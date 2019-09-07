package jpos.loader.simple;

import java.lang.reflect.Constructor;
import java.util.Hashtable;

import jpos.JposException;
import jpos.config.JposEntry;
import jpos.loader.JposServiceConnection;
import jpos.loader.JposServiceInstance;
import jpos.loader.JposServiceInstanceFactory;
import jpos.util.tracing.Tracer;
import jpos.util.tracing.TracerFactory;

public class SimpleServiceConnection implements JposServiceConnection
{
	private static Hashtable siFactoryTable = new Hashtable();
	private JposServiceInstance service = null;
	private JposEntry entry = null;
	private String logicalName = null;
	private String siFactoryClassName = null;
	private Tracer tracer = TracerFactory.getInstance().createTracer( "SimpleServiceConnection" );

	SimpleServiceConnection( String paramString1, JposEntry paramJposEntry, String paramString2 )
	{
		logicalName = paramString1;
		entry = paramJposEntry;
		siFactoryClassName = paramString2;
	}

	public JposServiceInstance getService()
	{
		return service;
	}

	public String getLogicalName()
	{
		return logicalName;
	}

	public void connect() throws JposException
	{
		try
		{
			Class[] arrayOfClass = new Class[2];
			arrayOfClass[0] = Class.forName( "java.lang.String" );
			arrayOfClass[1] = Class.forName( "jpos.config.JposEntry" );
			JposServiceInstanceFactory localObject = null;
			if ( siFactoryTable.containsKey( siFactoryClassName ) )
			{
				localObject = ( JposServiceInstanceFactory ) siFactoryTable.get( siFactoryClassName );
			}
			else
			{
				Class localClass = Class.forName( siFactoryClassName );
				Constructor localConstructor = localClass.getConstructor( new Class[0] );
				localObject = ( JposServiceInstanceFactory ) localConstructor.newInstance( new Object[0] );
				siFactoryTable.put( siFactoryClassName, localObject );
			}
			service = ( ( JposServiceInstanceFactory ) localObject ).createInstance( logicalName, entry );
		}
		catch ( Exception localException )
		{
			Object localObject = "Could not connect to service with logicalName = " + logicalName + ": Exception.message=" + localException.getMessage();
			tracer.println( ( String ) localObject );
			throw new JposException( 104, ( String ) localObject, localException );
		}
	}

	public void disconnect() throws JposException
	{
		if ( service != null )
		{
			service.deleteInstance();
			service = null;
		}
		tracer.println( "Disconnected to service OK" );
	}

	protected void finalize() throws JposException
	{
		disconnect();
	}
}
