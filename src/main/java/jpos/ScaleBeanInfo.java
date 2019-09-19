/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class ScaleBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( Scale.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, Scale.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapDisplay" ), makeProperty( "CapDisplayText" ), makeProperty( "CapPriceCalculating" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapTareWeight" ), makeProperty( "CapZeroScale" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapStatusUpdate" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapFreezeValue" ), makeProperty( "CapReadLiveWeightWithTare" ), makeProperty( "CapSetPriceCalculationMode" ), makeProperty( "CapSetUnitPriceWithWeightUnit" ), makeProperty( "CapSpecialTare" ), makeProperty( "CapTarePriority" ), makeProperty( "MaximumWeight" ), makeProperty( "WeightUnit" ), makeProperty( "AsyncMode" ), makeProperty( "AutoDisable" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "MaxDisplayTextChars" ), makeProperty( "SalesPrice" ), makeProperty( "TareWeight" ), makeProperty( "UnitPrice" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "ScaleLiveWeight" ), makeProperty( "StatusNotify" ), makeProperty( "ZeroValid" ), makeProperty( "MinimumWeight" )};
			return arrayOfPropertyDescriptor;
		}
		catch ( Exception localException )
		{
		}
		return super.getPropertyDescriptors();
	}

	public EventSetDescriptor makeEvent( String paramString ) throws IntrospectionException, ClassNotFoundException
	{
		String str = "jpos.events." + paramString + "Listener";
		return new EventSetDescriptor( Scale.class, paramString, Class.forName( str ), paramString + "Occurred" );
	}

	public EventSetDescriptor[] getEventSetDescriptors()
	{
		try
		{
			EventSetDescriptor[] arrayOfEventSetDescriptor = {makeEvent( "Data" ), makeEvent( "DirectIO" ), makeEvent( "Error" ), makeEvent( "StatusUpdate" )};
			return arrayOfEventSetDescriptor;
		}
		catch ( Exception localException )
		{
		}
		return super.getEventSetDescriptors();
	}
}
