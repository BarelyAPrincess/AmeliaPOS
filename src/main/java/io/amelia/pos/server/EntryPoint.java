package io.amelia.pos.server;

import io.amelia.foundation.ConfigLoader;
import io.amelia.foundation.ConfigRegistry;
import io.amelia.foundation.Foundation;
import io.amelia.foundation.FoundationCrashException;
import io.amelia.foundation.Hook;
import io.amelia.foundation.Kernel;
import io.amelia.lang.ConfigException;
import io.amelia.lang.StartupInterruptException;
import io.amelia.support.EnumColor;
import io.amelia.support.Priority;

public class EntryPoint
{
	@Hook( hookClass = Foundation.class, hookAction = Foundation.HOOK_ACTION_PARSE, priority = Priority.NORMAL )
	public static void loadAppConfig()
	{
		try
		{
			ConfigRegistry.LOADER.beginConfig();
			ConfigRegistry.LOADER.commitConfig( ConfigLoader.CommitType.INITIAL );
		}
		catch ( ConfigException.Error error )
		{
			error.printStackTrace();
		}
	}

	public static void main( String[] args ) throws Exception
	{
		try
		{
			Foundation.init();

			/* Specify the BaseApplication for this environment. */
			AmeliaPOSServer app = new AmeliaPOSServer();

			try
			{
				app.parse( args );
			}
			catch ( StartupInterruptException e )
			{
				// Prevent exception from being printed to console
				return;
			}

			Foundation.setApplication( app );

			/* Prepare the environment by downloading and applying builtin libraries required */
			Foundation.prepare();

			// Load up Network UDP Driver
			/* final UDPWorker udp = NetworkLoader.UDP();

			Events.getInstance().listen( app, RunlevelEvent.class, ( event ) -> {
				// Start the Networking
				if ( event.getRunLevel() == Runlevel.MAINLOOP )
				{
				/*try
				{
					udp.start();
				}
				catch ( ApplicationException.Error e )
				{
					throw new StartupException( e );
				}

				if ( !udp.isStarted() )
					throw new StartupException( "The UDP service failed to start for unknown reasons." );/
				}

				// Make sure I'm the only process with my instanceId running
				if ( event.getRunLevel() == Runlevel.NETWORKING )
				{
					try
					{
						Networking.start();
					}
					catch ( ApplicationException.Error e )
					{
						ExceptionReport.handleSingleException( e );
					}
				}
			} );

			*/

			/* Tell the Kernel to start the startup sequence */
			Foundation.start();
		}
		catch ( FoundationCrashException muted )
		{
			// Muted since abort information is normally communicated before this point.
		}
		finally
		{
			Kernel.L.info( EnumColor.AQUA + "Application has finished and ran for a total of " + Kernel.uptimeDescribe() + "." );
		}
	}
}
