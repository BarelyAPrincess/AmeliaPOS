package jpos.services;

import jpos.JposException;

public abstract interface BaseService
{
	public abstract String getCheckHealthText() throws JposException;

	public abstract boolean getClaimed() throws JposException;

	public abstract boolean getDeviceEnabled() throws JposException;

	public abstract void setDeviceEnabled( boolean paramBoolean ) throws JposException;

	public abstract String getDeviceServiceDescription() throws JposException;

	public abstract int getDeviceServiceVersion() throws JposException;

	public abstract boolean getFreezeEvents() throws JposException;

	public abstract void setFreezeEvents( boolean paramBoolean ) throws JposException;

	public abstract String getPhysicalDeviceDescription() throws JposException;

	public abstract String getPhysicalDeviceName() throws JposException;

	public abstract int getState() throws JposException;

	public abstract void claim( int paramInt ) throws JposException;

	public abstract void close() throws JposException;

	public abstract void checkHealth( int paramInt ) throws JposException;

	public abstract void directIO( int paramInt, int[] paramArrayOfInt, Object paramObject ) throws JposException;

	public abstract void open( String paramString, EventCallbacks paramEventCallbacks ) throws JposException;

	public abstract void release() throws JposException;
}
