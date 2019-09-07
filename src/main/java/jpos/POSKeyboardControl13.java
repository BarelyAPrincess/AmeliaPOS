package jpos;

import jpos.events.StatusUpdateListener;

public abstract interface POSKeyboardControl13 extends POSKeyboardControl12
{
	public abstract int getCapPowerReporting() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
