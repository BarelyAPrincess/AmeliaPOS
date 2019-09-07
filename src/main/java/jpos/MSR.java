package jpos;

import java.util.Vector;

import jpos.events.DataEvent;
import jpos.events.DataListener;
import jpos.events.DirectIOEvent;
import jpos.events.DirectIOListener;
import jpos.events.ErrorEvent;
import jpos.events.ErrorListener;
import jpos.events.OutputCompleteEvent;
import jpos.events.StatusUpdateEvent;
import jpos.events.StatusUpdateListener;
import jpos.services.BaseService;
import jpos.services.EventCallbacks;
import jpos.services.MSRService110;
import jpos.services.MSRService111;
import jpos.services.MSRService112;
import jpos.services.MSRService113;
import jpos.services.MSRService114;
import jpos.services.MSRService12;
import jpos.services.MSRService13;
import jpos.services.MSRService14;
import jpos.services.MSRService15;
import jpos.services.MSRService16;
import jpos.services.MSRService17;
import jpos.services.MSRService18;
import jpos.services.MSRService19;

public class MSR extends BaseJposControl implements MSRControl114, JposConst
{
	protected MSRService12 service12;
	protected MSRService13 service13;
	protected MSRService14 service14;
	protected MSRService15 service15;
	protected MSRService16 service16;
	protected MSRService17 service17;
	protected MSRService18 service18;
	protected MSRService19 service19;
	protected MSRService110 service110;
	protected MSRService111 service111;
	protected MSRService112 service112;
	protected MSRService113 service113;
	protected MSRService114 service114;
	protected Vector dataListeners = new Vector();
	protected Vector directIOListeners = new Vector();
	protected Vector errorListeners = new Vector();
	protected Vector statusUpdateListeners = new Vector();

	public MSR()
	{
		deviceControlDescription = "JavaPOS MSR Device Control";
		deviceControlVersion = 1014000;
	}

	public boolean getCapISO() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCapISO();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getCapJISOne() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCapJISOne();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getCapJISTwo() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCapJISTwo();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getCapPowerReporting() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1003000 )
		{
			throw new JposException( 104, "Device Service is not 1.3.0 compliant." );
		}
		try
		{
			return service13.getCapPowerReporting();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getCapTransmitSentinels() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1005000 )
		{
			throw new JposException( 104, "Device Service is not 1.5.0 compliant." );
		}
		try
		{
			return service15.getCapTransmitSentinels();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getCapStatisticsReporting() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1008000 )
		{
			throw new JposException( 104, "Device Service is not 1.8.0 compliant." );
		}
		try
		{
			return service18.getCapStatisticsReporting();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getCapUpdateStatistics() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1008000 )
		{
			throw new JposException( 104, "Device Service is not 1.8.0 compliant." );
		}
		try
		{
			return service18.getCapUpdateStatistics();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getCapCompareFirmwareVersion() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1009000 )
		{
			throw new JposException( 104, "Device Service is not 1.9.0 compliant." );
		}
		try
		{
			return service19.getCapCompareFirmwareVersion();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getCapUpdateFirmware() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1009000 )
		{
			throw new JposException( 104, "Device Service is not 1.9.0 compliant." );
		}
		try
		{
			return service19.getCapUpdateFirmware();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getCapWritableTracks() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1010000 )
		{
			throw new JposException( 104, "Device Service is not 1.10.0 compliant." );
		}
		try
		{
			return service110.getCapWritableTracks();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public String getCapCardAuthentication() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getCapCardAuthentication();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getCapDataEncryption() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getCapDataEncryption();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getCapDeviceAuthentication() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getCapDeviceAuthentication();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getCapTrackDataMasking() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getCapTrackDataMasking();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public String getAccountNumber() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getAccountNumber();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getAutoDisable() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getAutoDisable();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void setAutoDisable( boolean paramBoolean ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.setAutoDisable( paramBoolean );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getDataCount() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getDataCount();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getDataEventEnabled() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getDataEventEnabled();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void setDataEventEnabled( boolean paramBoolean ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.setDataEventEnabled( paramBoolean );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getDecodeData() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getDecodeData();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void setDecodeData( boolean paramBoolean ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.setDecodeData( paramBoolean );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getErrorReportingType() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getErrorReportingType();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void setErrorReportingType( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.setErrorReportingType( paramInt );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public String getExpirationDate() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getExpirationDate();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public String getFirstName() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getFirstName();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public String getMiddleInitial() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getMiddleInitial();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getParseDecodeData() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getParseDecodeData();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void setParseDecodeData( boolean paramBoolean ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.setParseDecodeData( paramBoolean );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public String getServiceCode() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getServiceCode();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public String getSuffix() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getSuffix();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public String getSurname() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getSurname();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public String getTitle() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getTitle();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public byte[] getTrack1Data() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getTrack1Data();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public byte[] getTrack1DiscretionaryData() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getTrack1DiscretionaryData();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public byte[] getTrack2Data() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getTrack2Data();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public byte[] getTrack2DiscretionaryData() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getTrack2DiscretionaryData();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public byte[] getTrack3Data() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getTrack3Data();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getTracksToRead() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getTracksToRead();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void setTracksToRead( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.setTracksToRead( paramInt );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getPowerNotify() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1003000 )
		{
			throw new JposException( 104, "Device Service is not 1.3.0 compliant." );
		}
		try
		{
			return service13.getPowerNotify();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void setPowerNotify( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1003000 )
		{
			throw new JposException( 104, "Device Service is not 1.3.0 compliant." );
		}
		try
		{
			service13.setPowerNotify( paramInt );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getPowerState() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1003000 )
		{
			throw new JposException( 104, "Device Service is not 1.3.0 compliant." );
		}
		try
		{
			return service13.getPowerState();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public byte[] getTrack4Data() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1005000 )
		{
			throw new JposException( 104, "Device Service is not 1.5.0 compliant." );
		}
		try
		{
			return service15.getTrack4Data();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getTransmitSentinels() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1005000 )
		{
			throw new JposException( 104, "Device Service is not 1.5.0 compliant." );
		}
		try
		{
			return service15.getTransmitSentinels();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void setTransmitSentinels( boolean paramBoolean ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1005000 )
		{
			throw new JposException( 104, "Device Service is not 1.5.0 compliant." );
		}
		try
		{
			service15.setTransmitSentinels( paramBoolean );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getEncodingMaxLength() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1010000 )
		{
			throw new JposException( 104, "Device Service is not 1.10.0 compliant." );
		}
		try
		{
			return service110.getEncodingMaxLength();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getTracksToWrite() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1010000 )
		{
			throw new JposException( 104, "Device Service is not 1.10.0 compliant." );
		}
		try
		{
			return service110.getTracksToWrite();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void setTracksToWrite( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1010000 )
		{
			throw new JposException( 104, "Device Service is not 1.10.0 compliant." );
		}
		try
		{
			service110.setTracksToWrite( paramInt );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public byte[] getAdditionalSecurityInformation() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getAdditionalSecurityInformation();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public byte[] getCardAuthenticationData() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getCardAuthenticationData();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getCardAuthenticationDataLength() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getCardAuthenticationDataLength();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public String getCardPropertyList() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getCardPropertyList();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public String getCardType() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getCardType();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public String getCardTypeList() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getCardTypeList();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getDataEncryptionAlgorithm() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getDataEncryptionAlgorithm();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void setDataEncryptionAlgorithm( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			service112.setDataEncryptionAlgorithm( paramInt );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public boolean getDeviceAuthenticated() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getDeviceAuthenticated();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getDeviceAuthenticationProtocol() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getDeviceAuthenticationProtocol();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public byte[] getTrack1EncryptedData() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getTrack1EncryptedData();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getTrack1EncryptedDataLength() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getTrack1EncryptedDataLength();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public byte[] getTrack2EncryptedData() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getTrack2EncryptedData();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getTrack2EncryptedDataLength() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getTrack2EncryptedDataLength();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public byte[] getTrack3EncryptedData() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getTrack3EncryptedData();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getTrack3EncryptedDataLength() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getTrack3EncryptedDataLength();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public byte[] getTrack4EncryptedData() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getTrack4EncryptedData();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public int getTrack4EncryptedDataLength() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getTrack4EncryptedDataLength();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public String getWriteCardType() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			return service112.getWriteCardType();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void setWriteCardType( String paramString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			service112.setWriteCardType( paramString );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void clearInput() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.clearInput();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void resetStatistics( String paramString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1008000 )
		{
			throw new JposException( 104, "Device Service is not 1.8.0 compliant." );
		}
		try
		{
			service18.resetStatistics( paramString );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void retrieveStatistics( String[] paramArrayOfString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1008000 )
		{
			throw new JposException( 104, "Device Service is not 1.8.0 compliant." );
		}
		try
		{
			service18.retrieveStatistics( paramArrayOfString );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void updateStatistics( String paramString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1008000 )
		{
			throw new JposException( 104, "Device Service is not 1.8.0 compliant." );
		}
		try
		{
			service18.updateStatistics( paramString );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1009000 )
		{
			throw new JposException( 104, "Device Service is not 1.9.0 compliant." );
		}
		try
		{
			service19.compareFirmwareVersion( paramString, paramArrayOfInt );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void updateFirmware( String paramString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1009000 )
		{
			throw new JposException( 104, "Device Service is not 1.9.0 compliant." );
		}
		try
		{
			service19.updateFirmware( paramString );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void clearInputProperties() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1010000 )
		{
			throw new JposException( 104, "Device Service is not 1.10.0 compliant." );
		}
		try
		{
			service110.clearInputProperties();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void writeTracks( byte[][] paramArrayOfByte, int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1010000 )
		{
			throw new JposException( 104, "Device Service is not 1.10.0 compliant." );
		}
		try
		{
			service110.writeTracks( paramArrayOfByte, paramInt );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void authenticateDevice( byte[] paramArrayOfByte ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			service112.authenticateDevice( paramArrayOfByte );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void deauthenticateDevice( byte[] paramArrayOfByte ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			service112.deauthenticateDevice( paramArrayOfByte );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void retrieveCardProperty( String paramString, String[] paramArrayOfString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			service112.retrieveCardProperty( paramString, paramArrayOfString );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void retrieveDeviceAuthenticationData( byte[] paramArrayOfByte ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			service112.retrieveDeviceAuthenticationData( paramArrayOfByte );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void updateKey( String paramString1, String paramString2 ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1012000 )
		{
			throw new JposException( 104, "Device Service is not 1.12.0 compliant." );
		}
		try
		{
			service112.updateKey( paramString1, paramString2 );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	public void retrieveDeviceAuthenticationData( byte[][] paramArrayOfByte ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1013000 )
		{
			throw new JposException( 104, "Device Service is not 1.13.0 compliant." );
		}
		try
		{
			service113.retrieveDeviceAuthenticationData( paramArrayOfByte );
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException );
		}
	}

	protected EventCallbacks createEventCallbacks()
	{
		return new MSRCallbacks();
	}

	protected void setDeviceService( BaseService paramBaseService, int paramInt ) throws JposException
	{
		if ( paramBaseService == null )
		{
			service12 = null;
			service13 = null;
			service14 = null;
			service15 = null;
			service16 = null;
			service17 = null;
			service18 = null;
			service19 = null;
			service110 = null;
			service111 = null;
			service112 = null;
			service113 = null;
			service114 = null;
		}
		else
		{
			if ( serviceVersion >= 1002000 )
			{
				try
				{
					service12 = ( ( MSRService12 ) paramBaseService );
				}
				catch ( Exception localException1 )
				{
					throw new JposException( 104, "Service does not fully implement MSRService12 interface", localException1 );
				}
			}
			if ( serviceVersion >= 1003000 )
			{
				try
				{
					service13 = ( ( MSRService13 ) paramBaseService );
				}
				catch ( Exception localException2 )
				{
					throw new JposException( 104, "Service does not fully implement MSRService13 interface", localException2 );
				}
			}
			if ( serviceVersion >= 1004000 )
			{
				try
				{
					service14 = ( ( MSRService14 ) paramBaseService );
				}
				catch ( Exception localException3 )
				{
					throw new JposException( 104, "Service does not fully implement MSRService14 interface", localException3 );
				}
			}
			if ( serviceVersion >= 1005000 )
			{
				try
				{
					service15 = ( ( MSRService15 ) paramBaseService );
				}
				catch ( Exception localException4 )
				{
					throw new JposException( 104, "Service does not fully implement MSRService15 interface", localException4 );
				}
			}
			if ( serviceVersion >= 1006000 )
			{
				try
				{
					service16 = ( ( MSRService16 ) paramBaseService );
				}
				catch ( Exception localException5 )
				{
					throw new JposException( 104, "Service does not fully implement MSRService16 interface", localException5 );
				}
			}
			if ( serviceVersion >= 1007000 )
			{
				try
				{
					service17 = ( ( MSRService17 ) paramBaseService );
				}
				catch ( Exception localException6 )
				{
					throw new JposException( 104, "Service does not fully implement MSRService17 interface", localException6 );
				}
			}
			if ( serviceVersion >= 1008000 )
			{
				try
				{
					service18 = ( ( MSRService18 ) paramBaseService );
				}
				catch ( Exception localException7 )
				{
					throw new JposException( 104, "Service does not fully implement MSRService18 interface", localException7 );
				}
			}
			if ( serviceVersion >= 1009000 )
			{
				try
				{
					service19 = ( ( MSRService19 ) paramBaseService );
				}
				catch ( Exception localException8 )
				{
					throw new JposException( 104, "Service does not fully implement MSRService19 interface", localException8 );
				}
			}
			if ( serviceVersion >= 1010000 )
			{
				try
				{
					service110 = ( ( MSRService110 ) paramBaseService );
				}
				catch ( Exception localException9 )
				{
					throw new JposException( 104, "Service does not fully implement MSRService110 interface", localException9 );
				}
			}
			if ( serviceVersion >= 1011000 )
			{
				try
				{
					service111 = ( ( MSRService111 ) paramBaseService );
				}
				catch ( Exception localException10 )
				{
					throw new JposException( 104, "Service does not fully implement MSRService111 interface", localException10 );
				}
			}
			if ( serviceVersion >= 1012000 )
			{
				try
				{
					service112 = ( ( MSRService112 ) paramBaseService );
				}
				catch ( Exception localException11 )
				{
					throw new JposException( 104, "Service does not fully implement MSRService112 interface", localException11 );
				}
			}
			if ( serviceVersion >= 1013000 )
			{
				try
				{
					service113 = ( ( MSRService113 ) paramBaseService );
				}
				catch ( Exception localException12 )
				{
					throw new JposException( 104, "Service does not fully implement MSRService113 interface", localException12 );
				}
			}
			if ( serviceVersion >= 1014000 )
			{
				try
				{
					service114 = ( ( MSRService114 ) paramBaseService );
				}
				catch ( Exception localException13 )
				{
					throw new JposException( 104, "Service does not fully implement MSRService114 interface", localException13 );
				}
			}
		}
	}

	public void addDataListener( DataListener paramDataListener )
	{
		synchronized ( dataListeners )
		{
			dataListeners.addElement( paramDataListener );
		}
	}

	public void removeDataListener( DataListener paramDataListener )
	{
		synchronized ( dataListeners )
		{
			dataListeners.removeElement( paramDataListener );
		}
	}

	public void addDirectIOListener( DirectIOListener paramDirectIOListener )
	{
		synchronized ( directIOListeners )
		{
			directIOListeners.addElement( paramDirectIOListener );
		}
	}

	public void removeDirectIOListener( DirectIOListener paramDirectIOListener )
	{
		synchronized ( directIOListeners )
		{
			directIOListeners.removeElement( paramDirectIOListener );
		}
	}

	public void addErrorListener( ErrorListener paramErrorListener )
	{
		synchronized ( errorListeners )
		{
			errorListeners.addElement( paramErrorListener );
		}
	}

	public void removeErrorListener( ErrorListener paramErrorListener )
	{
		synchronized ( errorListeners )
		{
			errorListeners.removeElement( paramErrorListener );
		}
	}

	public void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener )
	{
		synchronized ( statusUpdateListeners )
		{
			statusUpdateListeners.addElement( paramStatusUpdateListener );
		}
	}

	public void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener )
	{
		synchronized ( statusUpdateListeners )
		{
			statusUpdateListeners.removeElement( paramStatusUpdateListener );
		}
	}

	protected class MSRCallbacks implements EventCallbacks
	{
		protected MSRCallbacks()
		{
		}

		public BaseControl getEventSource()
		{
			return MSR.this;
		}

		public void fireDataEvent( DataEvent paramDataEvent )
		{
			synchronized ( dataListeners )
			{
				for ( int i = 0; i < dataListeners.size(); i++ )
				{
					( ( DataListener ) dataListeners.elementAt( i ) ).dataOccurred( paramDataEvent );
				}
			}
		}

		public void fireDirectIOEvent( DirectIOEvent paramDirectIOEvent )
		{
			synchronized ( directIOListeners )
			{
				for ( int i = 0; i < directIOListeners.size(); i++ )
				{
					( ( DirectIOListener ) directIOListeners.elementAt( i ) ).directIOOccurred( paramDirectIOEvent );
				}
			}
		}

		public void fireErrorEvent( ErrorEvent paramErrorEvent )
		{
			synchronized ( errorListeners )
			{
				for ( int i = 0; i < errorListeners.size(); i++ )
				{
					( ( ErrorListener ) errorListeners.elementAt( i ) ).errorOccurred( paramErrorEvent );
				}
			}
		}

		public void fireOutputCompleteEvent( OutputCompleteEvent paramOutputCompleteEvent )
		{
		}

		public void fireStatusUpdateEvent( StatusUpdateEvent paramStatusUpdateEvent )
		{
			synchronized ( statusUpdateListeners )
			{
				for ( int i = 0; i < statusUpdateListeners.size(); i++ )
				{
					( ( StatusUpdateListener ) statusUpdateListeners.elementAt( i ) ).statusUpdateOccurred( paramStatusUpdateEvent );
				}
			}
		}
	}
}
