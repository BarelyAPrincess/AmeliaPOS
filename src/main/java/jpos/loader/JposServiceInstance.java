package jpos.loader;

import jpos.JposException;

public abstract interface JposServiceInstance
{
	public abstract void deleteInstance() throws JposException;
}
