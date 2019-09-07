package jpos;

import jpos.events.DataListener;
import jpos.events.ErrorListener;
import jpos.events.StatusUpdateListener;

public abstract interface ScaleControl13 extends ScaleControl12
{
	public abstract boolean getCapDisplayText() throws JposException;

	public abstract boolean getCapPriceCalculating() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapTareWeight() throws JposException;

	public abstract boolean getCapZeroScale() throws JposException;

	public abstract boolean getAsyncMode() throws JposException;

	public abstract void setAsyncMode( boolean paramBoolean ) throws JposException;

	public abstract boolean getAutoDisable() throws JposException;

	public abstract void setAutoDisable( boolean paramBoolean ) throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract int getMaxDisplayTextChars() throws JposException;

	public abstract long getSalesPrice() throws JposException;

	public abstract int getTareWeight() throws JposException;

	public abstract void setTareWeight( int paramInt ) throws JposException;

	public abstract long getUnitPrice() throws JposException;

	public abstract void setUnitPrice( long paramLong ) throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void displayText( String paramString ) throws JposException;

	public abstract void zeroScale() throws JposException;

	public abstract void addDataListener( DataListener paramDataListener );

	public abstract void removeDataListener( DataListener paramDataListener );

	public abstract void addErrorListener( ErrorListener paramErrorListener );

	public abstract void removeErrorListener( ErrorListener paramErrorListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
