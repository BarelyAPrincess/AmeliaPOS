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
