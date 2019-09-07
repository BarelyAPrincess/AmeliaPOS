package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class FiscalPrinterBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( FiscalPrinter.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, FiscalPrinter.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapAdditionalLines" ), makeProperty( "CapAmountAdjustment" ), makeProperty( "CapAmountNotPaid" ), makeProperty( "CapCheckTotal" ), makeProperty( "CapCoverSensor" ), makeProperty( "CapDoubleWidth" ), makeProperty( "CapDuplicateReceipt" ), makeProperty( "CapFixedOutput" ), makeProperty( "CapHasVatTable" ), makeProperty( "CapIndependentHeader" ), makeProperty( "CapItemList" ), makeProperty( "CapJrnEmptySensor" ), makeProperty( "CapJrnNearEndSensor" ), makeProperty( "CapJrnPresent" ), makeProperty( "CapNonFiscalMode" ), makeProperty( "CapOrderAdjustmentFirst" ), makeProperty( "CapPercentAdjustment" ), makeProperty( "CapPositiveAdjustment" ), makeProperty( "CapPowerLossReport" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapPredefinedPaymentLines" ), makeProperty( "CapReceiptNotPaid" ), makeProperty( "CapRecEmptySensor" ), makeProperty( "CapRecNearEndSensor" ), makeProperty( "CapRecPresent" ), makeProperty( "CapRemainingFiscalMemory" ), makeProperty( "CapReservedWord" ), makeProperty( "CapSetHeader" ), makeProperty( "CapSetPOSID" ), makeProperty( "CapSetStoreFiscalID" ), makeProperty( "CapSetTrailer" ), makeProperty( "CapSetVatTable" ), makeProperty( "CapSlpEmptySensor" ), makeProperty( "CapSlpFiscalDocument" ), makeProperty( "CapSlpFullSlip" ), makeProperty( "CapSlpNearEndSensor" ), makeProperty( "CapSlpPresent" ), makeProperty( "CapSlpValidation" ), makeProperty( "CapSubAmountAdjustment" ), makeProperty( "CapSubPercentAdjustment" ), makeProperty( "CapSubtotal" ), makeProperty( "CapTrainingMode" ), makeProperty( "CapValidateJournal" ), makeProperty( "CapXReport" ), makeProperty( "CapAdditionalHeader" ), makeProperty( "CapAdditionalTrailer" ), makeProperty( "CapChangeDue" ), makeProperty( "CapEmptyReceiptIsVoidable" ), makeProperty( "CapFiscalReceiptStation" ), makeProperty( "CapFiscalReceiptType" ), makeProperty( "CapMultiContractor" ), makeProperty( "CapOnlyVoidLastItem" ), makeProperty( "CapPackageAdjustment" ), makeProperty( "CapPostPreLine" ), makeProperty( "CapSetCurrency" ), makeProperty( "CapTotalizerType" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapPositiveSubtotalAdjustment" ), makeProperty( "AmountDecimalPlace" ), makeProperty( "AsyncMode" ), makeProperty( "CheckTotal" ), makeProperty( "CountryCode" ), makeProperty( "CoverOpen" ), makeProperty( "DayOpened" ), makeProperty( "DescriptionLength" ), makeProperty( "DuplicateReceipt" ), makeProperty( "ErrorLevel" ), makeProperty( "ErrorOutID" ), makeProperty( "ErrorState" ), makeProperty( "ErrorStation" ), makeProperty( "ErrorString" ), makeProperty( "FlagWhenIdle" ), makeProperty( "JrnEmpty" ), makeProperty( "JrnNearEnd" ), makeProperty( "MessageLength" ), makeProperty( "NumHeaderLines" ), makeProperty( "NumTrailerLines" ), makeProperty( "NumVatRates" ), makeProperty( "OutputID" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "PredefinedPaymentLines" ), makeProperty( "PrinterState" ), makeProperty( "QuantityDecimalPlaces" ), makeProperty( "QuantityLength" ), makeProperty( "RecEmpty" ), makeProperty( "RecNearEnd" ), makeProperty( "RemainingFiscalMemory" ), makeProperty( "ReservedWord" ), makeProperty( "SlpEmpty" ), makeProperty( "SlpNearEnd" ), makeProperty( "SlipSelection" ), makeProperty( "TrainingModeActive" ), makeProperty( "ActualCurrency" ), makeProperty( "AdditionalHeader" ), makeProperty( "AdditionalTrailer" ), makeProperty( "ChangeDue" ), makeProperty( "ContractorId" ), makeProperty( "DateType" ), makeProperty( "FiscalReceiptStation" ), makeProperty( "FiscalReceiptType" ), makeProperty( "MessageType" ), makeProperty( "PostLine" ), makeProperty( "PreLine" ), makeProperty( "TotalizerType" ), makeProperty( "AmountDecimalPlaces" )};
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
		return new EventSetDescriptor( FiscalPrinter.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
