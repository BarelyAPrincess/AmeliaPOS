/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.loader;

import jpos.JposException;

public class JposLoaderException extends JposException
{
	public JposLoaderException( String paramString )
	{
		super( 0, paramString );
	}

	public JposLoaderException( String paramString, Exception paramException )
	{
		super( 0, paramString, paramException );
	}
}
