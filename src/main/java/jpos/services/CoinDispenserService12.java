package jpos.services;

import jpos.JposException;

public abstract interface CoinDispenserService12 extends BaseService
{
	public abstract boolean getCapEmptySensor() throws JposException;

	public abstract boolean getCapJamSensor() throws JposException;

	public abstract boolean getCapNearEmptySensor() throws JposException;

	public abstract int getDispenserStatus() throws JposException;

	public abstract void dispenseChange( int paramInt ) throws JposException;
}
