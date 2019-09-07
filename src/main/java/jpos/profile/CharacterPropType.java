package jpos.profile;

import java.io.Serializable;

public class CharacterPropType extends AbstractPropType implements PropType, Serializable
{
	private static PropType instance = null;

	public static PropType getInstance()
	{
		if ( instance == null )
		{
			instance = new CharacterPropType();
		}
		return instance;
	}

	public String toString()
	{
		return "CharacterPropType";
	}

	public Class getJavaTypeClass()
	{
		return new Character( 'c' ).getClass();
	}

	public boolean isValidValue( char paramChar )
	{
		return true;
	}

	public boolean isValidValue( Object paramObject )
	{
		return paramObject instanceof Character;
	}

	public boolean isValidValue( PropValue paramPropValue )
	{
		return isValidValue( paramPropValue.getValue() );
	}
}
