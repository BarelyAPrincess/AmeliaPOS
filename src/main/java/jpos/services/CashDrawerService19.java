package jpos.services;

import jpos.JposException;

public abstract interface CashDrawerService19 extends CashDrawerService18
{
	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;
}
