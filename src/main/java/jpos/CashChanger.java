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
import jpos.events.OutputCompleteEvent;
import jpos.events.StatusUpdateEvent;
import jpos.events.StatusUpdateListener;
import jpos.services.BaseService;
import jpos.services.CashChangerService110;
import jpos.services.CashChangerService111;
import jpos.services.CashChangerService112;
import jpos.services.CashChangerService113;
import jpos.services.CashChangerService114;
import jpos.services.CashChangerService12;
import jpos.services.CashChangerService13;
import jpos.services.CashChangerService14;
import jpos.services.CashChangerService15;
import jpos.services.CashChangerService16;
import jpos.services.CashChangerService17;
import jpos.services.CashChangerService18;
import jpos.services.CashChangerService19;
import jpos.services.EventCallbacks;

public class CashChanger extends BaseJposControl implements CashChangerControl114, JposConst
{
	protected CashChangerService12 service12;
	protected CashChangerService13 service13;
	protected CashChangerService14 service14;
	protected CashChangerService15 service15;
	protected CashChangerService16 service16;
	protected CashChangerService17 service17;
	protected CashChangerService18 service18;
	protected CashChangerService19 service19;
	protected CashChangerService110 service110;
	protected CashChangerService111 service111;
	protected CashChangerService112 service112;
	protected CashChangerService113 service113;
	protected CashChangerService114 service114;
	protected Vector directIOListeners = new Vector();
	protected Vector statusUpdateListeners = new Vector();
	protected Vector dataListeners = new Vector();

	public CashChanger()
	{
		deviceControlDescription = "JavaPOS CashChanger Device Control";
		deviceControlVersion = 1014000;
	}

	public boolean getCapDiscrepancy() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCapDiscrepancy();
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

	public boolean getCapFullSensor() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCapFullSensor();
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

	public boolean getCapNearFullSensor() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCapNearFullSensor();
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

	public boolean getCapDeposit() throws JposException
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
			return service15.getCapDeposit();
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

	public boolean getCapDepositDataEvent() throws JposException
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
			return service15.getCapDepositDataEvent();
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

	public boolean getCapPauseDeposit() throws JposException
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
			return service15.getCapPauseDeposit();
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

	public boolean getCapRepayDeposit() throws JposException
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
			return service15.getCapRepayDeposit();
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

	public boolean getCapJamSensor() throws JposException
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
			return service111.getCapJamSensor();
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

	public boolean getCapRealTimeData() throws JposException
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
			return service111.getCapRealTimeData();
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
		try
		{
			return service12.getAsyncMode();
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
		try
		{
			service12.setAsyncMode( paramBoolean );
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

	public int getAsyncResultCode() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getAsyncResultCode();
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

	public int getAsyncResultCodeExtended() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getAsyncResultCodeExtended();
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

	public String getCurrencyCashList() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCurrencyCashList();
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

	public String getCurrencyCode() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCurrencyCode();
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

	public void setCurrencyCode( String paramString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.setCurrencyCode( paramString );
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

	public String getCurrencyCodeList() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCurrencyCodeList();
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

	public int getCurrentExit() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getCurrentExit();
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

	public void setCurrentExit( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.setCurrentExit( paramInt );
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

	public int getDeviceExits() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getDeviceExits();
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

	public int getDeviceStatus() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getDeviceStatus();
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

	public String getExitCashList() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getExitCashList();
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

	public int getFullStatus() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service12.getFullStatus();
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

	public int getDataCount() throws JposException
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
			return service15.getDataCount();
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
		if ( serviceVersion < 1005000 )
		{
			throw new JposException( 104, "Device Service is not 1.5.0 compliant." );
		}
		try
		{
			return service15.getDataEventEnabled();
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
		if ( serviceVersion < 1005000 )
		{
			throw new JposException( 104, "Device Service is not 1.5.0 compliant." );
		}
		try
		{
			service15.setDataEventEnabled( paramBoolean );
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

	public int getDepositAmount() throws JposException
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
			return service15.getDepositAmount();
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

	public String getDepositCashList() throws JposException
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
			return service15.getDepositCashList();
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

	public String getDepositCodeList() throws JposException
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
			return service15.getDepositCodeList();
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

	public String getDepositCounts() throws JposException
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
			return service15.getDepositCounts();
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

	public int getDepositStatus() throws JposException
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
			return service15.getDepositStatus();
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

	public int getCurrentService() throws JposException
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
			return service111.getCurrentService();
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

	public void setCurrentService( int paramInt ) throws JposException
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
			service111.setCurrentService( paramInt );
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

	public boolean getRealTimeDataEnabled() throws JposException
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
			return service111.getRealTimeDataEnabled();
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

	public void setRealTimeDataEnabled( boolean paramBoolean ) throws JposException
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
			service111.setRealTimeDataEnabled( paramBoolean );
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

	public int getServiceCount() throws JposException
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
			return service111.getServiceCount();
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

	public int getServiceIndex() throws JposException
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
			return service111.getServiceIndex();
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

	public void dispenseCash( String paramString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.dispenseCash( paramString );
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

	public void readCashCounts( String[] paramArrayOfString, boolean[] paramArrayOfBoolean ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service12.readCashCounts( paramArrayOfString, paramArrayOfBoolean );
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

	public void beginDeposit() throws JposException
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
			service15.beginDeposit();
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
		if ( serviceVersion < 1005000 )
		{
			throw new JposException( 104, "Device Service is not 1.5.0 compliant." );
		}
		try
		{
			service15.clearInput();
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

	public void endDeposit( int paramInt ) throws JposException
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
			service15.endDeposit( paramInt );
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

	public void fixDeposit() throws JposException
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
			service15.fixDeposit();
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

	public void pauseDeposit( int paramInt ) throws JposException
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
			service15.pauseDeposit( paramInt );
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

	protected EventCallbacks createEventCallbacks()
	{
		return new CashChangerCallbacks();
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
					service12 = ( ( CashChangerService12 ) paramBaseService );
				}
				catch ( Exception localException1 )
				{
					throw new JposException( 104, "Service does not fully implement CashChangerService12 interface", localException1 );
				}
			}
			if ( serviceVersion >= 1003000 )
			{
				try
				{
					service13 = ( ( CashChangerService13 ) paramBaseService );
				}
				catch ( Exception localException2 )
				{
					throw new JposException( 104, "Service does not fully implement CashChangerService13 interface", localException2 );
				}
			}
			if ( serviceVersion >= 1004000 )
			{
				try
				{
					service14 = ( ( CashChangerService14 ) paramBaseService );
				}
				catch ( Exception localException3 )
				{
					throw new JposException( 104, "Service does not fully implement CashChangerService14 interface", localException3 );
				}
			}
			if ( serviceVersion >= 1005000 )
			{
				try
				{
					service15 = ( ( CashChangerService15 ) paramBaseService );
				}
				catch ( Exception localException4 )
				{
					throw new JposException( 104, "Service does not fully implement CashChangerService15 interface", localException4 );
				}
			}
			if ( serviceVersion >= 1006000 )
			{
				try
				{
					service16 = ( ( CashChangerService16 ) paramBaseService );
				}
				catch ( Exception localException5 )
				{
					throw new JposException( 104, "Service does not fully implement CashChangerService16 interface", localException5 );
				}
			}
			if ( serviceVersion >= 1007000 )
			{
				try
				{
					service17 = ( ( CashChangerService17 ) paramBaseService );
				}
				catch ( Exception localException6 )
				{
					throw new JposException( 104, "Service does not fully implement CashChangerService17 interface", localException6 );
				}
			}
			if ( serviceVersion >= 1008000 )
			{
				try
				{
					service18 = ( ( CashChangerService18 ) paramBaseService );
				}
				catch ( Exception localException7 )
				{
					throw new JposException( 104, "Service does not fully implement CashChangerService18 interface", localException7 );
				}
			}
			if ( serviceVersion >= 1009000 )
			{
				try
				{
					service19 = ( ( CashChangerService19 ) paramBaseService );
				}
				catch ( Exception localException8 )
				{
					throw new JposException( 104, "Service does not fully implement CashChangerService19 interface", localException8 );
				}
			}
			if ( serviceVersion >= 1010000 )
			{
				try
				{
					service110 = ( ( CashChangerService110 ) paramBaseService );
				}
				catch ( Exception localException9 )
				{
					throw new JposException( 104, "Service does not fully implement CashChangerService110 interface", localException9 );
				}
			}
			if ( serviceVersion >= 1011000 )
			{
				try
				{
					service111 = ( ( CashChangerService111 ) paramBaseService );
				}
				catch ( Exception localException10 )
				{
					throw new JposException( 104, "Service does not fully implement CashChangerService111 interface", localException10 );
				}
			}
			if ( serviceVersion >= 1012000 )
			{
				try
				{
					service112 = ( ( CashChangerService112 ) paramBaseService );
				}
				catch ( Exception localException11 )
				{
					throw new JposException( 104, "Service does not fully implement CashChangerService112 interface", localException11 );
				}
			}
			if ( serviceVersion >= 1013000 )
			{
				try
				{
					service113 = ( ( CashChangerService113 ) paramBaseService );
				}
				catch ( Exception localException12 )
				{
					throw new JposException( 104, "Service does not fully implement CashChangerService113 interface", localException12 );
				}
			}
			if ( serviceVersion >= 1014000 )
			{
				try
				{
					service114 = ( ( CashChangerService114 ) paramBaseService );
				}
				catch ( Exception localException13 )
				{
					throw new JposException( 104, "Service does not fully implement CashChangerService114 interface", localException13 );
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

	protected class CashChangerCallbacks implements EventCallbacks
	{
		protected CashChangerCallbacks()
		{
		}

		public BaseControl getEventSource()
		{
			return CashChanger.this;
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
