package jpos.events;

public class TransitionEvent extends JposEvent
{
	protected int eventNumber;
	protected int data;
	protected String string;

	public TransitionEvent( Object paramObject, int paramInt1, int paramInt2, String paramString )
	{
		super( paramObject );
		eventNumber = paramInt1;
		data = paramInt2;
		string = paramString;
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

	public String getString()
	{
		return string;
	}

	public void setString( String paramString )
	{
		string = paramString;
	}
}
