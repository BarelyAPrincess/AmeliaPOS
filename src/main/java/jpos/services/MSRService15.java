package jpos.services;

import jpos.JposException;
import jpos.loader.JposServiceInstance;

public abstract interface MSRService15 extends MSRService14, JposServiceInstance
{
	public abstract boolean getCapTransmitSentinels() throws JposException;

	public abstract byte[] getTrack4Data() throws JposException;

	public abstract boolean getTransmitSentinels() throws JposException;

	public abstract void setTransmitSentinels( boolean paramBoolean ) throws JposException;
}
