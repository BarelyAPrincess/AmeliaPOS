/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.config.simple.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import jpos.config.JposConfigException;
import jpos.config.JposEntry;
import jpos.config.JposEntry.Prop;
import jpos.config.simple.SimpleEntry;
import jpos.util.JposEntryUtility;
import jpos.util.tracing.Tracer;
import jpos.util.tracing.TracerFactory;

import org.apache.xerces.jaxp.SAXParserFactoryImpl;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class Xerces2RegPopulator extends AbstractXercesRegPopulator
{
	private XMLReader xmlReader = null;
	private SAXParser saxParser = null;
	private ErrorHandler errorHandler;
	private ContentHandler contentHandler;
	private EntityResolver entityResolver;
	private List jposEntryList;
	private Tracer tracer;
	public static final String XERCES2_REG_POPULATOR_NAME_STRING = "JCL XML Entries Populator 2";

	public Xerces2RegPopulator()
	{
		super( XercesRegPopulator.class.getName() );
		getClass();
		errorHandler = new JposErrorHandler();
		getClass();
		contentHandler = new JposContentHandler();
		getClass();
		entityResolver = new JposEntityResolver();
		jposEntryList = new LinkedList();
		tracer = TracerFactory.getInstance().createTracer( "Xerces2RegPopulator", true );
	}

	public Xerces2RegPopulator( String paramString )
	{
		super( paramString );
		getClass();
		errorHandler = new JposErrorHandler();
		getClass();
		contentHandler = new JposContentHandler();
		getClass();
		entityResolver = new JposEntityResolver();
		jposEntryList = new LinkedList();
		tracer = TracerFactory.getInstance().createTracer( "Xerces2RegPopulator", true );
	}

	public String getClassName()
	{
		return Xerces2RegPopulator.class.getName();
	}

	public void load()
	{
		try
		{
			InputStream localInputStream = getPopulatorFileIS();
			load( getPopulatorFileName() );
		}
		catch ( Exception localException )
		{
			tracer.println( "Error while loading populator file Exception.message: " + localException.getMessage() );
			lastLoadException = localException;
		}
	}

	public void load( String paramString )
	{
		FileReader localFileReader = null;
		try
		{
			localFileReader = new FileReader( new File( paramString ) );
			InputSource localInputSource = new InputSource( localFileReader );
			XMLReader localXMLReader = getSAXParser().getXMLReader();
			initXMLReader( localXMLReader );
			localXMLReader.setErrorHandler( errorHandler );
			localXMLReader.setContentHandler( contentHandler );
			localXMLReader.setEntityResolver( entityResolver );
			jposEntryList.clear();
			lastLoadException = null;
			localXMLReader.parse( localInputSource );
			Iterator localIterator = jposEntryList.iterator();
			while ( localIterator.hasNext() )
			{
				JposEntry localJposEntry = ( JposEntry ) localIterator.next();
				getJposEntries().put( localJposEntry.getLogicalName(), localJposEntry );
			}
			return;
		}
		catch ( FileNotFoundException localFileNotFoundException )
		{
			tracer.println( "Could not find file: " + paramString );
			lastLoadException = localFileNotFoundException;
		}
		catch ( ParserConfigurationException localParserConfigurationException )
		{
			tracer.println( "Could not create and configure SAX parser/factory" + localParserConfigurationException.getMessage() );
			lastLoadException = localParserConfigurationException;
		}
		catch ( IOException localIOException4 )
		{
			tracer.println( "Error while parsing XML file:IOException.msg=" + localIOException4.getMessage() );
			lastLoadException = localIOException4;
		}
		catch ( SAXException localSAXException )
		{
			tracer.println( "Error creating or using the SAXParser:SAXException.message=" + localSAXException.getMessage() );
			lastLoadException = localSAXException;
		}
		finally
		{
			try
			{
				if ( localFileReader != null )
				{
					localFileReader.close();
				}
			}
			catch ( IOException localIOException7 )
			{
				tracer.println( "load( " + paramString + ") IOException.msg=" + localIOException7.getMessage() );
			}
		}
	}

	public String getName()
	{
		return "JCL XML Entries Populator 2";
	}

	protected SAXParser getSAXParser() throws ParserConfigurationException, SAXException
	{
		if ( saxParser == null )
		{
			SAXParserFactoryImpl localSAXParserFactoryImpl = new SAXParserFactoryImpl();
			saxParser = localSAXParserFactoryImpl.newSAXParser();
		}
		return saxParser;
	}

	protected void initXMLReader( XMLReader paramXMLReader ) throws SAXException
	{
		paramXMLReader.setFeature( "http://xml.org/sax/features/namespaces", true );
		paramXMLReader.setFeature( "http://xml.org/sax/features/validation", true );
	}

	protected class JposErrorHandler implements ErrorHandler
	{
		protected JposErrorHandler()
		{
		}

		private String createMessage( String paramString, SAXParseException paramSAXParseException )
		{
			return paramString + "parsing XML file:SAXParseException.message = " + paramSAXParseException.getMessage();
		}

		public void error( SAXParseException paramSAXParseException ) throws SAXException
		{
			String str = createMessage( "JposErrorHandler:Error:", paramSAXParseException );
			tracer.print( str );
			throw new SAXException( str );
		}

		public void fatalError( SAXParseException paramSAXParseException ) throws SAXException
		{
			String str = createMessage( "JposErrorHandler:FatalError:", paramSAXParseException );
			tracer.print( str );
			throw new SAXException( str );
		}

		public void warning( SAXParseException paramSAXParseException ) throws SAXException
		{
			String str = createMessage( "JposErrorHandler:Warning:", paramSAXParseException );
			tracer.print( str );
			throw new SAXException( str );
		}
	}

	public class JposEntityResolver implements EntityResolver
	{
		public JposEntityResolver()
		{
		}

		public InputSource resolveEntity( String paramString1, String paramString2 )
		{
			tracer.println( "JposEntityResolver:resolveEntity:publicId=" + paramString1 );
			tracer.println( "JposEntityResolver:resolveEntity:systemId=" + paramString2 );
			if ( paramString1.equals( getDoctypeValue() ) )
			{
				InputStream localInputStream = getClass().getResourceAsStream( getDoctypeValue() );
				if ( localInputStream != null )
				{
					return new InputSource( new InputStreamReader( localInputStream ) );
				}
			}
			return null;
		}
	}

	protected class JposContentHandler extends DefaultHandler implements ContentHandler
	{
		private JposEntry currentEntry = null;

		protected JposContentHandler()
		{
		}

		public void startDocument() throws SAXException
		{
			tracer.println( "<startDocument/>" );
		}

		public void endDocument() throws SAXException
		{
			tracer.println( "<endDocument/>" );
		}

		public void startElement( String paramString1, String paramString2, String paramString3, Attributes paramAttributes ) throws SAXException
		{
			tracer.println( "<startElement qName=\"" + paramString3 + "\"/>" );
			if ( paramString3.equals( "JposEntries" ) )
			{
				jposEntryList.clear();
				currentEntry = null;
			}
			else if ( paramString3.equals( "JposEntry" ) )
			{
				currentEntry = createEntry( paramAttributes );
			}
			else if ( paramString3.equals( "creation" ) )
			{
				addCreationProp( currentEntry, paramAttributes );
			}
			else if ( paramString3.equals( "vendor" ) )
			{
				addVendorProp( currentEntry, paramAttributes );
			}
			else if ( paramString3.equals( "jpos" ) )
			{
				addJposProp( currentEntry, paramAttributes );
			}
			else if ( paramString3.equals( "product" ) )
			{
				addProductProp( currentEntry, paramAttributes );
			}
			else if ( paramString3.equals( "prop" ) )
			{
				addProp( currentEntry, paramAttributes );
			}
			else
			{
				tracer.println( "Invalid qName=" + paramString3 );
				throw new SAXException( "Invalid qName=" + paramString3 );
			}
		}

		public void endElement( String paramString1, String paramString2, String paramString3 ) throws SAXException
		{
			tracer.println( "<endElement qName=\"" + paramString3 + "\"/>" );
			if ( paramString3.equals( "JposEntry" ) )
			{
				jposEntryList.add( currentEntry );
			}
		}

		protected JposEntry createEntry( Attributes paramAttributes ) throws SAXException
		{
			String str = paramAttributes.getValue( "logicalName" );
			return new SimpleEntry( str, Xerces2RegPopulator.this );
		}

		protected void addCreationProp( JposEntry paramJposEntry, Attributes paramAttributes ) throws SAXException
		{
			String str1 = paramAttributes.getValue( "factoryClass" );
			String str2 = paramAttributes.getValue( "serviceClass" );
			currentEntry.addProperty( "serviceInstanceFactoryClass", str1 );
			currentEntry.addProperty( "serviceClass", str2 );
		}

		protected void addVendorProp( JposEntry paramJposEntry, Attributes paramAttributes ) throws SAXException
		{
			String str1 = paramAttributes.getValue( "name" );
			String str2 = paramAttributes.getValue( "url" );
			currentEntry.addProperty( "vendorName", str1 );
			currentEntry.addProperty( "vendorURL", str2 );
		}

		protected void addJposProp( JposEntry paramJposEntry, Attributes paramAttributes ) throws SAXException
		{
			String str1 = paramAttributes.getValue( "category" );
			String str2 = paramAttributes.getValue( "version" );
			currentEntry.addProperty( "deviceCategory", str1 );
			currentEntry.addProperty( "jposVersion", str2 );
		}

		protected void addProductProp( JposEntry paramJposEntry, Attributes paramAttributes ) throws SAXException
		{
			String str1 = paramAttributes.getValue( "description" );
			String str2 = paramAttributes.getValue( "name" );
			String str3 = paramAttributes.getValue( "url" );
			currentEntry.addProperty( "productDescription", str1 );
			currentEntry.addProperty( "productName", str2 );
			currentEntry.addProperty( "productURL", str3 );
		}

		protected void addProp( JposEntry paramJposEntry, Attributes paramAttributes ) throws SAXException
		{
			String str1 = paramAttributes.getValue( "name" );
			String str2 = paramAttributes.getValue( "value" );
			String str3 = paramAttributes.getValue( "type" );
			if ( ( str3 == null ) || ( str3.equals( "" ) ) )
			{
				str3 = "String";
			}
			try
			{
				Class localClass = JposEntryUtility.propTypeFromString( paramAttributes.getValue( "type" ) );
				Object localObject = JposEntryUtility.parsePropValue( str2, localClass );
				JposEntry.Prop localProp = currentEntry.createProp( str1, localObject, localClass );
				currentEntry.add( localProp );
			}
			catch ( JposConfigException localJposConfigException )
			{
				Object localObject = "Invalid prop: name=" + str1 + ":value=" + str2;
				tracer.println( ( String ) localObject );
				throw new SAXException( ( String ) localObject );
			}
		}
	}
}
