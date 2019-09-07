package jpos.profile;

public abstract interface PropValue
{
	public abstract Object getValue();

	public abstract String toString();

	public abstract PropType getType();

	public abstract boolean equals( Object paramObject );
}
