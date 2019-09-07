package jpos.config.simple.xml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.text.DateFormat;
import java.util.Date;
import java.util.Enumeration;

import jpos.config.JposEntry;
import jpos.config.Version;
import jpos.config.simple.AbstractRegPopulator;
import jpos.util.JposEntryUtility;
import jpos.util.tracing.Tracer;
import jpos.util.tracing.TracerFactory;

import org.apache.xerces.dom.DOMImplementationImpl;
import org.apache.xerces.parsers.DOMParser;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;

public abstract class AbstractXercesRegPopulator extends AbstractRegPopulator implements XmlRegPopulator
{
	protected String xmlFileName = "jpos.xml";
	protected DOMParser domParser = new DOMParser();
	private Tracer tracer = TracerFactory.getInstance().createTracer( "AbstractXercesRegPopulator" );
	public static final String DTD_FILE_PATH = "jpos" + File.separator + "res";
	public static final String DTD_FILE_NAME = DTD_FILE_PATH + File.separator + "jcl.dtd";

	public AbstractXercesRegPopulator( String paramString )
	{
		super( paramString );
	}

	public void save( Enumeration paramEnumeration ) throws Exception
	{
		if ( isPopulatorFileDefined() )
		{
			convertJposEntriesToXml( paramEnumeration, getPopulatorFileOS() );
		}
		else
		{
			convertJposEntriesToXml( paramEnumeration, new FileOutputStream( getDefaultXmlFileName() ) );
		}
	}

	public void save( Enumeration paramEnumeration, String paramString ) throws Exception
	{
		File localFile = new File( paramString );
		FileOutputStream localFileOutputStream = new FileOutputStream( localFile );
		convertJposEntriesToXml( paramEnumeration, localFileOutputStream );
		localFileOutputStream.close();
	}

	public URL getEntriesURL()
	{
		URL localURL = null;
		if ( ( getPopulatorFileURL() != null ) && ( !getPopulatorFileURL().equals( "" ) ) )
		{
			try
			{
				localURL = new URL( getPopulatorFileURL() );
			}
			catch ( Exception localException )
			{
				tracer.println( "getEntriesURL: Exception.message=" + localException.getMessage() );
			}
		}
		else
		{
			localURL = createURLFromFile( new File( getPopulatorFileName() ) );
		}
		tracer.println( "getPopulatorFileURL()=" + getPopulatorFileURL() );
		tracer.println( "getPopulatorFileName()=" + getPopulatorFileName() );
		return localURL;
	}

	protected Tracer getTracer()
	{
		return tracer;
	}

	protected String getDefaultXmlFileName()
	{
		return xmlFileName;
	}

	protected void convertJposEntriesToXml( Enumeration paramEnumeration, OutputStream paramOutputStream ) throws Exception
	{
		Document localDocument = getParser().getDocument();
		serializeDocument( localDocument, paramEnumeration, paramOutputStream );
	}

	protected DOMParser getParser()
	{
		return domParser;
	}

	protected void serializeDocument( Document paramDocument, Enumeration paramEnumeration, OutputStream paramOutputStream ) throws Exception
	{
		Document localDocument = createEmptyDocument();
		insertJposEntriesInDoc( localDocument, paramEnumeration );
		insertDateSavedComment( localDocument );
		OutputFormat localOutputFormat = new OutputFormat( "xml", "UTF-8", true );
		localOutputFormat.setStandalone( false );
		localOutputFormat.setIndenting( true );
		localOutputFormat.setIndent( 4 );
		localOutputFormat.setPreserveSpace( true );
		localOutputFormat.setLineWidth( 0 );
		insertDTDInfo( localDocument, localOutputFormat );
		PrintWriter localPrintWriter = null;
		try
		{
			localPrintWriter = new PrintWriter( new BufferedWriter( new OutputStreamWriter( paramOutputStream, "UTF-8" ) ) );
		}
		catch ( UnsupportedEncodingException localUnsupportedEncodingException )
		{
			tracer.println( "Error making PrintWriter: UnsupportedEncodingException.message = " + localUnsupportedEncodingException.getMessage() );
		}
		if ( localPrintWriter != null )
		{
			XMLSerializer localXMLSerializer = new XMLSerializer( localPrintWriter, localOutputFormat );
			localXMLSerializer.serialize( localDocument );
		}
	}

	protected String getDoctypeValue()
	{
		return "jpos/res/jcl.dtd";
	}

	protected void insertDTDInfo( Document paramDocument, OutputFormat paramOutputFormat ) throws Exception
	{
		String str1 = OutputFormat.whichDoctypePublic( paramDocument );
		String str2 = OutputFormat.whichDoctypeSystem( paramDocument );
		paramOutputFormat.setDoctype( "JposEntries", getDoctypeValue() );
	}

	protected Document createEmptyDocument()
	{
		DOMImplementationImpl localDOMImplementationImpl = ( DOMImplementationImpl ) DOMImplementationImpl.getDOMImplementation();
		DocumentType localDocumentType = localDOMImplementationImpl.createDocumentType( "JposEntries", "-//JavaPOS//DTD//EN", getDoctypeValue() );
		Document localDocument = localDOMImplementationImpl.createDocument( null, "JposEntries", localDocumentType );
		return localDocument;
	}

	protected void insertDateSavedComment( Document paramDocument ) throws Exception
	{
		String str1 = DateFormat.getInstance().format( new Date( System.currentTimeMillis() ) );
		String str2 = "Saved by JavaPOS jpos.config/loader (JCL) version " + Version.getVersionString() + " on " + str1;
		Comment localComment = paramDocument.createComment( str2 );
		paramDocument.getDocumentElement().insertBefore( localComment, paramDocument.getDocumentElement().getFirstChild() );
		paramDocument.getDocumentElement().insertBefore( paramDocument.createTextNode( "\n" ), localComment );
		paramDocument.getDocumentElement().appendChild( paramDocument.createTextNode( "\n" ) );
	}

	protected void appendCreationElement( Document paramDocument, Element paramElement, JposEntry paramJposEntry )
	{
		paramElement.appendChild( paramDocument.createTextNode( "        " ) );
		Element localElement = paramDocument.createElement( "creation" );
		Attr localAttr1 = paramDocument.createAttribute( "factoryClass" );
		Attr localAttr2 = paramDocument.createAttribute( "serviceClass" );
		localAttr1.setValue( ( String ) paramJposEntry.getPropertyValue( "serviceInstanceFactoryClass" ) );
		localAttr2.setValue( ( String ) paramJposEntry.getPropertyValue( "serviceClass" ) );
		localElement.setAttributeNode( localAttr1 );
		localElement.setAttributeNode( localAttr2 );
		paramElement.appendChild( localElement );
		paramElement.appendChild( paramDocument.createTextNode( "\n" ) );
	}

	protected void appendVendorElement( Document paramDocument, Element paramElement, JposEntry paramJposEntry )
	{
		paramElement.appendChild( paramDocument.createTextNode( "        " ) );
		Element localElement = paramDocument.createElement( "vendor" );
		Attr localAttr1 = paramDocument.createAttribute( "name" );
		Attr localAttr2 = paramDocument.createAttribute( "url" );
		localAttr1.setValue( ( String ) paramJposEntry.getPropertyValue( "vendorName" ) );
		localAttr2.setValue( ( String ) paramJposEntry.getPropertyValue( "vendorURL" ) );
		localElement.setAttributeNode( localAttr1 );
		localElement.setAttributeNode( localAttr2 );
		paramElement.appendChild( localElement );
		paramElement.appendChild( paramDocument.createTextNode( "\n" ) );
	}

	protected void appendJposElement( Document paramDocument, Element paramElement, JposEntry paramJposEntry )
	{
		paramElement.appendChild( paramDocument.createTextNode( "        " ) );
		Element localElement = paramDocument.createElement( "jpos" );
		Attr localAttr1 = paramDocument.createAttribute( "version" );
		Attr localAttr2 = paramDocument.createAttribute( "category" );
		localAttr1.setValue( ( String ) paramJposEntry.getPropertyValue( "jposVersion" ) );
		localAttr2.setValue( ( String ) paramJposEntry.getPropertyValue( "deviceCategory" ) );
		localElement.setAttributeNode( localAttr1 );
		localElement.setAttributeNode( localAttr2 );
		paramElement.appendChild( localElement );
		paramElement.appendChild( paramDocument.createTextNode( "\n" ) );
	}

	protected void appendProductElement( Document paramDocument, Element paramElement, JposEntry paramJposEntry )
	{
		paramElement.appendChild( paramDocument.createTextNode( "        " ) );
		Element localElement = paramDocument.createElement( "product" );
		Attr localAttr1 = paramDocument.createAttribute( "name" );
		Attr localAttr2 = paramDocument.createAttribute( "description" );
		Attr localAttr3 = paramDocument.createAttribute( "url" );
		localAttr1.setValue( ( String ) paramJposEntry.getPropertyValue( "productName" ) );
		localAttr2.setValue( ( String ) paramJposEntry.getPropertyValue( "productDescription" ) );
		localAttr3.setValue( ( String ) paramJposEntry.getPropertyValue( "productURL" ) );
		localElement.setAttributeNode( localAttr1 );
		localElement.setAttributeNode( localAttr2 );
		localElement.setAttributeNode( localAttr3 );
		paramElement.appendChild( localElement );
		paramElement.appendChild( paramDocument.createTextNode( "\n" ) );
	}

	protected void appendPropElement( Document paramDocument, Element paramElement, String paramString, Object paramObject )
	{
		paramElement.appendChild( paramDocument.createTextNode( "        " ) );
		Element localElement = paramDocument.createElement( "prop" );
		Attr localAttr1 = paramDocument.createAttribute( "name" );
		Attr localAttr2 = paramDocument.createAttribute( "value" );
		Attr localAttr3 = paramDocument.createAttribute( "type" );
		localAttr1.setValue( paramString );
		localAttr2.setValue( paramObject.toString() );
		localAttr3.setValue( JposEntryUtility.shortClassName( paramObject.getClass() ) );
		localElement.setAttributeNode( localAttr1 );
		localElement.setAttributeNode( localAttr2 );
		localElement.setAttributeNode( localAttr3 );
		paramElement.appendChild( localElement );
		paramElement.appendChild( paramDocument.createTextNode( "\n" ) );
	}

	protected void appendPropElements( Document paramDocument, Element paramElement, JposEntry paramJposEntry )
	{
		paramElement.appendChild( paramDocument.createTextNode( "\n        " ) );
		String str1 = "Other non JavaPOS required property (mostly vendor properties and bus specific properties i.e. RS232 )";
		paramElement.appendChild( paramDocument.createComment( str1 ) );
		paramElement.appendChild( paramDocument.createTextNode( "\n" ) );
		Enumeration localEnumeration = paramJposEntry.getPropertyNames();
		while ( localEnumeration.hasMoreElements() )
		{
			String str2 = ( String ) localEnumeration.nextElement();
			if ( !JposEntryUtility.isRequiredPropName( str2 ) )
			{
				appendPropElement( paramDocument, paramElement, str2, paramJposEntry.getPropertyValue( str2 ) );
			}
		}
	}

	protected void insertJposEntryInDoc( Document paramDocument, Element paramElement, JposEntry paramJposEntry )
	{
		appendCreationElement( paramDocument, paramElement, paramJposEntry );
		appendVendorElement( paramDocument, paramElement, paramJposEntry );
		appendJposElement( paramDocument, paramElement, paramJposEntry );
		appendProductElement( paramDocument, paramElement, paramJposEntry );
		appendPropElements( paramDocument, paramElement, paramJposEntry );
		paramDocument.getDocumentElement().appendChild( paramDocument.createTextNode( "\n    " ) );
		paramDocument.getDocumentElement().appendChild( paramElement );
		paramDocument.getDocumentElement().appendChild( paramDocument.createTextNode( "\n    " ) );
	}

	protected void insertJposEntriesInDoc( Document paramDocument, Enumeration paramEnumeration )
	{
		while ( paramEnumeration.hasMoreElements() )
		{
			JposEntry localJposEntry = ( JposEntry ) paramEnumeration.nextElement();
			if ( JposEntryUtility.isValidJposEntry( localJposEntry ) )
			{
				paramDocument.getDocumentElement().appendChild( paramDocument.createTextNode( "\n    " ) );
				Element localElement = paramDocument.createElement( "JposEntry" );
				Attr localAttr = paramDocument.createAttribute( "logicalName" );
				localAttr.setValue( ( String ) localJposEntry.getPropertyValue( "logicalName" ) );
				localElement.setAttributeNode( localAttr );
				localElement.appendChild( paramDocument.createTextNode( "\n" ) );
				insertJposEntryInDoc( paramDocument, localElement, localJposEntry );
			}
		}
	}
}
