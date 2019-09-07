package jpos.services;

import jpos.JposException;

public abstract interface POSKeyboardService12 extends BaseService
{
	public abstract boolean getCapKeyUp() throws JposException;

	public abstract boolean getAutoDisable() throws JposException;

	public abstract void setAutoDisable( boolean paramBoolean ) throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract int getEventTypes() throws JposException;

	public abstract void setEventTypes( int paramInt ) throws JposException;

	public abstract int getPOSKeyData() throws JposException;

	public abstract int getPOSKeyEventType() throws JposException;

	public abstract void clearInput() throws JposException;
}
