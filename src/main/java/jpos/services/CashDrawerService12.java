package jpos.services;

import jpos.JposException;

public abstract interface CashDrawerService12 extends BaseService
{
	public abstract boolean getCapStatus() throws JposException;

	public abstract boolean getDrawerOpened() throws JposException;

	public abstract void openDrawer() throws JposException;

	public abstract void waitForDrawerClose( int paramInt1, int paramInt2, int paramInt3, int paramInt4 ) throws JposException;
}
