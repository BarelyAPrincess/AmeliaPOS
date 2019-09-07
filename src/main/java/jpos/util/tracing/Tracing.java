package jpos.util.tracing;

public class Tracing
{
	private static Tracer tracer = TracerFactory.getInstance().createGlobalTracer();

	public static void println( Object paramObject )
	{
		tracer.println( paramObject.toString() );
	}

	public static void print( Object paramObject )
	{
		tracer.print( paramObject.toString() );
	}

	public static void print( Exception paramException )
	{
		tracer.print( paramException );
	}

	public static void flush()
	{
		tracer.flush();
	}

	public static void setOn( boolean paramBoolean )
	{
		tracer.setOn( paramBoolean );
	}

	public static boolean isOn()
	{
		return tracer.isOn();
	}
}
