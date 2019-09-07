package jpos.services;

import jpos.JposException;

public abstract interface POSPrinterService19 extends POSPrinterService18
{
	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapConcurrentPageMode() throws JposException;

	public abstract boolean getCapRecPageMode() throws JposException;

	public abstract boolean getCapSlpPageMode() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract String getPageModeArea() throws JposException;

	public abstract int getPageModeDescriptor() throws JposException;

	public abstract int getPageModeHorizontalPosition() throws JposException;

	public abstract void setPageModeHorizontalPosition( int paramInt ) throws JposException;

	public abstract String getPageModePrintArea() throws JposException;

	public abstract void setPageModePrintArea( String paramString ) throws JposException;

	public abstract int getPageModePrintDirection() throws JposException;

	public abstract void setPageModePrintDirection( int paramInt ) throws JposException;

	public abstract int getPageModeStation() throws JposException;

	public abstract void setPageModeStation( int paramInt ) throws JposException;

	public abstract int getPageModeVerticalPosition() throws JposException;

	public abstract void setPageModeVerticalPosition( int paramInt ) throws JposException;

	public abstract void clearPrintArea() throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void pageModePrint( int paramInt ) throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;
}
