package jpos.services;

import jpos.JposException;

public abstract interface SignatureCaptureService13 extends SignatureCaptureService12
{
	public abstract int getCapPowerReporting() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;
}
