package jpos.services;

import jpos.JposException;

public abstract interface ScaleService113 extends ScaleService112
{
	public abstract boolean getZeroValid() throws JposException;

	public abstract void setZeroValid( boolean paramBoolean ) throws JposException;
}
