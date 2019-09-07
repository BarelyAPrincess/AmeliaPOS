package jpos;

import jpos.events.DataListener;
import jpos.events.DirectIOListener;
import jpos.events.ErrorListener;

public abstract interface ScannerControl12 extends BaseControl
{
	public abstract boolean getAutoDisable() throws JposException;

	public abstract void setAutoDisable( boolean paramBoolean ) throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract boolean getDecodeData() throws JposException;

	public abstract void setDecodeData( boolean paramBoolean ) throws JposException;

	public abstract byte[] getScanData() throws JposException;

	public abstract byte[] getScanDataLabel() throws JposException;

	public abstract int getScanDataType() throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void addDataListener( DataListener paramDataListener );

	public abstract void removeDataListener( DataListener paramDataListener );

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addErrorListener( ErrorListener paramErrorListener );

	public abstract void removeErrorListener( ErrorListener paramErrorListener );
}
