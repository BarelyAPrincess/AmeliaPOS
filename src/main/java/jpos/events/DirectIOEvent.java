package jpos.events;

public class DirectIOEvent extends JposEvent
{
	protected int eventNumber;
	protected int data;
	protected Object object;

	public DirectIOEvent( Object paramObject1, int paramInt1, int paramInt2, Object paramObject2 )
	{
		super( paramObject1 );
		eventNumber = paramInt1;
		data = paramInt2;
		object = paramObject2;
	}

	public int getEventNumber()
	{
		return eventNumber;
	}

	public int getData()
	{
		return data;
	}

	public void setData( int paramInt )
	{
		data = paramInt;
	}

	public Object getObject()
	{
		return object;
	}

	public void setObject( Object paramObject )
	{
		object = paramObject;
	}
}
