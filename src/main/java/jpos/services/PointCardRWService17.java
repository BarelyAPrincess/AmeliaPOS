package jpos.services;

import jpos.JposException;

public abstract interface PointCardRWService17 extends PointCardRWService16
{
	public abstract boolean getCapMapCharacterSet() throws JposException;

	public abstract boolean getMapCharacterSet() throws JposException;

	public abstract void setMapCharacterSet( boolean paramBoolean ) throws JposException;
}
