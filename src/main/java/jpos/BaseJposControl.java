package jpos;

import jpos.loader.JposServiceConnection;
import jpos.loader.JposServiceLoader;
import jpos.services.BaseService;
import jpos.services.EventCallbacks;

public abstract class BaseJposControl implements BaseControl
{
	protected static final int deviceVersion12 = 1002000;
	protected static final int deviceVersion13 = 1003000;
	protected static final int deviceVersion14 = 1004000;
	protected static final int deviceVersion15 = 1005000;
	protected static final int deviceVersion16 = 1006000;
	protected static final int deviceVersion17 = 1007000;
	protected static final int deviceVersion18 = 1008000;
	protected static final int deviceVersion19 = 1009000;
	protected static final int deviceVersion110 = 1010000;
	protected static final int deviceVersion111 = 1011000;
	protected static final int deviceVersion112 = 1012000;
	protected static final int deviceVersion113 = 1013000;
	protected static final int deviceVersion114 = 1014000;
	protected String deviceControlDescription;
	protected int deviceControlVersion;
	protected JposServiceConnection serviceConnection;
	protected int serviceVersion;
	protected boolean bOpen;
	protected BaseService service;

	public String getCheckHealthText() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service.getCheckHealthText();
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

	public boolean getClaimed() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service.getClaimed();
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

	public String getDeviceControlDescription()
	{
		return deviceControlDescription;
	}

	public int getDeviceControlVersion()
	{
		return deviceControlVersion;
	}

	public boolean getDeviceEnabled() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service.getDeviceEnabled();
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

	public void setDeviceEnabled( boolean paramBoolean ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service.setDeviceEnabled( paramBoolean );
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

	public String getDeviceServiceDescription() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service.getDeviceServiceDescription();
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

	public int getDeviceServiceVersion() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service.getDeviceServiceVersion();
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

	public boolean getFreezeEvents() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service.getFreezeEvents();
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

	public void setFreezeEvents( boolean paramBoolean ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service.setFreezeEvents( paramBoolean );
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

	public String getPhysicalDeviceDescription() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service.getPhysicalDeviceDescription();
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

	public String getPhysicalDeviceName() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service.getPhysicalDeviceName();
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

	public int getState()
	{
		int i = 1;
		if ( bOpen )
		{
			try
			{
				i = service.getState();
			}
			catch ( Exception localException )
			{
			}
		}
		return i;
	}

	public void claim( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service.claim( paramInt );
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

	public synchronized void close() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service.close();
		}
		catch ( JposException localJposException )
		{
			throw localJposException;
		}
		catch ( Exception localException2 )
		{
			throw new JposException( 111, "Unhandled exception from Device Service", localException2 );
		}
		try
		{
			serviceConnection.disconnect();
		}
		catch ( Exception localException1 )
		{
			throw new JposException( 104, "Unable to free service connection", localException1 );
		}
		finally
		{
			setDeviceService( null, 0 );
			serviceConnection = null;
			service = null;
			serviceVersion = 0;
			bOpen = false;
		}
	}

	public void checkHealth( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service.checkHealth( paramInt );
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

	public void directIO( int paramInt, int[] paramArrayOfInt, Object paramObject ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service.directIO( paramInt, paramArrayOfInt, paramObject );
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

	public synchronized void open( String paramString ) throws JposException
	{
		if ( bOpen )
		{
			throw new JposException( 106, "Device Control already open" );
		}
		try
		{
			serviceConnection = JposServiceLoader.findService( paramString );
		}
		catch ( JposException localJposException1 )
		{
			throw localJposException1;
		}
		catch ( Exception localException2 )
		{
			throw new JposException( 109, "Device profile not found", localException2 );
		}
		try
		{
			serviceConnection.connect();
		}
		catch ( JposException localJposException2 )
		{
			throw localJposException2;
		}
		catch ( Exception localException3 )
		{
			throw new JposException( 104, "Could not connect to service", localException3 );
		}
		try
		{
			service = ( ( BaseService ) serviceConnection.getService() );
		}
		catch ( Exception localException1 )
		{
			throw new JposException( 104, "Could not get service instance", localException1 );
		}
		JposException jposException = null;
		int i = 0;
		try
		{
			EventCallbacks localEventCallbacks = createEventCallbacks();
			service.open( paramString, localEventCallbacks );
			i = 1;
			serviceVersion = service.getDeviceServiceVersion();
			setDeviceService( service, serviceVersion );
			bOpen = true;
		}
		catch ( JposException localJposException3 )
		{
			jposException = localJposException3;
		}
		catch ( Exception localException6 )
		{
			jposException = new JposException( 111, "Unhandled exception from Device Service", localException6 );
		}
		if ( !bOpen )
		{
			try
			{
				service.close();
			}
			catch ( Exception localException4 )
			{
			}
			try
			{
				serviceConnection.disconnect();
			}
			catch ( Exception localException5 )
			{
			}
			serviceConnection = null;
			serviceVersion = 0;
			throw jposException;
		}
	}

	public void release() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service.release();
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

	protected abstract EventCallbacks createEventCallbacks();

	protected abstract void setDeviceService( BaseService paramBaseService, int paramInt ) throws JposException;
}
