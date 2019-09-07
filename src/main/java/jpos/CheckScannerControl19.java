package jpos;

public abstract interface CheckScannerControl19 extends CheckScannerControl18
{
	public abstract boolean getCapAutoContrast() throws JposException;

	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapContrast() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract int getContrast() throws JposException;

	public abstract void setContrast( int paramInt ) throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;
}
