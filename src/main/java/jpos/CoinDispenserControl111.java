package jpos;

public abstract interface CoinDispenserControl111 extends CoinDispenserControl110
{
	public abstract void adjustCashCounts( String paramString ) throws JposException;

	public abstract void readCashCounts( String[] paramArrayOfString, boolean[] paramArrayOfBoolean ) throws JposException;
}
