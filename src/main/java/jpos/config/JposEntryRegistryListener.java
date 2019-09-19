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

import java.util.EventListener;

public abstract interface JposEntryRegistryListener extends EventListener
{
	public abstract void jposEntryAdded( JposEntryRegistryEvent paramJposEntryRegistryEvent );

	public abstract void jposEntryRemoved( JposEntryRegistryEvent paramJposEntryRegistryEvent );

	public abstract void jposEntryModified( JposEntryRegistryEvent paramJposEntryRegistryEvent );
}
