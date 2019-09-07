package jpos.profile;

import java.io.Serializable;

public class FloatPropType extends AbstractPropType implements PropType, Serializable
{
	private static PropType instance = null;

	public static PropType getInstance()
	{
		if ( instance == null )
		{
			instance = new FloatPropType();
		}
		return instance;
	}

	public String toString()
	{
		return "FloatPropType";
	}

	public Class getJavaTypeClass()
	{
		return new Float( 1.0D ).getClass();
	}

	public boolean isValidValue( float paramFloat )
	{
		return true;
	}

	public boolean isValidValue( Object paramObject )
	{
		return paramObject instanceof Float;
	}

	public boolean isValidValue( PropValue paramPropValue )
	{
		return isValidValue( paramPropValue.getValue() );
	}
}
