package jpos;

import jpos.events.DataListener;
import jpos.events.DirectIOListener;
import jpos.events.StatusUpdateListener;

public abstract interface BillAcceptorControl111 extends BaseControl
{
	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapDiscrepancy() throws JposException;

	public abstract boolean getCapFullSensor() throws JposException;

	public abstract boolean getCapJamSensor() throws JposException;

	public abstract boolean getCapNearFullSensor() throws JposException;

	public abstract boolean getCapPauseDeposit() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapRealTimeData() throws JposException;

	public abstract boolean getCapStatisticsReporting() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract boolean getCapUpdateStatistics() throws JposException;

	public abstract String getCurrencyCode() throws JposException;

	public abstract void setCurrencyCode( String paramString ) throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract int getDepositAmount() throws JposException;

	public abstract String getDepositCashList() throws JposException;

	public abstract String getDepositCodeList() throws JposException;

	public abstract String getDepositCounts() throws JposException;

	public abstract int getDepositStatus() throws JposException;

	public abstract int getFullStatus() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract boolean getRealTimeDataEnabled() throws JposException;

	public abstract void setRealTimeDataEnabled( boolean paramBoolean ) throws JposException;

	public abstract void adjustCashCounts( String paramString ) throws JposException;

	public abstract void beginDeposit() throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void endDeposit( int paramInt ) throws JposException;

	public abstract void fixDeposit() throws JposException;

	public abstract void pauseDeposit( int paramInt ) throws JposException;

	public abstract void readCashCounts( String[] paramArrayOfString, boolean[] paramArrayOfBoolean ) throws JposException;

	public abstract void resetStatistics( String paramString ) throws JposException;

	public abstract void retrieveStatistics( String[] paramArrayOfString ) throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;

	public abstract void updateStatistics( String paramString ) throws JposException;

	public abstract void addDataListener( DataListener paramDataListener );

	public abstract void removeDataListener( DataListener paramDataListener );

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
