package jpos.profile;

import java.util.Enumeration;

public abstract interface ProfileRegistry
{
	public abstract int getSize();

	public abstract boolean isEmpty();

	public abstract boolean hasProfile( String paramString );

	public abstract boolean hasProfile( Profile paramProfile );

	public abstract Enumeration getProfiles();

	public abstract Profile getProfile( String paramString );

	public abstract void addProfile( Profile paramProfile );

	public abstract void addProfile( String paramString, Profile paramProfile );

	public abstract void removeProfile( Profile paramProfile );

	public abstract void removeProfile( String paramString );
}
