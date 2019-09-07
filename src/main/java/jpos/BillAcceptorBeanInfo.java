package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class BillAcceptorBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( BillAcceptor.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, BillAcceptor.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapDiscrepancy" ), makeProperty( "CapFullSensor" ), makeProperty( "CapJamSensor" ), makeProperty( "CapNearFullSensor" ), makeProperty( "CapPauseDeposit" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapRealTimeData" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CurrencyCode" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "DepositAmount" ), makeProperty( "DepositCashList" ), makeProperty( "DepositCodeList" ), makeProperty( "DepositCounts" ), makeProperty( "DepositStatus" ), makeProperty( "FullStatus" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "RealTimeDataEnabled" )};
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
		return new EventSetDescriptor( BillAcceptor.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
