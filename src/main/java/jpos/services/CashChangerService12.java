package jpos.services;

import jpos.JposException;

public abstract interface CashChangerService12 extends BaseService
{
	public abstract boolean getCapDiscrepancy() throws JposException;

	public abstract boolean getCapEmptySensor() throws JposException;

	public abstract boolean getCapFullSensor() throws JposException;

	public abstract boolean getCapNearEmptySensor() throws JposException;

	public abstract boolean getCapNearFullSensor() throws JposException;

	public abstract boolean getAsyncMode() throws JposException;

	public abstract void setAsyncMode( boolean paramBoolean ) throws JposException;

	public abstract int getAsyncResultCode() throws JposException;

	public abstract int getAsyncResultCodeExtended() throws JposException;

	public abstract String getCurrencyCashList() throws JposException;

	public abstract String getCurrencyCode() throws JposException;

	public abstract void setCurrencyCode( String paramString ) throws JposException;

	public abstract String getCurrencyCodeList() throws JposException;

	public abstract int getCurrentExit() throws JposException;

	public abstract void setCurrentExit( int paramInt ) throws JposException;

	public abstract int getDeviceExits() throws JposException;

	public abstract int getDeviceStatus() throws JposException;

	public abstract String getExitCashList() throws JposException;

	public abstract int getFullStatus() throws JposException;

	public abstract void dispenseCash( String paramString ) throws JposException;

	public abstract void dispenseChange( int paramInt ) throws JposException;

	public abstract void readCashCounts( String[] paramArrayOfString, boolean[] paramArrayOfBoolean ) throws JposException;
}
