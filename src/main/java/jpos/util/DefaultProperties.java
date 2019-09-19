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

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

public class DefaultProperties implements JposProperties
{
	private Properties jposProperties = null;
	private HashMap multiPropMap = new HashMap();
	private String loadedPropFileName = "";
	private boolean loaded = false;
	private Exception lastException = null;
	private static Comparator propComparator = null;
	public static final String STRING_LIST_SEPARATOR = ",";

	public void loadJposProperties()
	{
		loadJposPropertiesByName( "jpos/res/jpos.properties" );
	}

	public boolean isLoaded()
	{
		return loaded;
	}

	public Exception getLastException()
	{
		return lastException;
	}

	public String getPropertyString( String paramString )
	{
		String str = "";
		if ( System.getProperties().containsKey( paramString ) )
		{
			str = System.getProperties().getProperty( paramString );
		}
		else if ( jposProperties != null )
		{
			str = jposProperties.getProperty( paramString );
		}
		return str;
	}

	public boolean isPropertyDefined( String paramString )
	{
		if ( System.getProperties().containsKey( paramString ) )
		{
			return true;
		}
		if ( jposProperties != null )
		{
			Enumeration localEnumeration = jposProperties.keys();
			while ( localEnumeration.hasMoreElements() )
			{
				String str = ( String ) localEnumeration.nextElement();
				if ( str.equals( paramString ) )
				{
					return true;
				}
			}
		}
		return false;
	}

	public Enumeration getPropertyNames()
	{
		return getJposProperties().keys();
	}

	public MultiProperty getMultiProperty( String paramString )
	{
		return ( MultiProperty ) multiPropMap.get( paramString );
	}

	public boolean hasMultiProperty( String paramString )
	{
		return multiPropMap.containsKey( paramString );
	}

	public int size()
	{
		return jposProperties.size();
	}

	public List getStringListProperty( String paramString )
	{
		String str = getPropertyString( paramString );
		ArrayList localArrayList = new ArrayList();
		if ( str == null )
		{
			return localArrayList;
		}
		StringTokenizer localStringTokenizer = new StringTokenizer( str, "," );
		while ( localStringTokenizer.hasMoreTokens() )
		{
			localArrayList.add( localStringTokenizer.nextToken() );
		}
		return localArrayList;
	}

	public String toString()
	{
		StringBuffer localStringBuffer = new StringBuffer();
		localStringBuffer.append( "<JposProperties>\n" );
		Enumeration localEnumeration = getPropertyNames();
		ArrayList localArrayList = new ArrayList();
		while ( localEnumeration.hasMoreElements() )
		{
			localArrayList.add( localEnumeration.nextElement() );
		}
		Collections.sort( localArrayList );
		Iterator localIterator = localArrayList.iterator();
		while ( localIterator.hasNext() )
		{
			String str1 = ( String ) localIterator.next();
			String str2 = getPropertyString( str1 );
			localStringBuffer.append( "<name = \"" + str1 + "\"" + " value = \"" + str2 + "\" />\n" );
		}
		localStringBuffer.append( "</JposProperties>\n" );
		return localStringBuffer.toString();
	}

	public static Comparator propComparator()
	{
		if ( propComparator == null )
		{
			propComparator = new Comparator()
			{
				public int compare( Object paramAnonymousObject1, Object paramAnonymousObject2 )
				{
					if ( !( paramAnonymousObject1 instanceof JposProperties.Prop ) )
					{
						return -1;
					}
					if ( !( paramAnonymousObject2 instanceof JposProperties.Prop ) )
					{
						return -1;
					}
					String str1 = ( ( JposProperties.Prop ) paramAnonymousObject1 ).getName();
					String str2 = ( ( JposProperties.Prop ) paramAnonymousObject2 ).getName();
					return str1.compareTo( str2 );
				}
			};
		}
		return propComparator;
	}

	public static Iterator getDefinedPropertyNames()
	{
		ArrayList localArrayList = new ArrayList();
		for ( int i = 0; i < JposPropertiesConst.PROP_NAME_ARRAY.length; i++ )
		{
			localArrayList.add( JposPropertiesConst.PROP_NAME_ARRAY[i] );
		}
		return localArrayList.iterator();
	}

	protected void createMultiProperties()
	{
		Enumeration localEnumeration = jposProperties.keys();
		while ( localEnumeration.hasMoreElements() )
		{
			String str1 = ( String ) localEnumeration.nextElement();
			String str2 = ( String ) jposProperties.get( str1 );
			if ( isMultiProp( str1 ) )
			{
				String str3 = getMultiPropBaseName( str1 );
				MultiProp localMultiProp;
				if ( multiPropMap.containsKey( str3 ) )
				{
					localMultiProp = ( MultiProp ) multiPropMap.get( str3 );
					localMultiProp.add( str1, str2 );
				}
				else
				{
					getClass();
					localMultiProp = new MultiProp( str3 );
					localMultiProp.add( str1, str2 );
					multiPropMap.put( str3, localMultiProp );
				}
			}
		}
	}

	protected boolean isMultiProp( String paramString )
	{
		if ( paramString.indexOf( "." ) == -1 )
		{
			return false;
		}
		int i = paramString.lastIndexOf( "." );
		String str = paramString.substring( i + 1 );
		int j = -1;
		try
		{
			j = Integer.parseInt( str );
		}
		catch ( NumberFormatException localNumberFormatException )
		{
			j = -1;
		}
		return j >= 0;
	}

	protected String getMultiPropBaseName( String paramString ) throws IllegalArgumentException
	{
		if ( !isMultiProp( paramString ) )
		{
			throw new IllegalArgumentException( "getMultiPropBaseName( propName ) expects a propName that is a MuliProp" );
		}
		return paramString.substring( 0, paramString.lastIndexOf( "." ) );
	}

	public Iterator getProps()
	{
		ArrayList localArrayList = new ArrayList();
		Enumeration localEnumeration = getPropertyNames();
		while ( localEnumeration.hasMoreElements() )
		{
			String str1 = ( String ) localEnumeration.nextElement();
			String str2 = getPropertyString( str1 );
			Prop localProp = new Prop( str1, str2 );
			localArrayList.add( localProp );
		}
		return localArrayList.iterator();
	}

	void loadJposPropertiesByName( String paramString )
	{
		loaded = false;
		lastException = null;
		jposProperties = findProperties( paramString );
		createMultiProperties();
	}

	String getLoadedPropFileName()
	{
		return loadedPropFileName;
	}

	Properties getJposProperties()
	{
		if ( jposProperties == null )
		{
			loadJposProperties();
		}
		return jposProperties;
	}

	Properties findProperties( String paramString )
	{
		Properties localProperties = new Properties();
		loadedPropFileName = paramString;
		Object localObject1 = getClass().getClassLoader().getResourceAsStream( loadedPropFileName );
		if ( localObject1 != null )
		{
			localObject1 = new BufferedInputStream( ( InputStream ) localObject1 );
			try
			{
				localProperties.load( ( InputStream ) localObject1 );
				loaded = true;
			}
			catch ( Exception localException1 )
			{
				loaded = false;
				loadedPropFileName = "";
				lastException = localException1;
			}
			finally
			{
				try
				{
					( ( InputStream ) localObject1 ).close();
				}
				catch ( Exception localException2 )
				{
					System.err.println( "Unexpected exception while closing stream Exception.message = " + localException2.getMessage() );
				}
			}
		}
		else
		{
			loaded = false;
			System.err.println( paramString + " file not found" );
		}
		return localProperties;
	}

	public static class Prop implements JposProperties.Prop
	{
		private String name = "";
		private String value = "";

		public Prop( String paramString1, String paramString2 )
		{
			name = paramString1;
			value = paramString2;
		}

		public String getName()
		{
			return name;
		}

		public String getValue()
		{
			return value;
		}

		public void setName( String paramString )
		{
			name = paramString;
		}

		public void setValue( String paramString )
		{
			value = paramString;
		}

		public int compareTo( JposProperties.Prop paramProp )
		{
			if ( paramProp == null )
			{
				return -1;
			}
			return getName().compareTo( paramProp.getName() );
		}

		public int compareTo( Object paramObject )
		{
			return compareTo( ( JposProperties.Prop ) paramObject );
		}

		public boolean equals( Object paramObject )
		{
			if ( paramObject == null )
			{
				return false;
			}
			if ( !( paramObject instanceof JposProperties.Prop ) )
			{
				return false;
			}
			JposProperties.Prop localProp = ( JposProperties.Prop ) paramObject;
			return ( getName().equals( localProp.getName() ) ) && ( getValue().equals( localProp.getValue() ) );
		}

		public String toString()
		{
			return "<name = " + getName() + ", value = " + getValue() + ">";
		}
	}

	class MultiProp implements MultiProperty
	{
		private String basePropName = "";
		private HashMap propMap = new HashMap();

		MultiProp( String paramString )
		{
			basePropName = paramString;
		}

		public String getBasePropertyName()
		{
			return basePropName;
		}

		public Iterator getPropertyNames()
		{
			return propMap.keySet().iterator();
		}

		public Iterator getSortedPropertyNames()
		{
			ArrayList localArrayList = new ArrayList( propMap.keySet() );
			Collections.sort( localArrayList );
			return localArrayList.iterator();
		}

		public Iterator getPropertyValues()
		{
			return propMap.values().iterator();
		}

		public String getPropertyString( String paramString )
		{
			return ( String ) propMap.get( paramString );
		}

		public String getPropertyString( int paramInt ) throws IllegalArgumentException
		{
			if ( paramInt < 0 )
			{
				throw new IllegalArgumentException( "Cannot find property in multiprop with number i = " + paramInt );
			}
			return getPropertyString( getBasePropertyName() + "." + paramInt );
		}

		public int getNumberOfProperties()
		{
			return propMap.size();
		}

		public int propertyNumber( String paramString ) throws IllegalArgumentException
		{
			return validatePropName( paramString );
		}

		int validatePropName( String paramString ) throws IllegalArgumentException
		{
			if ( !paramString.startsWith( getBasePropertyName() + "." ) )
			{
				throw new IllegalArgumentException( "propName = " + paramString + " passed does not match base prop name of " + getBasePropertyName() );
			}
			if ( paramString.endsWith( "." ) )
			{
				throw new IllegalArgumentException( "propName = " + paramString + " passed must end with a pattern .<number>" );
			}
			String str = paramString.substring( paramString.lastIndexOf( "." ) + 1 );
			int i = 0;
			try
			{
				i = Integer.parseInt( str );
			}
			catch ( NumberFormatException localNumberFormatException )
			{
				throw new IllegalArgumentException( "propName = " + paramString + " passed must end with a pattern .<number>" );
			}
			return i;
		}

		void add( String paramString1, String paramString2 ) throws IllegalArgumentException
		{
			validatePropName( paramString1 );
			propMap.put( paramString1, paramString2 );
		}

		String remove( String paramString )
		{
			return ( String ) propMap.remove( paramString );
		}
	}
}
