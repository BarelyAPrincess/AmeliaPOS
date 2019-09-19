/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.util;

public class DefaultComparableElement implements Comparable
{
	private Object object = null;

	public DefaultComparableElement( Object paramObject )
	{
		object = paramObject;
	}

	public int compareTo( Object paramObject )
	{
		return object.toString().compareTo( paramObject.toString() );
	}

	public boolean equals( Object paramObject )
	{
		return object.toString().equals( paramObject.toString() );
	}

	public Object getObject()
	{
		return object;
	}

	public String toString()
	{
		return object.toString();
	}
}
