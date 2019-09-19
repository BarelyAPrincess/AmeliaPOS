/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.util;

import java.io.PrintStream;

/**
 * @deprecated
 */
public class Tracer
{
	private boolean tracerOn = false;
	private TracerOutput onTracerOutput = new DefaultTracerOutput();
	private TracerOutput offTracerOutput = new TracerOutput()
	{
		public void println( String paramAnonymousString )
		{
		}

		public void print( String paramAnonymousString )
		{
		}
	};
	private static Tracer instance = null;

	public static Tracer getInstance()
	{
		if ( instance == null )
		{
			instance = new Tracer();
			instance.init();
		}
		return instance;
	}

	public void println( String paramString )
	{
		getTracerOutput().println( paramString );
	}

	public void print( String paramString )
	{
		getTracerOutput().print( paramString );
	}

	public void setOn( boolean paramBoolean )
	{
		tracerOn = paramBoolean;
	}

	public boolean isOn()
	{
		return tracerOn;
	}

	private void init()
	{
		DefaultProperties localDefaultProperties = new DefaultProperties();
		localDefaultProperties.loadJposProperties();
		if ( !localDefaultProperties.isPropertyDefined( "jpos.util.tracing" ) )
		{
			setOn( false );
		}
		else
		{
			String str = localDefaultProperties.getPropertyString( "jpos.util.tracing" );
			if ( ( str.equalsIgnoreCase( "ON" ) ) || ( str.equalsIgnoreCase( "TRUE" ) ) )
			{
				setOn( true );
			}
		}
	}

	private TracerOutput getTracerOutput()
	{
		return isOn() ? onTracerOutput : offTracerOutput;
	}

	static class DefaultTracerOutput implements TracerOutput
	{
		public void println( String paramString )
		{
			System.err.println( paramString );
		}

		public void print( String paramString )
		{
			System.err.print( paramString );
		}
	}
}
