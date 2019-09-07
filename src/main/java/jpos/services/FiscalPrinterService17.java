package jpos.services;

import jpos.JposException;

public abstract interface FiscalPrinterService17 extends FiscalPrinterService16
{
	public abstract int getAmountDecimalPlaces() throws JposException;
}
