package jpos.profile;

import java.io.Serializable;

public class BooleanPropType extends AbstractPropType implements PropType, Serializable
{
	private static PropType instance = null;

	public static PropType getInstance()
	{
		if ( instance == null )
		{
			instance = new BooleanPropType();
		}
		return instance;
	}

	public String toString()
	{
		return "BooleanPropType";
	}

	public Class getJavaTypeClass()
	{
		return new Boolean( false ).getClass();
	}

	public boolean isValidValue( boolean paramBoolean )
	{
		return true;
	}

	public boolean isValidValue( Object paramObject )
	{
		return paramObject instanceof Boolean;
	}

	public boolean isValidValue( PropValue paramPropValue )
	{
		return isValidValue( paramPropValue.getValue() );
	}
}
