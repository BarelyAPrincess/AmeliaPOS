package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class BumpBarBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( BumpBar.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, BumpBar.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapPowerReporting" ), makeProperty( "CapTone" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "AsyncMode" ), makeProperty( "AutoToneDuration" ), makeProperty( "AutoToneFrequency" ), makeProperty( "BumpBarDataCount" ), makeProperty( "CurrentUnitID" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "ErrorString" ), makeProperty( "ErrorUnits" ), makeProperty( "EventString" ), makeProperty( "EventUnitID" ), makeProperty( "EventUnits" ), makeProperty( "Keys" ), makeProperty( "OutputID" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "Timeout" ), makeProperty( "UnitsOnline" )};
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
		return new EventSetDescriptor( BumpBar.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
