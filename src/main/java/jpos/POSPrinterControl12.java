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

import jpos.events.DirectIOListener;
import jpos.events.ErrorListener;
import jpos.events.OutputCompleteListener;
import jpos.events.StatusUpdateListener;

public abstract interface POSPrinterControl12 extends BaseControl
{
	public abstract int getCapCharacterSet() throws JposException;

	public abstract boolean getCapConcurrentJrnRec() throws JposException;

	public abstract boolean getCapConcurrentJrnSlp() throws JposException;

	public abstract boolean getCapConcurrentRecSlp() throws JposException;

	public abstract boolean getCapCoverSensor() throws JposException;

	public abstract boolean getCapJrn2Color() throws JposException;

	public abstract boolean getCapJrnBold() throws JposException;

	public abstract boolean getCapJrnDhigh() throws JposException;

	public abstract boolean getCapJrnDwide() throws JposException;

	public abstract boolean getCapJrnDwideDhigh() throws JposException;

	public abstract boolean getCapJrnEmptySensor() throws JposException;

	public abstract boolean getCapJrnItalic() throws JposException;

	public abstract boolean getCapJrnNearEndSensor() throws JposException;

	public abstract boolean getCapJrnPresent() throws JposException;

	public abstract boolean getCapJrnUnderline() throws JposException;

	public abstract boolean getCapRec2Color() throws JposException;

	public abstract boolean getCapRecBarCode() throws JposException;

	public abstract boolean getCapRecBitmap() throws JposException;

	public abstract boolean getCapRecBold() throws JposException;

	public abstract boolean getCapRecDhigh() throws JposException;

	public abstract boolean getCapRecDwide() throws JposException;

	public abstract boolean getCapRecDwideDhigh() throws JposException;

	public abstract boolean getCapRecEmptySensor() throws JposException;

	public abstract boolean getCapRecItalic() throws JposException;

	public abstract boolean getCapRecLeft90() throws JposException;

	public abstract boolean getCapRecNearEndSensor() throws JposException;

	public abstract boolean getCapRecPapercut() throws JposException;

	public abstract boolean getCapRecPresent() throws JposException;

	public abstract boolean getCapRecRight90() throws JposException;

	public abstract boolean getCapRecRotate180() throws JposException;

	public abstract boolean getCapRecStamp() throws JposException;

	public abstract boolean getCapRecUnderline() throws JposException;

	public abstract boolean getCapSlp2Color() throws JposException;

	public abstract boolean getCapSlpBarCode() throws JposException;

	public abstract boolean getCapSlpBitmap() throws JposException;

	public abstract boolean getCapSlpBold() throws JposException;

	public abstract boolean getCapSlpDhigh() throws JposException;

	public abstract boolean getCapSlpDwide() throws JposException;

	public abstract boolean getCapSlpDwideDhigh() throws JposException;

	public abstract boolean getCapSlpEmptySensor() throws JposException;

	public abstract boolean getCapSlpFullslip() throws JposException;

	public abstract boolean getCapSlpItalic() throws JposException;

	public abstract boolean getCapSlpLeft90() throws JposException;

	public abstract boolean getCapSlpNearEndSensor() throws JposException;

	public abstract boolean getCapSlpPresent() throws JposException;

	public abstract boolean getCapSlpRight90() throws JposException;

	public abstract boolean getCapSlpRotate180() throws JposException;

	public abstract boolean getCapSlpUnderline() throws JposException;

	public abstract boolean getCapTransaction() throws JposException;

	public abstract boolean getAsyncMode() throws JposException;

	public abstract void setAsyncMode( boolean paramBoolean ) throws JposException;

	public abstract int getCharacterSet() throws JposException;

	public abstract void setCharacterSet( int paramInt ) throws JposException;

	public abstract String getCharacterSetList() throws JposException;

	public abstract boolean getCoverOpen() throws JposException;

	public abstract int getErrorLevel() throws JposException;

	public abstract int getErrorStation() throws JposException;

	public abstract String getErrorString() throws JposException;

	public abstract boolean getFlagWhenIdle() throws JposException;

	public abstract void setFlagWhenIdle( boolean paramBoolean ) throws JposException;

	public abstract String getFontTypefaceList() throws JposException;

	public abstract boolean getJrnEmpty() throws JposException;

	public abstract boolean getJrnLetterQuality() throws JposException;

	public abstract void setJrnLetterQuality( boolean paramBoolean ) throws JposException;

	public abstract int getJrnLineChars() throws JposException;

	public abstract void setJrnLineChars( int paramInt ) throws JposException;

	public abstract String getJrnLineCharsList() throws JposException;

	public abstract int getJrnLineHeight() throws JposException;

	public abstract void setJrnLineHeight( int paramInt ) throws JposException;

	public abstract int getJrnLineSpacing() throws JposException;

	public abstract void setJrnLineSpacing( int paramInt ) throws JposException;

	public abstract int getJrnLineWidth() throws JposException;

	public abstract boolean getJrnNearEnd() throws JposException;

	public abstract int getMapMode() throws JposException;

	public abstract void setMapMode( int paramInt ) throws JposException;

	public abstract int getOutputID() throws JposException;

	public abstract String getRecBarCodeRotationList() throws JposException;

	public abstract boolean getRecEmpty() throws JposException;

	public abstract boolean getRecLetterQuality() throws JposException;

	public abstract void setRecLetterQuality( boolean paramBoolean ) throws JposException;

	public abstract int getRecLineChars() throws JposException;

	public abstract void setRecLineChars( int paramInt ) throws JposException;

	public abstract String getRecLineCharsList() throws JposException;

	public abstract int getRecLineHeight() throws JposException;

	public abstract void setRecLineHeight( int paramInt ) throws JposException;

	public abstract int getRecLineSpacing() throws JposException;

	public abstract void setRecLineSpacing( int paramInt ) throws JposException;

	public abstract int getRecLinesToPaperCut() throws JposException;

	public abstract int getRecLineWidth() throws JposException;

	public abstract boolean getRecNearEnd() throws JposException;

	public abstract int getRecSidewaysMaxChars() throws JposException;

	public abstract int getRecSidewaysMaxLines() throws JposException;

	public abstract int getRotateSpecial() throws JposException;

	public abstract void setRotateSpecial( int paramInt ) throws JposException;

	public abstract String getSlpBarCodeRotationList() throws JposException;

	public abstract boolean getSlpEmpty() throws JposException;

	public abstract boolean getSlpLetterQuality() throws JposException;

	public abstract void setSlpLetterQuality( boolean paramBoolean ) throws JposException;

	public abstract int getSlpLineChars() throws JposException;

	public abstract void setSlpLineChars( int paramInt ) throws JposException;

	public abstract String getSlpLineCharsList() throws JposException;

	public abstract int getSlpLineHeight() throws JposException;

	public abstract void setSlpLineHeight( int paramInt ) throws JposException;

	public abstract int getSlpLinesNearEndToEnd() throws JposException;

	public abstract int getSlpLineSpacing() throws JposException;

	public abstract void setSlpLineSpacing( int paramInt ) throws JposException;

	public abstract int getSlpLineWidth() throws JposException;

	public abstract int getSlpMaxLines() throws JposException;

	public abstract boolean getSlpNearEnd() throws JposException;

	public abstract int getSlpSidewaysMaxChars() throws JposException;

	public abstract int getSlpSidewaysMaxLines() throws JposException;

	public abstract void beginInsertion( int paramInt ) throws JposException;

	public abstract void beginRemoval( int paramInt ) throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void cutPaper( int paramInt ) throws JposException;

	public abstract void endInsertion() throws JposException;

	public abstract void endRemoval() throws JposException;

	public abstract void printBarCode( int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6 ) throws JposException;

	public abstract void printBitmap( int paramInt1, String paramString, int paramInt2, int paramInt3 ) throws JposException;

	public abstract void printImmediate( int paramInt, String paramString ) throws JposException;

	public abstract void printNormal( int paramInt, String paramString ) throws JposException;

	public abstract void printTwoNormal( int paramInt, String paramString1, String paramString2 ) throws JposException;

	public abstract void rotatePrint( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void setBitmap( int paramInt1, int paramInt2, String paramString, int paramInt3, int paramInt4 ) throws JposException;

	public abstract void setLogo( int paramInt, String paramString ) throws JposException;

	public abstract void transactionPrint( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void validateData( int paramInt, String paramString ) throws JposException;

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addErrorListener( ErrorListener paramErrorListener );

	public abstract void removeErrorListener( ErrorListener paramErrorListener );

	public abstract void addOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener );

	public abstract void removeOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
