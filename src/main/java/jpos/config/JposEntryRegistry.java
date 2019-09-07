package jpos.config;

import java.io.File;
import java.util.Enumeration;

public abstract interface JposEntryRegistry
{
	public abstract boolean hasJposEntry( String paramString );

	public abstract Enumeration getEntries();

	public abstract JposEntry getJposEntry( String paramString );

	public abstract void addJposEntry( String paramString, JposEntry paramJposEntry );

	public abstract void addJposEntry( JposEntry paramJposEntry );

	public abstract void removeJposEntry( JposEntry paramJposEntry );

	public abstract void removeJposEntry( String paramString );

	public abstract void modifyJposEntry( String paramString, JposEntry paramJposEntry );

	public abstract void addJposEntryRegistryListener( JposEntryRegistryListener paramJposEntryRegistryListener );

	public abstract void removeJposEntryRegistryListener( JposEntryRegistryListener paramJposEntryRegistryListener );

	public abstract void save() throws Exception;

	public abstract void saveToFile( File paramFile ) throws Exception;

	public abstract void load();

	public abstract JposRegPopulator getRegPopulator();

	public abstract int getSize();

	public abstract boolean isLoaded();
}
