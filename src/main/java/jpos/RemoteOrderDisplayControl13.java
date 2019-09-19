/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos;

import jpos.events.DataListener;
import jpos.events.DirectIOListener;
import jpos.events.ErrorListener;
import jpos.events.OutputCompleteListener;
import jpos.events.StatusUpdateListener;

public abstract interface RemoteOrderDisplayControl13 extends BaseControl
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

	public abstract void addDataListener( DataListener paramDataListener );

	public abstract void removeDataListener( DataListener paramDataListener );

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addErrorListener( ErrorListener paramErrorListener );

	public abstract void removeErrorListener( ErrorListener paramErrorListener );

	public abstract void addOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener );

	public abstract void removeOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
