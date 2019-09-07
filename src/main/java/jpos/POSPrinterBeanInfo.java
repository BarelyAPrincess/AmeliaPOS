package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class POSPrinterBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( POSPrinter.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, POSPrinter.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapCharacterSet" ), makeProperty( "CapConcurrentJrnRec" ), makeProperty( "CapConcurrentJrnSlp" ), makeProperty( "CapConcurrentRecSlp" ), makeProperty( "CapCoverSensor" ), makeProperty( "CapJrn2Color" ), makeProperty( "CapJrnBold" ), makeProperty( "CapJrnDhigh" ), makeProperty( "CapJrnDwide" ), makeProperty( "CapJrnDwideDhigh" ), makeProperty( "CapJrnEmptySensor" ), makeProperty( "CapJrnItalic" ), makeProperty( "CapJrnNearEndSensor" ), makeProperty( "CapJrnPresent" ), makeProperty( "CapJrnUnderline" ), makeProperty( "CapRec2Color" ), makeProperty( "CapRecBarCode" ), makeProperty( "CapRecBitmap" ), makeProperty( "CapRecBold" ), makeProperty( "CapRecDhigh" ), makeProperty( "CapRecDwide" ), makeProperty( "CapRecDwideDhigh" ), makeProperty( "CapRecEmptySensor" ), makeProperty( "CapRecItalic" ), makeProperty( "CapRecLeft90" ), makeProperty( "CapRecNearEndSensor" ), makeProperty( "CapRecPapercut" ), makeProperty( "CapRecPresent" ), makeProperty( "CapRecRight90" ), makeProperty( "CapRecRotate180" ), makeProperty( "CapRecStamp" ), makeProperty( "CapRecUnderline" ), makeProperty( "CapSlp2Color" ), makeProperty( "CapSlpBarCode" ), makeProperty( "CapSlpBitmap" ), makeProperty( "CapSlpBold" ), makeProperty( "CapSlpDhigh" ), makeProperty( "CapSlpDwide" ), makeProperty( "CapSlpDwideDhigh" ), makeProperty( "CapSlpEmptySensor" ), makeProperty( "CapSlpFullslip" ), makeProperty( "CapSlpItalic" ), makeProperty( "CapSlpLeft90" ), makeProperty( "CapSlpNearEndSensor" ), makeProperty( "CapSlpPresent" ), makeProperty( "CapSlpRight90" ), makeProperty( "CapSlpRotate180" ), makeProperty( "CapSlpUnderline" ), makeProperty( "CapTransaction" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapJrnCartridgeSensor" ), makeProperty( "CapJrnColor" ), makeProperty( "CapRecCartridgeSensor" ), makeProperty( "CapRecColor" ), makeProperty( "CapRecMarkFeed" ), makeProperty( "CapSlpBothSidesPrint" ), makeProperty( "CapSlpCartridgeSensor" ), makeProperty( "CapSlpColor" ), makeProperty( "CapMapCharacterSet" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapConcurrentPageMode" ), makeProperty( "CapRecPageMode" ), makeProperty( "CapSlpPageMode" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CapRecRuledLine" ), makeProperty( "CapSlpRuledLine" ), makeProperty( "AsyncMode" ), makeProperty( "CharacterSet" ), makeProperty( "CharacterSetList" ), makeProperty( "CoverOpen" ), makeProperty( "ErrorLevel" ), makeProperty( "ErrorStation" ), makeProperty( "ErrorString" ), makeProperty( "FlagWhenIdle" ), makeProperty( "FontTypefaceList" ), makeProperty( "JrnEmpty" ), makeProperty( "JrnLetterQuality" ), makeProperty( "JrnLineChars" ), makeProperty( "JrnLineCharsList" ), makeProperty( "JrnLineHeight" ), makeProperty( "JrnLineSpacing" ), makeProperty( "JrnLineWidth" ), makeProperty( "JrnNearEnd" ), makeProperty( "MapMode" ), makeProperty( "OutputID" ), makeProperty( "RecBarCodeRotationList" ), makeProperty( "RecEmpty" ), makeProperty( "RecLetterQuality" ), makeProperty( "RecLineChars" ), makeProperty( "RecLineCharsList" ), makeProperty( "RecLineHeight" ), makeProperty( "RecLineSpacing" ), makeProperty( "RecLinesToPaperCut" ), makeProperty( "RecLineWidth" ), makeProperty( "RecNearEnd" ), makeProperty( "RecSidewaysMaxChars" ), makeProperty( "RecSidewaysMaxLines" ), makeProperty( "RotateSpecial" ), makeProperty( "SlpBarCodeRotationList" ), makeProperty( "SlpEmpty" ), makeProperty( "SlpLetterQuality" ), makeProperty( "SlpLineChars" ), makeProperty( "SlpLineCharsList" ), makeProperty( "SlpLineHeight" ), makeProperty( "SlpLinesNearEndToEnd" ), makeProperty( "SlpLineSpacing" ), makeProperty( "SlpLineWidth" ), makeProperty( "SlpMaxLines" ), makeProperty( "SlpNearEnd" ), makeProperty( "SlpSidewaysMaxChars" ), makeProperty( "SlpSidewaysMaxLines" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "CartridgeNotify" ), makeProperty( "JrnCartridgeState" ), makeProperty( "JrnCurrentCartridge" ), makeProperty( "RecCartridgeState" ), makeProperty( "RecCurrentCartridge" ), makeProperty( "SlpCartridgeState" ), makeProperty( "SlpCurrentCartridge" ), makeProperty( "SlpPrintSide" ), makeProperty( "MapCharacterSet" ), makeProperty( "RecBitmapRotationList" ), makeProperty( "SlpBitmapRotationList" ), makeProperty( "PageModeArea" ), makeProperty( "PageModeDescriptor" ), makeProperty( "PageModeHorizontalPosition" ), makeProperty( "PageModePrintArea" ), makeProperty( "PageModePrintDirection" ), makeProperty( "PageModeStation" ), makeProperty( "PageModeVerticalPosition" )};
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
		return new EventSetDescriptor( POSPrinter.class, paramString, Class.forName( str ), paramString + "Occurred" );
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
