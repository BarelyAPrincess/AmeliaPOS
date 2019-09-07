package jpos.profile;

public abstract interface PropValueList
{
	public abstract int getSize();

	public abstract boolean isEmpty();

	public abstract void add( PropValue paramPropValue );

	public abstract void remove( PropValue paramPropValue );

	public abstract void removeAll();

	public abstract boolean contains( PropValue paramPropValue );

	public abstract Iterator iterator();

	public static abstract interface Iterator
	{
		public abstract PropValue next();

		public abstract boolean hasNext();
	}
}
