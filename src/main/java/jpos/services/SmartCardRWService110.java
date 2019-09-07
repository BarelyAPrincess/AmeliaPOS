package jpos.services;

import jpos.JposException;

public abstract interface SmartCardRWService110 extends SmartCardRWService19
{
	public abstract void clearInputProperties() throws JposException;
}
