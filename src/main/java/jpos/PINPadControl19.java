package jpos;

public abstract interface PINPadControl19 extends PINPadControl18
{
	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;
}
