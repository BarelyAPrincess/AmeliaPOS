package jpos.util.tracing;

public abstract interface TracerOutput
{
	public abstract String getPrefix();

	public abstract void close();

	public abstract void println( String paramString );

	public abstract void print( String paramString );

	public abstract void print( Exception paramException );

	public abstract void flush();
}
