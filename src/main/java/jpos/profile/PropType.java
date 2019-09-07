package jpos.profile;

public abstract interface PropType
{
	public abstract String toString();

	public abstract String getDescription();

	public abstract Class getJavaTypeClass();

	public abstract boolean isValidValue( Object paramObject );

	public abstract boolean isValidValue( PropValue paramPropValue );
}
