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

public abstract interface DevCat
{
	public static final String JPOS_VERSION_STRING = "1.5";

	public abstract String toString();

	public abstract void accept( DevCatVisitor paramDevCatVisitor );
}
