package jpos;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class LineDisplayBeanInfo extends SimpleBeanInfo
{
	public BeanDescriptor getBeanDescriptor()
	{
		return new BeanDescriptor( LineDisplay.class );
	}

	public PropertyDescriptor makeProperty( String paramString ) throws IntrospectionException
	{
		return new PropertyDescriptor( paramString, LineDisplay.class );
	}

	public PropertyDescriptor[] getPropertyDescriptors()
	{
		try
		{
			PropertyDescriptor[] arrayOfPropertyDescriptor = {makeProperty( "CapBlink" ), makeProperty( "CapBrightness" ), makeProperty( "CapCharacterSet" ), makeProperty( "CapDescriptors" ), makeProperty( "CapHMarquee" ), makeProperty( "CapICharWait" ), makeProperty( "CapVMarquee" ), makeProperty( "CapPowerReporting" ), makeProperty( "CapBlinkRate" ), makeProperty( "CapCursorType" ), makeProperty( "CapCustomGlyph" ), makeProperty( "CapReadBack" ), makeProperty( "CapReverse" ), makeProperty( "CapBitmap" ), makeProperty( "CapMapCharacterSet" ), makeProperty( "CapScreenMode" ), makeProperty( "CapStatisticsReporting" ), makeProperty( "CapUpdateStatistics" ), makeProperty( "CapCompareFirmwareVersion" ), makeProperty( "CapUpdateFirmware" ), makeProperty( "CharacterSet" ), makeProperty( "CharacterSetList" ), makeProperty( "Columns" ), makeProperty( "CurrentWindow" ), makeProperty( "CursorColumn" ), makeProperty( "CursorRow" ), makeProperty( "CursorUpdate" ), makeProperty( "DeviceBrightness" ), makeProperty( "DeviceColumns" ), makeProperty( "DeviceDescriptors" ), makeProperty( "DeviceRows" ), makeProperty( "DeviceWindows" ), makeProperty( "InterCharacterWait" ), makeProperty( "MarqueeFormat" ), makeProperty( "MarqueeRepeatWait" ), makeProperty( "MarqueeType" ), makeProperty( "MarqueeUnitWait" ), makeProperty( "Rows" ), makeProperty( "PowerNotify" ), makeProperty( "PowerState" ), makeProperty( "BlinkRate" ), makeProperty( "CursorType" ), makeProperty( "CustomGlyphList" ), makeProperty( "GlyphHeight" ), makeProperty( "GlyphWidth" ), makeProperty( "MapCharacterSet" ), makeProperty( "MaximumX" ), makeProperty( "MaximumY" ), makeProperty( "ScreenMode" ), makeProperty( "ScreenModeList" )};
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
		return new EventSetDescriptor( LineDisplay.class, paramString, Class.forName( str ), paramString + "Occurred" );
	}

	public EventSetDescriptor[] getEventSetDescriptors()
	{
		try
		{
			EventSetDescriptor[] arrayOfEventSetDescriptor = {makeEvent( "DirectIO" ), makeEvent( "StatusUpdate" )};
			return arrayOfEventSetDescriptor;
		}
		catch ( Exception localException )
		{
		}
		return super.getEventSetDescriptors();
	}
}
