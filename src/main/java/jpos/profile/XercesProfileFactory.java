package jpos.profile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import jpos.util.XmlHelper;
import jpos.util.tracing.Tracer;
import jpos.util.tracing.TracerFactory;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class XercesProfileFactory implements ProfileFactory
{
	private Profile profile = null;
	private DOMParser domParser = new DOMParser();
	private DefaultErrorHandler errorHandler;
	private Tracer tracer;
	public static final String PROFILE_DTD_FILE_NAME = "jcl_profile.dtd";
	public static final String PROFILE_DTD_FILE_PATH = "jpos" + File.separator + "res" + File.separator;

	public XercesProfileFactory()
	{
		getClass();
		errorHandler = new DefaultErrorHandler();
		tracer = TracerFactory.getInstance().createTracer( "XercesProfileFactory" );
	}

	private Profile extractProfile( Document paramDocument ) throws ProfileException
	{
		Element localElement1 = paramDocument.getDocumentElement();
		String str1 = localElement1.getAttribute( "name" );
		DefaultProfile localDefaultProfile = new DefaultProfile( str1 );
		NodeList localNodeList = localElement1.getElementsByTagName( "ProfileInfo" );
		if ( localNodeList.getLength() != 1 )
		{
			throw new ProfileException( "Profile does not contain 1 ProfileInfo element" );
		}
		Element localElement2 = ( Element ) localNodeList.item( 0 );
		localDefaultProfile.setVersion( localElement2.getAttribute( "version" ) );
		localDefaultProfile.setVendorName( localElement2.getAttribute( "vendorName" ) );
		try
		{
			String str2 = localElement2.getAttribute( "vendorUrl" );
			localDefaultProfile.setVendorUrl( new URL( str2 ) );
		}
		catch ( MalformedURLException localMalformedURLException )
		{
			throw new ProfileException( "ProfileInfo contains an invalid vendorUrl string" );
		}
		localDefaultProfile.setDescription( localElement2.getAttribute( "description" ) );
		return localDefaultProfile;
	}

	Document parse( String paramString ) throws ProfileException
	{
		XmlHelper localXmlHelper = new XmlHelper();
		try
		{
			localXmlHelper.setDtdFileName( "jcl_profile.dtd" );
			localXmlHelper.setDtdFilePath( PROFILE_DTD_FILE_PATH );
			localXmlHelper.checkAndCreateTempDtd();
			DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
			localDocumentBuilderFactory.setNamespaceAware( true );
			localDocumentBuilderFactory.setValidating( true );
			DocumentBuilder localObject1 = localDocumentBuilderFactory.newDocumentBuilder();
			getClass();
			DefaultErrorHandler localObject2 = new DefaultErrorHandler();
			( ( DocumentBuilder ) localObject1 ).setErrorHandler( ( ErrorHandler ) localObject2 );
			Document localObject3 = ( ( DocumentBuilder ) localObject1 ).parse( new File( paramString ) );
			if ( ( ( ( DefaultErrorHandler ) localObject2 ).getErrorList().size() > 0 ) || ( ( ( DefaultErrorHandler ) localObject2 ).getFatalErrorList().size() > 0 ) )
				throw new ProfileException( "Error while parsing XML file, set properties jpos.tracing = ON in jpos.properties file for details" );
			return localObject3;
		}
		catch ( IOException localIOException )
		{
			Object localObject1 = "Error loading XML profile file";
			tracer.println( ( String ) localObject1 + ": Exception.message = " + localIOException.getMessage() );
			throw new ProfileException( ( String ) localObject1, localIOException );
		}
		catch ( SAXException localSAXException )
		{
			Object localObject2 = "Error parsing XML profile file";
			tracer.println( ( String ) localObject2 + ": Exception.message = " + localSAXException.getMessage() );
			throw new ProfileException( ( String ) localObject2, localSAXException );
		}
		catch ( ParserConfigurationException localParserConfigurationException )
		{
			Object localObject3 = "Error creating XML parser";
			tracer.println( ( String ) localObject3 + ": Exception.message = " + localParserConfigurationException.getMessage() );
			throw new ProfileException( ( String ) localObject3, localParserConfigurationException );
		}
		finally
		{
			localXmlHelper.removeTempDtd();
		}
	}

	Document parseSchema( String paramString ) throws ProfileException
	{
		try
		{
			DocumentBuilderFactory localDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
			localDocumentBuilderFactory.setNamespaceAware( true );
			localDocumentBuilderFactory.setValidating( true );
			DocumentBuilder localObject1 = localDocumentBuilderFactory.newDocumentBuilder();
			getClass();
			DefaultErrorHandler localObject2 = new DefaultErrorHandler();
			( ( DocumentBuilder ) localObject1 ).setErrorHandler( ( ErrorHandler ) localObject2 );
			return ( ( DocumentBuilder ) localObject1 ).parse( new File( paramString ) );
		}
		catch ( IOException localIOException )
		{
			Object localObject1 = "Error loading XML profile file";
			tracer.println( ( String ) localObject1 + ": Excpetion.message = " + localIOException.getMessage() );
			throw new ProfileException( ( String ) localObject1, localIOException );
		}
		catch ( SAXException localSAXException )
		{
			Object localObject2 = "Error parsing XML profile file";
			tracer.println( ( String ) localObject2 + ": Exception.message = " + localSAXException.getMessage() );
			throw new ProfileException( ( String ) localObject2, localSAXException );
		}
		catch ( ParserConfigurationException localParserConfigurationException )
		{
			Object localObject3 = "Error creating XML parser";
			tracer.println( ( String ) localObject3 + ": Exception.message = " + localParserConfigurationException.getMessage() );
			throw new ProfileException( ( String ) localObject3, localParserConfigurationException );
		}
	}

	Profile load( String paramString ) throws ProfileException
	{
		Document localDocument = parse( paramString );
		return extractProfile( localDocument );
	}

	public Profile createProfile( String paramString ) throws ProfileException
	{
		return load( paramString );
	}

	class DefaultErrorHandler implements ErrorHandler
	{
		private List warningList = new ArrayList();
		private List errorList = new ArrayList();
		private List fatalErrorList = new ArrayList();

		DefaultErrorHandler()
		{
		}

		List getErrorList()
		{
			return errorList;
		}

		List getWarningList()
		{
			return warningList;
		}

		List getFatalErrorList()
		{
			return fatalErrorList;
		}

		public void warning( SAXParseException paramSAXParseException ) throws SAXException
		{
			tracer.println( "Line " + paramSAXParseException.getLineNumber() + ": WARNING SAXParseException.message = " + paramSAXParseException.getMessage() );
			warningList.add( paramSAXParseException );
		}

		public void error( SAXParseException paramSAXParseException ) throws SAXException
		{
			tracer.println( "Line " + paramSAXParseException.getLineNumber() + ": ERROR SAXParseException.message = " + paramSAXParseException.getMessage() );
			errorList.add( paramSAXParseException );
		}

		public void fatalError( SAXParseException paramSAXParseException ) throws SAXException
		{
			tracer.println( "Line " + paramSAXParseException.getLineNumber() + ": FATALERROR SAXParseException.message = " + paramSAXParseException.getMessage() );
			fatalErrorList.add( paramSAXParseException );
		}
	}
}
