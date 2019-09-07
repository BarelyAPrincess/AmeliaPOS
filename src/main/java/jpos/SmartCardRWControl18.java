package jpos;

import jpos.events.DataListener;
import jpos.events.DirectIOListener;
import jpos.events.ErrorListener;
import jpos.events.OutputCompleteListener;
import jpos.events.StatusUpdateListener;

public abstract interface SmartCardRWControl18 extends BaseControl
{
	public abstract boolean getCapCardErrorDetection() throws JposException;

	public abstract int getCapInterfaceMode() throws JposException;

	public abstract int getCapIsoEmvMode() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract int getCapSCPresentSensor() throws JposException;

	public abstract int getCapSCSlots() throws JposException;

	public abstract boolean getCapStatisticsReporting() throws JposException;

	public abstract int getCapTransmissionProtocol() throws JposException;

	public abstract boolean getCapUpdateStatistics() throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract int getInterfaceMode() throws JposException;

	public abstract void setInterfaceMode( int paramInt ) throws JposException;

	public abstract int getIsoEmvMode() throws JposException;

	public abstract void setIsoEmvMode( int paramInt ) throws JposException;

	public abstract int getOutputID() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract int getSCPresentSensor() throws JposException;

	public abstract int getSCSlot() throws JposException;

	public abstract void setSCSlot( int paramInt ) throws JposException;

	public abstract boolean getTransactionInProgress() throws JposException;

	public abstract int getTransmissionProtocol() throws JposException;

	public abstract void beginInsertion( int paramInt ) throws JposException;

	public abstract void beginRemoval( int paramInt ) throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void endInsertion() throws JposException;

	public abstract void endRemoval() throws JposException;

	public abstract void readData( int paramInt, int[] paramArrayOfInt, String[] paramArrayOfString ) throws JposException;

	public abstract void resetStatistics( String paramString ) throws JposException;

	public abstract void retrieveStatistics( String[] paramArrayOfString ) throws JposException;

	public abstract void updateStatistics( String paramString ) throws JposException;

	public abstract void writeData( int paramInt1, int paramInt2, String paramString ) throws JposException;

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
