package jpos.profile;

import java.net.URL;

public abstract interface Profile
{
	public abstract String getName();

	public abstract String getVersion();

	public abstract String getDescription();

	public abstract String getVendorName();

	public abstract URL getVendorUrl();

	public abstract DevCatInfoList getDevCatInfoList();
}
