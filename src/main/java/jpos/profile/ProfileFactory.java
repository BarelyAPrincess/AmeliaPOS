package jpos.profile;

public abstract interface ProfileFactory
{
	public abstract Profile createProfile( String paramString ) throws ProfileException;
}
