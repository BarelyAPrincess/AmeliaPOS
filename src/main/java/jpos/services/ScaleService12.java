package jpos.services;

import jpos.JposException;

public abstract interface ScaleService12 extends BaseService
{
	public abstract boolean getCapDisplay() throws JposException;

	public abstract int getMaximumWeight() throws JposException;

	public abstract int getWeightUnit() throws JposException;

	public abstract void readWeight( int[] paramArrayOfInt, int paramInt ) throws JposException;
}
