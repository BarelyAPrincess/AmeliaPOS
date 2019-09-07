package jpos;

public abstract interface POSPrinterControl113 extends POSPrinterControl112
{
	public abstract int getCapRecRuledLine() throws JposException;

	public abstract int getCapSlpRuledLine() throws JposException;

	public abstract void drawRuledLine( int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5 ) throws JposException;
}
