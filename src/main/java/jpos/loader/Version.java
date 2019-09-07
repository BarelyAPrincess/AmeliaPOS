package jpos.loader;

import java.io.PrintStream;

public final class Version
{
	private static final String JCL_VERSION_STRING = "2.2.0";

	public static void main( String[] paramArrayOfString )
	{
		System.out.println( "JavaPOS jpos.config/loader (JCL) version 2.2.0" );
	}

	public static String getVersionString()
	{
		return "2.2.0";
	}
}
