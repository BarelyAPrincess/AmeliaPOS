package jpos.profile;

import java.io.Serializable;

public abstract class AbstractPropType implements PropType, Serializable
{
	private String description = "";

	public abstract String toString();

	public abstract Class getJavaTypeClass();

	public abstract boolean isValidValue( Object paramObject );

	public abstract boolean isValidValue( PropValue paramPropValue );

	public String getDescription()
	{
		return description;
	}

	void setDescription( String paramString )
	{
		description = paramString;
	}
}
