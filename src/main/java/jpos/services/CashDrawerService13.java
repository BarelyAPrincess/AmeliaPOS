package jpos.services;

import jpos.JposException;

public abstract interface CashDrawerService13 extends CashDrawerService12
{
	public abstract int getCapPowerReporting() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;
}
