package jpos;

public abstract interface POSPrinterControl17 extends POSPrinterControl16
{
	public abstract boolean getCapMapCharacterSet() throws JposException;

	public abstract boolean getMapCharacterSet() throws JposException;

	public abstract void setMapCharacterSet( boolean paramBoolean ) throws JposException;

	public abstract String getRecBitmapRotationList() throws JposException;

	public abstract String getSlpBitmapRotationList() throws JposException;
}
