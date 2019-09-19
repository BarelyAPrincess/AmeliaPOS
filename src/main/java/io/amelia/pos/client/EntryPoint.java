/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package io.amelia.pos.client;

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
			AmeliaPOSClient app = new AmeliaPOSClient();

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
