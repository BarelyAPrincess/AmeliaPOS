package jpos;

public abstract interface RemoteOrderDisplayControl17 extends RemoteOrderDisplayControl16
{
	public abstract boolean getCapMapCharacterSet() throws JposException;

	public abstract boolean getMapCharacterSet() throws JposException;

	public abstract void setMapCharacterSet( boolean paramBoolean ) throws JposException;
}
