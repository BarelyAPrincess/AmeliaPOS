package io.amelia.pos.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.logging.Level;

import io.amelia.data.parcel.ParcelCarrier;
import io.amelia.foundation.ConfigRegistry;
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
import io.amelia.logcompat.DefaultLogFormatter;
import io.amelia.logcompat.LogBuilder;
import io.amelia.looper.LooperRouter;
import io.amelia.net.Networking;
import io.amelia.net.tcp.TCPService;
import io.amelia.net.web.WebService;
import io.amelia.net.wip.NetworkLoader;
import io.amelia.support.EnumColor;
import io.amelia.support.IO;
import io.amelia.support.Streams;
import io.amelia.support.Sys;
import io.amelia.users.Users;
import sun.misc.Signal;
import sun.misc.SignalHandler;

import static io.amelia.foundation.Runlevel.*;

public class AmeliaPOSServer extends DefaultApplication implements NetworkedApplication
{
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
		// if ( currentRunlevel == MAINLOOP )
		// LooperRouter.getMainLooper().postTaskRepeatingLater( entry -> Networking.heartbeat( entry.getLastPolledMillis() ), 50L, 50L );
		if ( currentRunlevel == SHUTDOWN )
		{
			Kernel.L.info( "Shutting Down Plugin Manager..." );
			Foundation.getPlugins().shutdown();

			// Kernel.L.info( "Shutting Down Permission Manager..." );
			// Foundation.getPermissions().shutdown();

			// Kernel.L.info( "Shutting Down Account Manager..." );
			// Foundation.getUsers().shutdown();
		}
		if ( currentRunlevel == NETWORKING )
		{
			Networking.startNetworkService( new TCPService() );
		}
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

	public static class ConfigKeys
	{
		private ConfigKeys()
		{
			// Static Access
		}
	}
}
