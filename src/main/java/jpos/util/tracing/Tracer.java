package jpos.util.tracing;

import java.io.PrintStream;

import jpos.util.DefaultProperties;
import jpos.util.JposProperties;

public class Tracer
{
	private boolean tracerOn = false;
	private String tracerName = "";
	private boolean appendName = true;
	private TracerOutput customTracerOutput = null;
	private TracerOutput onTracerOutput = new DefaultTracerOutput();
	private TracerOutput offTracerOutput = new TracerOutput()
	{
		public void close()
		{
		}

		public String getPrefix()
		{
			return "";
		}

		public void print( Exception paramAnonymousException )
		{
		}

		public void println( String paramAnonymousString )
		{
		}

		public void print( String paramAnonymousString )
		{
		}

		public void flush()
		{
		}
	};
	private static Tracer instance = null;

	protected Tracer()
	{
		appendName = false;
	}

	Tracer( String paramString )
	{
		if ( ( paramString == null ) || ( paramString.equals( "" ) ) )
		{
			appendName = false;
			tracerName = "";
			onTracerOutput = new DefaultTracerOutput();
		}
		else
		{
			appendName = true;
			onTracerOutput = new DefaultTracerOutput( "[" + paramString + "]" );
			tracerName = paramString;
		}
	}

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

	public void println( Object paramObject )
	{
		getTracerOutput().println( paramObject.toString() );
	}

	public void print( String paramString )
	{
		getTracerOutput().print( paramString );
	}

	public void print( Object paramObject )
	{
		getTracerOutput().print( paramObject.toString() );
	}

	public void print( Exception paramException )
	{
		getTracerOutput().print( paramException );
	}

	public void flush()
	{
		getTracerOutput().flush();
	}

	public void setOn( boolean paramBoolean )
	{
		tracerOn = paramBoolean;
	}

	public boolean isOn()
	{
		return tracerOn;
	}

	public String getName()
	{
		return tracerName;
	}

	public void setAppendName( boolean paramBoolean )
	{
		appendName = paramBoolean;
	}

	public boolean isAppendName()
	{
		return appendName;
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
		if ( customTracerOutput != null )
		{
			return customTracerOutput;
		}
		return isOn() ? onTracerOutput : offTracerOutput;
	}

	void setTracerOutput( TracerOutput paramTracerOutput )
	{
		tracerOn = true;
		customTracerOutput = paramTracerOutput;
	}

	class DefaultTracerOutput implements TracerOutput
	{
		protected String prefix = "";
		protected PrintStream printStream = System.err;

		public DefaultTracerOutput()
		{
			prefix = "";
			appendName = false;
		}

		public DefaultTracerOutput( String paramString )
		{
			if ( paramString == null )
			{
				prefix = "";
			}
			else if ( paramString.equals( "" ) )
			{
				prefix = "";
			}
			else
			{
				prefix = paramString;
				appendName = true;
			}
		}

		public DefaultTracerOutput( String paramString, PrintStream paramPrintStream )
		{
			this( paramString );
			printStream = paramPrintStream;
		}

		public String getPrefix()
		{
			return prefix;
		}

		public void close()
		{
			getPrintStream().close();
		}

		public void println( String paramString )
		{
			getPrintStream().println( ( appendName ? prefix : "" ) + paramString );
		}

		public void print( String paramString )
		{
			getPrintStream().print( ( appendName ? prefix : "" ) + paramString );
		}

		public void print( Exception paramException )
		{
			if ( appendName )
			{
				System.err.println( "<" + prefix + ">" );
			}
			paramException.printStackTrace( getPrintStream() );
			if ( appendName )
			{
				System.err.println( "</" + prefix + ">" );
			}
		}

		public void flush()
		{
			getPrintStream().flush();
		}

		protected PrintStream getPrintStream()
		{
			return printStream;
		}

		protected void setPrintStream( PrintStream paramPrintStream )
		{
			printStream = paramPrintStream;
		}
	}
}
