package jpos.loader.simple;

import jpos.JposException;
import jpos.config.DefaultCompositeRegPopulator;
import jpos.config.JposEntry;
import jpos.config.JposEntryRegistry;
import jpos.config.JposRegPopulator;
import jpos.config.simple.SimpleEntryRegistry;
import jpos.config.simple.SimpleRegPopulator;
import jpos.loader.JposServiceConnection;
import jpos.loader.JposServiceManager;
import jpos.profile.DefaultProfileRegistry;
import jpos.profile.Profile;
import jpos.profile.ProfileException;
import jpos.profile.ProfileFactory;
import jpos.profile.ProfileRegistry;
import jpos.profile.XercesProfileFactory;
import jpos.util.DefaultProperties;
import jpos.util.JposProperties;
import jpos.util.tracing.Tracer;
import jpos.util.tracing.TracerFactory;

public class SimpleServiceManager implements JposServiceManager
{
	private JposRegPopulator regPopulator = null;
	private SimpleEntryRegistry entryRegistry = null;
	private ProfileRegistry profileRegistry = null;
	private ProfileFactory profileFactory = null;
	private JposProperties jposProperties = new DefaultProperties();
	private Tracer tracer = TracerFactory.getInstance().createTracer( "SimpleServiceManager" );

	/**
	 * @deprecated
	 */
	public SimpleServiceManager()
	{
		getProperties().loadJposProperties();
		init();
	}

	public SimpleServiceManager( JposProperties paramJposProperties )
	{
		jposProperties = paramJposProperties;
		init();
	}

	private void init()
	{
		initEntryRegistry();
	}

	private void initEntryRegistry()
	{
		initRegPopulator();
		entryRegistry = new SimpleEntryRegistry( regPopulator );
	}

	private void initRegPopulator()
	{
		JposProperties localJposProperties = getProperties();
		if ( localJposProperties.isPropertyDefined( "jpos.config.regPopulatorClass" ) )
		{
			String str = localJposProperties.getPropertyString( "jpos.config.regPopulatorClass" );
			try
			{
				Class localClass = Class.forName( str );
				regPopulator = ( ( JposRegPopulator ) localClass.newInstance() );
			}
			catch ( Exception localException )
			{
				tracer.println( "Could not create populator by name: " + str + " Exception.message= " + localException.getMessage() );
				regPopulator = new SimpleRegPopulator();
			}
		}
		else if ( localJposProperties.hasMultiProperty( "jpos.config.populator.class" ) )
		{
			regPopulator = new DefaultCompositeRegPopulator();
		}
		else
		{
			regPopulator = new SimpleRegPopulator();
		}
	}

	private ProfileFactory getProfileFactory()
	{
		if ( profileFactory == null )
		{
			profileFactory = new XercesProfileFactory();
		}
		return profileFactory;
	}

	public JposEntryRegistry getEntryRegistry()
	{
		return entryRegistry;
	}

	public JposProperties getProperties()
	{
		return jposProperties;
	}

	public JposRegPopulator getRegPopulator()
	{
		return regPopulator;
	}

	public JposServiceConnection createConnection( String paramString ) throws JposException
	{
		SimpleServiceConnection localSimpleServiceConnection = null;
		try
		{
			JposEntry localJposEntry = entryRegistry.getJposEntry( paramString );
			if ( localJposEntry == null )
			{
				throw new JposException( 109, "Service does not exist in loaded JCL registry" );
			}
			String str = ( String ) localJposEntry.getPropertyValue( "serviceInstanceFactoryClass" );
			localSimpleServiceConnection = new SimpleServiceConnection( paramString, localJposEntry, str );
		}
		catch ( JposException localJposException )
		{
			tracer.println( "createConnection: JposException.msg=" + localJposException.getMessage() );
			throw localJposException;
		}
		catch ( Exception localException )
		{
			tracer.println( "createConnection: Exception.msg=" + localException.getMessage() );
			throw new JposException( 104, "Could not find service" );
		}
		return localSimpleServiceConnection;
	}

	public ProfileRegistry getProfileRegistry()
	{
		if ( profileRegistry == null )
		{
			profileRegistry = new DefaultProfileRegistry();
		}
		return profileRegistry;
	}

	public Profile loadProfile( String paramString ) throws ProfileException
	{
		Profile localProfile = getProfileFactory().createProfile( paramString );
		if ( localProfile != null )
		{
			profileRegistry.addProfile( localProfile );
		}
		return localProfile;
	}

	public void reloadEntryRegistry()
	{
		getProperties().loadJposProperties();
		initEntryRegistry();
		getEntryRegistry().load();
		tracer.println( "Sucessfully reloaded registry" );
	}
}
