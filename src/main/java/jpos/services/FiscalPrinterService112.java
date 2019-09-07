package jpos.services;

import jpos.JposException;

public abstract interface FiscalPrinterService112 extends FiscalPrinterService111
{
	public abstract void printRecItemRefund( String paramString1, long paramLong1, int paramInt1, int paramInt2, long paramLong2, String paramString2 ) throws JposException;

	public abstract void printRecItemRefundVoid( String paramString1, long paramLong1, int paramInt1, int paramInt2, long paramLong2, String paramString2 ) throws JposException;
}
