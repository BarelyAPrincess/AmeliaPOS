package jpos.services;

import jpos.JposException;

public abstract interface KeylockService12 extends BaseService
{
	public abstract int getKeyPosition() throws JposException;

	public abstract int getPositionCount() throws JposException;

	public abstract void waitForKeylockChange( int paramInt1, int paramInt2 ) throws JposException;
}
