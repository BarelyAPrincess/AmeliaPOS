package jpos.loader;

import jpos.JposException;

public class JposLoaderException extends JposException
{
	public JposLoaderException( String paramString )
	{
		super( 0, paramString );
	}

	public JposLoaderException( String paramString, Exception paramException )
	{
		super( 0, paramString, paramException );
	}
}
