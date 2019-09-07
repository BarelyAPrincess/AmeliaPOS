package jpos;

import jpos.events.DataListener;
import jpos.events.DirectIOListener;
import jpos.events.ErrorListener;
import jpos.events.StatusUpdateListener;

public abstract interface BiometricsControl110 extends BaseControl
{
	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapPrematchData() throws JposException;

	public abstract boolean getCapRawSensorData() throws JposException;

	public abstract boolean getCapRealTimeData() throws JposException;

	public abstract int getCapSensorColor() throws JposException;

	public abstract int getCapSensorOrientation() throws JposException;

	public abstract int getCapSensorType() throws JposException;

	public abstract boolean getCapStatisticsReporting() throws JposException;

	public abstract boolean getCapTemplateAdaptation() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract boolean getCapUpdateStatistics() throws JposException;

	public abstract int getAlgorithm() throws JposException;

	public abstract void setAlgorithm( int paramInt ) throws JposException;

	public abstract String getAlgorithmList() throws JposException;

	public abstract boolean getAutoDisable() throws JposException;

	public abstract void setAutoDisable( boolean paramBoolean ) throws JposException;

	public abstract byte[] getBIR() throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract byte[] getRawSensorData() throws JposException;

	public abstract boolean getRealTimeDataEnabled() throws JposException;

	public abstract void setRealTimeDataEnabled( boolean paramBoolean ) throws JposException;

	public abstract int getSensorBPP() throws JposException;

	public abstract int getSensorColor() throws JposException;

	public abstract void setSensorColor( int paramInt ) throws JposException;

	public abstract int getSensorHeight() throws JposException;

	public abstract int getSensorOrientation() throws JposException;

	public abstract void setSensorOrientation( int paramInt ) throws JposException;

	public abstract int getSensorType() throws JposException;

	public abstract void setSensorType( int paramInt ) throws JposException;

	public abstract int getSensorWidth() throws JposException;

	public abstract void beginEnrollCapture( byte[] paramArrayOfByte1, byte[] paramArrayOfByte2 ) throws JposException;

	public abstract void beginVerifyCapture() throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void clearInputProperties() throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void endCapture() throws JposException;

	public abstract void identify( int paramInt1, int paramInt2, boolean paramBoolean, byte[][] paramArrayOfByte, int[][] paramArrayOfInt, int paramInt3 ) throws JposException;

	public abstract void identifyMatch( int paramInt1, int paramInt2, boolean paramBoolean, byte[] paramArrayOfByte, byte[][] paramArrayOfByte1, int[][] paramArrayOfInt ) throws JposException;

	public abstract void processPrematchData( byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[][] paramArrayOfByte ) throws JposException;

	public abstract void resetStatistics( String paramString ) throws JposException;

	public abstract void retrieveStatistics( String[] paramArrayOfString ) throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;

	public abstract void updateStatistics( String paramString ) throws JposException;

	public abstract void verify( int paramInt1, int paramInt2, boolean paramBoolean, byte[] paramArrayOfByte, byte[][] paramArrayOfByte1, boolean[] paramArrayOfBoolean, int[] paramArrayOfInt1, int[] paramArrayOfInt2, byte[][] paramArrayOfByte2, int paramInt3 ) throws JposException;

	public abstract void verifyMatch( int paramInt1, int paramInt2, boolean paramBoolean, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[][] paramArrayOfByte3, boolean[] paramArrayOfBoolean, int[] paramArrayOfInt1, int[] paramArrayOfInt2, byte[][] paramArrayOfByte4 ) throws JposException;

	public abstract void addDataListener( DataListener paramDataListener );

	public abstract void removeDataListener( DataListener paramDataListener );

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addErrorListener( ErrorListener paramErrorListener );

	public abstract void removeErrorListener( ErrorListener paramErrorListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
