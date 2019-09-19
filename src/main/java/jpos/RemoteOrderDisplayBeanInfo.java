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

public class RemoteOrderDisplayBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( RemoteOrderDisplay.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, RemoteOrderDisplay.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapPowerReporting" ), makeProperty( "CapSelectCharacterSet" ), makeProperty( "CapTone" ), makeProperty( "CapTouch" ), makeProperty( "CapTransaction" ), makeProperty( "CapMapCharacterSet" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "AsyncMode" ), makeProperty( "AutoToneDuration" ), makeProperty( "AutoToneFrequency" ), makeProperty( "CharacterSet" ), makeProperty( "CharacterSetList" ), makeProperty( "Clocks" ), makeProperty( "CurrentUnitID" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "ErrorString" ), makeProperty( "ErrorUnits" ), makeProperty( "EventString" ), makeProperty( "EventType" ), makeProperty( "EventUnitID" ), makeProperty( "EventUnits" ), makeProperty( "OutputID" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "SystemClocks" ), makeProperty( "SystemVideoSaveBuffers" ), makeProperty( "Timeout" ), makeProperty( "UnitsOnline" ), makeProperty( "VideoDataCount" ), makeProperty( "VideoMode" ), makeProperty( "VideoModesList" ), makeProperty( "VideoSaveBuffers" ), makeProperty( "MapCharacterSet" )};
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
		return new EventSetDescriptor( RemoteOrderDisplay.class, paramString, Class.forName( str ), paramString + "Occurred" );
	}

	public EventSetDescriptor[] getEventSetDescriptors()
	{
		try
		{
			EventSetDescriptor[] arrayOfEventSetDescriptor = {makeEvent( "Data" ), makeEvent( "DirectIO" ), makeEvent( "Error" ), makeEvent( "OutputComplete" ), makeEvent( "StatusUpdate" )};
			return arrayOfEventSetDescriptor;
		}
		catch ( Exception localException )
		{
		}
		return super.getEventSetDescriptors();
	}
}
