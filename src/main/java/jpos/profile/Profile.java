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

import java.net.URL;

public abstract interface Profile
{
	public abstract String getName();

	public abstract String getVersion();

	public abstract String getDescription();

	public abstract String getVendorName();

	public abstract URL getVendorUrl();

	public abstract DevCatInfoList getDevCatInfoList();
}
