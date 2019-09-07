package jpos.services;

import jpos.JposException;

public abstract interface RemoteOrderDisplayService13 extends BaseService
{
	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapSelectCharacterSet() throws JposException;

	public abstract boolean getCapTone() throws JposException;

	public abstract boolean getCapTouch() throws JposException;

	public abstract boolean getCapTransaction() throws JposException;

	public abstract boolean getAsyncMode() throws JposException;

	public abstract void setAsyncMode( boolean paramBoolean ) throws JposException;

	public abstract int getAutoToneDuration() throws JposException;

	public abstract void setAutoToneDuration( int paramInt ) throws JposException;

	public abstract int getAutoToneFrequency() throws JposException;

	public abstract void setAutoToneFrequency( int paramInt ) throws JposException;

	public abstract int getCharacterSet() throws JposException;

	public abstract String getCharacterSetList() throws JposException;

	public abstract int getClocks() throws JposException;

	public abstract int getCurrentUnitID() throws JposException;

	public abstract void setCurrentUnitID( int paramInt ) throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract String getErrorString() throws JposException;

	public abstract int getErrorUnits() throws JposException;

	public abstract String getEventString() throws JposException;

	public abstract int getEventType() throws JposException;

	public abstract void setEventType( int paramInt ) throws JposException;

	public abstract int getEventUnitID() throws JposException;

	public abstract int getEventUnits() throws JposException;

	public abstract int getOutputID() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract int getSystemClocks() throws JposException;

	public abstract int getSystemVideoSaveBuffers() throws JposException;

	public abstract int getTimeout() throws JposException;

	public abstract void setTimeout( int paramInt ) throws JposException;

	public abstract int getUnitsOnline() throws JposException;

	public abstract int getVideoDataCount() throws JposException;

	public abstract int getVideoMode() throws JposException;

	public abstract void setVideoMode( int paramInt ) throws JposException;

	public abstract String getVideoModesList() throws JposException;

	public abstract int getVideoSaveBuffers() throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void clearVideo( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void clearVideoRegion( int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6 ) throws JposException;

	public abstract void controlClock( int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10 ) throws JposException;

	public abstract void controlCursor( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void copyVideoRegion( int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7 ) throws JposException;

	public abstract void displayData( int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString ) throws JposException;

	public abstract void drawBox( int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7 ) throws JposException;

	public abstract void freeVideoRegion( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void resetVideo( int paramInt ) throws JposException;

	public abstract void restoreVideoRegion( int paramInt1, int paramInt2, int paramInt3, int paramInt4 ) throws JposException;

	public abstract void saveVideoRegion( int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6 ) throws JposException;

	public abstract void selectChararacterSet( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void setCursor( int paramInt1, int paramInt2, int paramInt3 ) throws JposException;

	public abstract void transactionDisplay( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void updateVideoRegionAttribute( int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7 ) throws JposException;

	public abstract void videoSound( int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5 ) throws JposException;
}
