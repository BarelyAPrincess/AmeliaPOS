package jpos;

public abstract interface FiscalPrinterControl111 extends FiscalPrinterControl110
{
	public abstract boolean getCapPositiveSubtotalAdjustment() throws JposException;

	public abstract void printRecItemVoid( String paramString1, long paramLong1, int paramInt1, int paramInt2, long paramLong2, String paramString2 ) throws JposException;

	public abstract void printRecItemAdjustmentVoid( int paramInt1, String paramString, long paramLong, int paramInt2 ) throws JposException;
}
