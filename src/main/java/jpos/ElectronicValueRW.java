package jpos;

import java.util.Vector;

import jpos.events.DataEvent;
import jpos.events.DataListener;
import jpos.events.DirectIOEvent;
import jpos.events.DirectIOListener;
import jpos.events.ErrorEvent;
import jpos.events.ErrorListener;
import jpos.events.OutputCompleteEvent;
import jpos.events.OutputCompleteListener;
import jpos.events.StatusUpdateEvent;
import jpos.events.StatusUpdateListener;
import jpos.events.TransitionListener;
import jpos.services.BaseService;
import jpos.services.ElectronicValueRWService112;
import jpos.services.ElectronicValueRWService113;
import jpos.services.ElectronicValueRWService114;
import jpos.services.EventCallbacks;

public class ElectronicValueRW extends BaseJposControl implements ElectronicValueRWControl114, JposConst
{
	protected ElectronicValueRWService112 service112;
	protected ElectronicValueRWService113 service113;
	protected ElectronicValueRWService114 service114;
	protected Vector dataListeners = new Vector();
	protected Vector directIOListeners = new Vector();
	protected Vector errorListeners = new Vector();
	protected Vector outputCompleteListeners = new Vector();
	protected Vector statusUpdateListeners = new Vector();
	protected Vector transitionListeners = new Vector();

	public ElectronicValueRW()
	{
		deviceControlDescription = "JavaPOS ElectronicValueRW Device Control";
		deviceControlVersion = 1014000;
	}

	public boolean getCapActivateService() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapActivateService();
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

	public boolean getCapAddValue() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapAddValue();
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

	public boolean getCapCancelValue() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapCancelValue();
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

	public int getCapCardSensor() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapCardSensor();
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
		try
		{
			return service112.getCapCompareFirmwareVersion();
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

	public int getCapDetectionControl() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapDetectionControl();
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

	public boolean getCapElectronicMoney() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapElectronicMoney();
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

	public boolean getCapEnumerateCardServices() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapEnumerateCardServices();
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

	public boolean getCapIndirectTransactionLog() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapIndirectTransactionLog();
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

	public boolean getCapLockTerminal() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapLockTerminal();
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

	public boolean getCapLogStatus() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapLogStatus();
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

	public boolean getCapMediumID() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapMediumID();
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

	public boolean getCapPoint() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapPoint();
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
		try
		{
			return service112.getCapPowerReporting();
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
		try
		{
			return service112.getCapRealTimeData();
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
		try
		{
			return service112.getCapStatisticsReporting();
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

	public boolean getCapSubtractValue() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapSubtractValue();
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

	public boolean getCapTransaction() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapTransaction();
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

	public boolean getCapTransactionLog() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapTransactionLog();
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

	public boolean getCapUnlockTerminal() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapUnlockTerminal();
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
		try
		{
			return service112.getCapUpdateFirmware();
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

	public boolean getCapUpdateKey() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapUpdateKey();
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
		try
		{
			return service112.getCapUpdateStatistics();
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

	public boolean getCapVoucher() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapVoucher();
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

	public boolean getCapWriteValue() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCapWriteValue();
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

	public boolean getCapPINDevice() throws JposException
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
			return service114.getCapPINDevice();
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

	public boolean getCapMembershipCertificate() throws JposException
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
			return service114.getCapMembershipCertificate();
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

	public boolean getCapTrainingMode() throws JposException
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
			return service114.getCapTrainingMode();
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
			return service112.getAccountNumber();
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

	public String getAdditionalSecurityInformation() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
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

	public void setAdditionalSecurityInformation( String paramString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.setAdditionalSecurityInformation( paramString );
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

	public long getAmount() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getAmount();
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

	public void setAmount( long paramLong ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.setAmount( paramLong );
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

	public String getApprovalCode() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getApprovalCode();
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

	public void setApprovalCode( String paramString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.setApprovalCode( paramString );
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
			return service112.getAsyncMode();
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
			service112.setAsyncMode( paramBoolean );
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
			return service112.getAutoDisable();
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
			service112.setAutoDisable( paramBoolean );
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

	public long getBalance() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getBalance();
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

	public long getBalanceOfPoint() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getBalanceOfPoint();
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

	public String getCardServiceList() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCardServiceList();
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

	public String getCurrentService() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getCurrentService();
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

	public void setCurrentService( String paramString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.setCurrentService( paramString );
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
			return service112.getDataCount();
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
			return service112.getDataEventEnabled();
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
			service112.setDataEventEnabled( paramBoolean );
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

	public boolean getDetectionControl() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getDetectionControl();
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

	public void setDetectionControl( boolean paramBoolean ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.setDetectionControl( paramBoolean );
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

	public int getDetectionStatus() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getDetectionStatus();
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
			return service112.getExpirationDate();
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

	public String getLastUsedDate() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getLastUsedDate();
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

	public int getLogStatus() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getLogStatus();
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

	public String getMediumID() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getMediumID();
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

	public void setMediumID( String paramString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.setMediumID( paramString );
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

	public int getOutputID() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getOutputID();
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

	public long getPoint() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getPoint();
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

	public void setPoint( long paramLong ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.setPoint( paramLong );
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
		try
		{
			return service112.getPowerNotify();
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
		try
		{
			service112.setPowerNotify( paramInt );
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
		try
		{
			return service112.getPowerState();
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

	public String getReaderWriterServiceList() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getReaderWriterServiceList();
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

	public int getSequenceNumber() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getSequenceNumber();
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

	public long getSettledAmount() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getSettledAmount();
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

	public long getSettledPoint() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getSettledPoint();
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

	public String getTransactionLog() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getTransactionLog();
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

	public String getVoucherID() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getVoucherID();
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

	public void setVoucherID( String paramString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.setVoucherID( paramString );
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

	public String getVoucherIDList() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			return service112.getVoucherIDList();
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

	public void setVoucherIDList( String paramString ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.setVoucherIDList( paramString );
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

	public int getPINEntry() throws JposException
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
			return service114.getPINEntry();
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

	public void setPINEntry( int paramInt ) throws JposException
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
			service114.setPINEntry( paramInt );
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

	public int getServiceType() throws JposException
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
			return service114.getServiceType();
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

	public int getTrainingModeState() throws JposException
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
			return service114.getTrainingModeState();
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

	public void setTrainingModeState( int paramInt ) throws JposException
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
			service114.setTrainingModeState( paramInt );
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

	public void accessLog( int paramInt1, int paramInt2, int paramInt3 ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.accessLog( paramInt1, paramInt2, paramInt3 );
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

	public void activateService( int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.activateService( paramArrayOfInt, paramArrayOfObject );
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

	public void addValue( int paramInt1, int paramInt2 ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.addValue( paramInt1, paramInt2 );
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

	public void beginDetection( int paramInt1, int paramInt2 ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.beginDetection( paramInt1, paramInt2 );
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

	public void beginRemoval( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.beginRemoval( paramInt );
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

	public void cancelValue( int paramInt1, int paramInt2 ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.cancelValue( paramInt1, paramInt2 );
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

	public void captureCard() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.captureCard();
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
			service112.clearInput();
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
		try
		{
			service112.clearInputProperties();
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

	public void clearOutput() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.clearOutput();
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
		try
		{
			service112.compareFirmwareVersion( paramString, paramArrayOfInt );
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

	public void endDetection() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.endDetection();
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

	public void endRemoval() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.endRemoval();
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

	public void enumerateCardServices() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.enumerateCardServices();
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

	public void lockTerminal() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.lockTerminal();
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

	public void readValue( int paramInt1, int paramInt2 ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.readValue( paramInt1, paramInt2 );
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
		try
		{
			service112.resetStatistics( paramString );
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
		try
		{
			service112.retrieveStatistics( paramArrayOfString );
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

	public void subtractValue( int paramInt1, int paramInt2 ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.subtractValue( paramInt1, paramInt2 );
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

	public void transactionAccess( int paramInt ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.transactionAccess( paramInt );
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

	public void unlockTerminal() throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.unlockTerminal();
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
		try
		{
			service112.updateFirmware( paramString );
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

	public void updateKey( int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.updateKey( paramArrayOfInt, paramArrayOfObject );
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
		try
		{
			service112.updateStatistics( paramString );
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

	public void writeValue( int paramInt1, int paramInt2 ) throws JposException
	{
		if ( !bOpen )
		{
			throw new JposException( 101, "Control not opened" );
		}
		try
		{
			service112.writeValue( paramInt1, paramInt2 );
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

	public void accessData( int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException
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
			service114.accessData( paramInt, paramArrayOfInt, paramArrayOfObject );
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

	public void activateEVService( int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException
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
			service114.activateEVService( paramArrayOfInt, paramArrayOfObject );
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

	public void checkServiceRegistrationToMedium( int paramInt1, int paramInt2 ) throws JposException
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
			service114.checkServiceRegistrationToMedium( paramInt1, paramInt2 );
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

	public void clearParameterInformation() throws JposException
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
			service114.clearParameterInformation();
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

	public void closeDailyEVService( int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException
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
			service114.closeDailyEVService( paramArrayOfInt, paramArrayOfObject );
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

	public void deactivateEVService( int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException
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
			service114.deactivateEVService( paramArrayOfInt, paramArrayOfObject );
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

	public void openDailyEVService( int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException
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
			service114.openDailyEVService( paramArrayOfInt, paramArrayOfObject );
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

	public void queryLastSuccessfulTransactionResult() throws JposException
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
			service114.queryLastSuccessfulTransactionResult();
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

	public void registerServiceToMedium( int paramInt1, int paramInt2 ) throws JposException
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
			service114.registerServiceToMedium( paramInt1, paramInt2 );
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

	public void retrieveResultInformation( String paramString, String[] paramArrayOfString ) throws JposException
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
			service114.retrieveResultInformation( paramString, paramArrayOfString );
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

	public void setParameterInformation( String paramString1, String paramString2 ) throws JposException
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
			service114.setParameterInformation( paramString1, paramString2 );
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

	public void unregisterServiceToMedium( int paramInt1, int paramInt2 ) throws JposException
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
			service114.unregisterServiceToMedium( paramInt1, paramInt2 );
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

	public void updateData( int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException
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
			service114.updateData( paramInt, paramArrayOfInt, paramArrayOfObject );
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
		return new ElectronicValueRWCallbacks();
	}

	protected void setDeviceService( BaseService paramBaseService, int paramInt ) throws JposException
	{
		if ( paramBaseService == null )
		{
			service112 = null;
			service113 = null;
			service114 = null;
		}
		else
		{
			if ( serviceVersion >= 1012000 )
			{
				try
				{
					service112 = ( ( ElectronicValueRWService112 ) paramBaseService );
				}
				catch ( Exception localException1 )
				{
					throw new JposException( 104, "Service does not fully implement ElectronicValueRWService112 interface", localException1 );
				}
			}
			if ( serviceVersion >= 1013000 )
			{
				try
				{
					service113 = ( ( ElectronicValueRWService113 ) paramBaseService );
				}
				catch ( Exception localException2 )
				{
					throw new JposException( 104, "Service does not fully implement ElectronicValueRWService113 interface", localException2 );
				}
			}
			if ( serviceVersion >= 1014000 )
			{
				try
				{
					service114 = ( ( ElectronicValueRWService114 ) paramBaseService );
				}
				catch ( Exception localException3 )
				{
					throw new JposException( 104, "Service does not fully implement ElectronicValueRWService114 interface", localException3 );
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

	public void addOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener )
	{
		synchronized ( outputCompleteListeners )
		{
			outputCompleteListeners.addElement( paramOutputCompleteListener );
		}
	}

	public void removeOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener )
	{
		synchronized ( outputCompleteListeners )
		{
			outputCompleteListeners.removeElement( paramOutputCompleteListener );
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

	public void addTransitionListener( TransitionListener paramTransitionListener )
	{
		synchronized ( transitionListeners )
		{
			transitionListeners.addElement( paramTransitionListener );
		}
	}

	public void removeTransitionListener( TransitionListener paramTransitionListener )
	{
		synchronized ( transitionListeners )
		{
			transitionListeners.removeElement( paramTransitionListener );
		}
	}

	protected class ElectronicValueRWCallbacks implements EventCallbacks
	{
		protected ElectronicValueRWCallbacks()
		{
		}

		public BaseControl getEventSource()
		{
			return ElectronicValueRW.this;
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
			synchronized ( outputCompleteListeners )
			{
				for ( int i = 0; i < outputCompleteListeners.size(); i++ )
				{
					( ( OutputCompleteListener ) outputCompleteListeners.elementAt( i ) ).outputCompleteOccurred( paramOutputCompleteEvent );
				}
			}
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
