package jpos.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import jpos.config.JposConfigException;
import jpos.config.JposEntry;
import jpos.config.JposEntryConst;
import jpos.config.RS232Const;
import jpos.config.simple.SimpleEntry;

public class JposEntryUtility
{
	private static JposEntry prototypeJposEntry = null;
	private static final List STANDARD_PROP_NAMES_LIST = new ArrayList();

	public static boolean isValidJposEntry( JposEntry paramJposEntry )
	{
		boolean bool = false;
		if ( ( paramJposEntry.hasPropertyWithName( "logicalName" ) ) && ( paramJposEntry.hasPropertyWithName( "serviceInstanceFactoryClass" ) ) && ( paramJposEntry.hasPropertyWithName( "serviceClass" ) ) && ( paramJposEntry.hasPropertyWithName( "deviceCategory" ) ) && ( paramJposEntry.hasPropertyWithName( "jposVersion" ) ) && ( paramJposEntry.hasPropertyWithName( "vendorName" ) ) && ( paramJposEntry.hasPropertyWithName( "vendorURL" ) ) && ( paramJposEntry.hasPropertyWithName( "productName" ) ) && ( paramJposEntry.hasPropertyWithName( "productURL" ) ) && ( paramJposEntry.hasPropertyWithName( "productDescription" ) ) )
		{
			bool = true;
		}
		return bool;
	}

	public static boolean isRequiredPropName( String paramString )
	{
		boolean bool = false;
		if ( ( paramString.equals( "logicalName" ) ) || ( paramString.equals( "serviceInstanceFactoryClass" ) ) || ( paramString.equals( "serviceClass" ) ) || ( paramString.equals( "deviceCategory" ) ) || ( paramString.equals( "jposVersion" ) ) || ( paramString.equals( "vendorName" ) ) || ( paramString.equals( "vendorURL" ) ) || ( paramString.equals( "productName" ) ) || ( paramString.equals( "productURL" ) ) || ( paramString.equals( "productDescription" ) ) )
		{
			bool = true;
		}
		return bool;
	}

	public static boolean isRS232PropName( String paramString )
	{
		boolean bool = false;
		if ( ( paramString.equals( "portName" ) ) || ( paramString.equals( "baudRate" ) ) || ( paramString.equals( "dataBits" ) ) || ( paramString.equals( "parity" ) ) || ( paramString.equals( "stopBits" ) ) || ( paramString.equals( "flowControl" ) ) )
		{
			bool = true;
		}
		return bool;
	}

	public static void removeAllRS232Props( JposEntry paramJposEntry )
	{
		paramJposEntry.removeProperty( "portName" );
		paramJposEntry.removeProperty( "baudRate" );
		paramJposEntry.removeProperty( "dataBits" );
		paramJposEntry.removeProperty( "parity" );
		paramJposEntry.removeProperty( "stopBits" );
		paramJposEntry.removeProperty( "flowControl" );
	}

	public static Iterator getStandardPropNames()
	{
		return STANDARD_PROP_NAMES_LIST.iterator();
	}

	public static Enumeration getNonRequiredPropNames( JposEntry paramJposEntry )
	{
		Vector localVector = new Vector();
		Enumeration localEnumeration = paramJposEntry.getPropertyNames();
		while ( localEnumeration.hasMoreElements() )
		{
			String str = ( String ) localEnumeration.nextElement();
			if ( !isRequiredPropName( str ) )
			{
				localVector.add( str );
			}
		}
		return localVector.elements();
	}

	public static Enumeration getMissingRequiredPropNames( JposEntry paramJposEntry )
	{
		Vector localVector = new Vector();
		if ( !paramJposEntry.hasPropertyWithName( "logicalName" ) )
		{
			localVector.add( "logicalName" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "serviceInstanceFactoryClass" ) )
		{
			localVector.add( "serviceInstanceFactoryClass" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "serviceClass" ) )
		{
			localVector.add( "serviceClass" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "deviceCategory" ) )
		{
			localVector.add( "deviceCategory" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "jposVersion" ) )
		{
			localVector.add( "jposVersion" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "vendorName" ) )
		{
			localVector.add( "vendorName" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "vendorURL" ) )
		{
			localVector.add( "vendorURL" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "productName" ) )
		{
			localVector.add( "productName" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "productURL" ) )
		{
			localVector.add( "productURL" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "productDescription" ) )
		{
			localVector.add( "productDescription" );
		}
		return localVector.elements();
	}

	public static Enumeration getMissingRS232PropNames( JposEntry paramJposEntry )
	{
		Vector localVector = new Vector();
		if ( !paramJposEntry.hasPropertyWithName( "portName" ) )
		{
			localVector.add( "portName" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "baudRate" ) )
		{
			localVector.add( "baudRate" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "dataBits" ) )
		{
			localVector.add( "dataBits" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "parity" ) )
		{
			localVector.add( "parity" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "stopBits" ) )
		{
			localVector.add( "stopBits" );
		}
		if ( !paramJposEntry.hasPropertyWithName( "flowControl" ) )
		{
			localVector.add( "flowControl" );
		}
		return localVector.elements();
	}

	public static Enumeration getVendorPropNames( JposEntry paramJposEntry )
	{
		Vector localVector = new Vector();
		Enumeration localEnumeration = paramJposEntry.getPropertyNames();
		while ( localEnumeration.hasMoreElements() )
		{
			localVector.add( localEnumeration.nextElement() );
		}
		Iterator localIterator = getStandardPropNames();
		while ( localIterator.hasNext() )
		{
			String str = ( String ) localIterator.next();
			localVector.remove( str );
		}
		return localVector.elements();
	}

	public static void addMissingRequiredProps( JposEntry paramJposEntry )
	{
		Enumeration localEnumeration = getMissingRequiredPropNames( paramJposEntry );
		JposEntry localJposEntry = getEntryPrototype();
		while ( localEnumeration.hasMoreElements() )
		{
			String str = ( String ) localEnumeration.nextElement();
			paramJposEntry.addProperty( str, localJposEntry.getPropertyValue( str ) );
		}
	}

	public static JposEntry getEntryPrototype()
	{
		if ( prototypeJposEntry == null )
		{
			prototypeJposEntry = new SimpleEntry();
			prototypeJposEntry.addProperty( "logicalName", "UnknownDevice" );
			prototypeJposEntry.addProperty( "serviceInstanceFactoryClass", "UnknownServiceInstanceFactoryClass" );
			prototypeJposEntry.addProperty( "serviceClass", "UnknownServiceClass" );
			prototypeJposEntry.addProperty( "deviceCategory", "CashDrawer" );
			prototypeJposEntry.addProperty( "jposVersion", "1.5" );
			prototypeJposEntry.addProperty( "vendorName", "Unknown Vendor Name" );
			prototypeJposEntry.addProperty( "vendorURL", "http://www.UnknownVerdorURL.com" );
			prototypeJposEntry.addProperty( "productName", "Unknown Product Name" );
			prototypeJposEntry.addProperty( "productURL", "http://www.UnknownProductURL.com" );
			prototypeJposEntry.addProperty( "productDescription", "Unknown Product Description" );
		}
		return ( ( SimpleEntry ) prototypeJposEntry ).copy();
	}

	public static String shortClassName( Class paramClass )
	{
		return paramClass.toString().substring( paramClass.toString().lastIndexOf( "." ) + 1 );
	}

	public static boolean validatePropValue( Object paramObject, Class paramClass )
	{
		if ( ( paramObject == null ) || ( paramClass == null ) )
		{
			return false;
		}
		if ( !isValidPropType( paramClass ) )
		{
			return false;
		}
		return paramClass.isInstance( paramObject );
	}

	public static boolean isValidPropType( Class paramClass )
	{
		if ( paramClass == null )
		{
			return false;
		}
		for ( int i = 0; i < JposEntryConst.PROP_TYPES.length; i++ )
		{
			if ( paramClass.equals( JposEntryConst.PROP_TYPES[i] ) )
			{
				return true;
			}
		}
		return false;
	}

	public static Object getDefaultValueForType( Class paramClass ) throws JposConfigException
	{
		if ( !isValidPropType( paramClass ) )
		{
			throw new JposConfigException( "Invalid property type: " + paramClass );
		}
		Object localObject = "";
		try
		{
			if ( paramClass.equals( String.class ) )
			{
				localObject = "";
			}
			else if ( paramClass.equals( Boolean.class ) )
			{
				localObject = new Boolean( false );
			}
			else if ( paramClass.equals( Character.class ) )
			{
				localObject = new Character( 'a' );
			}
			else if ( paramClass.equals( Double.class ) )
			{
				localObject = new Double( 0.0D );
			}
			else if ( paramClass.equals( Float.class ) )
			{
				localObject = new Float( 0.0F );
			}
			else if ( paramClass.equals( Byte.class ) )
			{
				localObject = new Byte( ( byte ) 0 );
			}
			else if ( paramClass.equals( Integer.class ) )
			{
				localObject = new Integer( 0 );
			}
			else if ( paramClass.equals( Long.class ) )
			{
				localObject = new Long( 0L );
			}
			else if ( paramClass.equals( Short.class ) )
			{
				localObject = new Short( ( short ) 0 );
			}
		}
		catch ( Exception localException )
		{
			throw new JposConfigException( "Invalid property type" );
		}
		return localObject;
	}

	public static Object parsePropValue( String paramString, Class paramClass ) throws JposConfigException
	{
		if ( !isValidPropType( paramClass ) )
		{
			throw new JposConfigException( "Invalid property type: " + paramClass );
		}
		Object localObject = "";
		try
		{
			if ( paramClass.equals( String.class ) )
			{
				localObject = paramString;
			}
			else if ( paramClass.equals( Boolean.class ) )
			{
				localObject = Boolean.valueOf( paramString );
			}
			else if ( paramClass.equals( Character.class ) )
			{
				localObject = new Character( paramString.charAt( 0 ) );
			}
			else if ( paramClass.equals( Double.class ) )
			{
				localObject = Double.valueOf( paramString );
			}
			else if ( paramClass.equals( Float.class ) )
			{
				localObject = Float.valueOf( paramString );
			}
			else if ( paramClass.equals( Byte.class ) )
			{
				localObject = Byte.decode( paramString );
			}
			else if ( paramClass.equals( Integer.class ) )
			{
				localObject = Integer.decode( paramString );
			}
			else if ( paramClass.equals( Long.class ) )
			{
				localObject = Long.decode( paramString );
			}
			else if ( paramClass.equals( Short.class ) )
			{
				localObject = Short.decode( paramString );
			}
		}
		catch ( Exception localException )
		{
			throw new JposConfigException( "Could not create property value of type: " + paramClass + " from string: " + paramString );
		}
		return localObject;
	}

	public static Class propTypeFromString( String paramString ) throws JposConfigException
	{
		if ( paramString == null )
		{
			throw new JposConfigException( "typeString cannot be null" );
		}
		String str = "java.lang." + paramString;
		try
		{
			Class localClass = Class.forName( str );
			if ( !isValidPropType( localClass ) )
			{
				throw new JposConfigException( "Invalid property type: " + paramString );
			}
			return localClass;
		}
		catch ( ClassNotFoundException localClassNotFoundException )
		{
			throw new JposConfigException( "Invalid typeString", localClassNotFoundException );
		}
	}

	static
	{
		for ( int i = 0; i < JposEntryConst.REQUIRED_PROPS.length; i++ )
		{
			STANDARD_PROP_NAMES_LIST.add( JposEntryConst.REQUIRED_PROPS[i] );
		}
		STANDARD_PROP_NAMES_LIST.add( "deviceBus" );
		for ( int j = 0; j < RS232Const.RS232_PROPS.length; j++ )
		{
			STANDARD_PROP_NAMES_LIST.add( RS232Const.RS232_PROPS[j] );
		}
	}
}
