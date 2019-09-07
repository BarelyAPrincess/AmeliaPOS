package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class BillDispenserBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( BillDispenser.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, BillDispenser.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapDiscrepancy" ), makeProperty( "CapEmptySensor" ), makeProperty( "CapJamSensor" ), makeProperty( "CapNearEmptySensor" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "AsyncMode" ), makeProperty( "AsyncResultCode" ), makeProperty( "AsyncResultCodeExtended" ), makeProperty( "CurrencyCashList" ), makeProperty( "CurrencyCode" ), makeProperty( "CurrencyCodeList" ), makeProperty( "CurrentExit" ), makeProperty( "DeviceExits" ), makeProperty( "DeviceStatus" ), makeProperty( "ExitCashList" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" )};
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
		return new EventSetDescriptor( BillDispenser.class, paramString, Class.forName( str ), paramString + "Occurred" );
	}

	public EventSetDescriptor[] getEventSetDescriptors()
	{
		try
		{
			EventSetDescriptor[] arrayOfEventSetDescriptor = {makeEvent( "DirectIO" ), makeEvent( "StatusUpdate" )};
			return arrayOfEventSetDescriptor;
		}
		catch ( Exception localException )
		{
		}
		return super.getEventSetDescriptors();
	}
}
