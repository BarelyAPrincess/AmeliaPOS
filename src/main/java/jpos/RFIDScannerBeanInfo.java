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

public class RFIDScannerBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( RFIDScanner.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, RFIDScanner.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapContinuousRead" ), makeProperty( "CapDisableTag" ), makeProperty( "CapLockTag" ), makeProperty( "CapMultipleProtocols" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapReadTimer" ), makeProperty( "CapRealTimeData" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapWriteTag" ), makeProperty( "AutoDisable" ), makeProperty( "ContinuousReadMode" ), makeProperty( "CurrentTagID" ), makeProperty( "CurrentTagProtocol" ), makeProperty( "CurrentTagUserData" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "OutputID" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "ProtocolMask" ), makeProperty( "ReadTimerInterval" ), makeProperty( "TagCount" )};
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
		return new EventSetDescriptor( RFIDScanner.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
