/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.profile;

import java.util.Enumeration;

public abstract interface ProfileRegistry
{
	public abstract int getSize();

	public abstract boolean isEmpty();

	public abstract boolean hasProfile( String paramString );

	public abstract boolean hasProfile( Profile paramProfile );

	public abstract Enumeration getProfiles();

	public abstract Profile getProfile( String paramString );

	public abstract void addProfile( Profile paramProfile );

	public abstract void addProfile( String paramString, Profile paramProfile );

	public abstract void removeProfile( Profile paramProfile );

	public abstract void removeProfile( String paramString );
}
