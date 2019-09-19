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

public abstract interface DevCatInfoList
{
	public abstract int getSize();

	public abstract boolean isEmpty();

	public abstract void add( DevCatInfo paramDevCatInfo );

	public abstract void remove( DevCatInfo paramDevCatInfo );

	public abstract void removeAll();

	public abstract boolean contains( DevCatInfo paramDevCatInfo );

	public abstract Iterator iterator();

	public static abstract interface Iterator
	{
		public abstract DevCatInfo next();

		public abstract boolean hasNext();
	}
}
