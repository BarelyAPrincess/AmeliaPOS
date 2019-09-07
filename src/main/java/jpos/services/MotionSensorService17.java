package jpos.services;

import jpos.JposException;
import jpos.loader.JposServiceInstance;

public abstract interface MotionSensorService17 extends BaseService, JposServiceInstance
{
	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getMotion() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract int getTimeout() throws JposException;

	public abstract void setTimeout( int paramInt ) throws JposException;

	public abstract void waitForMotion( int paramInt ) throws JposException;
}
