package jpos;

public abstract interface CATControl19 extends CATControl18
{
	public abstract boolean getCapCashDeposit() throws JposException;

	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapLockTerminal() throws JposException;

	public abstract boolean getCapLogStatus() throws JposException;

	public abstract boolean getCapUnlockTerminal() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract long getBalance() throws JposException;

	public abstract int getLogStatus() throws JposException;

	public abstract long getSettledAmount() throws JposException;

	public abstract void cashDeposit( int paramInt1, long paramLong, int paramInt2 ) throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void lockTerminal() throws JposException;

	public abstract void unlockTerminal() throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;
}
