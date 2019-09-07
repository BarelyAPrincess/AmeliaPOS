package jpos.config;

import java.io.PrintStream;

public final class Version
{
	public static void main( String[] paramArrayOfString )
	{
		System.out.println( "JavaPOS jpos.config/loader (JCL) version " + jpos.loader.Version.getVersionString() );
	}

	public static String getVersionString()
	{
		return jpos.loader.Version.getVersionString();
	}
}
