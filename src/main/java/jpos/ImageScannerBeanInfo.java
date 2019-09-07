package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class ImageScannerBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( ImageScanner.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, ImageScanner.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapAim" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapDecodeData" ), makeProperty( "CapHostTriggered" ), makeProperty( "CapIlluminate" ), makeProperty( "CapImageData" ), makeProperty( "CapImageQuality" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapVideoData" ), makeProperty( "AimMode" ), makeProperty( "AutoDisable" ), makeProperty( "BitsPerPixel" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "FrameData" ), makeProperty( "FrameType" ), makeProperty( "IlluminateMode" ), makeProperty( "ImageHeight" ), makeProperty( "ImageLength" ), makeProperty( "ImageMode" ), makeProperty( "ImageQuality" ), makeProperty( "ImageType" ), makeProperty( "ImageWidth" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "VideoCount" ), makeProperty( "VideoRate" )};
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
		return new EventSetDescriptor( ImageScanner.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
