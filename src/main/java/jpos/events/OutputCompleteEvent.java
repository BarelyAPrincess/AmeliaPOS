package jpos.events;

public class OutputCompleteEvent extends JposEvent
{
	protected int outputID;

	public OutputCompleteEvent( Object paramObject, int paramInt )
	{
		super( paramObject );
		outputID = paramInt;
	}

	public int getOutputID()
	{
		return outputID;
	}
}
