package jpos;

public abstract interface FiscalPrinterControl112 extends FiscalPrinterControl111
{
	public abstract void printRecItemRefund( String paramString1, long paramLong1, int paramInt1, int paramInt2, long paramLong2, String paramString2 ) throws JposException;

	public abstract void printRecItemRefundVoid( String paramString1, long paramLong1, int paramInt1, int paramInt2, long paramLong2, String paramString2 ) throws JposException;
}
