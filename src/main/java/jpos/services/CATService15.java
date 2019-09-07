package jpos.services;

import jpos.JposException;
import jpos.loader.JposServiceInstance;

public abstract interface CATService15 extends CATService14, JposServiceInstance
{
	public abstract int getPaymentMedia() throws JposException;

	public abstract void setPaymentMedia( int paramInt ) throws JposException;
}
