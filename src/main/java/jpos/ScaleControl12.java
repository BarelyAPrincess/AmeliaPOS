package jpos;

import jpos.events.DirectIOListener;

public abstract interface ScaleControl12 extends BaseControl
{
	public abstract boolean getCapDisplay() throws JposException;

	public abstract int getMaximumWeight() throws JposException;

	public abstract int getWeightUnit() throws JposException;

	public abstract void readWeight( int[] paramArrayOfInt, int paramInt ) throws JposException;

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );
}
