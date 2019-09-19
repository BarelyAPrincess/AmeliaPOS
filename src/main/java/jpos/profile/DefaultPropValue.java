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

import java.io.Serializable;

class DefaultPropValue implements PropValue, Serializable
{
	private Object value = null;
	private PropType type = null;

	DefaultPropValue( Object paramObject, PropType paramPropType )
	{
		value = paramObject;
		type = paramPropType;
	}

	public Object getValue()
	{
		return value;
	}

	public String toString()
	{
		return value.toString();
	}

	public PropType getType()
	{
		return type;
	}

	public boolean equals( Object paramObject )
	{
		if ( paramObject == null )
		{
			return false;
		}
		if ( !( paramObject instanceof PropValue ) )
		{
			return false;
		}
		return value.equals( ( ( PropValue ) paramObject ).getValue() );
	}
}
