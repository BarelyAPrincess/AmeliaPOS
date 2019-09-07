package jpos.services;

import jpos.JposException;

public abstract interface BumpBarService13 extends BaseService
{
	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapTone() throws JposException;

	public abstract boolean getAsyncMode() throws JposException;

	public abstract void setAsyncMode( boolean paramBoolean ) throws JposException;

	public abstract int getAutoToneDuration() throws JposException;

	public abstract void setAutoToneDuration( int paramInt ) throws JposException;

	public abstract int getAutoToneFrequency() throws JposException;

	public abstract void setAutoToneFrequency( int paramInt ) throws JposException;

	public abstract int getBumpBarDataCount() throws JposException;

	public abstract int getCurrentUnitID() throws JposException;

	public abstract void setCurrentUnitID( int paramInt ) throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract String getErrorString() throws JposException;

	public abstract int getErrorUnits() throws JposException;

	public abstract String getEventString() throws JposException;

	public abstract int getEventUnitID() throws JposException;

	public abstract int getEventUnits() throws JposException;

	public abstract int getKeys() throws JposException;

	public abstract int getOutputID() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract int getTimeout() throws JposException;

	public abstract void setTimeout( int paramInt ) throws JposException;

	public abstract int getUnitsOnline() throws JposException;

	public abstract void bumpBarSound( int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5 ) throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void setKeyTranslation( int paramInt1, int paramInt2, int paramInt3 ) throws JposException;
}
