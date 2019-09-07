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
import jpos.services.CashDrawerService110;
import jpos.services.CashDrawerService111;
import jpos.services.CashDrawerService112;
import jpos.services.CashDrawerService113;
import jpos.services.CashDrawerService114;
import jpos.services.CashDrawerService12;
import jpos.services.CashDrawerService13;
import jpos.services.CashDrawerService14;
import jpos.services.CashDrawerService15;
import jpos.services.CashDrawerService16;
import jpos.services.CashDrawerService17;
import jpos.services.CashDrawerService18;
import jpos.services.CashDrawerService19;
import jpos.services.EventCallbacks;

public class CashDrawer extends BaseJposControl implements CashDrawerControl114, JposConst
{
	protected CashDrawerService12 service12;
	protected CashDrawerService13 service13;
	protected CashDrawerService14 service14;
	protected CashDrawerService15 service15;
	protected CashDrawerService16 service16;
	protected CashDrawerService17 service17;
	protected CashDrawerService18 service18;
	protected CashDrawerService19 service19;
	protected CashDrawerService110 service110;
	protected CashDrawerService111 service111;
	protected CashDrawerService112 service112;
	protected CashDrawerService113 service113;
	protected CashDrawerService114 service114;
	protected Vector directIOListeners = new Vector();
	protected Vector statusUpdateListeners = new Vector();

	public CashDrawer()
	{
		deviceControlDescription = "JavaPOS CashDrawer Device Control";
		deviceControlVersion = 1014000;
	}

	public boolean getCapStatus() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCapStatus();
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

	public boolean getCapStatusMultiDrawerDetect() throws JposException
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
			return service15.getCapStatusMultiDrawerDetect();
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

	public boolean getDrawerOpened() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getDrawerOpened();
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

	public void openDrawer() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.openDrawer();
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

	public void waitForDrawerClose( int paramInt1, int paramInt2, int paramInt3, int paramInt4 ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.waitForDrawerClose( paramInt1, paramInt2, paramInt3, paramInt4 );
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

	protected EventCallbacks createEventCallbacks()
	{
		return new CashDrawerCallbacks();
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
					service12 = ( ( CashDrawerService12 ) paramBaseService );
				}
				catch ( Exception localException1 )
				{
					throw new JposException( 104, "Service does not fully implement CashDrawerService12 interface", localException1 );
				}
			}
			if ( serviceVersion >= 1003000 )
			{
				try
				{
					service13 = ( ( CashDrawerService13 ) paramBaseService );
				}
				catch ( Exception localException2 )
				{
					throw new JposException( 104, "Service does not fully implement CashDrawerService13 interface", localException2 );
				}
			}
			if ( serviceVersion >= 1004000 )
			{
				try
				{
					service14 = ( ( CashDrawerService14 ) paramBaseService );
				}
				catch ( Exception localException3 )
				{
					throw new JposException( 104, "Service does not fully implement CashDrawerService14 interface", localException3 );
				}
			}
			if ( serviceVersion >= 1005000 )
			{
				try
				{
					service15 = ( ( CashDrawerService15 ) paramBaseService );
				}
				catch ( Exception localException4 )
				{
					throw new JposException( 104, "Service does not fully implement CashDrawerService15 interface", localException4 );
				}
			}
			if ( serviceVersion >= 1006000 )
			{
				try
				{
					service16 = ( ( CashDrawerService16 ) paramBaseService );
				}
				catch ( Exception localException5 )
				{
					throw new JposException( 104, "Service does not fully implement CashDrawerService16 interface", localException5 );
				}
			}
			if ( serviceVersion >= 1007000 )
			{
				try
				{
					service17 = ( ( CashDrawerService17 ) paramBaseService );
				}
				catch ( Exception localException6 )
				{
					throw new JposException( 104, "Service does not fully implement CashDrawerService17 interface", localException6 );
				}
			}
			if ( serviceVersion >= 1008000 )
			{
				try
				{
					service18 = ( ( CashDrawerService18 ) paramBaseService );
				}
				catch ( Exception localException7 )
				{
					throw new JposException( 104, "Service does not fully implement CashDrawerService18 interface", localException7 );
				}
			}
			if ( serviceVersion >= 1009000 )
			{
				try
				{
					service19 = ( ( CashDrawerService19 ) paramBaseService );
				}
				catch ( Exception localException8 )
				{
					throw new JposException( 104, "Service does not fully implement CashDrawerService19 interface", localException8 );
				}
			}
			if ( serviceVersion >= 1010000 )
			{
				try
				{
					service110 = ( ( CashDrawerService110 ) paramBaseService );
				}
				catch ( Exception localException9 )
				{
					throw new JposException( 104, "Service does not fully implement CashDrawerService110 interface", localException9 );
				}
			}
			if ( serviceVersion >= 1011000 )
			{
				try
				{
					service111 = ( ( CashDrawerService111 ) paramBaseService );
				}
				catch ( Exception localException10 )
				{
					throw new JposException( 104, "Service does not fully implement CashDrawerService111 interface", localException10 );
				}
			}
			if ( serviceVersion >= 1012000 )
			{
				try
				{
					service112 = ( ( CashDrawerService112 ) paramBaseService );
				}
				catch ( Exception localException11 )
				{
					throw new JposException( 104, "Service does not fully implement CashDrawerService112 interface", localException11 );
				}
			}
			if ( serviceVersion >= 1013000 )
			{
				try
				{
					service113 = ( ( CashDrawerService113 ) paramBaseService );
				}
				catch ( Exception localException12 )
				{
					throw new JposException( 104, "Service does not fully implement CashDrawerService113 interface", localException12 );
				}
			}
			if ( serviceVersion >= 1014000 )
			{
				try
				{
					service114 = ( ( CashDrawerService114 ) paramBaseService );
				}
				catch ( Exception localException13 )
				{
					throw new JposException( 104, "Service does not fully implement CashDrawerService114 interface", localException13 );
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

	protected class CashDrawerCallbacks implements EventCallbacks
	{
		protected CashDrawerCallbacks()
		{
		}

		public BaseControl getEventSource()
		{
			return CashDrawer.this;
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
