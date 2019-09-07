package jpos.config.simple;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import jpos.config.JposConfigException;
import jpos.config.JposEntry;
import jpos.config.JposEntry.Prop;
import jpos.config.JposRegPopulator;
import jpos.util.JposEntryUtility;

public class SimpleEntry implements JposEntry, Serializable, Comparable
{
	private Hashtable properties = new Hashtable();
	private transient JposRegPopulator regPopulator = null;
	public static final long serialVersionUID = 6937048853319310114L;

	public SimpleEntry()
	{
		regPopulator = null;
	}

	public SimpleEntry( JposRegPopulator paramJposRegPopulator )
	{
		regPopulator = paramJposRegPopulator;
	}

	public SimpleEntry( String paramString, JposRegPopulator paramJposRegPopulator )
	{
		this( paramJposRegPopulator );
		addProperty( "logicalName", paramString );
	}

	SimpleEntry( String paramString )
	{
		addProperty( "logicalName", paramString );
	}

	public int getPropertyCount()
	{
		return properties.size();
	}

	public Enumeration getPropertyNames()
	{
		return properties.keys();
	}

	public boolean hasPropertyWithName( String paramString )
	{
		return properties.containsKey( paramString );
	}

	public boolean hasPropertyWithValue( Object paramObject )
	{
		return properties.contains( paramObject );
	}

	public Object getPropertyValue( String paramString )
	{
		return properties.get( paramString );
	}

	public Class getPropertyType( String paramString )
	{
		return getPropertyValue( paramString ).getClass();
	}

	public Object modifyPropertyValue( String paramString, Object paramObject ) throws IllegalArgumentException
	{
		checkNull( paramString );
		checkNull( paramObject );
		if ( !hasPropertyWithName( paramString ) )
		{
			return null;
		}
		Object localObject = removeProperty( paramString );
		addProperty( paramString, paramObject );
		return localObject;
	}

	public Object addProperty( String paramString, Object paramObject ) throws IllegalArgumentException
	{
		checkNull( paramString );
		checkNull( paramObject );
		return properties.put( paramString, paramObject );
	}

	public Object removeProperty( String paramString )
	{
		return properties.remove( paramString );
	}

	public boolean equals( JposEntry paramJposEntry )
	{
		if ( paramJposEntry == null )
		{
			return false;
		}
		if ( getPropertyCount() != paramJposEntry.getPropertyCount() )
		{
			return false;
		}
		Enumeration localEnumeration = paramJposEntry.getPropertyNames();
		while ( localEnumeration.hasMoreElements() )
		{
			String str = ( String ) localEnumeration.nextElement();
			Object localObject = paramJposEntry.getPropertyValue( str );
			if ( !hasPropertyWithName( str ) )
			{
				return false;
			}
			if ( !getPropertyValue( str ).equals( localObject ) )
			{
				return false;
			}
		}
		return true;
	}

	public JposEntry copy()
	{
		SimpleEntry localSimpleEntry = new SimpleEntry();
		Enumeration localEnumeration = getPropertyNames();
		while ( localEnumeration.hasMoreElements() )
		{
			String str = ( String ) localEnumeration.nextElement();
			localSimpleEntry.addProperty( str, getPropertyValue( str ) );
		}
		return localSimpleEntry;
	}

	public JposRegPopulator getRegPopulator()
	{
		return regPopulator;
	}

	public String getLogicalName()
	{
		return ( String ) getPropertyValue( "logicalName" );
	}

	public JposEntry.Prop getProp( String paramString )
	{
		Object localObject = getPropertyValue( paramString );
		if ( localObject == null )
		{
			return null;
		}
		return new Prop( paramString, localObject );
	}

	public Iterator getProps()
	{
		ArrayList localArrayList = new ArrayList();
		Enumeration localEnumeration = getPropertyNames();
		while ( localEnumeration.hasMoreElements() )
		{
			String str = ( String ) localEnumeration.nextElement();
			localArrayList.add( new Prop( str, getPropertyValue( str ) ) );
		}
		return localArrayList.iterator();
	}

	public void add( JposEntry.Prop paramProp ) throws IllegalArgumentException
	{
		checkNull( paramProp );
		addProperty( paramProp.getName(), paramProp.getValue() );
	}

	public void remove( JposEntry.Prop paramProp )
	{
		removeProperty( paramProp.getName() );
	}

	public void modify( JposEntry.Prop paramProp ) throws IllegalArgumentException
	{
		checkNull( paramProp );
		if ( !hasPropertyWithName( paramProp.getName() ) )
		{
			return;
		}
		modifyPropertyValue( paramProp.getName(), paramProp.getValue() );
	}

	public boolean hasProp( JposEntry.Prop paramProp )
	{
		return hasPropertyWithName( paramProp.getName() );
	}

	public JposEntry.Prop createProp( String paramString, Object paramObject, Class paramClass ) throws JposConfigException
	{
		if ( ( paramString == null ) || ( paramObject == null ) || ( paramClass == null ) )
		{
			throw new JposConfigException( "Cannot create JposEntry.Prop with null argument" );
		}
		if ( !JposEntryUtility.validatePropValue( paramObject, paramClass ) )
		{
			throw new JposConfigException( "Cannot create JposEntry.Prop with invalid value or type" );
		}
		return new Prop( paramString, paramObject );
	}

	public boolean equals( Object paramObject )
	{
		if ( ( paramObject instanceof JposEntry ) )
		{
			return equals( ( JposEntry ) paramObject );
		}
		return false;
	}

	public int compareTo( Object paramObject )
	{
		if ( ( paramObject == null ) || ( !( paramObject instanceof JposEntry ) ) )
		{
			throw new RuntimeException( "Cannot compare: " + paramObject + " with JposEntry: " + this );
		}
		JposEntry localJposEntry = ( JposEntry ) paramObject;
		if ( equals( localJposEntry ) )
		{
			return 0;
		}
		return getLogicalName().compareTo( localJposEntry.getLogicalName() );
	}

	public String toString()
	{
		StringBuffer localStringBuffer = new StringBuffer();
		localStringBuffer.append( "<JposEntry logicalName=\"" + getPropertyValue( "logicalName" ) + "\">\n" );
		localStringBuffer.append( "\t<creation factoryClass=\"" + getPropertyValue( "serviceInstanceFactoryClass" ) + "\" serviceClass=\"" + getPropertyValue( "serviceClass" ) + "\"/>\n" );
		localStringBuffer.append( "\t<vendor name=\"" + getPropertyValue( "vendorName" ) + "\" url=" + getPropertyValue( "vendorURL" ) + "\"/>\n" );
		localStringBuffer.append( "\t<jpos category=\"" + getPropertyValue( "deviceCategory" ) + "\" version=\"" + getPropertyValue( "jposVersion" ) + "\"/>\n" );
		localStringBuffer.append( "\t<product description=\"" + getPropertyValue( "productDescription" ) + "\" name=\"" + getPropertyValue( "productName" ) + "\" url=\"" + getPropertyValue( "productURL" ) + "\"/>\n" );
		localStringBuffer.append( "\n" );
		Enumeration localEnumeration = JposEntryUtility.getNonRequiredPropNames( this );
		while ( localEnumeration.hasMoreElements() )
		{
			String str1 = ( String ) localEnumeration.nextElement();
			String str2 = getPropertyValue( str1 ).toString();
			String str3 = JposEntryUtility.shortClassName( str2.getClass() );
			localStringBuffer.append( "\t<prop name=\"" + str1 + "\" value=\"" + str2 + "\" type=\"" + str3 + "\"/>\n" );
		}
		localStringBuffer.append( "</JposEntry>\n" );
		return localStringBuffer.toString();
	}

	void setRegPopulator( JposRegPopulator paramJposRegPopulator )
	{
		regPopulator = paramJposRegPopulator;
	}

	protected static void checkNull( Object paramObject ) throws IllegalArgumentException
	{
		if ( paramObject == null )
		{
			throw new IllegalArgumentException( "Invalid null argument passed for a JposEntry property value or name" );
		}
	}

	public static class Prop implements JposEntry.Prop, Comparable
	{
		private String name = "";
		private Object value = null;
		private Class typeClass = null;

		public Prop( String paramString, Object paramObject ) throws IllegalArgumentException
		{
			SimpleEntry.checkNull( paramString );
			SimpleEntry.checkNull( paramObject );
			name = paramString;
			value = paramObject;
			typeClass = paramObject.getClass();
		}

		public String getName()
		{
			return name;
		}

		public Object getValue()
		{
			return value;
		}

		public String getValueAsString()
		{
			return String.valueOf( value );
		}

		public Class getType()
		{
			return typeClass;
		}

		public void setName( String paramString ) throws IllegalArgumentException
		{
			SimpleEntry.checkNull( paramString );
			name = paramString;
		}

		public void setValue( Object paramObject ) throws IllegalArgumentException
		{
			SimpleEntry.checkNull( paramObject );
			if ( !JposEntryUtility.validatePropValue( paramObject, paramObject.getClass() ) )
			{
				throw new IllegalArgumentException( "Cannot set property named = " + getName() + " with value = " + paramObject + " invalid value or type" );
			}
			setValue( paramObject, paramObject.getClass() );
		}

		public boolean isOfType( Class paramClass )
		{
			if ( ( paramClass == null ) || ( typeClass == null ) )
			{
				return false;
			}
			return typeClass.equals( paramClass );
		}

		public JposEntry.Prop copy()
		{
			return new Prop( getName(), getValue() );
		}

		public boolean equals( Object paramObject )
		{
			if ( paramObject == null )
			{
				return false;
			}
			if ( !( paramObject instanceof JposEntry.Prop ) )
			{
				return false;
			}
			JposEntry.Prop localProp = ( JposEntry.Prop ) paramObject;
			return ( getName().equals( localProp.getName() ) ) && ( getValue().equals( localProp.getValue() ) );
		}

		public int compareTo( Object paramObject )
		{
			if ( ( paramObject == null ) || ( !( paramObject instanceof JposEntry.Prop ) ) )
			{
				throw new RuntimeException( "Cannot compare: " + paramObject + " with JposEntry.Prop: " + this );
			}
			JposEntry.Prop localProp = ( JposEntry.Prop ) paramObject;
			if ( equals( localProp ) )
			{
				return 0;
			}
			return getName().compareTo( localProp.getName() );
		}

		public int hashCode()
		{
			return getName().hashCode();
		}

		private void setValue( Object paramObject, Class paramClass ) throws IllegalArgumentException
		{
			SimpleEntry.checkNull( paramObject );
			SimpleEntry.checkNull( paramClass );
			if ( !paramObject.getClass().equals( paramClass ) )
			{
				throw new IllegalArgumentException( "Value and value type not in agreement for property named = " + name );
			}
			value = paramObject;
			typeClass = paramClass;
		}
	}
}
