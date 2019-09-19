/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.config.simple;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import jpos.config.JposEntry;
import jpos.util.tracing.Tracer;
import jpos.util.tracing.TracerFactory;

public class SimpleRegPopulator extends AbstractRegPopulator
{
	private File serFile = null;
	private ZipFile zipSerFile = null;
	private boolean serInZipFile = false;
	private String absoluteFileName = "";
	private String serFileName = "jpos.cfg";
	private Tracer tracer = TracerFactory.getInstance().createTracer( "SimpleRegPopulator" );
	public static final String DEFAULT_JPOS_SER_FILE_NAME = "jpos.cfg";
	public static final String TEMP_SER_FILE_NAME = "__jpos_temp.cfg";
	public static final String SIMPLE_REG_POPULATOR_NAME_STRING = "JCL Serialized Entries Populator";

	public SimpleRegPopulator()
	{
		super( SimpleRegPopulator.class.getName() );
	}

	public SimpleRegPopulator( String paramString )
	{
		super( paramString );
	}

	public String getClassName()
	{
		return SimpleRegPopulator.class.getName();
	}

	public void save( Enumeration paramEnumeration ) throws Exception
	{
		saveJposEntries( paramEnumeration );
	}

	public void save( Enumeration paramEnumeration, String paramString ) throws Exception
	{
		File localFile = new File( paramString );
		FileOutputStream localFileOutputStream = new FileOutputStream( localFile );
		saveJposEntries( paramEnumeration, localFileOutputStream );
		localFileOutputStream.close();
	}

	public void load()
	{
		getJposEntries().clear();
		Enumeration localEnumeration = readJposEntries();
		while ( localEnumeration.hasMoreElements() )
		{
			try
			{
				JposEntry localJposEntry = ( JposEntry ) localEnumeration.nextElement();
				String str = str = ( String ) localJposEntry.getPropertyValue( "logicalName" );
				if ( str != null )
				{
					getJposEntries().put( str, localJposEntry );
				}
				lastLoadException = null;
			}
			catch ( Exception localException )
			{
				lastLoadException = localException;
				tracer.println( "Error loading serialized JposEntry file: Exception.message= " + localException.getMessage() );
			}
		}
	}

	public void load( String paramString )
	{
		try
		{
			getJposEntries().clear();
			Enumeration localEnumeration = readJposEntries( new FileInputStream( paramString ) );
			while ( localEnumeration.hasMoreElements() )
			{
				JposEntry localJposEntry = ( JposEntry ) localEnumeration.nextElement();
				String str = ( String ) localJposEntry.getPropertyValue( "logicalName" );
				if ( str != null )
				{
					getJposEntries().put( str, localJposEntry );
				}
			}
			lastLoadException = null;
		}
		catch ( Exception localException )
		{
			lastLoadException = localException;
			tracer.println( "Error loading serialized JposEntry file: Exception.message=" + localException.getMessage() );
		}
	}

	public URL getEntriesURL()
	{
		URL localURL = null;
		if ( serInZipFile )
		{
			localURL = createURLFromFile( zipSerFile );
		}
		else
		{
			localURL = createURLFromFile( serFile );
		}
		return localURL;
	}

	public String getName()
	{
		return "JCL Serialized Entries Populator";
	}

	protected void saveSerInZipFile( Enumeration paramEnumeration ) throws Exception
	{
		ZipOutputStream localZipOutputStream = new ZipOutputStream( new FileOutputStream( zipSerFile.getName() + ".temp.jar" ) );
		Enumeration localEnumeration = zipSerFile.entries();
		while ( localEnumeration.hasMoreElements() )
		{
			ZipEntry localZipEntry = ( ZipEntry ) localEnumeration.nextElement();
			localZipOutputStream.putNextEntry( localZipEntry );
			Object localObject1;
			Object localObject2;
			if ( localZipEntry.getName() != serFileName )
			{
				localObject1 = zipSerFile.getInputStream( localZipEntry );
				while ( ( ( InputStream ) localObject1 ).available() > 0 )
				{
					localObject2 = new byte[( ( InputStream ) localObject1 ).available()];
					( ( InputStream ) localObject1 ).read( ( byte[] ) localObject2 );
					localZipOutputStream.write( ( byte[] ) localObject2 );
				}
				localZipOutputStream.closeEntry();
			}
			else
			{
				localObject1 = new ObjectOutputStream( new FileOutputStream( "__jpos_temp.cfg" ) );
				while ( paramEnumeration.hasMoreElements() )
				{
					localObject2 = ( JposEntry ) paramEnumeration.nextElement();
					( ( ObjectOutputStream ) localObject1 ).writeObject( localObject2 );
				}
				( ( ObjectOutputStream ) localObject1 ).flush();
				( ( ObjectOutputStream ) localObject1 ).close();
				localObject2 = new FileInputStream( "__jpos_temp.cfg" );
				while ( ( ( FileInputStream ) localObject2 ).available() > 0 )
				{
					byte[] arrayOfByte = new byte[( ( FileInputStream ) localObject2 ).available()];
					( ( FileInputStream ) localObject2 ).read( arrayOfByte );
					localZipOutputStream.write( arrayOfByte );
				}
				localZipOutputStream.closeEntry();
			}
		}
		localZipOutputStream.flush();
		localZipOutputStream.close();
	}

	protected void saveSerFile( Enumeration paramEnumeration ) throws Exception
	{
		saveJposEntries( paramEnumeration, new FileOutputStream( serFileName ) );
	}

	protected void saveJposEntries( Enumeration paramEnumeration, OutputStream paramOutputStream ) throws Exception
	{
		ObjectOutputStream localObjectOutputStream = new ObjectOutputStream( paramOutputStream );
		while ( paramEnumeration.hasMoreElements() )
		{
			JposEntry localJposEntry = ( JposEntry ) paramEnumeration.nextElement();
			localObjectOutputStream.writeObject( localJposEntry );
		}
		localObjectOutputStream.close();
	}

	protected ObjectInputStream findSerOIS()
	{
		Vector localVector = new Vector();
		ObjectInputStream localObjectInputStream = findSerOISInClasspath( localVector );
		if ( localObjectInputStream == null )
		{
			localObjectInputStream = findSerOISInJar( localVector );
		}
		return localObjectInputStream;
	}

	protected ObjectInputStream findSerOISInClasspath( Vector paramVector )
	{
		ObjectInputStream localObjectInputStream = null;
		String str1 = System.getProperty( "java.class.path" );
		String str2 = System.getProperty( "path.separator" );
		String str3 = System.getProperty( "file.separator" );
		String str4 = "";
		StringTokenizer localStringTokenizer = new StringTokenizer( str1, str2, false );
		while ( localStringTokenizer.hasMoreTokens() )
		{
			try
			{
				str4 = localStringTokenizer.nextToken().trim();
				if ( !str4.equals( "" ) )
				{
					if ( ( str4.length() > 4 ) && ( ( str4.endsWith( ".zip" ) ) || ( str4.endsWith( ".jar" ) ) ) )
					{
						paramVector.addElement( str4 );
					}
					else
					{
						absoluteFileName = ( str4 + str3 + serFileName );
						localObjectInputStream = new ObjectInputStream( new BufferedInputStream( new FileInputStream( absoluteFileName ) ) );
						serFile = new File( absoluteFileName );
						serInZipFile = false;
						break;
					}
				}
			}
			catch ( Exception localException )
			{
			}
		}
		return localObjectInputStream;
	}

	protected ObjectInputStream findSerOISInJar( Vector paramVector )
	{
		ObjectInputStream localObjectInputStream = null;
		for ( int i = 0; i < paramVector.size(); i++ )
		{
			String str1 = ( String ) paramVector.elementAt( i );
			try
			{
				ZipFile localZipFile = new ZipFile( str1 );
				Enumeration localEnumeration = localZipFile.entries();
				while ( localEnumeration.hasMoreElements() )
				{
					ZipEntry localZipEntry = ( ZipEntry ) localEnumeration.nextElement();
					String str2 = localZipEntry.getName();
					if ( str2.endsWith( serFileName ) )
					{
						localObjectInputStream = new ObjectInputStream( localZipFile.getInputStream( localZipEntry ) );
						zipSerFile = localZipFile;
						serInZipFile = true;
						break;
					}
				}
			}
			catch ( Exception localException )
			{
			}
			if ( localObjectInputStream != null )
			{
				break;
			}
		}
		return localObjectInputStream;
	}

	protected Enumeration readJposEntries( InputStream paramInputStream )
	{
		Vector localVector = new Vector();
		try
		{
			ObjectInputStream localObjectInputStream = null;
			if ( ( paramInputStream instanceof ObjectInputStream ) )
			{
				localObjectInputStream = ( ObjectInputStream ) paramInputStream;
			}
			else if ( paramInputStream != null )
			{
				localObjectInputStream = new ObjectInputStream( paramInputStream );
			}
			if ( localObjectInputStream == null )
			{
				tracer.println( "Can't find serialized JposEntry file: " + serFileName );
			}
			else
			{
				for ( ; ; )
				{
					localVector.addElement( localObjectInputStream.readObject() );
				}
			}
			serFileName = absoluteFileName;
		}
		catch ( EOFException localEOFException )
		{
		}
		catch ( Exception localException )
		{
			tracer.println( "ERROR while reading serialized JposEntry file: " + serFileName + " Exception.message=" + localException.getMessage() );
		}
		return localVector.elements();
	}

	protected Enumeration readJposEntries()
	{
		Enumeration localEnumeration = null;
		if ( isPopulatorFileDefined() )
		{
			try
			{
				localEnumeration = readJposEntries( getPopulatorFileIS() );
			}
			catch ( Exception localException )
			{
				localEnumeration = new Vector().elements();
			}
		}
		else
		{
			localEnumeration = readJposEntries( findSerOIS() );
		}
		return localEnumeration;
	}

	protected void saveJposEntries( Enumeration paramEnumeration ) throws Exception
	{
		if ( isPopulatorFileDefined() )
		{
			saveJposEntries( paramEnumeration, getPopulatorFileOS() );
		}
		else if ( serInZipFile )
		{
			saveSerInZipFile( paramEnumeration );
		}
		else
		{
			saveSerFile( paramEnumeration );
		}
	}
}
