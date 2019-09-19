/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.util.tracing;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import jpos.util.DefaultProperties;
import jpos.util.JposProperties;

public class TracerFactory
{
	private HashMap tracerMap = new HashMap();
	private HashMap namedTracerState = new HashMap();
	private Tracer globalTracer = Tracer.getInstance();
	private PrintStream printStream = null;
	private boolean turnOnAllNamedTracers = false;
	private static TracerFactory instance = null;
	public static final String TRACING_PROP_NAME = "jpos.tracing";
	public static final String TRACER_PROP_NAME = "jpos.util.tracing.Tracer";
	public static final String TURN_ON_NAMED_TRACERS_PROP_NAME = "jpos.util.tracing.TurnOnNamedTracers";
	public static final String TURN_ON_ALL_NAMED_TRACERS_PROP_NAME = "jpos.util.tracing.TurnOnAllNamedTracers";
	public static final String TRACER_OUTPUT_TO_FILE_PROP_NAME = "jpos.util.tracing.TracerOutputToFile";
	public static final String TRACER_OUTPUT_FILE_NAME_PROP_NAME = "jpos.util.tracing.TracerOutputFileName";
	public static final String TRACER_OUTPUT_FILE_LOCATION = "jpos.util.tracing.TracerOutputFileLocation";
	public static final String USER_HOME_LOCATION_VALUE = "<user.home>";

	public static TracerFactory getInstance()
	{
		if ( instance == null )
		{
			instance = new TracerFactory();
			instance.init();
		}
		return instance;
	}

	public void setOutputFile( File paramFile ) throws IOException
	{
	}

	public Tracer createGlobalTracer()
	{
		return globalTracer;
	}

	public Tracer createGlobalTracer( boolean paramBoolean )
	{
		globalTracer.setOn( paramBoolean );
		return globalTracer;
	}

	public Tracer createTracer( String paramString )
	{
		if ( tracerMap.containsKey( paramString ) )
		{
			return ( Tracer ) tracerMap.get( paramString );
		}
		Tracer localTracer = new Tracer( paramString );
		if ( namedTracerState.containsKey( paramString ) )
		{
			localTracer.setOn( ( ( Boolean ) namedTracerState.get( paramString ) ).booleanValue() );
		}
		else
		{
			localTracer.setOn( false );
		}
		if ( turnOnAllNamedTracers )
		{
			localTracer.setOn( true );
		}
		tracerMap.put( paramString, localTracer );
		return localTracer;
	}

	public Tracer createTracer( String paramString, boolean paramBoolean )
	{
		Tracer localTracer = createTracer( paramString );
		localTracer.setOn( paramBoolean );
		return localTracer;
	}

	protected void finalize()
	{
		if ( printStream != null )
		{
			printStream.close();
		}
	}

	private boolean isPropertyTrue( String paramString )
	{
		if ( paramString == null )
		{
			return false;
		}
		return ( paramString.equalsIgnoreCase( "ON" ) ) || ( paramString.equalsIgnoreCase( "TRUE" ) );
	}

	private void init()
	{
		DefaultProperties localDefaultProperties = new DefaultProperties();
		localDefaultProperties.loadJposProperties();
		initGlobalTracer( localDefaultProperties );
		initTurnedOnTracers( localDefaultProperties );
		initNamedTracers( localDefaultProperties );
		initTracerOutput();
	}

	private void initGlobalTracer( JposProperties paramJposProperties )
	{
		if ( !paramJposProperties.isPropertyDefined( "jpos.tracing" ) )
		{
			globalTracer.setOn( false );
		}
		else
		{
			String str = paramJposProperties.getPropertyString( "jpos.tracing" );
			if ( isPropertyTrue( str ) )
			{
				globalTracer.setOn( true );
			}
		}
	}

	private void initTurnedOnTracers( JposProperties paramJposProperties )
	{
		Object localObject;
		if ( paramJposProperties.isPropertyDefined( "jpos.util.tracing.TurnOnAllNamedTracers" ) )
		{
			localObject = paramJposProperties.getPropertyString( "jpos.util.tracing.TurnOnAllNamedTracers" );
			if ( isPropertyTrue( ( String ) localObject ) )
			{
				turnOnAllNamedTracers = true;
			}
			else
			{
				turnOnAllNamedTracers = false;
			}
		}
		else if ( paramJposProperties.isPropertyDefined( "jpos.util.tracing.TurnOnNamedTracers" ) )
		{
			localObject = paramJposProperties.getStringListProperty( "jpos.util.tracing.TurnOnNamedTracers" );
			for ( int i = 0; i < ( ( List ) localObject ).size(); i++ )
			{
				String str = ( ( List ) localObject ).get( i ).toString();
				namedTracerState.put( str, Boolean.TRUE );
			}
		}
	}

	private void initNamedTracers( JposProperties paramJposProperties )
	{
		Enumeration localEnumeration = paramJposProperties.getPropertyNames();
		while ( localEnumeration.hasMoreElements() )
		{
			String str1 = ( String ) localEnumeration.nextElement();
			if ( str1.startsWith( "jpos.util.tracing.Tracer" ) )
			{
				String str2 = str1.substring( "jpos.util.tracing.Tracer.".length(), str1.length() );
				if ( paramJposProperties.isPropertyDefined( str1 ) )
				{
					String str3 = paramJposProperties.getPropertyString( str1 );
					if ( ( str3.equalsIgnoreCase( "ON" ) ) || ( str3.equalsIgnoreCase( "TRUE" ) ) )
					{
						namedTracerState.put( str2, Boolean.TRUE );
					}
					else
					{
						namedTracerState.put( str2, Boolean.FALSE );
					}
				}
			}
		}
	}

	private void initTracerOutput()
	{
	}
}
