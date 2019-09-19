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

import java.util.EventObject;

public class JposEntryRegistryEvent extends EventObject
{
	private JposEntry jposEntry = null;

	public JposEntryRegistryEvent( Object paramObject, JposEntry paramJposEntry )
	{
		super( paramObject );
		jposEntry = paramJposEntry;
	}

	public JposEntry getJposEntry()
	{
		return jposEntry;
	}
}
