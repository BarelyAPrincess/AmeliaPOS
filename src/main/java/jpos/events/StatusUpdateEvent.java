package jpos.events;

public class StatusUpdateEvent extends JposEvent
{
	protected int status;

	public StatusUpdateEvent( Object paramObject, int paramInt )
	{
		super( paramObject );
		status = paramInt;
	}

	public int getStatus()
	{
		return status;
	}
}
