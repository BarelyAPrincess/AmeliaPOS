package jpos.services;

import jpos.JposException;

public abstract interface POSPrinterService113 extends POSPrinterService112
{
	public abstract int getCapRecRuledLine() throws JposException;

	public abstract int getCapSlpRuledLine() throws JposException;

	public abstract void drawRuledLine( int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5 ) throws JposException;
}
