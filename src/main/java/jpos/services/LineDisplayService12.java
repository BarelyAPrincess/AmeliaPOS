package jpos.services;

import jpos.JposException;

public abstract interface LineDisplayService12 extends BaseService
{
	public abstract int getCapBlink() throws JposException;

	public abstract boolean getCapBrightness() throws JposException;

	public abstract int getCapCharacterSet() throws JposException;

	public abstract boolean getCapDescriptors() throws JposException;

	public abstract boolean getCapHMarquee() throws JposException;

	public abstract boolean getCapICharWait() throws JposException;

	public abstract boolean getCapVMarquee() throws JposException;

	public abstract int getCharacterSet() throws JposException;

	public abstract void setCharacterSet( int paramInt ) throws JposException;

	public abstract String getCharacterSetList() throws JposException;

	public abstract int getColumns() throws JposException;

	public abstract int getCurrentWindow() throws JposException;

	public abstract void setCurrentWindow( int paramInt ) throws JposException;

	public abstract int getCursorColumn() throws JposException;

	public abstract void setCursorColumn( int paramInt ) throws JposException;

	public abstract int getCursorRow() throws JposException;

	public abstract void setCursorRow( int paramInt ) throws JposException;

	public abstract boolean getCursorUpdate() throws JposException;

	public abstract void setCursorUpdate( boolean paramBoolean ) throws JposException;

	public abstract int getDeviceBrightness() throws JposException;

	public abstract void setDeviceBrightness( int paramInt ) throws JposException;

	public abstract int getDeviceColumns() throws JposException;

	public abstract int getDeviceDescriptors() throws JposException;

	public abstract int getDeviceRows() throws JposException;

	public abstract int getDeviceWindows() throws JposException;

	public abstract int getInterCharacterWait() throws JposException;

	public abstract void setInterCharacterWait( int paramInt ) throws JposException;

	public abstract int getMarqueeFormat() throws JposException;

	public abstract void setMarqueeFormat( int paramInt ) throws JposException;

	public abstract int getMarqueeRepeatWait() throws JposException;

	public abstract void setMarqueeRepeatWait( int paramInt ) throws JposException;

	public abstract int getMarqueeType() throws JposException;

	public abstract void setMarqueeType( int paramInt ) throws JposException;

	public abstract int getMarqueeUnitWait() throws JposException;

	public abstract void setMarqueeUnitWait( int paramInt ) throws JposException;

	public abstract int getRows() throws JposException;

	public abstract void clearDescriptors() throws JposException;

	public abstract void clearText() throws JposException;

	public abstract void createWindow( int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6 ) throws JposException;

	public abstract void destroyWindow() throws JposException;

	public abstract void displayText( String paramString, int paramInt ) throws JposException;

	public abstract void displayTextAt( int paramInt1, int paramInt2, String paramString, int paramInt3 ) throws JposException;

	public abstract void refreshWindow( int paramInt ) throws JposException;

	public abstract void scrollText( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void setDescriptor( int paramInt1, int paramInt2 ) throws JposException;
}
