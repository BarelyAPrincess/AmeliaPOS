package jpos;

public abstract interface MSRControl110 extends MSRControl19
{
	public abstract int getCapWritableTracks() throws JposException;

	public abstract int getEncodingMaxLength() throws JposException;

	public abstract int getTracksToWrite() throws JposException;

	public abstract void setTracksToWrite( int paramInt ) throws JposException;

	public abstract void clearInputProperties() throws JposException;

	public abstract void writeTracks( byte[][] paramArrayOfByte, int paramInt ) throws JposException;
}
