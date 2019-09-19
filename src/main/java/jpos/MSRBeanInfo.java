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

public class MSRBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( MSR.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, MSR.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapISO" ), makeProperty( "CapJISOne" ), makeProperty( "CapJISTwo" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapTransmitSentinels" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapWritableTracks" ), makeProperty( "CapCardAuthentication" ), makeProperty( "CapDataEncryption" ), makeProperty( "CapDeviceAuthentication" ), makeProperty( "CapTrackDataMasking" ), makeProperty( "AccountNumber" ), makeProperty( "AutoDisable" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "DecodeData" ), makeProperty( "ErrorReportingType" ), makeProperty( "ExpirationDate" ), makeProperty( "FirstName" ), makeProperty( "MiddleInitial" ), makeProperty( "ParseDecodeData" ), makeProperty( "ServiceCode" ), makeProperty( "Suffix" ), makeProperty( "Surname" ), makeProperty( "Title" ), makeProperty( "Track1Data" ), makeProperty( "Track1DiscretionaryData" ), makeProperty( "Track2Data" ), makeProperty( "Track2DiscretionaryData" ), makeProperty( "Track3Data" ), makeProperty( "TracksToRead" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "Track4Data" ), makeProperty( "TransmitSentinels" ), makeProperty( "EncodingMaxLength" ), makeProperty( "TracksToWrite" ), makeProperty( "AdditionalSecurityInformation" ), makeProperty( "CardAuthenticationData" ), makeProperty( "CardAuthenticationDataLength" ), makeProperty( "CardPropertyList" ), makeProperty( "CardType" ), makeProperty( "CardTypeList" ), makeProperty( "DataEncryptionAlgorithm" ), makeProperty( "DeviceAuthenticated" ), makeProperty( "DeviceAuthenticationProtocol" ), makeProperty( "Track1EncryptedData" ), makeProperty( "Track1EncryptedDataLength" ), makeProperty( "Track2EncryptedData" ), makeProperty( "Track2EncryptedDataLength" ), makeProperty( "Track3EncryptedData" ), makeProperty( "Track3EncryptedDataLength" ), makeProperty( "Track4EncryptedData" ), makeProperty( "Track4EncryptedDataLength" ), makeProperty( "WriteCardType" )};
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
		return new EventSetDescriptor( MSR.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
