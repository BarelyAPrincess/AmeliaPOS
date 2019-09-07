package jpos.services;

import jpos.JposException;
import jpos.loader.JposServiceInstance;

public abstract interface PINPadService15 extends PINPadService14, JposServiceInstance
{
	public abstract byte[] getTrack4Data() throws JposException;

	public abstract void setTrack4Data( byte[] paramArrayOfByte ) throws JposException;
}
