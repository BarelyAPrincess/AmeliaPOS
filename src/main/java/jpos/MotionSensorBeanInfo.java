package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class MotionSensorBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( MotionSensor.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, MotionSensor.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapPowerReporting" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "Motion" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "Timeout" )};
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
		return new EventSetDescriptor( MotionSensor.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
