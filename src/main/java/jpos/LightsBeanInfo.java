package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class LightsBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( Lights.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, Lights.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapAlarm" ), makeProperty( "CapBlink" ), makeProperty( "CapColor" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "MaxLights" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" )};
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
		return new EventSetDescriptor( Lights.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
