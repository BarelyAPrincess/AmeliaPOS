package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class PINPadBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( PINPad.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, PINPad.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapDisplay" ), makeProperty( "CapLanguage" ), makeProperty( "CapKeyboard" ), makeProperty( "CapMACCalculation" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapTone" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "AccountNumber" ), makeProperty( "AdditionalSecurityInformation" ), makeProperty( "Amount" ), makeProperty( "AvailableLanguagesList" ), makeProperty( "AvailablePromptsList" ), makeProperty( "DataCount" ), makeProperty( "DataEventEnabled" ), makeProperty( "EncryptedPIN" ), makeProperty( "MaximumPINLength" ), makeProperty( "MerchantID" ), makeProperty( "MinimumPINLength" ), makeProperty( "PINEntryEnabled" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "Prompt" ), makeProperty( "PromptLanguage" ), makeProperty( "TerminalID" ), makeProperty( "Track1Data" ), makeProperty( "Track2Data" ), makeProperty( "Track3Data" ), makeProperty( "TransactionType" ), makeProperty( "Track4Data" )};
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
		return new EventSetDescriptor( PINPad.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
