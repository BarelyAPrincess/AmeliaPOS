package jpos.loader;

import jpos.JposException;
import jpos.config.JposEntry;

public abstract interface JposServiceInstanceFactory
{
	public abstract JposServiceInstance createInstance( String paramString, JposEntry paramJposEntry ) throws JposException;
}
