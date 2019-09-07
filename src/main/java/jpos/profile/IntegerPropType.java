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
