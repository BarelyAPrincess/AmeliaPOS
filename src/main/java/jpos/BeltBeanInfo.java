package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class BeltBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( Belt.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, Belt.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapAutoStopBackward" ), makeProperty( "CapAutoStopBackwardItemCount" ), makeProperty( "CapAutoStopForward" ), makeProperty( "CapAutoStopForwardItemCount" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapLightBarrierBackward" ), makeProperty( "CapLightBarrierForward" ), makeProperty( "CapMoveBackward" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapRealTimeData" ), makeProperty( "CapSecurityFlapBackward" ), makeProperty( "CapSecurityFlapForward" ), makeProperty( "CapSpeedStepsBackward" ), makeProperty( "CapSpeedStepsForward" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "AutoStopBackward" ), makeProperty( "AutoStopBackwardDelayTime" ), makeProperty( "AutoStopBackwardItemCount" ), makeProperty( "AutoStopForward" ), makeProperty( "AutoStopForwardDelayTime" ), makeProperty( "AutoStopForwardItemCount" ), makeProperty( "LightBarrierBackwardInterrupted" ), makeProperty( "LightBarrierForwardInterrupted" ), makeProperty( "MotionStatus" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "SecurityFlapBackwardOpened" ), makeProperty( "SecurityFlapForwardOpened" )};
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
		return new EventSetDescriptor( Belt.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
