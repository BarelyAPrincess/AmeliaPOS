package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class BiometricsBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( Biometrics.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, Biometrics.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapPrematchData" ), makeProperty( "CapRawSensorData" ), makeProperty( "CapRealTimeData" ), makeProperty( "CapSensorColor" ), makeProperty( "CapSensorOrientation" ), makeProperty( "CapSensorType" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapTemplateAdaptation" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "Algorithm" ), makeProperty( "AlgorithmList" ), makeProperty( "AutoDisable" ), makeProperty( "BIR" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "RawSensorData" ), makeProperty( "RealTimeDataEnabled" ), makeProperty( "SensorBPP" ), makeProperty( "SensorColor" ), makeProperty( "SensorHeight" ), makeProperty( "SensorOrientation" ), makeProperty( "SensorType" ), makeProperty( "SensorWidth" )};
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
		return new EventSetDescriptor( Biometrics.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
