package jpos;

public abstract interface CashDrawerControl13 extends CashDrawerControl12
{
	public abstract int getCapPowerReporting() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;
}