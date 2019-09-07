package jpos.config;

import java.net.URL;
import java.util.Enumeration;

public abstract interface JposRegPopulator
{
	public abstract String getUniqueId();

	public abstract String getClassName();

	public abstract void save( Enumeration paramEnumeration ) throws Exception;

	public abstract void save( Enumeration paramEnumeration, String paramString ) throws Exception;

	public abstract void load();

	public abstract void load( String paramString );

	public abstract Exception getLastLoadException();

	public abstract URL getEntriesURL();

	public abstract Enumeration getEntries();

	public abstract boolean isComposite();

	public abstract String getName();
}
