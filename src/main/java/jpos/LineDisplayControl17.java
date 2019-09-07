package jpos;

public abstract interface LineDisplayControl17 extends LineDisplayControl16
{
	public abstract boolean getCapBitmap() throws JposException;

	public abstract boolean getCapMapCharacterSet() throws JposException;

	public abstract boolean getCapScreenMode() throws JposException;

	public abstract boolean getMapCharacterSet() throws JposException;

	public abstract void setMapCharacterSet( boolean paramBoolean ) throws JposException;

	public abstract int getMaximumX() throws JposException;

	public abstract int getMaximumY() throws JposException;

	public abstract int getScreenMode() throws JposException;

	public abstract void setScreenMode( int paramInt ) throws JposException;

	public abstract String getScreenModeList() throws JposException;

	public abstract void displayBitmap( String paramString, int paramInt1, int paramInt2, int paramInt3 ) throws JposException;

	public abstract void setBitmap( int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4 ) throws JposException;
}
