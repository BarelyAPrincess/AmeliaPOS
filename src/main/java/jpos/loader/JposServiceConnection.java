package jpos.loader;

import jpos.JposException;

public abstract interface JposServiceConnection
{
	public abstract JposServiceInstance getService();

	public abstract String getLogicalName();

	public abstract void connect() throws JposException;

	public abstract void disconnect() throws JposException;
}
