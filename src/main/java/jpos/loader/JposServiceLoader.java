package jpos.loader;

import java.lang.reflect.Constructor;

import jpos.JposException;
import jpos.config.JposEntryRegistry;
import jpos.loader.simple.SimpleServiceManager;
import jpos.util.DefaultProperties;
import jpos.util.JposProperties;
import jpos.util.tracing.Tracer;
import jpos.util.tracing.TracerFactory;

public final class JposServiceLoader
{
	private static Tracer tracer = TracerFactory.getInstance().createTracer( "JposServiceLoader" );
	private static JposServiceManager manager = null;

	public static JposServiceConnection findService( String paramString ) throws JposException
	{
		if ( manager == null )
		{
			String str = "Did not find a valid jpos.config.serviceManagerClass to create";
			tracer.println( str );
			throw new JposException( 104, str );
		}
		tracer.println( "findService: " + paramString );
		return manager.createConnection( paramString );
	}

	public static JposServiceManager getManager()
	{
		return manager;
	}

	static
	{
		DefaultProperties localDefaultProperties = new DefaultProperties();
		localDefaultProperties.loadJposProperties();
		int i = 0;
		String str = "";
		if ( localDefaultProperties.isPropertyDefined( "jpos.config.serviceManagerClass" ) )
		{
			i = 1;
			str = localDefaultProperties.getPropertyString( "jpos.config.serviceManagerClass" );
		}
		else if ( localDefaultProperties.isPropertyDefined( "jpos.loader.serviceManagerClass" ) )
		{
			i = 1;
			str = localDefaultProperties.getPropertyString( "jpos.loader.serviceManagerClass" );
		}
		if ( i != 0 )
		{
			tracer.println( "Custom manager is defined: className= " + str );
			try
			{
				Class localClass1 = Class.forName( str );
				Class localClass2 = Class.forName( "jpos.util.JposProperties" );
				Class[] arrayOfClass = {localClass2};
				Constructor localConstructor = localClass1.getConstructor( arrayOfClass );
				Object[] arrayOfObject = {localDefaultProperties};
				manager = ( JposServiceManager ) localConstructor.newInstance( arrayOfObject );
			}
			catch ( Exception localException )
			{
				tracer.println( "Error creating instance of specified jpos.config.serviceManagerClass class: " + str );
				tracer.println( "Using default manager class: jpos.loader.simple.SimpleServiceManager" );
				manager = new SimpleServiceManager( localDefaultProperties );
			}
		}
		else
		{
			manager = new SimpleServiceManager( localDefaultProperties );
		}
		manager.getEntryRegistry().load();
		tracer.println( "manager.getEntryRegistry().load() OK" );
	}
}
