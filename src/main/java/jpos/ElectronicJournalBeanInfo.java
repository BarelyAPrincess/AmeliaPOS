package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class ElectronicJournalBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( ElectronicJournal.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, ElectronicJournal.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapAddMarker" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapErasableMedium" ), makeProperty( "CapInitializeMedium" ), makeProperty( "CapMediumIsAvailable" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapPrintContent" ), makeProperty( "CapPrintContentFile" ), makeProperty( "CapRetrieveCurrentMarker" ), makeProperty( "CapRetrieveMarker" ), makeProperty( "CapRetrieveMarkerByDateTime" ), makeProperty( "CapRetrieveMarkersDateTime" ), makeProperty( "CapStation" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapStorageEnabled" ), makeProperty( "CapSuspendPrintContent" ), makeProperty( "CapSuspendQueryContent" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapWaterMark" ), makeProperty( "AsyncMode" ), makeProperty( "AutoDisable" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "FlagWhenIdle" ), makeProperty( "MediumFreeSpace" ), makeProperty( "MediumID" ), makeProperty( "MediumIsAvailable" ), makeProperty( "MediumSize" ), makeProperty( "OutputID" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "Station" ), makeProperty( "StorageEnabled" ), makeProperty( "Suspended" ), makeProperty( "WaterMark" )};
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
		return new EventSetDescriptor( ElectronicJournal.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
