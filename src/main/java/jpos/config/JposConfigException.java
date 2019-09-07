package jpos.config;

import jpos.JposException;

public class JposConfigException extends JposException
{
	public JposConfigException( String paramString )
	{
		super( 0, paramString );
	}

	public JposConfigException( String paramString, Exception paramException )
	{
		super( 0, paramString, paramException );
	}
}
