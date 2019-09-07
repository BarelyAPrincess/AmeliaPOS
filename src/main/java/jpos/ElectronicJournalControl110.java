package jpos;

import jpos.events.DataListener;
import jpos.events.DirectIOListener;
import jpos.events.ErrorListener;
import jpos.events.OutputCompleteListener;
import jpos.events.StatusUpdateListener;

public abstract interface ElectronicJournalControl110 extends BaseControl
{
	public abstract boolean getCapAddMarker() throws JposException;

	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapErasableMedium() throws JposException;

	public abstract boolean getCapInitializeMedium() throws JposException;

	public abstract boolean getCapMediumIsAvailable() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapPrintContent() throws JposException;

	public abstract boolean getCapPrintContentFile() throws JposException;

	public abstract boolean getCapRetrieveCurrentMarker() throws JposException;

	public abstract boolean getCapRetrieveMarker() throws JposException;

	public abstract boolean getCapRetrieveMarkerByDateTime() throws JposException;

	public abstract boolean getCapRetrieveMarkersDateTime() throws JposException;

	public abstract int getCapStation() throws JposException;

	public abstract boolean getCapStatisticsReporting() throws JposException;

	public abstract boolean getCapStorageEnabled() throws JposException;

	public abstract boolean getCapSuspendPrintContent() throws JposException;

	public abstract boolean getCapSuspendQueryContent() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract boolean getCapUpdateStatistics() throws JposException;

	public abstract boolean getCapWaterMark() throws JposException;

	public abstract boolean getAsyncMode() throws JposException;

	public abstract void setAsyncMode( boolean paramBoolean ) throws JposException;

	public abstract boolean getAutoDisable() throws JposException;

	public abstract void setAutoDisable( boolean paramBoolean ) throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract boolean getFlagWhenIdle() throws JposException;

	public abstract void setFlagWhenIdle( boolean paramBoolean ) throws JposException;

	public abstract long getMediumFreeSpace() throws JposException;

	public abstract String getMediumID() throws JposException;

	public abstract boolean getMediumIsAvailable() throws JposException;

	public abstract long getMediumSize() throws JposException;

	public abstract int getOutputID() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract int getStation() throws JposException;

	public abstract void setStation( int paramInt ) throws JposException;

	public abstract boolean getStorageEnabled() throws JposException;

	public abstract void setStorageEnabled( boolean paramBoolean ) throws JposException;

	public abstract boolean getSuspended() throws JposException;

	public abstract boolean getWaterMark() throws JposException;

	public abstract void setWaterMark( boolean paramBoolean ) throws JposException;

	public abstract void addMarker( String paramString ) throws JposException;

	public abstract void cancelPrintContent() throws JposException;

	public abstract void cancelQueryContent() throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void eraseMedium() throws JposException;

	public abstract void initializeMedium( String paramString ) throws JposException;

	public abstract void printContent( String paramString1, String paramString2 ) throws JposException;

	public abstract void printContentFile( String paramString ) throws JposException;

	public abstract void queryContent( String paramString1, String paramString2, String paramString3 ) throws JposException;

	public abstract void resetStatistics( String paramString ) throws JposException;

	public abstract void resumePrintContent() throws JposException;

	public abstract void resumeQueryContent() throws JposException;

	public abstract void retrieveCurrentMarker( int paramInt, String[] paramArrayOfString ) throws JposException;

	public abstract void retrieveMarker( int paramInt1, int paramInt2, int paramInt3, String[] paramArrayOfString ) throws JposException;

	public abstract void retrieveMarkerByDateTime( int paramInt, String paramString1, String paramString2, String[] paramArrayOfString ) throws JposException;

	public abstract void retrieveMarkersDateTime( String paramString, String[] paramArrayOfString ) throws JposException;

	public abstract void retrieveStatistics( String[] paramArrayOfString ) throws JposException;

	public abstract void suspendPrintContent() throws JposException;

	public abstract void suspendQueryContent() throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;

	public abstract void updateStatistics( String paramString ) throws JposException;

	public abstract void addDataListener( DataListener paramDataListener );

	public abstract void removeDataListener( DataListener paramDataListener );

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addErrorListener( ErrorListener paramErrorListener );

	public abstract void removeErrorListener( ErrorListener paramErrorListener );

	public abstract void addOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener );

	public abstract void removeOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
