package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class POSPowerBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( POSPower.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, POSPower.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapFanAlarm" ), makeProperty( "CapHeatAlarm" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapQuickCharge" ), makeProperty( "CapShutdownPOS" ), makeProperty( "CapUPSChargeState" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapBatteryCapacityRemaining" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapRestartPOS" ), makeProperty( "CapStandbyPOS" ), makeProperty( "CapSuspendPOS" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapVariableBatteryCriticallyLowThreshold" ), makeProperty( "CapVariableBatteryLowThreshold" ), makeProperty( "EnforcedShutdownDelayTime" ), makeProperty( "PowerFailDelayTime" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "QuickChargeMode" ), makeProperty( "QuickChargeTime" ), makeProperty( "UPSChargeState" ), makeProperty( "BatteryCapacityRemaining" ), makeProperty( "BatteryCriticallyLowThreshold" ), makeProperty( "BatteryLowThreshold" ), makeProperty( "PowerSource" )};
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
		return new EventSetDescriptor( POSPower.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
