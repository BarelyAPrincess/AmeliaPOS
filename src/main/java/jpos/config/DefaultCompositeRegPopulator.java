package jpos.config;

import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import jpos.JposException;
import jpos.loader.JposServiceLoader;
import jpos.loader.JposServiceManager;
import jpos.util.JposProperties;
import jpos.util.JposProperties.MultiProperty;
import jpos.util.tracing.Tracer;
import jpos.util.tracing.TracerFactory;

public class DefaultCompositeRegPopulator implements CompositeRegPopulator
{
	private HashMap popMap = new HashMap();
	private HashMap popFileMap = new HashMap();
	private JposRegPopulator defaultPop = null;
	private Exception lastLoadException = null;
	private Tracer tracer = TracerFactory.getInstance().createTracer( "DefaultCompositeRegPopulator" );

	public DefaultCompositeRegPopulator()
	{
	}

	public DefaultCompositeRegPopulator( JposRegPopulator paramJposRegPopulator )
	{
		add( paramJposRegPopulator );
		setDefaultPopulator( paramJposRegPopulator );
	}

	private JposRegPopulator createPopulator( String paramString1, String paramString2 )
	{
		JposRegPopulator localJposRegPopulator = null;
		try
		{
			Class localClass = Class.forName( paramString2 );
			try
			{
				Class[] arrayOfClass = {String.class};
				Constructor localConstructor = localClass.getConstructor( arrayOfClass );
				Object[] arrayOfObject = {paramString1};
				localJposRegPopulator = ( JposRegPopulator ) localConstructor.newInstance( arrayOfObject );
			}
			catch ( NoSuchMethodException localNoSuchMethodException1 )
			{
				Constructor localConstructor = localClass.getConstructor( new Class[0] );
				localJposRegPopulator = ( JposRegPopulator ) localConstructor.newInstance( new Object[0] );
			}
		}
		catch ( ClassNotFoundException localClassNotFoundException )
		{
			tracer.println( "Could not find populator class with name: " + paramString2 + " exception message = " + localClassNotFoundException.getMessage() );
		}
		catch ( NoSuchMethodException localNoSuchMethodException2 )
		{
			tracer.println( "Populator by class name: " + paramString2 + " must define a no-arg ctor or a 1-arg ctor with String param as the unique ID" );
		}
		catch ( InstantiationException localInstantiationException )
		{
			tracer.println( "Could not instantiate populator class with name: " + paramString2 + " exception message = " + localInstantiationException.getMessage() );
		}
		catch ( Exception localException )
		{
			tracer.println( "Could not instantiate populator class with name: " + paramString2 + " exception message = " + localException.getMessage() );
		}
		return localJposRegPopulator;
	}

	protected void setDefaultPopulator( JposRegPopulator paramJposRegPopulator ) throws IllegalArgumentException
	{
		if ( paramJposRegPopulator == null )
		{
			throw new IllegalArgumentException( "Null value cannot be used for default JposRegPopualtor" );
		}
		if ( ( paramJposRegPopulator.getUniqueId() == null ) || ( "".equals( paramJposRegPopulator.getUniqueId() ) ) )
		{
			throw new IllegalArgumentException( "Default JposRegPopualtor cannot have a unique ID of null or empty string" );
		}
		add( paramJposRegPopulator );
		defaultPop = paramJposRegPopulator;
	}

	public String getUniqueId()
	{
		return getClassName();
	}

	public String getClassName()
	{
		return DefaultCompositeRegPopulator.class.getName();
	}

	public void save( Enumeration paramEnumeration ) throws Exception
	{
		HashMap localHashMap = new HashMap();
		Iterator localIterator = popMap.values().iterator();
		while ( localIterator.hasNext() )
		{
			localHashMap.put( ( ( JposRegPopulator ) localIterator.next() ).getUniqueId(), new ArrayList() );
		}
		JposRegPopulator localJposRegPopulator;
		Object localObject2;
		while ( paramEnumeration.hasMoreElements() )
		{
			JposEntry localObject1 = ( JposEntry ) paramEnumeration.nextElement();
			localJposRegPopulator = ( ( JposEntry ) localObject1 ).getRegPopulator();
			if ( localJposRegPopulator == null )
			{
				localObject2 = ( Collection ) localHashMap.get( getDefaultPopulator().getUniqueId() );
				( ( Collection ) localObject2 ).add( localObject1 );
			}
			else
			{
				localObject2 = ( Collection ) localHashMap.get( localJposRegPopulator.getUniqueId() );
				if ( localObject2 == null )
				{
					tracer.println( "Trying to save entry with logicalName = " + ( ( JposEntry ) localObject1 ).getLogicalName() + " and populator with" );
				}
				else
				{
					( ( Collection ) localObject2 ).add( localObject1 );
				}
			}
		}
		Exception localObject1 = null;
		localIterator = popMap.values().iterator();
		while ( localIterator.hasNext() )
		{
			localJposRegPopulator = ( JposRegPopulator ) localIterator.next();
			localObject2 = localJposRegPopulator.getUniqueId();
			Collection localCollection = ( Collection ) localHashMap.get( localObject2 );
			try
			{
				if ( popFileMap.get( localJposRegPopulator.getUniqueId() ) != null )
				{
					localJposRegPopulator.save( new Vector( localCollection ).elements(), ( String ) popFileMap.get( localJposRegPopulator.getUniqueId() ) );
				}
				else
				{
					localJposRegPopulator.save( new Vector( localCollection ).elements() );
				}
			}
			catch ( Exception localException )
			{
				localObject1 = localException;
				tracer.println( "Error while saving to populator with unique ID:" + localJposRegPopulator.getUniqueId() );
			}
		}
		if ( localObject1 != null )
			throw localObject1;
	}

	public void save( Enumeration paramEnumeration, String paramString ) throws Exception
	{
		getDefaultPopulator().save( paramEnumeration, paramString );
	}

	public void load()
	{
		JposProperties localJposProperties = JposServiceLoader.getManager().getProperties();
		MultiProperty localMultiProperty1 = localJposProperties.getMultiProperty( "jpos.config.populator.class" );
		MultiProperty localMultiProperty2 = localJposProperties.getMultiProperty( "jpos.config.populator.file" );
		if ( localMultiProperty1.getNumberOfProperties() == 0 )
		{
			tracer.println( "CompositeRegPopulator.load() w/o any defined multi-property" );
			throw new RuntimeException( "CompositeRegPopulator.load() w/o any defined multi-property" );
		}
		Iterator localIterator = localMultiProperty1.getSortedPropertyNames();
		String str1 = ( String ) localIterator.next();
		String str2 = localMultiProperty1.getPropertyString( str1 );
		int i = localMultiProperty1.propertyNumber( str1 );
		JposRegPopulator localJposRegPopulator1 = createPopulator( str1, str2 );
		String str3;
		if ( ( localMultiProperty2 != null ) && ( localMultiProperty2.getNumberOfProperties() > 0 ) )
		{
			str3 = localMultiProperty2.getPropertyString( i );
			if ( str3 != null )
			{
				localJposRegPopulator1.load( str3 );
				lastLoadException = localJposRegPopulator1.getLastLoadException();
				popFileMap.put( localJposRegPopulator1.getUniqueId(), str3 );
			}
			else
			{
				tracer.println( "Created default populator with name = " + str1 + " OK but populator file is null" );
				localJposRegPopulator1.load();
				lastLoadException = localJposRegPopulator1.getLastLoadException();
			}
		}
		else
		{
			localJposRegPopulator1.load();
			lastLoadException = localJposRegPopulator1.getLastLoadException();
		}
		if ( localJposRegPopulator1 != null )
		{
			setDefaultPopulator( localJposRegPopulator1 );
		}
		else
		{
			tracer.println( "Did not add default populator by <name, className>: <" + str1 + ", " + str2 + ">" );
		}
		while ( localIterator.hasNext() )
		{
			str3 = ( String ) localIterator.next();
			String str4 = localMultiProperty1.getPropertyString( str3 );
			int j = localMultiProperty1.propertyNumber( str3 );
			JposRegPopulator localJposRegPopulator2 = createPopulator( str3, str4 );
			if ( localJposRegPopulator2 != null )
			{
				if ( ( localMultiProperty2 != null ) && ( localMultiProperty2.getNumberOfProperties() > 0 ) )
				{
					String str5 = localMultiProperty2.getPropertyString( j );
					localJposRegPopulator2.load( str5 );
					popFileMap.put( localJposRegPopulator2.getUniqueId(), str5 );
				}
				else
				{
					tracer.println( "Created populator with name = " + str3 + " OK but populator file is null" );
					localJposRegPopulator2.load();
					lastLoadException = localJposRegPopulator2.getLastLoadException();
				}
				add( localJposRegPopulator2 );
			}
			else
			{
				tracer.println( "Did not add populator by <name, className>: <" + str3 + ", " + str4 + ">" );
			}
		}
	}

	public void load( String paramString )
	{
		getDefaultPopulator().load( paramString );
	}

	public URL getEntriesURL()
	{
		return getDefaultPopulator().getEntriesURL();
	}

	public Enumeration getEntries()
	{
		Vector localVector = new Vector();
		Iterator localIterator = getPopulators();
		while ( localIterator.hasNext() )
		{
			JposRegPopulator localJposRegPopulator = ( JposRegPopulator ) localIterator.next();
			Enumeration localEnumeration = localJposRegPopulator.getEntries();
			while ( localEnumeration.hasMoreElements() )
			{
				localVector.add( localEnumeration.nextElement() );
			}
		}
		return localVector.elements();
	}

	public boolean isComposite()
	{
		return true;
	}

	public String getName()
	{
		return "JCL Composite Entries Populator";
	}

	public Exception getLastLoadException()
	{
		return lastLoadException;
	}

	public String toString()
	{
		return getName();
	}

	public JposRegPopulator getDefaultPopulator()
	{
		return defaultPop;
	}

	public void add( JposRegPopulator paramJposRegPopulator )
	{
		popMap.put( paramJposRegPopulator.getUniqueId(), paramJposRegPopulator );
	}

	public void remove( JposRegPopulator paramJposRegPopulator )
	{
		popMap.remove( paramJposRegPopulator.getUniqueId() );
	}

	public Iterator getPopulators()
	{
		return popMap.values().iterator();
	}

	public JposRegPopulator getPopulator( String paramString )
	{
		return ( JposRegPopulator ) popMap.get( paramString );
	}

	public int size()
	{
		return popMap.size();
	}
}
