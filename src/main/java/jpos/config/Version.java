/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.config;

import java.io.PrintStream;

public final class Version
{
	public static void main( String[] paramArrayOfString )
	{
		System.out.println( "JavaPOS jpos.config/loader (JCL) version " + jpos.loader.Version.getVersionString() );
	}

	public static String getVersionString()
	{
		return jpos.loader.Version.getVersionString();
	}
}
