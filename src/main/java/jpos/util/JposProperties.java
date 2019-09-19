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

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public abstract interface JposProperties extends JposPropertiesConst
{
	public static final String TRACING_PROP_NAME = "jpos.util.tracing";
	public static final String TRACING_ON_PROP_VALUE = "ON";
	public static final String TRACING_TRUE_PROP_VALUE = "TRUE";

	public abstract void loadJposProperties();

	public abstract boolean isLoaded();

	public abstract String getPropertyString( String paramString );

	public abstract boolean isPropertyDefined( String paramString );

	public abstract Enumeration getPropertyNames();

	public abstract List getStringListProperty( String paramString );

	public abstract MultiProperty getMultiProperty( String paramString );

	public abstract boolean hasMultiProperty( String paramString );

	public abstract Iterator getProps();

	public abstract int size();

	public static abstract interface Prop extends Comparable
	{
		public abstract String getName();

		public abstract String getValue();

		public abstract void setName( String paramString );

		public abstract void setValue( String paramString );

		public abstract int compareTo( Prop paramProp );

		public abstract int compareTo( Object paramObject );
	}

	public static abstract interface MultiProperty
	{
		public abstract int propertyNumber( String paramString ) throws IllegalArgumentException;

		public abstract String getBasePropertyName();

		public abstract Iterator getPropertyNames();

		public abstract Iterator getSortedPropertyNames();

		public abstract Iterator getPropertyValues();

		public abstract String getPropertyString( String paramString );

		public abstract String getPropertyString( int paramInt ) throws IllegalArgumentException;

		public abstract int getNumberOfProperties();
	}
}
