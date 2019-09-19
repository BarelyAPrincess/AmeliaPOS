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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import jpos.util.tracing.Tracer;
import jpos.util.tracing.TracerFactory;

public class FileUtil
{
	private static Tracer tracer = TracerFactory.getInstance().createTracer( "FileUtil" );

	protected static synchronized List getCpDirList()
	{
		String str1 = System.getProperty( "java.class.path" );
		LinkedList localLinkedList = new LinkedList();
		StringTokenizer localStringTokenizer = new StringTokenizer( str1, File.pathSeparator );
		while ( localStringTokenizer.hasMoreTokens() )
		{
			String str2 = localStringTokenizer.nextToken();
			if ( ( str2.toLowerCase().endsWith( "jar" ) ) || ( str2.toLowerCase().endsWith( "zip" ) ) )
			{
				localLinkedList.add( str2.substring( 0, str2.lastIndexOf( File.separator ) ) );
			}
			else
			{
				localLinkedList.add( str2 );
			}
		}
		return localLinkedList;
	}

	protected static synchronized List getJarList()
	{
		String str1 = System.getProperty( "java.class.path" );
		LinkedList localLinkedList = new LinkedList();
		StringTokenizer localStringTokenizer = new StringTokenizer( str1, File.pathSeparator );
		while ( localStringTokenizer.hasMoreTokens() )
		{
			String str2 = localStringTokenizer.nextToken();
			if ( ( str2.toLowerCase().endsWith( "jar" ) ) || ( str2.toLowerCase().endsWith( "zip" ) ) )
			{
				localLinkedList.add( str2 );
			}
		}
		return localLinkedList;
	}

	protected static synchronized JarEntry getJarEntry( JarFile paramJarFile, String paramString )
	{
		tracer.println( "<getJarEntry jarFile=" + paramJarFile + " fileName=" + paramString + ">" );
		if ( paramJarFile == null )
		{
			return null;
		}
		Enumeration localEnumeration = paramJarFile.entries();
		while ( localEnumeration.hasMoreElements() )
		{
			JarEntry localJarEntry = ( JarEntry ) localEnumeration.nextElement();
			if ( localJarEntry.getName().equals( paramString ) )
			{
				tracer.println( "jarEntry.getName()=" + localJarEntry.getName() );
				return localJarEntry;
			}
		}
		tracer.println( "<message>Could not find JarEntry with fileName=" + paramString + "</message>" );
		tracer.println( "</getJarEntry>" );
		return null;
	}

	protected static synchronized JarFile lookForFileInJars( String paramString )
	{
		try
		{
			tracer.println( "<lookForFileInJars fileName=" + paramString + ">" );
			String str1 = System.getProperty( "java.class.path" );
			tracer.println( "classpath=" + str1 );
			List localList1 = getJarList();
			List localList2 = getCpDirList();
			for ( int i = 0; i < localList1.size(); i++ )
			{
				String str2 = ( String ) localList1.get( i );
				tracer.println( "jarFileName=" + str2 );
				JarFile localJarFile1 = new JarFile( new File( str2 ) );
				JarEntry localJarEntry = getJarEntry( localJarFile1, paramString );
				if ( localJarEntry != null )
				{
					JarFile localJarFile2 = localJarFile1;
					return localJarFile2;
				}
			}
			return null;
		}
		catch ( Exception localException )
		{
			return null;
		}
		finally
		{
			tracer.println( "</lookForFileInJars>" );
		}
	}

	public static synchronized boolean locateFile( String paramString, boolean paramBoolean1, boolean paramBoolean2 )
	{
		File localFile = findFile( paramString, paramBoolean1 );
		if ( localFile != null )
		{
			return true;
		}
		if ( paramBoolean2 )
		{
			JarFile localJarFile = lookForFileInJars( paramString );
			if ( localJarFile != null )
			{
				return true;
			}
		}
		return false;
	}

	public static synchronized File findFile( String paramString, boolean paramBoolean )
	{
		try
		{
			File localFile1 = new File( paramString );
			if ( localFile1.exists() )
			{
				return localFile1;
			}
			List localList1 = getJarList();
			List localList2 = getCpDirList();
			if ( paramBoolean )
			{
				for ( int i = 0; i < localList2.size(); i++ )
				{
					String str = ( String ) localList2.get( i );
					File localFile2 = new File( str + File.separator + paramString );
					if ( localFile2.exists() )
					{
						return localFile2;
					}
				}
			}
			return null;
		}
		catch ( Exception localException )
		{
		}
		return null;
	}

	public static synchronized InputStream loadFile( String paramString, boolean paramBoolean1, boolean paramBoolean2 ) throws FileNotFoundException, IOException
	{
		tracer.println( "<loadFile fileName=" + paramString + " searchInClassPath=" + paramBoolean1 + " searchInJarFile=" + paramBoolean2 + ">" );
		File localFile = findFile( paramString, paramBoolean1 );
		if ( localFile != null )
		{
			return new FileInputStream( localFile );
		}
		if ( ( localFile == null ) && ( !paramBoolean2 ) )
		{
			throw new FileNotFoundException( "Could not find file: " + paramString );
		}
		JarFile localJarFile = lookForFileInJars( paramString );
		if ( localJarFile == null )
		{
			throw new FileNotFoundException( "Could not find file: " + paramString );
		}
		JarEntry localJarEntry = getJarEntry( localJarFile, paramString );
		if ( localJarEntry != null )
		{
			return localJarFile.getInputStream( localJarEntry );
		}
		throw new FileNotFoundException( "Could not find file: " + paramString );
	}
}
