package jpos.loader;

import jpos.JposException;
import jpos.config.JposEntryRegistry;
import jpos.config.JposRegPopulator;
import jpos.profile.Profile;
import jpos.profile.ProfileException;
import jpos.profile.ProfileRegistry;
import jpos.util.JposProperties;

public abstract interface JposServiceManager
{
	public abstract JposServiceConnection createConnection( String paramString ) throws JposException;

	public abstract JposEntryRegistry getEntryRegistry();

	public abstract JposProperties getProperties();

	public abstract JposRegPopulator getRegPopulator();

	public abstract ProfileRegistry getProfileRegistry();

	public abstract Profile loadProfile( String paramString ) throws ProfileException;

	public abstract void reloadEntryRegistry();
}
