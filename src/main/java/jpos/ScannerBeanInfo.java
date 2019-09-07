package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class ScannerBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( Scanner.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, Scanner.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapPowerReporting" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "AutoDisable" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "DecodeData" ), makeProperty( "ScanData" ), makeProperty( "ScanDataLabel" ), makeProperty( "ScanDataType" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" )};
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
		return new EventSetDescriptor( Scanner.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
