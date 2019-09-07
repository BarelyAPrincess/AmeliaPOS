package jpos.config.simple;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import jpos.config.JposRegPopulator;
import jpos.loader.JposServiceLoader;
import jpos.loader.JposServiceManager;
import jpos.util.JposProperties;
import jpos.util.tracing.Tracer;
import jpos.util.tracing.TracerFactory;

public abstract class AbstractRegPopulator implements JposRegPopulator
{
	private Hashtable jposEntries = new Hashtable();
	private InputStream populatorIS = null;
	private OutputStream populatorOS = null;
	private String populatorFileName = "";
	private String populatorFileURL = "";
	private String uniqueId = "";
	protected Exception lastLoadException = null;
	private Tracer tracer = TracerFactory.getInstance().createTracer( "AbstractRegPopulator" );

	public AbstractRegPopulator( String paramString )
	{
		setUniqueId( paramString );
	}

	public abstract void save( Enumeration paramEnumeration ) throws Exception;

	public abstract void save( Enumeration paramEnumeration, String paramString ) throws Exception;

	public abstract void load();

	public abstract void load( String paramString );

	public abstract URL getEntriesURL();

	public abstract String getName();

	public String getUniqueId()
	{
		return uniqueId.equals( "" ) ? getClassName() : uniqueId;
	}

	public Enumeration getEntries()
	{
		Vector localVector = new Vector();
		Enumeration localEnumeration = jposEntries.elements();
		while ( localEnumeration.hasMoreElements() )
		{
			localVector.addElement( localEnumeration.nextElement() );
		}
		return localVector.elements();
	}

	public boolean isComposite()
	{
		return false;
	}

	public String toString()
	{
		return getName();
	}

	public Exception getLastLoadException()
	{
		return lastLoadException;
	}

	protected URL createURLFromFile( File paramFile )
	{
		URL localURL = null;
		try
		{
			localURL = new URL( "file", "", paramFile.getAbsolutePath() );
		}
		catch ( Exception localException )
		{
			tracer.println( "Error creating URL: Exception.message=" + localException.getMessage() );
		}
		return localURL;
	}

	protected URL createURLFromFile( ZipFile paramZipFile )
	{
		URL localURL = null;
		try
		{
			localURL = new URL( "jar", "", new File( paramZipFile.getName() ).getAbsolutePath() );
		}
		catch ( Exception localException )
		{
			tracer.println( "Error creating URL: Exception.message=" + localException.getMessage() );
		}
		return localURL;
	}

	protected Hashtable getJposEntries()
	{
		return jposEntries;
	}

	protected boolean isPopulatorFileDefined()
	{
		boolean bool = false;
		JposProperties localJposProperties = JposServiceLoader.getManager().getProperties();
		if ( localJposProperties.isPropertyDefined( "jpos.config.populatorFile" ) )
		{
			bool = true;
		}
		else if ( localJposProperties.isPropertyDefined( "jpos.config.populatorFileURL" ) )
		{
			bool = true;
		}
		return bool;
	}

	protected InputStream getPopulatorFileIS() throws Exception
	{
		JposProperties localJposProperties = JposServiceLoader.getManager().getProperties();
		if ( localJposProperties.isPropertyDefined( "jpos.config.populatorFile" ) )
		{
			populatorFileName = localJposProperties.getPropertyString( "jpos.config.populatorFile" );
			tracer.println( "getPopulatorFileIS(): populatorFileName=" + populatorFileName );
			populatorIS = new FileInputStream( populatorFileName );
		}
		else
		{
			Object localObject;
			if ( localJposProperties.isPropertyDefined( "jpos.config.populatorFileURL" ) )
			{
				populatorFileURL = localJposProperties.getPropertyString( "jpos.config.populatorFileURL" );
				localObject = new URL( populatorFileURL );
				populatorIS = ( ( URL ) localObject ).openStream();
				tracer.println( "getPopulatorFileIS(): populatorFileURL=" + populatorFileURL );
			}
			else
			{
				localObject = "jpos.config.populatorFile OR  jpos.config.populatorFileURL properties not defined";
				tracer.println( ( String ) localObject );
				throw new Exception( ( String ) localObject );
			}
		}
		return populatorIS;
	}

	protected OutputStream getPopulatorFileOS() throws Exception
	{
		JposProperties localJposProperties = JposServiceLoader.getManager().getProperties();
		if ( localJposProperties.isPropertyDefined( "jpos.config.populatorFile" ) )
		{
			populatorFileName = localJposProperties.getPropertyString( "jpos.config.populatorFile" );
			populatorOS = new FileOutputStream( populatorFileName );
		}
		else
		{
			Object localObject;
			if ( localJposProperties.isPropertyDefined( "jpos.config.populatorFileURL" ) )
			{
				populatorFileURL = localJposProperties.getPropertyString( "jpos.config.populatorFileURL" );
				localObject = new URL( populatorFileURL );
				populatorOS = ( ( URL ) localObject ).openConnection().getOutputStream();
			}
			else
			{
				localObject = "jpos.config.populatorFile OR jpos.config.populatorFileURL properties not defined";
				tracer.println( ( String ) localObject );
				throw new Exception( ( String ) localObject );
			}
		}
		return populatorOS;
	}

	protected String getPopulatorFileName()
	{
		return populatorFileName;
	}

	protected String getPopulatorFileURL()
	{
		return populatorFileURL;
	}

	protected void setUniqueId( String paramString )
	{
		uniqueId = paramString;
	}

	protected InputStream findFileInClasspath( String paramString )
	{
		String str1 = System.getProperty( "java.class.path" );
		String str2 = System.getProperty( "path.separator" );
		String str3 = System.getProperty( "file.separator" );
		BufferedInputStream localBufferedInputStream = null;
		if ( ( paramString.startsWith( "." ) ) || ( paramString.startsWith( str3 ) ) )
		{
			try
			{
				localBufferedInputStream = new BufferedInputStream( new FileInputStream( paramString ) );
			}
			catch ( IOException localIOException )
			{
				localBufferedInputStream = null;
				tracer.println( "findFileInClasspath: IOException.msg=" + localIOException.getMessage() );
			}
			return localBufferedInputStream;
		}
		String str4 = "";
		Vector localVector = new Vector();
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
						localVector.addElement( str4 );
					}
					else
					{
						String str5 = str4 + ( ( paramString.startsWith( str3 ) ) || ( str4.endsWith( str3 ) ) ? "" : str3 ) + paramString;
						localBufferedInputStream = new BufferedInputStream( new FileInputStream( str5 ) );
						break;
					}
				}
			}
			catch ( Exception localException )
			{
			}
		}
		if ( localBufferedInputStream == null )
		{
			return findFileInJarZipFiles( paramString, localVector );
		}
		return localBufferedInputStream;
	}

	protected InputStream findFileInJarZipFiles( String paramString, Vector paramVector )
	{
		BufferedInputStream localBufferedInputStream = null;
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
					if ( str2.endsWith( paramString ) )
					{
						localBufferedInputStream = new BufferedInputStream( localZipFile.getInputStream( localZipEntry ) );
						break;
					}
				}
			}
			catch ( Exception localException )
			{
				tracer.println( "findInJarZipFiles: Exception.message=" + localException.getMessage() );
			}
			if ( localBufferedInputStream != null )
			{
				break;
			}
		}
		return localBufferedInputStream;
	}
}
