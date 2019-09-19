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

public class PointCardRWBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( PointCardRW.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, PointCardRW.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapBold" ), makeProperty( "CapCardEntranceSensor" ), makeProperty( "CapCharacterSet" ), makeProperty( "CapCleanCard" ), makeProperty( "CapClearPrint" ), makeProperty( "CapDhigh" ), makeProperty( "CapDwide" ), makeProperty( "CapDwideDhigh" ), makeProperty( "CapItalic" ), makeProperty( "CapLeft90" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapPrint" ), makeProperty( "CapPrintMode" ), makeProperty( "CapRight90" ), makeProperty( "CapRotate180" ), makeProperty( "CapTracksToRead" ), makeProperty( "CapTracksToWrite" ), makeProperty( "CapMapCharacterSet" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CardState" ), makeProperty( "CharacterSet" ), makeProperty( "CharacterSetList" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "FontTypeFaceList" ), makeProperty( "LineChars" ), makeProperty( "LineCharsList" ), makeProperty( "LineHeight" ), makeProperty( "LineSpacing" ), makeProperty( "LineWidth" ), makeProperty( "MapMode" ), makeProperty( "MaxLines" ), makeProperty( "OutputID" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "PrintHeight" ), makeProperty( "ReadState1" ), makeProperty( "ReadState2" ), makeProperty( "RecvLength1" ), makeProperty( "RecvLength2" ), makeProperty( "SidewaysMaxChars" ), makeProperty( "SidewaysMaxLines" ), makeProperty( "TracksToRead" ), makeProperty( "TracksToWrite" ), makeProperty( "Track1Data" ), makeProperty( "Track2Data" ), makeProperty( "Track3Data" ), makeProperty( "Track4Data" ), makeProperty( "Track5Data" ), makeProperty( "Track6Data" ), makeProperty( "WriteState1" ), makeProperty( "WriteState2" ), makeProperty( "Write1Data" ), makeProperty( "Write2Data" ), makeProperty( "Write3Data" ), makeProperty( "Write4Data" ), makeProperty( "Write5Data" ), makeProperty( "Write6Data" ), makeProperty( "MapCharacterSet" )};
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
		return new EventSetDescriptor( PointCardRW.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
