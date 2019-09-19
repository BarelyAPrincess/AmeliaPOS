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

public class IntegerPropType extends AbstractPropType implements PropType, Serializable
{
	private static PropType instance = null;

	public static PropType getInstance()
	{
		if ( instance == null )
		{
			instance = new IntegerPropType();
		}
		return instance;
	}

	public String toString()
	{
		return "IntegerPropType";
	}

	public Class getJavaTypeClass()
	{
		return new Integer( 0 ).getClass();
	}

	public boolean isValidValue( int paramInt )
	{
		return true;
	}

	public boolean isValidValue( Object paramObject )
	{
		return paramObject instanceof Integer;
	}

	public boolean isValidValue( PropValue paramPropValue )
	{
		return isValidValue( paramPropValue.getValue() );
	}
}
