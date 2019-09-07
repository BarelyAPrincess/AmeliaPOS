package jpos.util;

import java.io.PrintStream;

import jpos.loader.JposServiceLoader;
import jpos.loader.JposServiceManager;

public class JposPropertiesViewer
{
	public static void main( String[] paramArrayOfString )
	{
		System.out.println( "<!-- JavaPOS jpos.config/loader (JCL) defined Java properties: -->" );
		System.out.println( "<!-- name = \"propName\" value = \"propValue\" -->" );
		System.out.println( JposServiceLoader.getManager().getProperties() );
	}
}
