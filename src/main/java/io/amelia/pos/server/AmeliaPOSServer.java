/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package io.amelia.pos.server;

import com.rabbitmq.client.Channel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.function.Consumer;
import java.util.logging.Level;

import io.amelia.data.parcel.Parcel;
import io.amelia.data.parcel.ParcelCarrier;
import io.amelia.data.parcel.ParcelLoader;
import io.amelia.foundation.DefaultApplication;
import io.amelia.foundation.Env;
import io.amelia.foundation.Foundation;
import io.amelia.foundation.Kernel;
import io.amelia.foundation.LogHandler;
import io.amelia.foundation.NetworkedApplication;
import io.amelia.foundation.PropDevMeta;
import io.amelia.foundation.Runlevel;
import io.amelia.lang.ApplicationException;
import io.amelia.lang.ParcelException;
import io.amelia.lang.ParcelableException;
import io.amelia.logcompat.DefaultLogFormatter;
import io.amelia.logcompat.LogBuilder;
import io.amelia.net.RabbitMQHelper;
import io.amelia.support.EnumColor;
import io.amelia.support.IO;
import io.amelia.support.Sys;
import jpos.CashDrawer;
import jpos.CashDrawerConst;
import jpos.CashDrawerControl114;
import jpos.JposConst;
import jpos.JposException;
import jpos.POSPrinter;
import jpos.POSPrinterConst;
import jpos.POSPrinterControl14;
import jpos.events.OutputCompleteEvent;
import jpos.events.OutputCompleteListener;
import jpos.events.StatusUpdateEvent;
import jpos.events.StatusUpdateListener;
import sun.misc.Signal;
import sun.misc.SignalHandler;

import static io.amelia.foundation.Runlevel.INITIALIZATION;
import static io.amelia.foundation.Runlevel.NETWORKING;
import static io.amelia.foundation.Runlevel.SHUTDOWN;
import static io.amelia.foundation.Runlevel.STARTUP;

public class AmeliaPOSServer extends DefaultApplication implements NetworkedApplication, OutputCompleteListener, StatusUpdateListener
{
	public static final String ESC = "\u001B";
	private POSPrinterControl14 printer = new POSPrinter();
	private CashDrawerControl114 drawer = new CashDrawer();

	public AmeliaPOSServer() throws ApplicationException.Error
	{
		try
		{
			Kernel.setDevMeta( new PropDevMeta( AmeliaPOSServer.class, "build.properties" ) );
		}
		catch ( IOException e )
		{
			throw new RuntimeException( e );
		}

		addArgument( "console-fancy", "Specifies if control characters are written with console output to stylize it, e.g., fgcolor, bgcolor, bold, or inverted." );
		addStringArgument( "epos-properties", "Specifies the file location of the `epos.properties` file, default is in the app root." );
	}

	@Override
	public void handleParcel( ParcelCarrier parcelCarrier ) throws ParcelException.Error
	{
		// TODO Nothing Yet!
	}

	private String queueTempName;

	@Override
	public void onRunlevelChange( Runlevel previousRunlevel, Runlevel currentRunlevel ) throws ApplicationException.Error
	{
		super.onRunlevelChange( previousRunlevel, currentRunlevel );

		if ( currentRunlevel == INITIALIZATION )
		{
			if ( Sys.isAdminUser() )
				Kernel.L.warning( "We detected that you are running this application with the system admin account. This is highly discouraged, it may compromise security or file permissions." );

			// Minimum 1GB memory recommended.
			if ( Runtime.getRuntime().maxMemory() / 1024L / 1024L < 1024L )
				Kernel.L.warning( "We detected less than the recommended 1024Mb of JVM ram, we recommended you dedicate more ram to guarantee a smoother experience. You can use the JVM options \"-Xmx1024M -Xms1024M\" to set the ram at 1GB." );

			try
			{
				Env env = getEnv();

				LogBuilder.addFileHandler( "latest", false, 6, Level.ALL );
				LogBuilder.addFileHandler( "colored", true, 0, Level.ALL );

				LogBuilder.setConsoleFormatter( new DefaultLogFormatter( env.getBoolean( "console-fancy" ).orElse( true ) ) );
				Kernel.setLogHandler( new LogHandler()
				{
					@Override
					public void log( Level level, Class<?> source, String message, Object... args )
					{
						LogBuilder.get( source ).log( level, message, args );
					}

					@Override
					public void log( Level level, Class<?> source, Throwable cause )
					{
						LogBuilder.get( source ).log( level, cause );
					}

					@Override
					public void log( Level level, Class<?> source, Throwable cause, String message, Object... args )
					{
						LogBuilder.get( source ).log( level, cause, message, args );
					}
				} );
			}
			catch ( Exception e )
			{
				throwStartupException( e );
			}

			if ( Sys.isUnixLikeOS() )
			{
				SignalHandler signalHandler = signal -> Foundation.shutdown( "Received SIGTERM - Terminate" );

				Signal.handle( new Signal( "TERM" ), signalHandler );
				Signal.handle( new Signal( "INT" ), signalHandler );
			}
		}
		if ( currentRunlevel == STARTUP )
		{
			printer.addOutputCompleteListener( this );
			drawer.addStatusUpdateListener( this );

			try
			{
				printer.open( "POSPrinter" );
				printer.claim( 1000 );
				printer.setDeviceEnabled( true );
			}
			catch ( JposException e )
			{
				Kernel.L.severe( "Failed to claim POSPrinter. Printer commands will be disabled.", e );
			}

			try
			{
				drawer.open( "CashDrawer" );
				drawer.claim( 1000 );
				if ( drawer.getCapPowerReporting() != JposConst.JPOS_PR_NONE )
					drawer.setPowerNotify( JposConst.JPOS_PN_ENABLED );
				drawer.setDeviceEnabled( true );
			}
			catch ( JposException e )
			{
				Kernel.L.severe( "Failed to claim CashDrawer. Drawer commands will be disabled.", e );
			}

			Consumer<String> commandConsumer = cmd -> {
				switch ( cmd.toLowerCase() )
				{
					case "publish":
						RabbitMQHelper.getInstance().publishMessageNow( "terminals", "", "Hello World!" );
						break;
					case "open":
						try
						{
							drawer.openDrawer();
						}
						catch ( JposException e )
						{
							Foundation.L.severe( "Failed to open drawer", e );
						}
						break;
					case "receipt":
						try
						{
							if ( printer.getCapRecPresent() == true )
							{
								int orgSpacing = printer.getRecLineSpacing();

								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\n\n\n" );

								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\u001b|4C\u001b|bC  Weekend Badge\n" );

								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "   #19-9950 | Printed at 1:15AM\n" );

								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\n\n" );

								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\u001b|fP" );

								printer.setRecLineSpacing( orgSpacing );

								/*

								printer.transactionPrint( POSPrinterConst.PTR_S_RECEIPT, POSPrinterConst.PTR_TP_TRANSACTION );

								printer.rotatePrint( POSPrinterConst.PTR_S_RECEIPT, POSPrinterConst.PTR_RP_LEFT90 );

								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\u001b|4C\u001b|bC   Receipt     " );
								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\u001b|3C\u001b|2uC       Mr. Brawn\n" );
								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\u001b|2uC                                                  \n\n" );
								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\u001b|2uC\u001b|3C        Total payment              $\u001b|4C21.00  \n" );
								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\u001b|1C\n" );
								printer.setRecLineSpacing( printer.getRecLineHeight() );
								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\u001b|uC Details               \n" );
								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\u001b|1C                          \u001b|2CJPOS Store\n" );
								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\u001b|uC Tax excluded    $20.00\n" );
								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\u001b|1C                          \u001b|bCZip code 999-9999\n" );
								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\u001b|uC Tax(5%)        $1.00\u001b|N    Phone#(9999)99-9998\n" );

								printer.rotatePrint( POSPrinterConst.PTR_S_RECEIPT, POSPrinterConst.PTR_RP_NORMAL );

								printer.printNormal( POSPrinterConst.PTR_S_RECEIPT, "\u001b|fP" );

								printer.transactionPrint( POSPrinterConst.PTR_S_RECEIPT, POSPrinterConst.PTR_TP_NORMAL ); */
							}
						}
						catch ( JposException ex )
						{
						}

						break;
					case "endorse":

						try
						{
							printer.setMapMode( POSPrinterConst.PTR_MM_METRIC );
							printer.setRecLetterQuality( true );

							printer.beginInsertion( 15000 );
							printer.endInsertion();

							printer.printNormal( POSPrinterConst.PTR_S_SLIP, "\n" );

							printer.printNormal( POSPrinterConst.PTR_S_SLIP, "\u001b|4C\u001b|bC Chris Ramencon\n" );

							printer.printNormal( POSPrinterConst.PTR_S_SLIP, "#19-9950 R | Printed at 1:15AM Thursday\n" );

							printer.beginRemoval( 10000 );
							printer.endRemoval();
						}
						catch ( JposException ignore )
						{
							// Ignore
						}

						break;
					case "exit":
					case "quit":
						Foundation.shutdown( "Shutdown by User" );
					default:
						Foundation.L.info( "Command Unknown" );
				}
			};

			Foundation.requestTerminal( commandConsumer );

			RabbitMQHelper.getInstance().start();

			try
			{
				Channel channel = RabbitMQHelper.getInstance().channel();

				channel.exchangeDeclare( "terminals", "fanout" );

				String tempQueue = channel.queueDeclare().getQueue();

				Kernel.L.info( "Create queue " + tempQueue );

				channel.queueBind( tempQueue, "terminals", "" );

				channel.basicConsume( tempQueue, true, ( consumerTag, delivery ) -> {
					String payload = new String( delivery.getBody(), "UTF-8" );
					Kernel.L.info( " [x] Received Payload '" + payload + "'" );

					try
					{
						Parcel data = ParcelLoader.decodeJson( payload );

						String uuid = data.getString( "uuid" ).orElseThrow( () -> new ParcelException.Error( "Parcel was missing the UUID key." ) );

						Kernel.L.info( "[x] Is this our UUID? '" + uuid + "'" );

						data.getString( "cmd" ).ifPresent( commandConsumer::accept );

						data.getString( "badge" ).ifPresent( nll -> {
							try
							{
								String badgeName = data.getString( "badgeName" ).orElse( "" );
								String badgeId = data.getString( "badgeId" ).orElseThrow( () -> new IOException() );

								printer.setMapMode( POSPrinterConst.PTR_MM_METRIC );
								printer.setRecLetterQuality( true );

								printer.beginInsertion( 15000 );
								printer.endInsertion();

								printer.transactionPrint( POSPrinterConst.PTR_S_RECEIPT, POSPrinterConst.PTR_TP_TRANSACTION );

								printer.rotatePrint( POSPrinterConst.PTR_S_RECEIPT, POSPrinterConst.PTR_RP_ROTATE180 );

								printer.printNormal( POSPrinterConst.PTR_S_SLIP, "\n" );

								printer.printNormal( POSPrinterConst.PTR_S_SLIP, "   #" + badgeId + " R | Printed at 1:15AM Thursday\n" );

								printer.printNormal( POSPrinterConst.PTR_S_SLIP, "\u001b|4C\u001b|bC " + badgeName + "\n" );

								printer.rotatePrint( POSPrinterConst.PTR_S_RECEIPT, POSPrinterConst.PTR_RP_NORMAL );

								printer.transactionPrint( POSPrinterConst.PTR_S_RECEIPT, POSPrinterConst.PTR_TP_NORMAL );

								printer.beginRemoval( 10000 );
								printer.endRemoval();
							}
							catch ( JposException ignore )
							{
								// Ignore
							}
						} );
					}
					catch ( ParcelableException.Error | ParcelException.Error error )
					{
						error.printStackTrace();
					}
				}, consumerTag -> {
				} );

				// TODO Publish our queue to the database.
			}
			catch ( IOException e )
			{
				e.printStackTrace();
				// Ignore
			}
		}
		// if ( currentRunlevel == MAINLOOP )
		// LooperRouter.getMainLooper().postTaskRepeatingLater( entry -> Networking.heartbeat( entry.getLastPolledMillis() ), 50L, 50L );
		if ( currentRunlevel == SHUTDOWN )
		{
			// Kernel.L.info( "Shutting Down Plugin Manager..." );
			// Foundation.getPlugins().shutdown();

			// Kernel.L.info( "Shutting Down Permission Manager..." );
			// Foundation.getPermissions().shutdown();

			// Kernel.L.info( "Shutting Down Account Manager..." );
			// Foundation.getUsers().shutdown();

			RabbitMQHelper.getInstance().shutdown();

			try
			{
				printer.removeOutputCompleteListener( this );
				printer.setDeviceEnabled( false );
				printer.release();
				printer.close();
			}
			catch ( JposException e )
			{
				Kernel.L.severe( "Failed to release POSPrinter.", e );
			}

			try
			{
				drawer.removeStatusUpdateListener( this );
				drawer.setDeviceEnabled( false );
				drawer.release();
				drawer.close();
			}
			catch ( JposException e )
			{
				Kernel.L.severe( "Failed to release CashDrawer.", e );
			}
		}
		if ( currentRunlevel == NETWORKING )
		{
			// Networking.startNetworkService( new TCPService() );
		}
	}

	/*public static boolean postValue( @Nonnull String category, @Nonnull String action )
	{
		try
		{
			String url = "http://10.8.1.10/api/post";

			URL urlObj = new URL( url );
			HttpURLConnection con = ( HttpURLConnection ) urlObj.openConnection();
			con.setRequestMethod( "POST" );

			String urlParameters = "v=1&tid=UA-60405654-1&cid=" + instanceId + "&t=event&ec=" + category + "&ea=" + action + "&el=" + label;

			con.setDoOutput( true );
			DataOutputStream wr = new DataOutputStream( con.getOutputStream() );
			wr.writeBytes( urlParameters );
			wr.flush();
			wr.close();

			int responseCode = con.getResponseCode();
			Kernel.L.fine( "Analytics Response [" + category + "]: " + responseCode );

			BufferedReader in = new BufferedReader( new InputStreamReader( con.getInputStream() ) );
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ( ( inputLine = in.readLine() ) != null )
				response.append( inputLine );
			in.close();

			return true;
		}
		catch ( IOException e )
		{
			return false;
		}
	}*/

	@Override
	public void outputCompleteOccurred( OutputCompleteEvent paramOutputCompleteEvent )
	{

	}

	@Override
	protected void parse() throws Exception
	{
		/*Streams.forEachWithException( ConfigRegistry.config.getChildOrCreate( Users.ConfigKeys.CREATORS ).getChildren(), child -> {
			URI userCreatorPath = URI.create( ConfigRegistry.config.getString( "path" ).orElseThrow( () -> new StorageException.Error( "Malformed user creator configuration. {backend=" + child.getCurrentPath() + "}" ) ) );
			StorageBackend storageBackend;

			if ( HoneyStorageProvider.SCHEME.equals( userCreatorPath.getScheme() ) )
				storageBackend = HoneyStorage.getBackend( NodePath.of( userCreatorPath.getPath() ) ).orElseThrow( () -> new StorageException.Error( "The user creator " + userCreatorPath + " was not found." ) );
			else
				storageBackend = new FileStorageBackend( Paths.get( userCreatorPath ), NodePath.empty() );

			// Foundation.getUsers().addUserCreator( child.getLocalName(), storageBackend, child.getBoolean( "default" ).orElse( false ) );
		} );*/
	}

	@Override
	public void sendToAll( ParcelCarrier parcel )
	{
		// TODO Distribute the parcel to all available receivers.
	}

	@Override
	public void showBanner( Kernel.Logger logger )
	{
		InputStream is = getClass().getClassLoader().getResourceAsStream( "banner.txt" );
		if ( is != null )
			for ( String line : IO.readStreamToLines( is ) )
				logger.info( EnumColor.GOLD + line );

		super.showBanner( logger );
	}

	@Override
	public void statusUpdateOccurred( StatusUpdateEvent statusUpdateEvent )
	{
		CashDrawerControl114 control = ( CashDrawerControl114 ) statusUpdateEvent.getSource();
		String status = null;

		switch ( statusUpdateEvent.getStatus() )
		{
			case CashDrawerConst.CASH_SUE_DRAWERCLOSED:
				status = "Drawer is closed!";
				break;

			case CashDrawerConst.CASH_SUE_DRAWEROPEN:
				status = "Drawer is open!";
				break;

			//The Power Reporting Requirements fires the event when the device power status is changed.
			case JposConst.JPOS_SUE_POWER_ONLINE:
				status = "Drawer is ready!";
				break;

			case JposConst.JPOS_SUE_POWER_OFF:
				status = "Drawer is OFF!";
				break;

			case JposConst.JPOS_SUE_POWER_OFFLINE:
				status = "Drawer is not ready!";
				break;

			case JposConst.JPOS_SUE_POWER_OFF_OFFLINE:
				status = "Drawer is offline!";
				break;
		}

		if ( status != null )
			Foundation.L.info( "Got drawer status change: " + status );
	}

	public static class ConfigKeys
	{
		private ConfigKeys()
		{
			// Static Access
		}
	}
}
