package jpos;

public abstract interface KeylockControl111 extends KeylockControl110
{
	public abstract int getCapKeylockType() throws JposException;

	public abstract byte[] getElectronicKeyValue() throws JposException;
}
