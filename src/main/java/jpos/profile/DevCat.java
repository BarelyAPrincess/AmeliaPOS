package jpos.profile;

public abstract interface DevCat
{
	public static final String JPOS_VERSION_STRING = "1.5";

	public abstract String toString();

	public abstract void accept( DevCatVisitor paramDevCatVisitor );
}
