package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class CheckScannerBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( CheckScanner.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, CheckScanner.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapAutoGenerateFileID" ), makeProperty( "CapAutoGenerateImageTagData" ), makeProperty( "CapAutoSize" ), makeProperty( "CapColor" ), makeProperty( "CapConcurrentMICR" ), makeProperty( "CapDefineCropArea" ), makeProperty( "CapImageFormat" ), makeProperty( "CapImageTagData" ), makeProperty( "CapMICRDevice" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapStoreImageFiles" ), makeProperty( "CapValidationDevice" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapAutoContrast" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapContrast" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "AutoDisable" ), makeProperty( "Color" ), makeProperty( "ConcurrentMICR" ), makeProperty( "CropAreaCount" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "DocumentHeight" ), makeProperty( "DocumentWidth" ), makeProperty( "FileID" ), makeProperty( "FileIndex" ), makeProperty( "ImageData" ), makeProperty( "ImageFormat" ), makeProperty( "ImageMemoryStatus" ), makeProperty( "ImageTagData" ), makeProperty( "MapMode" ), makeProperty( "MaxCropAreas" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "Quality" ), makeProperty( "QualityList" ), makeProperty( "RemainingImagesEstimate" ), makeProperty( "Contrast" )};
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
		return new EventSetDescriptor( CheckScanner.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
