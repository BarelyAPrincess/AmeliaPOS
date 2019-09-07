package jpos.services;

import jpos.JposException;

public abstract interface POSPrinterService110 extends POSPrinterService19
{
	public abstract void printMemoryBitmap( int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4 ) throws JposException;
}
