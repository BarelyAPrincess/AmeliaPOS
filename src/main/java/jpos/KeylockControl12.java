package jpos;

import jpos.events.DirectIOListener;
import jpos.events.StatusUpdateListener;

public abstract interface KeylockControl12 extends BaseControl
{
	public abstract int getKeyPosition() throws JposException;

	public abstract int getPositionCount() throws JposException;

	public abstract void waitForKeylockChange( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
