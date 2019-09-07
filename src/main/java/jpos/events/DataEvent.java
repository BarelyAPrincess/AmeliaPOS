package jpos.events;

public class DataEvent extends JposEvent
{
	protected int status;

	public DataEvent( Object paramObject, int paramInt )
	{
		super( paramObject );
		status = paramInt;
	}

	public int getStatus()
	{
		return status;
	}
}
