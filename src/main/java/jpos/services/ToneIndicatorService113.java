package jpos.services;

import jpos.JposException;

public abstract interface ToneIndicatorService113 extends ToneIndicatorService112
{
	public abstract int getCapMelody() throws JposException;

	public abstract int getMelodyType() throws JposException;

	public abstract void setMelodyType( int paramInt ) throws JposException;

	public abstract int getMelodyVolume() throws JposException;

	public abstract void setMelodyVolume( int paramInt ) throws JposException;
}
