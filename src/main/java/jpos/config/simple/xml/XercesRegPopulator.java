package jpos.config.simple.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Vector;

import jpos.config.JposConfigException;
import jpos.config.JposEntry;
import jpos.config.simple.SimpleEntry;
import jpos.util.JposEntryUtility;
import jpos.util.tracing.Tracer;
import jpos.util.tracing.TracerFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XercesRegPopulator extends AbstractXercesRegPopulator
{
	private Tracer tracer = TracerFactory.getInstance().createTracer( "XercesRegPopulator" );
	public static final String DTD_JAR_FILE_NAME = "/jpos/res/jcl.dtd";
	public static final String XERCES_REG_POPULATOR_NAME_STRING = "JCL XML Entries Populator";

	public XercesRegPopulator()
	{
		super( XercesRegPopulator.class.getName() );
	}

	public XercesRegPopulator( String paramString )
	{
		super( paramString );
	}

	public String getClassName()
	{
		return XercesRegPopulator.class.getName();
	}

	public void load()
	{
		tracer.println( "load(): isPopulatorFileDefined=" + isPopulatorFileDefined() );
		if ( !isPopulatorFileDefined() )
		{
			getJposEntries().clear();
			xmlFileName = "jpos.xml";
			load( xmlFileName );
			return;
		}
		try
		{
			getJposEntries().clear();
			domParser.setEntityResolver( new JPOSDTDEntityResolver() );
			domParser.parse( new InputSource( getPopulatorFileIS() ) );
			Document localDocument = domParser.getDocument();
			Enumeration localEnumeration = extractJposEntries( localDocument );
			while ( localEnumeration.hasMoreElements() )
			{
				JposEntry localJposEntry = ( JposEntry ) localEnumeration.nextElement();
				if ( localJposEntry.hasPropertyWithName( "logicalName" ) )
				{
					getJposEntries().put( localJposEntry.getLogicalName(), localJposEntry );
				}
			}
			lastLoadException = null;
		}
		catch ( Exception localException )
		{
			lastLoadException = localException;
			tracer.println( "Error loading XML file.  Exception.msg = " + localException.getMessage() );
		}
		finally
		{
		}
	}

	public void load( String paramString )
	{
		tracer.println( "load: xmlFileName=" + paramString );
		Object localObject1 = null;
		File localFile = new File( paramString );
		try
		{
			if ( localFile.exists() )
			{
				localObject1 = new FileInputStream( localFile );
			}
			else
			{
				localObject1 = findFileInClasspath( paramString );
			}
			if ( localObject1 == null )
			{
				localObject1 = getClass().getClassLoader().getResourceAsStream( paramString );
			}
			if ( localObject1 == null )
			{
				getJposEntries().clear();
				tracer.println( "Could not find file: " + paramString + " in path or CLASSPATH" );
				lastLoadException = new FileNotFoundException( paramString );
				return;
			}
			lastLoadException = null;
		}
		catch ( Exception localException1 )
		{
			lastLoadException = localException1;
			tracer.println( "Error loading XML file.  Exception.message = " + localException1.getMessage() );
		}
		try
		{
			getJposEntries().clear();
			domParser.setEntityResolver( new JPOSDTDEntityResolver() );
			domParser.parse( new InputSource( ( InputStream ) localObject1 ) );
			Document localDocument = domParser.getDocument();
			Enumeration localEnumeration = extractJposEntries( localDocument );
			while ( localEnumeration.hasMoreElements() )
			{
				JposEntry localJposEntry = ( JposEntry ) localEnumeration.nextElement();
				if ( localJposEntry.hasPropertyWithName( "logicalName" ) )
				{
					getJposEntries().put( localJposEntry.getLogicalName(), localJposEntry );
				}
			}
			lastLoadException = null;
		}
		catch ( Exception localException2 )
		{
			lastLoadException = localException2;
			tracer.println( "Error loading XML file.  Exception.message = " + localException2.getMessage() );
		}
		finally
		{
		}
	}

	public String getName()
	{
		return "JCL XML Entries Populator";
	}

	protected Enumeration extractJposEntries( Document paramDocument )
	{
		Vector localVector = new Vector();
		NodeList localNodeList1 = paramDocument.getElementsByTagName( "JposEntry" );
		String str1 = "";
		try
		{
			for ( int i = 0; i < localNodeList1.getLength(); i++ )
			{
				Node localNode = localNodeList1.item( i );
				if ( localNode.getNodeType() == 1 )
				{
					SimpleEntry localSimpleEntry = new SimpleEntry();
					Element localElement1 = ( Element ) localNode;
					str1 = localElement1.getAttribute( "logicalName" );
					localSimpleEntry.addProperty( "logicalName", str1 );
					NodeList localNodeList2 = localNodeList1.item( i ).getChildNodes();
					Object localObject;
					for ( int j = 0; j < localNodeList2.getLength(); j++ )
					{
						localObject = localNodeList2.item( j );
						if ( ( ( Node ) localObject ).getNodeType() == 1 )
						{
							Element localElement2 = ( Element ) localObject;
							String str2 = localElement2.getNodeName();
							if ( str2.equals( "creation" ) )
							{
								extractCreationAttr( localSimpleEntry, localElement2 );
							}
							else if ( str2.equals( "vendor" ) )
							{
								extractVendorAttr( localSimpleEntry, localElement2 );
							}
							else if ( str2.equals( "jpos" ) )
							{
								extractJposAttr( localSimpleEntry, localElement2 );
							}
							else if ( str2.equals( "product" ) )
							{
								extractProductAttr( localSimpleEntry, localElement2 );
							}
							else
							{
								extractPropAttr( localSimpleEntry, localElement2 );
							}
						}
					}
					if ( JposEntryUtility.isValidJposEntry( localSimpleEntry ) )
					{
						localVector.addElement( localSimpleEntry );
					}
					else
					{
						localObject = "JposEntry with logicalName: " + str1 + " is not valid (missing required properties)";
						throw new JposConfigException( ( String ) localObject );
					}
				}
			}
		}
		catch ( JposConfigException localJposConfigException )
		{
			tracer.println( "Skipping invalid entry with logicalName: " + str1 );
			tracer.println( "--->JposConfigException.message = " + localJposConfigException.getMessage() );
			tracer.print( localJposConfigException );
			if ( localJposConfigException.getOrigException() != null )
			{
				tracer.print( localJposConfigException.getOrigException() );
			}
		}
		return localVector.elements();
	}

	protected void extractCreationAttr( JposEntry paramJposEntry, Element paramElement )
	{
		paramJposEntry.addProperty( "serviceInstanceFactoryClass", paramElement.getAttribute( "factoryClass" ) );
		paramJposEntry.addProperty( "serviceClass", paramElement.getAttribute( "serviceClass" ) );
	}

	protected void extractVendorAttr( JposEntry paramJposEntry, Element paramElement )
	{
		paramJposEntry.addProperty( "vendorName", paramElement.getAttribute( "name" ) );
		paramJposEntry.addProperty( "vendorURL", paramElement.getAttribute( "url" ) );
	}

	protected void extractJposAttr( JposEntry paramJposEntry, Element paramElement )
	{
		paramJposEntry.addProperty( "jposVersion", paramElement.getAttribute( "version" ) );
		paramJposEntry.addProperty( "deviceCategory", paramElement.getAttribute( "category" ) );
	}

	protected void extractProductAttr( JposEntry paramJposEntry, Element paramElement )
	{
		paramJposEntry.addProperty( "productName", paramElement.getAttribute( "name" ) );
		paramJposEntry.addProperty( "productDescription", paramElement.getAttribute( "description" ) );
		paramJposEntry.addProperty( "productURL", paramElement.getAttribute( "url" ) );
	}

	protected void extractPropAttr( JposEntry paramJposEntry, Element paramElement ) throws JposConfigException
	{
		String str1 = paramElement.getAttribute( "name" );
		String str2 = paramElement.getAttribute( "value" );
		String str3 = paramElement.getAttribute( "type" );
		if ( str3.equals( "" ) )
		{
			str3 = "String";
		}
		Object localObject = null;
		Class localClass = null;
		try
		{
			localClass = Class.forName( "java.lang." + str3 );
		}
		catch ( ClassNotFoundException localClassNotFoundException )
		{
			throw new JposConfigException( "Invalid property type: " + str3 + " for property named: " + str1, localClassNotFoundException );
		}
		if ( !JposEntryUtility.isValidPropType( localClass ) )
		{
			throw new JposConfigException( "Invalid property type: " + str3 + " for property named: " + str1 );
		}
		localObject = JposEntryUtility.parsePropValue( str2, localClass );
		if ( !JposEntryUtility.validatePropValue( localObject, localClass ) )
		{
			throw new JposConfigException( "Invalid property type: " + str3 + " for property named: " + str1 );
		}
		paramJposEntry.add( paramJposEntry.createProp( str1, localObject, localClass ) );
	}

	public class JPOSDTDEntityResolver implements EntityResolver
	{
		public JPOSDTDEntityResolver()
		{
		}

		public InputSource resolveEntity( String paramString1, String paramString2 ) throws SAXException, IOException
		{
			if ( paramString1.equals( "-//JavaPOS//DTD//EN" ) )
			{
				InputStream localInputStream = getClass().getResourceAsStream( "/jpos/res/jcl.dtd" );
				if ( localInputStream != null )
				{
					return new InputSource( new InputStreamReader( localInputStream ) );
				}
			}
			return null;
		}
	}
}
