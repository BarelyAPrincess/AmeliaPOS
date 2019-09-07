package jpos.config;

import java.util.EventObject;

public class JposEntryRegistryEvent extends EventObject
{
	private JposEntry jposEntry = null;

	public JposEntryRegistryEvent( Object paramObject, JposEntry paramJposEntry )
	{
		super( paramObject );
		jposEntry = paramJposEntry;
	}

	public JposEntry getJposEntry()
	{
		return jposEntry;
	}
}
