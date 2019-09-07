package jpos;

import jpos.events.DirectIOListener;
import jpos.events.StatusUpdateListener;

public abstract interface ItemDispenserControl112 extends BaseControl
{
	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapEmptySensor() throws JposException;

	public abstract boolean getCapIndividualSlotStatus() throws JposException;

	public abstract boolean getCapJamSensor() throws JposException;

	public abstract boolean getCapNearEmptySensor() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapStatisticsReporting() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract boolean getCapUpdateStatistics() throws JposException;

	public abstract int getDispenserStatus() throws JposException;

	public abstract int getMaxSlots() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract void adjustItemCount( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void dispenseItem( int[] paramArrayOfInt, int paramInt ) throws JposException;

	public abstract void resetStatistics( String paramString ) throws JposException;

	public abstract void readItemCount( int[] paramArrayOfInt, int paramInt ) throws JposException;

	public abstract void retrieveStatistics( String[] paramArrayOfString ) throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;

	public abstract void updateStatistics( String paramString ) throws JposException;

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
