package jpos;

import jpos.events.DataListener;
import jpos.events.DirectIOListener;
import jpos.events.ErrorListener;
import jpos.events.OutputCompleteListener;
import jpos.events.StatusUpdateListener;

public abstract interface RFIDScannerControl112 extends BaseControl
{
	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapContinuousRead() throws JposException;

	public abstract boolean getCapDisableTag() throws JposException;

	public abstract boolean getCapLockTag() throws JposException;

	public abstract int getCapMultipleProtocols() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapReadTimer() throws JposException;

	public abstract boolean getCapRealTimeData() throws JposException;

	public abstract boolean getCapStatisticsReporting() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract boolean getCapUpdateStatistics() throws JposException;

	public abstract int getCapWriteTag() throws JposException;

	public abstract boolean getAutoDisable() throws JposException;

	public abstract void setAutoDisable( boolean paramBoolean ) throws JposException;

	public abstract boolean getContinuousReadMode() throws JposException;

	public abstract byte[] getCurrentTagID() throws JposException;

	public abstract int getCurrentTagProtocol() throws JposException;

	public abstract byte[] getCurrentTagUserData() throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract int getOutputID() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract int getProtocolMask() throws JposException;

	public abstract void setProtocolMask( int paramInt ) throws JposException;

	public abstract int getReadTimerInterval() throws JposException;

	public abstract void setReadTimerInterval( int paramInt ) throws JposException;

	public abstract int getTagCount() throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void clearInputProperties() throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void disableTag( byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2 ) throws JposException;

	public abstract void firstTag() throws JposException;

	public abstract void lockTag( byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2 ) throws JposException;

	public abstract void nextTag() throws JposException;

	public abstract void previousTag() throws JposException;

	public abstract void readTags( int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte3 ) throws JposException;

	public abstract void resetStatistics( String paramString ) throws JposException;

	public abstract void retrieveStatistics( String[] paramArrayOfString ) throws JposException;

	public abstract void startReadTags( int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3, byte[] paramArrayOfByte3 ) throws JposException;

	public abstract void stopReadTags( byte[] paramArrayOfByte ) throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;

	public abstract void updateStatistics( String paramString ) throws JposException;

	public abstract void writeTagData( byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, byte[] paramArrayOfByte3 ) throws JposException;

	public abstract void writeTagID( byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3 ) throws JposException;

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
