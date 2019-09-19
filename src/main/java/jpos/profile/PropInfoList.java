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

public abstract interface PropInfoList
{
	public abstract int getSize();

	public abstract boolean isEmpty();

	public abstract void add( PropInfo paramPropInfo );

	public abstract void remove( PropInfo paramPropInfo );

	public abstract void removeAll();

	public abstract boolean contains( PropInfo paramPropInfo );

	public abstract Iterator iterator();

	public static abstract interface Iterator
	{
		public abstract PropInfo next();

		public abstract boolean hasNext();
	}
}
