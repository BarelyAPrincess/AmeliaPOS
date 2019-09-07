package jpos;

import java.awt.Point;

import jpos.events.DataListener;
import jpos.events.DirectIOListener;
import jpos.events.ErrorListener;

public abstract interface SignatureCaptureControl12 extends BaseControl
{
	public abstract boolean getCapDisplay() throws JposException;

	public abstract boolean getCapRealTimeData() throws JposException;

	public abstract boolean getCapUserTerminated() throws JposException;

	public abstract boolean getAutoDisable() throws JposException;

	public abstract void setAutoDisable( boolean paramBoolean ) throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract int getMaximumX() throws JposException;

	public abstract int getMaximumY() throws JposException;

	public abstract Point[] getPointArray() throws JposException;

	public abstract byte[] getRawData() throws JposException;

	public abstract boolean getRealTimeDataEnabled() throws JposException;

	public abstract void setRealTimeDataEnabled( boolean paramBoolean ) throws JposException;

	public abstract void beginCapture( String paramString ) throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void endCapture() throws JposException;

	public abstract void addDataListener( DataListener paramDataListener );

	public abstract void removeDataListener( DataListener paramDataListener );

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addErrorListener( ErrorListener paramErrorListener );

	public abstract void removeErrorListener( ErrorListener paramErrorListener );
}
