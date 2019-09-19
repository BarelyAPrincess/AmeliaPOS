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
import jpos.config.JposEntryRegistry;
import jpos.config.JposRegPopulator;
import jpos.profile.Profile;
import jpos.profile.ProfileException;
import jpos.profile.ProfileRegistry;
import jpos.util.JposProperties;

public abstract interface JposServiceManager
{
	public abstract JposServiceConnection createConnection( String paramString ) throws JposException;

	public abstract JposEntryRegistry getEntryRegistry();

	public abstract JposProperties getProperties();

	public abstract JposRegPopulator getRegPopulator();

	public abstract ProfileRegistry getProfileRegistry();

	public abstract Profile loadProfile( String paramString ) throws ProfileException;

	public abstract void reloadEntryRegistry();
}
