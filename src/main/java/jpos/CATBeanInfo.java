package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class CATBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( CAT.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, CAT.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapAdditionalSecurityInformation" ), makeProperty( "CapAuthorizeCompletion" ), makeProperty( "CapAuthorizePreSales" ), makeProperty( "CapAuthorizeRefund" ), makeProperty( "CapAuthorizeVoid" ), makeProperty( "CapAuthorizeVoidPreSales" ), makeProperty( "CapCenterResultCode" ), makeProperty( "CapCheckCard" ), makeProperty( "CapDailyLog" ), makeProperty( "CapInstallments" ), makeProperty( "CapPaymentDetail" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapTaxOthers" ), makeProperty( "CapTransactionNumber" ), makeProperty( "CapTrainingMode" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapCashDeposit" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapLockTerminal" ), makeProperty( "CapLogStatus" ), makeProperty( "CapUnlockTerminal" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "AccountNumber" ), makeProperty( "AdditionalSecurityInformation" ), makeProperty( "ApprovalCode" ), makeProperty( "AsyncMode" ), makeProperty( "CardCompanyID" ), makeProperty( "CenterResultCode" ), makeProperty( "DailyLog" ), makeProperty( "PaymentCondition" ), makeProperty( "PaymentDetail" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "SequenceNumber" ), makeProperty( "SlipNumber" ), makeProperty( "TrainingMode" ), makeProperty( "TransactionNumber" ), makeProperty( "TransactionType" ), makeProperty( "PaymentMedia" ), makeProperty( "Balance" ), makeProperty( "LogStatus" ), makeProperty( "SettledAmount" ), makeProperty( "OutputID" )};
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
		return new EventSetDescriptor( CAT.class, paramString, Class.forName( str ), paramString + "Occurred" );
	}

	public EventSetDescriptor[] getEventSetDescriptors()
	{
		try
		{
			EventSetDescriptor[] arrayOfEventSetDescriptor = {makeEvent( "DirectIO" ), makeEvent( "Error" ), makeEvent( "OutputComplete" ), makeEvent( "StatusUpdate" )};
			return arrayOfEventSetDescriptor;
		}
		catch ( Exception localException )
		{
		}
		return super.getEventSetDescriptors();
	}
}
