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

import jpos.JposException;

public class JposConfigException extends JposException
{
	public JposConfigException( String paramString )
	{
		super( 0, paramString );
	}

	public JposConfigException( String paramString, Exception paramException )
	{
		super( 0, paramString, paramException );
	}
}
