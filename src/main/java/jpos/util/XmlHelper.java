package jpos.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.Vector;

import jpos.util.tracing.Tracer;
import jpos.util.tracing.TracerFactory;

public class XmlHelper
{
	private String dtdFileName = "jcl.dtd";
	private String dtdFilePath = DEFAULT_DTD_FILE_PATH;
	private String dtdJarFullFileName = dtdFilePath + File.separator + dtdFileName;
	private boolean createdTempDTD = false;
	private boolean createdTempDir = false;
	private Tracer tracer = TracerFactory.getInstance().createTracer( "XmlHelper" );
	public static final String DEFAULT_DTD_FILE_NAME = "jcl.dtd";
	public static final String DEFAULT_DTD_FILE_PATH = "jpos" + File.separator + "res" + File.separator;

	public String getDtdFileName()
	{
		return dtdFileName;
	}

	public String getDtdFilePath()
	{
		return dtdFilePath;
	}

	public void setDtdFileName( String paramString )
	{
		dtdFileName = paramString;
	}

	public void setDtdFilePath( String paramString )
	{
		dtdFilePath = ( paramString + File.separator );
	}

	public void checkAndCreateTempDtd()
	{
		createdTempDTD = false;
		createdTempDir = false;
		InputStream localInputStream = null;
		dtdJarFullFileName = ( dtdFilePath + dtdFileName );
		try
		{
			File localFile1 = new File( dtdFilePath );
			File localFile2 = new File( dtdJarFullFileName );
			if ( localFile2.exists() )
			{
				return;
			}
			if ( !localFile1.exists() )
			{
				localFile1.mkdirs();
				createdTempDir = true;
				tracer.println( "DTD file PATH does not exist.  Created path " + dtdFilePath );
			}
			localInputStream = ClassLoader.getSystemClassLoader().getResourceAsStream( dtdJarFullFileName );
			tracer.println( "Got DTD InputStream from current ClassLoader" );
			if ( localInputStream != null )
			{
				readAndCreateTempDtdFile( localInputStream );
			}
			return;
		}
		catch ( IOException localIOException2 )
		{
			tracer.println( "Error creating DTD file: Exception.message = " + localIOException2.getMessage() );
		}
		finally
		{
			try
			{
				if ( localInputStream != null )
				{
					localInputStream.close();
				}
			}
			catch ( IOException localIOException5 )
			{
				tracer.println( "Error while closing streams: Exception.message = " + localIOException5.getMessage() );
			}
		}
	}

	public void removeTempDtd()
	{
		try
		{
			if ( createdTempDTD )
			{
				File localFile = new File( dtdJarFullFileName );
				localFile.delete();
				if ( createdTempDir )
				{
					removeDirs( dtdFilePath );
				}
				tracer.println( "Removed temp directory with DTD OK" );
			}
		}
		catch ( Exception localException )
		{
			tracer.println( "Error removing temporary DTD file: Exception.msg = " + localException.getMessage() );
		}
	}

	private void readAndCreateTempDtdFile( InputStream paramInputStream ) throws IOException
	{
		File localFile = new File( dtdJarFullFileName );
		FileOutputStream localFileOutputStream = new FileOutputStream( localFile );
		OutputStreamWriter localOutputStreamWriter = new OutputStreamWriter( localFileOutputStream );
		StringBuffer localStringBuffer = new StringBuffer();
		while ( paramInputStream.available() > 0 )
		{
			byte[] arrayOfByte = new byte[paramInputStream.available()];
			paramInputStream.read( arrayOfByte );
			localStringBuffer.append( new String( arrayOfByte ) );
		}
		localOutputStreamWriter.write( localStringBuffer.toString().trim() );
		createdTempDTD = true;
		try
		{
			if ( localOutputStreamWriter != null )
			{
				localOutputStreamWriter.close();
			}
			if ( localFileOutputStream != null )
			{
				localFileOutputStream.close();
			}
		}
		catch ( IOException localIOException )
		{
			tracer.println( "Error while closing streams: IOExeption.msg=" + localIOException.getMessage() );
		}
		tracer.println( "Read and created temp " + dtdFilePath + dtdFileName );
	}

	private Vector getSubdirNames( String paramString )
	{
		String str1 = paramString.replace( "\\".charAt( 0 ), "/".charAt( 0 ) );
		if ( !str1.endsWith( "/" ) )
		{
			str1 = str1 + "/";
		}
		Vector localVector = new Vector();
		for ( String str2 = str1; str2.indexOf( "/" ) != -1; str2 = str2.substring( str2.indexOf( "/" ) + 1 ) )
		{
			localVector.add( str2.substring( 0, str2.indexOf( "/" ) ) );
		}
		return localVector;
	}

	void removeDirs( String paramString ) throws IOException
	{
		Vector localVector1 = getSubdirNames( paramString );
		while ( localVector1.size() > 0 )
		{
			Vector localVector2 = ( Vector ) localVector1.clone();
			String str = "";
			for ( int i = 0; i < localVector1.size(); i++ )
			{
				str = str + ( String ) localVector1.elementAt( i ) + File.separator;
			}
			File localFile = new File( str );
			if ( ( localFile.list() != null ) && ( localFile.list().length == 0 ) )
			{
				localFile.delete();
			}
			if ( localVector1.size() > 0 )
			{
				localVector1.removeElementAt( localVector1.size() - 1 );
			}
		}
	}
}
