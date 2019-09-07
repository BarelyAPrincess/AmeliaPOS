package jpos.services;

import jpos.JposException;

public abstract interface ScaleService19 extends ScaleService18
{
	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapStatusUpdate() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract int getScaleLiveWeight() throws JposException;

	public abstract int getStatusNotify() throws JposException;

	public abstract void setStatusNotify( int paramInt ) throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;
}
