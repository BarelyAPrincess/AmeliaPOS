package jpos.services;

import jpos.JposException;

public abstract interface ScaleService114 extends ScaleService113
{
	public abstract boolean getCapFreezeValue() throws JposException;

	public abstract boolean getCapReadLiveWeightWithTare() throws JposException;

	public abstract boolean getCapSetPriceCalculationMode() throws JposException;

	public abstract boolean getCapSetUnitPriceWithWeightUnit() throws JposException;

	public abstract boolean getCapSpecialTare() throws JposException;

	public abstract boolean getCapTarePriority() throws JposException;

	public abstract int getMinimumWeight() throws JposException;

	public abstract void doPriceCalculating( int[] paramArrayOfInt1, int[] paramArrayOfInt2, long[] paramArrayOfLong1, long[] paramArrayOfLong2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, int[] paramArrayOfInt5, long[] paramArrayOfLong3, int paramInt ) throws JposException;

	public abstract void freezeValue( int paramInt, boolean paramBoolean ) throws JposException;

	public abstract void readLiveWeightWithTare( int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt ) throws JposException;

	public abstract void setPriceCalculationMode( int paramInt ) throws JposException;

	public abstract void setSpecialTare( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void setTarePrioity( int paramInt ) throws JposException;

	public abstract void setTarePriority( int paramInt ) throws JposException;

	public abstract void setUnitPriceWithWeightUnit( long paramLong, int paramInt1, int paramInt2, int paramInt3 ) throws JposException;
}
