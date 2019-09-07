package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class ElectronicValueRWBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( ElectronicValueRW.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, ElectronicValueRW.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapActivateService" ), makeProperty( "CapAddValue" ), makeProperty( "CapCancelValue" ), makeProperty( "CapCardSensor" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapDetectionControl" ), makeProperty( "CapElectronicMoney" ), makeProperty( "CapEnumerateCardServices" ), makeProperty( "CapIndirectTransactionLog" ), makeProperty( "CapLockTerminal" ), makeProperty( "CapLogStatus" ), makeProperty( "CapMediumID" ), makeProperty( "CapPoint" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapRealTimeData" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapSubtractValue" ), makeProperty( "CapTransaction" ), makeProperty( "CapTransactionLog" ), makeProperty( "CapUnlockTerminal" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapUpdateKey" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapVoucher" ), makeProperty( "CapWriteValue" ), makeProperty( "CapPINDevice" ), makeProperty( "CapMembershipCertificate" ), makeProperty( "CapTrainingMode" ), makeProperty( "AccountNumber" ), makeProperty( "AdditionalSecurityInformation" ), makeProperty( "Amount" ), makeProperty( "ApprovalCode" ), makeProperty( "AsyncMode" ), makeProperty( "AutoDisable" ), makeProperty( "Balance" ), makeProperty( "BalanceOfPoint" ), makeProperty( "CardServiceList" ), makeProperty( "CurrentService" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "DetectionControl" ), makeProperty( "DetectionStatus" ), makeProperty( "ExpirationDate" ), makeProperty( "LastUsedDate" ), makeProperty( "LogStatus" ), makeProperty( "MediumID" ), makeProperty( "OutputID" ), makeProperty( "Point" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "ReaderWriterServiceList" ), makeProperty( "SequenceNumber" ), makeProperty( "SettledAmount" ), makeProperty( "SettledPoint" ), makeProperty( "TransactionLog" ), makeProperty( "VoucherID" ), makeProperty( "VoucherIDList" ), makeProperty( "PINEntry" ), makeProperty( "ServiceType" ), makeProperty( "TrainingModeState" )};
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
		return new EventSetDescriptor( ElectronicValueRW.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
