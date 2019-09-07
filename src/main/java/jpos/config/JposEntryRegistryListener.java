package jpos.config;

import java.util.EventListener;

public abstract interface JposEntryRegistryListener extends EventListener
{
	public abstract void jposEntryAdded( JposEntryRegistryEvent paramJposEntryRegistryEvent );

	public abstract void jposEntryRemoved( JposEntryRegistryEvent paramJposEntryRegistryEvent );

	public abstract void jposEntryModified( JposEntryRegistryEvent paramJposEntryRegistryEvent );
}
