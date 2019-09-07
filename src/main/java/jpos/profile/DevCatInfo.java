package jpos.profile;

public abstract interface DevCatInfo
{
	public abstract Profile getProfile();

	public abstract DevCat getDevCat();

	public abstract PropInfoList getStandardProps();

	public abstract PropInfoList getRequiredProps();

	public abstract PropInfoList getOptionalProps();

	public abstract String toString();
}
