package jpos;

public abstract interface MSRControl15 extends MSRControl14
{
	public abstract boolean getCapTransmitSentinels() throws JposException;

	public abstract byte[] getTrack4Data() throws JposException;

	public abstract boolean getTransmitSentinels() throws JposException;

	public abstract void setTransmitSentinels( boolean paramBoolean ) throws JposException;
}
