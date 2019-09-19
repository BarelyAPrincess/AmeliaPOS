/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.services;

import jpos.JposException;
import jpos.loader.JposServiceInstance;

public abstract interface PointCardRWService15 extends BaseService, JposServiceInstance
{
	public abstract boolean getCapBold() throws JposException;

	public abstract int getCapCardEntranceSensor() throws JposException;

	public abstract int getCapCharacterSet() throws JposException;

	public abstract boolean getCapCleanCard() throws JposException;

	public abstract boolean getCapClearPrint() throws JposException;

	public abstract boolean getCapDhigh() throws JposException;

	public abstract boolean getCapDwide() throws JposException;

	public abstract boolean getCapDwideDhigh() throws JposException;

	public abstract boolean getCapItalic() throws JposException;

	public abstract boolean getCapLeft90() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapPrint() throws JposException;

	public abstract boolean getCapPrintMode() throws JposException;

	public abstract boolean getCapRight90() throws JposException;

	public abstract boolean getCapRotate180() throws JposException;

	public abstract int getCapTracksToRead() throws JposException;

	public abstract int getCapTracksToWrite() throws JposException;

	public abstract int getCardState() throws JposException;

	public abstract int getCharacterSet() throws JposException;

	public abstract void setCharacterSet( int paramInt ) throws JposException;

	public abstract String getCharacterSetList() throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract String getFontTypeFaceList() throws JposException;

	public abstract int getLineChars() throws JposException;

	public abstract void setLineChars( int paramInt ) throws JposException;

	public abstract String getLineCharsList() throws JposException;

	public abstract int getLineHeight() throws JposException;

	public abstract void setLineHeight( int paramInt ) throws JposException;

	public abstract int getLineSpacing() throws JposException;

	public abstract void setLineSpacing( int paramInt ) throws JposException;

	public abstract int getLineWidth() throws JposException;

	public abstract int getMapMode() throws JposException;

	public abstract void setMapMode( int paramInt ) throws JposException;

	public abstract int getMaxLines() throws JposException;

	public abstract int getOutputID() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract int getPrintHeight() throws JposException;

	public abstract int getReadState1() throws JposException;

	public abstract int getReadState2() throws JposException;

	public abstract int getRecvLength1() throws JposException;

	public abstract int getRecvLength2() throws JposException;

	public abstract int getSidewaysMaxChars() throws JposException;

	public abstract int getSidewaysMaxLines() throws JposException;

	public abstract int getTracksToRead() throws JposException;

	public abstract void setTracksToRead( int paramInt ) throws JposException;

	public abstract int getTracksToWrite() throws JposException;

	public abstract void setTracksToWrite( int paramInt ) throws JposException;

	public abstract String getTrack1Data() throws JposException;

	public abstract String getTrack2Data() throws JposException;

	public abstract String getTrack3Data() throws JposException;

	public abstract String getTrack4Data() throws JposException;

	public abstract String getTrack5Data() throws JposException;

	public abstract String getTrack6Data() throws JposException;

	public abstract int getWriteState1() throws JposException;

	public abstract int getWriteState2() throws JposException;

	public abstract String getWrite1Data() throws JposException;

	public abstract void setWrite1Data( String paramString ) throws JposException;

	public abstract String getWrite2Data() throws JposException;

	public abstract void setWrite2Data( String paramString ) throws JposException;

	public abstract String getWrite3Data() throws JposException;

	public abstract void setWrite3Data( String paramString ) throws JposException;

	public abstract String getWrite4Data() throws JposException;

	public abstract void setWrite4Data( String paramString ) throws JposException;

	public abstract String getWrite5Data() throws JposException;

	public abstract void setWrite5Data( String paramString ) throws JposException;

	public abstract String getWrite6Data() throws JposException;

	public abstract void setWrite6Data( String paramString ) throws JposException;

	public abstract void beginInsertion( int paramInt ) throws JposException;

	public abstract void beginRemoval( int paramInt ) throws JposException;

	public abstract void cleanCard() throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void clearPrintWrite( int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5 ) throws JposException;

	public abstract void endInsertion() throws JposException;

	public abstract void endRemoval() throws JposException;

	public abstract void printWrite( int paramInt1, int paramInt2, int paramInt3, String paramString ) throws JposException;

	public abstract void rotatePrint( int paramInt ) throws JposException;

	public abstract void validateData( String paramString ) throws JposException;
}
