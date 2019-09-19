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

public class CashChangerBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( CashChanger.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, CashChanger.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapDiscrepancy" ), makeProperty( "CapEmptySensor" ), makeProperty( "CapFullSensor" ), makeProperty( "CapNearEmptySensor" ), makeProperty( "CapNearFullSensor" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapDeposit" ), makeProperty( "CapDepositDataEvent" ), makeProperty( "CapPauseDeposit" ), makeProperty( "CapRepayDeposit" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapJamSensor" ), makeProperty( "CapRealTimeData" ), makeProperty( "AsyncMode" ), makeProperty( "AsyncResultCode" ), makeProperty( "AsyncResultCodeExtended" ), makeProperty( "CurrencyCashList" ), makeProperty( "CurrencyCode" ), makeProperty( "CurrencyCodeList" ), makeProperty( "CurrentExit" ), makeProperty( "DeviceExits" ), makeProperty( "DeviceStatus" ), makeProperty( "ExitCashList" ), makeProperty( "FullStatus" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "DepositAmount" ), makeProperty( "DepositCashList" ), makeProperty( "DepositCodeList" ), makeProperty( "DepositCounts" ), makeProperty( "DepositStatus" ), makeProperty( "CurrentService" ), makeProperty( "RealTimeDataEnabled" ), makeProperty( "ServiceCount" ), makeProperty( "ServiceIndex" )};
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
		return new EventSetDescriptor( CashChanger.class, paramString, Class.forName( str ), paramString + "Occurred" );
	}

	public EventSetDescriptor[] getEventSetDescriptors()
	{
		try
		{
			EventSetDescriptor[] arrayOfEventSetDescriptor = {makeEvent( "Data" ), makeEvent( "DirectIO" ), makeEvent( "StatusUpdate" )};
			return arrayOfEventSetDescriptor;
		}
		catch ( Exception localException )
		{
		}
		return super.getEventSetDescriptors();
	}
}
