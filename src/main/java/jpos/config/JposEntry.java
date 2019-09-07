package jpos.config;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Iterator;

public abstract interface JposEntry extends Serializable, Comparable
{
	public static final String SI_FACTORY_CLASS_PROP_NAME = "serviceInstanceFactoryClass";
	public static final String LOGICAL_NAME_PROP_NAME = "logicalName";
	public static final String SERVICE_CLASS_PROP_NAME = "serviceClass";
	public static final String VENDOR_NAME_PROP_NAME = "vendorName";
	public static final String VENDOR_URL_PROP_NAME = "vendorURL";
	public static final String DEVICE_CATEGORY_PROP_NAME = "deviceCategory";
	public static final String JPOS_VERSION_PROP_NAME = "jposVersion";
	public static final String PRODUCT_NAME_PROP_NAME = "productName";
	public static final String PRODUCT_DESCRIPTION_PROP_NAME = "productDescription";
	public static final String PRODUCT_URL_PROP_NAME = "productURL";

	public abstract int getPropertyCount();

	public abstract Enumeration getPropertyNames();

	public abstract boolean hasPropertyWithName( String paramString );

	public abstract boolean hasPropertyWithValue( Object paramObject );

	public abstract Object getPropertyValue( String paramString );

	public abstract Class getPropertyType( String paramString );

	public abstract Object modifyPropertyValue( String paramString, Object paramObject ) throws IllegalArgumentException;

	public abstract Object addProperty( String paramString, Object paramObject ) throws IllegalArgumentException;

	public abstract Object removeProperty( String paramString );

	public abstract boolean equals( JposEntry paramJposEntry );

	public abstract JposRegPopulator getRegPopulator();

	public abstract String getLogicalName();

	public abstract Prop getProp( String paramString );

	public abstract Iterator getProps();

	public abstract void add( Prop paramProp ) throws IllegalArgumentException;

	public abstract void remove( Prop paramProp );

	public abstract void modify( Prop paramProp ) throws IllegalArgumentException;

	public abstract boolean hasProp( Prop paramProp );

	public abstract Prop createProp( String paramString, Object paramObject, Class paramClass ) throws JposConfigException;

	public static abstract interface Prop extends Comparable
	{
		public abstract String getName();

		public abstract Object getValue();

		public abstract String getValueAsString();

		public abstract Class getType();

		public abstract void setName( String paramString ) throws IllegalArgumentException;

		public abstract void setValue( Object paramObject ) throws IllegalArgumentException;

		public abstract boolean isOfType( Class paramClass );

		public abstract boolean equals( Object paramObject );

		public abstract Prop copy();
	}
}
