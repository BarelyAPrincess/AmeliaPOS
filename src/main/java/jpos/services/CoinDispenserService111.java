package jpos.services;

import jpos.JposException;

public abstract interface CoinDispenserService111 extends CoinDispenserService110
{
	public abstract void adjustCashCounts( String paramString ) throws JposException;

	public abstract void readCashCounts( String[] paramArrayOfString, boolean[] paramArrayOfBoolean ) throws JposException;
}
