package jpos.profile;

public abstract interface DevCatInfoList
{
	public abstract int getSize();

	public abstract boolean isEmpty();

	public abstract void add( DevCatInfo paramDevCatInfo );

	public abstract void remove( DevCatInfo paramDevCatInfo );

	public abstract void removeAll();

	public abstract boolean contains( DevCatInfo paramDevCatInfo );

	public abstract Iterator iterator();

	public static abstract interface Iterator
	{
		public abstract DevCatInfo next();

		public abstract boolean hasNext();
	}
}
