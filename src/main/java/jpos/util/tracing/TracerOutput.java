/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.util.tracing;

public abstract interface TracerOutput
{
	public abstract String getPrefix();

	public abstract void close();

	public abstract void println( String paramString );

	public abstract void print( String paramString );

	public abstract void print( Exception paramException );

	public abstract void flush();
}
