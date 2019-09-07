package jpos;

import java.util.Vector;

import jpos.events.DataEvent;
import jpos.events.DirectIOEvent;
import jpos.events.DirectIOListener;
import jpos.events.ErrorEvent;
import jpos.events.OutputCompleteEvent;
import jpos.events.StatusUpdateEvent;
import jpos.events.StatusUpdateListener;
import jpos.services.BaseService;
import jpos.services.CoinDispenserService110;
import jpos.services.CoinDispenserService111;
import jpos.services.CoinDispenserService112;
import jpos.services.CoinDispenserService113;
import jpos.services.CoinDispenserService114;
import jpos.services.CoinDispenserService12;
import jpos.services.CoinDispenserService13;
import jpos.services.CoinDispenserService14;
import jpos.services.CoinDispenserService15;
import jpos.services.CoinDispenserService16;
import jpos.services.CoinDispenserService17;
import jpos.services.CoinDispenserService18;
import jpos.services.CoinDispenserService19;
import jpos.services.EventCallbacks;

public class CoinDispenser extends BaseJposControl implements CoinDispenserControl114, JposConst
{
	protected CoinDispenserService12 service12;
	protected CoinDispenserService13 service13;
	protected CoinDispenserService14 service14;
	protected CoinDispenserService15 service15;
	protected CoinDispenserService16 service16;
	protected CoinDispenserService17 service17;
	protected CoinDispenserService18 service18;
	protected CoinDispenserService19 service19;
	protected CoinDispenserService110 service110;
	protected CoinDispenserService111 service111;
	protected CoinDispenserService112 service112;
	protected CoinDispenserService113 service113;
	protected CoinDispenserService114 service114;
	protected Vector directIOListeners = new Vector();
	protected Vector statusUpdateListeners = new Vector();

	public CoinDispenser()
	{
		deviceControlDescription = "JavaPOS CoinDispenser Device Control";
		deviceControlVersion = 1014000;
	}

	public boolean getCapEmptySensor() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCapEmptySensor();
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

	public boolean getCapJamSensor() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCapJamSensor();
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

	public boolean getCapNearEmptySensor() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCapNearEmptySensor();
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

	public int getDispenserStatus() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getDispenserStatus();
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

	public void dispenseChange( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.dispenseChange( paramInt );
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

	public void adjustCashCounts( String paramString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1011000 )
		{
			throw new JposException( 104, "Device Service is not 1.11.0 compliant." );
		}
		try
		{
			service111.adjustCashCounts( paramString );
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

	public void readCashCounts( String[] paramArrayOfString, boolean[] paramArrayOfBoolean ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1011000 )
		{
			throw new JposException( 104, "Device Service is not 1.11.0 compliant." );
		}
		try
		{
			service111.readCashCounts( paramArrayOfString, paramArrayOfBoolean );
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
		return new CoinDispenserCallbacks();
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
					service12 = ( ( CoinDispenserService12 ) paramBaseService );
				}
				catch ( Exception localException1 )
				{
					throw new JposException( 104, "Service does not fully implement CoinDispenserService12 interface", localException1 );
				}
			}
			if ( serviceVersion >= 1003000 )
			{
				try
				{
					service13 = ( ( CoinDispenserService13 ) paramBaseService );
				}
				catch ( Exception localException2 )
				{
					throw new JposException( 104, "Service does not fully implement CoinDispenserService13 interface", localException2 );
				}
			}
			if ( serviceVersion >= 1004000 )
			{
				try
				{
					service14 = ( ( CoinDispenserService14 ) paramBaseService );
				}
				catch ( Exception localException3 )
				{
					throw new JposException( 104, "Service does not fully implement CoinDispenserService14 interface", localException3 );
				}
			}
			if ( serviceVersion >= 1005000 )
			{
				try
				{
					service15 = ( ( CoinDispenserService15 ) paramBaseService );
				}
				catch ( Exception localException4 )
				{
					throw new JposException( 104, "Service does not fully implement CoinDispenserService15 interface", localException4 );
				}
			}
			if ( serviceVersion >= 1006000 )
			{
				try
				{
					service16 = ( ( CoinDispenserService16 ) paramBaseService );
				}
				catch ( Exception localException5 )
				{
					throw new JposException( 104, "Service does not fully implement CoinDispenserService16 interface", localException5 );
				}
			}
			if ( serviceVersion >= 1007000 )
			{
				try
				{
					service17 = ( ( CoinDispenserService17 ) paramBaseService );
				}
				catch ( Exception localException6 )
				{
					throw new JposException( 104, "Service does not fully implement CoinDispenserService17 interface", localException6 );
				}
			}
			if ( serviceVersion >= 1008000 )
			{
				try
				{
					service18 = ( ( CoinDispenserService18 ) paramBaseService );
				}
				catch ( Exception localException7 )
				{
					throw new JposException( 104, "Service does not fully implement CoinDispenserService18 interface", localException7 );
				}
			}
			if ( serviceVersion >= 1009000 )
			{
				try
				{
					service19 = ( ( CoinDispenserService19 ) paramBaseService );
				}
				catch ( Exception localException8 )
				{
					throw new JposException( 104, "Service does not fully implement CoinDispenserService19 interface", localException8 );
				}
			}
			if ( serviceVersion >= 1010000 )
			{
				try
				{
					service110 = ( ( CoinDispenserService110 ) paramBaseService );
				}
				catch ( Exception localException9 )
				{
					throw new JposException( 104, "Service does not fully implement CoinDispenserService110 interface", localException9 );
				}
			}
			if ( serviceVersion >= 1011000 )
			{
				try
				{
					service111 = ( ( CoinDispenserService111 ) paramBaseService );
				}
				catch ( Exception localException10 )
				{
					throw new JposException( 104, "Service does not fully implement CoinDispenserService111 interface", localException10 );
				}
			}
			if ( serviceVersion >= 1012000 )
			{
				try
				{
					service112 = ( ( CoinDispenserService112 ) paramBaseService );
				}
				catch ( Exception localException11 )
				{
					throw new JposException( 104, "Service does not fully implement CoinDispenserService112 interface", localException11 );
				}
			}
			if ( serviceVersion >= 1013000 )
			{
				try
				{
					service113 = ( ( CoinDispenserService113 ) paramBaseService );
				}
				catch ( Exception localException12 )
				{
					throw new JposException( 104, "Service does not fully implement CoinDispenserService113 interface", localException12 );
				}
			}
			if ( serviceVersion >= 1014000 )
			{
				try
				{
					service114 = ( ( CoinDispenserService114 ) paramBaseService );
				}
				catch ( Exception localException13 )
				{
					throw new JposException( 104, "Service does not fully implement CoinDispenserService114 interface", localException13 );
				}
			}
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

	protected class CoinDispenserCallbacks implements EventCallbacks
	{
		protected CoinDispenserCallbacks()
		{
		}

		public BaseControl getEventSource()
		{
			return CoinDispenser.this;
		}

		public void fireDataEvent( DataEvent paramDataEvent )
		{
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
