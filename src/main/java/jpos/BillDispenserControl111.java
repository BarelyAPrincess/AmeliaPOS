package jpos;

import jpos.events.DirectIOListener;
import jpos.events.StatusUpdateListener;

public abstract interface BillDispenserControl111 extends BaseControl
{
	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapDiscrepancy() throws JposException;

	public abstract boolean getCapEmptySensor() throws JposException;

	public abstract boolean getCapJamSensor() throws JposException;

	public abstract boolean getCapNearEmptySensor() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapStatisticsReporting() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract boolean getCapUpdateStatistics() throws JposException;

	public abstract boolean getAsyncMode() throws JposException;

	public abstract void setAsyncMode( boolean paramBoolean ) throws JposException;

	public abstract int getAsyncResultCode() throws JposException;

	public abstract int getAsyncResultCodeExtended() throws JposException;

	public abstract String getCurrencyCashList() throws JposException;

	public abstract String getCurrencyCode() throws JposException;

	public abstract void setCurrencyCode( String paramString ) throws JposException;

	public abstract String getCurrencyCodeList() throws JposException;

	public abstract int getCurrentExit() throws JposException;

	public abstract void setCurrentExit( int paramInt ) throws JposException;

	public abstract int getDeviceExits() throws JposException;

	public abstract int getDeviceStatus() throws JposException;

	public abstract String getExitCashList() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract void adjustCashCounts( String paramString ) throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void dispenseCash( String paramString ) throws JposException;

	public abstract void readCashCounts( String[] paramArrayOfString, boolean[] paramArrayOfBoolean ) throws JposException;

	public abstract void resetStatistics( String paramString ) throws JposException;

	public abstract void retrieveStatistics( String[] paramArrayOfString ) throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;

	public abstract void updateStatistics( String paramString ) throws JposException;

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
