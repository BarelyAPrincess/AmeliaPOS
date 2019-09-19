/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
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
import jpos.services.ScaleService110;
import jpos.services.ScaleService111;
import jpos.services.ScaleService112;
import jpos.services.ScaleService113;
import jpos.services.ScaleService114;
import jpos.services.ScaleService12;
import jpos.services.ScaleService13;
import jpos.services.ScaleService14;
import jpos.services.ScaleService15;
import jpos.services.ScaleService16;
import jpos.services.ScaleService17;
import jpos.services.ScaleService18;
import jpos.services.ScaleService19;

public class Scale extends BaseJposControl implements ScaleControl114, JposConst
{
	protected ScaleService12 service12;
	protected ScaleService13 service13;
	protected ScaleService14 service14;
	protected ScaleService15 service15;
	protected ScaleService16 service16;
	protected ScaleService17 service17;
	protected ScaleService18 service18;
	protected ScaleService19 service19;
	protected ScaleService110 service110;
	protected ScaleService111 service111;
	protected ScaleService112 service112;
	protected ScaleService113 service113;
	protected ScaleService114 service114;
	protected Vector directIOListeners = new Vector();
	protected Vector dataListeners = new Vector();
	protected Vector errorListeners = new Vector();
	protected Vector statusUpdateListeners = new Vector();

	public Scale()
	{
		deviceControlDescription = "JavaPOS Scale Device Control";
		deviceControlVersion = 1014000;
	}

	public boolean getCapDisplay() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCapDisplay();
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

	public boolean getCapDisplayText() throws JposException
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
			return service13.getCapDisplayText();
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

	public boolean getCapPriceCalculating() throws JposException
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
			return service13.getCapPriceCalculating();
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

	public boolean getCapTareWeight() throws JposException
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
			return service13.getCapTareWeight();
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

	public boolean getCapZeroScale() throws JposException
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
			return service13.getCapZeroScale();
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

	public boolean getCapStatusUpdate() throws JposException
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
			return service19.getCapStatusUpdate();
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

	public boolean getCapFreezeValue() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			return service114.getCapFreezeValue();
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

	public boolean getCapReadLiveWeightWithTare() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			return service114.getCapReadLiveWeightWithTare();
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

	public boolean getCapSetPriceCalculationMode() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			return service114.getCapSetPriceCalculationMode();
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

	public boolean getCapSetUnitPriceWithWeightUnit() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			return service114.getCapSetUnitPriceWithWeightUnit();
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

	public boolean getCapSpecialTare() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			return service114.getCapSpecialTare();
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

	public boolean getCapTarePriority() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			return service114.getCapTarePriority();
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

	public int getMaximumWeight() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getMaximumWeight();
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

	public int getWeightUnit() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getWeightUnit();
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

	public boolean getAsyncMode() throws JposException
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
			return service13.getAsyncMode();
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

	public void setAsyncMode( boolean paramBoolean ) throws JposException
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
			service13.setAsyncMode( paramBoolean );
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
		if ( serviceVersion < 1003000 )
		{
			throw new JposException( 104, "Device Service is not 1.3.0 compliant." );
		}
		try
		{
			return service13.getAutoDisable();
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
		if ( serviceVersion < 1003000 )
		{
			throw new JposException( 104, "Device Service is not 1.3.0 compliant." );
		}
		try
		{
			service13.setAutoDisable( paramBoolean );
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
		if ( serviceVersion < 1003000 )
		{
			throw new JposException( 104, "Device Service is not 1.3.0 compliant." );
		}
		try
		{
			return service13.getDataCount();
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
		if ( serviceVersion < 1003000 )
		{
			throw new JposException( 104, "Device Service is not 1.3.0 compliant." );
		}
		try
		{
			return service13.getDataEventEnabled();
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
		if ( serviceVersion < 1003000 )
		{
			throw new JposException( 104, "Device Service is not 1.3.0 compliant." );
		}
		try
		{
			service13.setDataEventEnabled( paramBoolean );
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

	public int getMaxDisplayTextChars() throws JposException
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
			return service13.getMaxDisplayTextChars();
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

	public long getSalesPrice() throws JposException
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
			return service13.getSalesPrice();
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

	public int getTareWeight() throws JposException
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
			return service13.getTareWeight();
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

	public void setTareWeight( int paramInt ) throws JposException
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
			service13.setTareWeight( paramInt );
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

	public long getUnitPrice() throws JposException
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
			return service13.getUnitPrice();
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

	public void setUnitPrice( long paramLong ) throws JposException
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
			service13.setUnitPrice( paramLong );
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

	public int getScaleLiveWeight() throws JposException
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
			return service19.getScaleLiveWeight();
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

	public int getStatusNotify() throws JposException
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
			return service19.getStatusNotify();
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

	public void setStatusNotify( int paramInt ) throws JposException
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
			service19.setStatusNotify( paramInt );
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

	public boolean getZeroValid() throws JposException
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
			return service113.getZeroValid();
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

	public void setZeroValid( boolean paramBoolean ) throws JposException
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
			service113.setZeroValid( paramBoolean );
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

	public int getMinimumWeight() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			return service114.getMinimumWeight();
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

	public void readWeight( int[] paramArrayOfInt, int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.readWeight( paramArrayOfInt, paramInt );
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
		if ( serviceVersion < 1003000 )
		{
			throw new JposException( 104, "Device Service is not 1.3.0 compliant." );
		}
		try
		{
			service13.clearInput();
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

	public void displayText( String paramString ) throws JposException
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
			service13.displayText( paramString );
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

	public void zeroScale() throws JposException
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
			service13.zeroScale();
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

	public void doPriceCalculating( int[] paramArrayOfInt1, int[] paramArrayOfInt2, long[] paramArrayOfLong1, long[] paramArrayOfLong2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, int[] paramArrayOfInt5, long[] paramArrayOfLong3, int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			service114.doPriceCalculating( paramArrayOfInt1, paramArrayOfInt2, paramArrayOfLong1, paramArrayOfLong2, paramArrayOfInt3, paramArrayOfInt4, paramArrayOfInt5, paramArrayOfLong3, paramInt );
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

	public void freezeValue( int paramInt, boolean paramBoolean ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			service114.freezeValue( paramInt, paramBoolean );
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

	public void readLiveWeightWithTare( int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			service114.readLiveWeightWithTare( paramArrayOfInt1, paramArrayOfInt2, paramInt );
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

	public void setPriceCalculationMode( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			service114.setPriceCalculationMode( paramInt );
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

	public void setSpecialTare( int paramInt1, int paramInt2 ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			service114.setSpecialTare( paramInt1, paramInt2 );
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

	public void setTarePrioity( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			service114.setTarePrioity( paramInt );
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

	public void setTarePriority( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			service114.setTarePriority( paramInt );
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

	public void setUnitPriceWithWeightUnit( long paramLong, int paramInt1, int paramInt2, int paramInt3 ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		if ( serviceVersion < 1014000 )
		{
			throw new JposException( 104, "Device Service is not 1.14.0 compliant." );
		}
		try
		{
			service114.setUnitPriceWithWeightUnit( paramLong, paramInt1, paramInt2, paramInt3 );
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
		return new ScaleCallbacks();
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
					service12 = ( ( ScaleService12 ) paramBaseService );
				}
				catch ( Exception localException1 )
				{
					throw new JposException( 104, "Service does not fully implement ScaleService12 interface", localException1 );
				}
			}
			if ( serviceVersion >= 1003000 )
			{
				try
				{
					service13 = ( ( ScaleService13 ) paramBaseService );
				}
				catch ( Exception localException2 )
				{
					throw new JposException( 104, "Service does not fully implement ScaleService13 interface", localException2 );
				}
			}
			if ( serviceVersion >= 1004000 )
			{
				try
				{
					service14 = ( ( ScaleService14 ) paramBaseService );
				}
				catch ( Exception localException3 )
				{
					throw new JposException( 104, "Service does not fully implement ScaleService14 interface", localException3 );
				}
			}
			if ( serviceVersion >= 1005000 )
			{
				try
				{
					service15 = ( ( ScaleService15 ) paramBaseService );
				}
				catch ( Exception localException4 )
				{
					throw new JposException( 104, "Service does not fully implement ScaleService15 interface", localException4 );
				}
			}
			if ( serviceVersion >= 1006000 )
			{
				try
				{
					service16 = ( ( ScaleService16 ) paramBaseService );
				}
				catch ( Exception localException5 )
				{
					throw new JposException( 104, "Service does not fully implement ScaleService16 interface", localException5 );
				}
			}
			if ( serviceVersion >= 1007000 )
			{
				try
				{
					service17 = ( ( ScaleService17 ) paramBaseService );
				}
				catch ( Exception localException6 )
				{
					throw new JposException( 104, "Service does not fully implement ScaleService17 interface", localException6 );
				}
			}
			if ( serviceVersion >= 1008000 )
			{
				try
				{
					service18 = ( ( ScaleService18 ) paramBaseService );
				}
				catch ( Exception localException7 )
				{
					throw new JposException( 104, "Service does not fully implement ScaleService18 interface", localException7 );
				}
			}
			if ( serviceVersion >= 1009000 )
			{
				try
				{
					service19 = ( ( ScaleService19 ) paramBaseService );
				}
				catch ( Exception localException8 )
				{
					throw new JposException( 104, "Service does not fully implement ScaleService19 interface", localException8 );
				}
			}
			if ( serviceVersion >= 1010000 )
			{
				try
				{
					service110 = ( ( ScaleService110 ) paramBaseService );
				}
				catch ( Exception localException9 )
				{
					throw new JposException( 104, "Service does not fully implement ScaleService110 interface", localException9 );
				}
			}
			if ( serviceVersion >= 1011000 )
			{
				try
				{
					service111 = ( ( ScaleService111 ) paramBaseService );
				}
				catch ( Exception localException10 )
				{
					throw new JposException( 104, "Service does not fully implement ScaleService111 interface", localException10 );
				}
			}
			if ( serviceVersion >= 1012000 )
			{
				try
				{
					service112 = ( ( ScaleService112 ) paramBaseService );
				}
				catch ( Exception localException11 )
				{
					throw new JposException( 104, "Service does not fully implement ScaleService112 interface", localException11 );
				}
			}
			if ( serviceVersion >= 1013000 )
			{
				try
				{
					service113 = ( ( ScaleService113 ) paramBaseService );
				}
				catch ( Exception localException12 )
				{
					throw new JposException( 104, "Service does not fully implement ScaleService113 interface", localException12 );
				}
			}
			if ( serviceVersion >= 1014000 )
			{
				try
				{
					service114 = ( ( ScaleService114 ) paramBaseService );
				}
				catch ( Exception localException13 )
				{
					throw new JposException( 104, "Service does not fully implement ScaleService114 interface", localException13 );
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

	protected class ScaleCallbacks implements EventCallbacks
	{
		protected ScaleCallbacks()
		{
		}

		public BaseControl getEventSource()
		{
			return Scale.this;
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
