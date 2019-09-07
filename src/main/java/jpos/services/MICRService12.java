package jpos.services;

import jpos.JposException;

public abstract interface MICRService12 extends BaseService
{
	public abstract boolean getCapValidationDevice() throws JposException;

	public abstract boolean getAutoDisable() throws JposException;

	public abstract void setAutoDisable( boolean paramBoolean ) throws JposException;

	public abstract String getAccountNumber() throws JposException;

	public abstract String getAmount() throws JposException;

	public abstract String getBankNumber() throws JposException;

	public abstract int getCheckType() throws JposException;

	public abstract int getCountryCode() throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract String getEPC() throws JposException;

	public abstract String getRawData() throws JposException;

	public abstract String getSerialNumber() throws JposException;

	public abstract String getTransitNumber() throws JposException;

	public abstract void beginInsertion( int paramInt ) throws JposException;

	public abstract void beginRemoval( int paramInt ) throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void endInsertion() throws JposException;

	public abstract void endRemoval() throws JposException;
}
