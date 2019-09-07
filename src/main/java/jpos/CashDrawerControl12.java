package jpos;

import jpos.events.DirectIOListener;
import jpos.events.StatusUpdateListener;

public abstract interface CashDrawerControl12 extends BaseControl
{
	public abstract boolean getCapStatus() throws JposException;

	public abstract boolean getDrawerOpened() throws JposException;

	public abstract void openDrawer() throws JposException;

	public abstract void waitForDrawerClose( int paramInt1, int paramInt2, int paramInt3, int paramInt4 ) throws JposException;

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
