package jpos;

public abstract interface PINPadControl15 extends PINPadControl14
{
	public abstract byte[] getTrack4Data() throws JposException;

	public abstract void setTrack4Data( byte[] paramArrayOfByte ) throws JposException;
}
