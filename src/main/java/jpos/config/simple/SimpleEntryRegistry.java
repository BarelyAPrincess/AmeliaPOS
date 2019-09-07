package jpos.config.simple;

import java.io.File;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import jpos.config.JposEntry;
import jpos.config.JposEntryRegistry;
import jpos.config.JposEntryRegistryEvent;
import jpos.config.JposEntryRegistryListener;
import jpos.config.JposRegPopulator;
import jpos.util.tracing.Tracer;
import jpos.util.tracing.TracerFactory;

public class SimpleEntryRegistry implements JposEntryRegistry
{
	public Hashtable jposEntries = new Hashtable();
	private Vector listeners = new Vector();
	private JposRegPopulator regPopulator = null;
	private boolean loaded = false;
	private Tracer tracer = TracerFactory.getInstance().createTracer( "SimpleEntryRegistry" );

	/**
	 * @deprecated
	 */
	public SimpleEntryRegistry()
	{
	}

	public SimpleEntryRegistry( JposRegPopulator paramJposRegPopulator )
	{
		regPopulator = paramJposRegPopulator;
	}

	public boolean hasJposEntry( String paramString )
	{
		return jposEntries.containsKey( paramString );
	}

	public Enumeration getEntries()
	{
		Vector localVector = new Vector();
		Enumeration localEnumeration = jposEntries.elements();
		while ( localEnumeration.hasMoreElements() )
		{
			localVector.addElement( localEnumeration.nextElement() );
		}
		return localVector.elements();
	}

	public JposEntry getJposEntry( String paramString )
	{
		return ( JposEntry ) jposEntries.get( paramString );
	}

	public void modifyJposEntry( String paramString, JposEntry paramJposEntry )
	{
		jposEntries.put( paramString, paramJposEntry );
		tracer.println( "Modified entry.logicalName = " + paramString );
		fireJposEntryRegistryEventModified( new JposEntryRegistryEvent( this, paramJposEntry ) );
	}

	public void addJposEntry( String paramString, JposEntry paramJposEntry )
	{
		jposEntries.put( paramString, paramJposEntry );
		tracer.println( "Added entry.logicalName = " + paramString );
		fireJposEntryRegistryEventAdded( new JposEntryRegistryEvent( this, paramJposEntry ) );
	}

	public void addJposEntry( JposEntry paramJposEntry )
	{
		addJposEntry( paramJposEntry.getLogicalName(), paramJposEntry );
	}

	public void removeJposEntry( JposEntry paramJposEntry )
	{
		Enumeration localEnumeration = jposEntries.elements();
		while ( localEnumeration.hasMoreElements() )
		{
			JposEntry localJposEntry1 = ( JposEntry ) localEnumeration.nextElement();
			if ( localJposEntry1.hasPropertyWithName( "logicalName" ) )
			{
				JposEntry localJposEntry2 = ( JposEntry ) jposEntries.remove( paramJposEntry.getPropertyValue( "logicalName" ) );
				tracer.println( "Removed entry.logicalName = " + paramJposEntry.getLogicalName() );
				fireJposEntryRegistryEventRemoved( new JposEntryRegistryEvent( this, localJposEntry2 ) );
				return;
			}
		}
		tracer.println( "Could not find entry to remove entry.logicalName = " + paramJposEntry.getLogicalName() );
	}

	public void removeJposEntry( String paramString )
	{
		JposEntry localJposEntry = ( JposEntry ) jposEntries.get( paramString );
		if ( localJposEntry != null )
		{
			jposEntries.remove( paramString );
			fireJposEntryRegistryEventRemoved( new JposEntryRegistryEvent( this, localJposEntry ) );
		}
	}

	public void addJposEntryRegistryListener( JposEntryRegistryListener paramJposEntryRegistryListener )
	{
		listeners.addElement( paramJposEntryRegistryListener );
	}

	public void removeJposEntryRegistryListener( JposEntryRegistryListener paramJposEntryRegistryListener )
	{
		listeners.removeElement( paramJposEntryRegistryListener );
	}

	public void save() throws Exception
	{
		getRegPopulator().save( getEntries() );
	}

	public void saveToFile( File paramFile ) throws Exception
	{
		getRegPopulator().save( getEntries(), paramFile.getCanonicalPath() );
	}

	public JposRegPopulator getRegPopulator()
	{
		return regPopulator;
	}

	public void load()
	{
		getRegPopulator().load();
		jposEntries.clear();
		Enumeration localEnumeration = getRegPopulator().getEntries();
		while ( localEnumeration.hasMoreElements() )
		{
			try
			{
				JposEntry localJposEntry = ( JposEntry ) localEnumeration.nextElement();
				jposEntries.put( localJposEntry.getPropertyValue( "logicalName" ), localJposEntry );
			}
			catch ( Exception localException )
			{
				tracer.print( localException );
			}
		}
		loaded = true;
	}

	public int getSize()
	{
		return jposEntries.size();
	}

	public boolean isLoaded()
	{
		return loaded;
	}

	public String toString()
	{
		StringBuffer localStringBuffer = new StringBuffer();
		localStringBuffer.append( "<SimpleEntryRegistry>\n" );
		localStringBuffer.append( "<size=\"" + getSize() + "\"\n/>" );
		localStringBuffer.append( "<populatorUniqueId=\"" + getRegPopulator().getUniqueId() + "\"\n/>" );
		localStringBuffer.append( "numberOfListeners=\"" + listeners.size() + "\"\n/>" );
		localStringBuffer.append( "<entries>\n" );
		Enumeration localEnumeration = getEntries();
		for ( int i = 0; localEnumeration.hasMoreElements(); i++ )
		{
			localStringBuffer.append( "<entry" + i + ".LogicalName=\"" + ( ( JposEntry ) localEnumeration.nextElement() ).getLogicalName() + "\"\n/>" );
		}
		localStringBuffer.append( "</entries>\n" );
		localStringBuffer.append( "</SimpleEntryRegistry>\n" );
		return localStringBuffer.toString();
	}

	protected void fireJposEntryRegistryEventAdded( JposEntryRegistryEvent paramJposEntryRegistryEvent )
	{
		tracer.println( "fireJposEntryRegistryEventAdded: e.getJposEntry().logicalName = " + paramJposEntryRegistryEvent.getJposEntry().getLogicalName() );
		Vector localVector = ( Vector ) listeners.clone();
		synchronized ( localVector )
		{
			for ( int i = 0; i < localVector.size(); i++ )
			{
				( ( JposEntryRegistryListener ) localVector.elementAt( i ) ).jposEntryAdded( paramJposEntryRegistryEvent );
			}
		}
	}

	protected void fireJposEntryRegistryEventRemoved( JposEntryRegistryEvent paramJposEntryRegistryEvent )
	{
		tracer.println( "fireJposEntryRegistryEventRemoved: e.getJposEntry().logicalName = " + paramJposEntryRegistryEvent.getJposEntry().getLogicalName() );
		Vector localVector = ( Vector ) listeners.clone();
		synchronized ( localVector )
		{
			for ( int i = 0; i < localVector.size(); i++ )
			{
				( ( JposEntryRegistryListener ) localVector.elementAt( i ) ).jposEntryRemoved( paramJposEntryRegistryEvent );
			}
		}
	}

	protected void fireJposEntryRegistryEventModified( JposEntryRegistryEvent paramJposEntryRegistryEvent )
	{
		tracer.println( "fireJposEntryRegistryEventModified: e.getJposEntry().logicalName = " + paramJposEntryRegistryEvent.getJposEntry().getLogicalName() );
		Vector localVector = ( Vector ) listeners.clone();
		synchronized ( localVector )
		{
			for ( int i = 0; i < localVector.size(); i++ )
			{
				( ( JposEntryRegistryListener ) localVector.elementAt( i ) ).jposEntryModified( paramJposEntryRegistryEvent );
			}
		}
	}
}
