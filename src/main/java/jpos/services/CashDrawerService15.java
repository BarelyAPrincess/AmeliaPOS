package jpos.services;

import jpos.JposException;
import jpos.loader.JposServiceInstance;

public abstract interface CashDrawerService15 extends CashDrawerService14, JposServiceInstance
{
	public abstract boolean getCapStatusMultiDrawerDetect() throws JposException;
}
