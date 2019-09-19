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

public class StringPropType extends AbstractPropType implements PropType, Serializable
{
	private static PropType instance = null;

	public static PropType getInstance()
	{
		if ( instance == null )
		{
			instance = new StringPropType();
		}
		return instance;
	}

	public String toString()
	{
		return "StringPropType";
	}

	public Class getJavaTypeClass()
	{
		return "".getClass();
	}

	public boolean isValidValue( String paramString )
	{
		return paramString != null;
	}

	public boolean isValidValue( Object paramObject )
	{
		return paramObject instanceof String;
	}

	public boolean isValidValue( PropValue paramPropValue )
	{
		return isValidValue( paramPropValue.getValue() );
	}
}
