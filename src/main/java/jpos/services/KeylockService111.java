package jpos.services;

import jpos.JposException;

public abstract interface KeylockService111 extends KeylockService110
{
	public abstract int getCapKeylockType() throws JposException;

	public abstract byte[] getElectronicKeyValue() throws JposException;
}
