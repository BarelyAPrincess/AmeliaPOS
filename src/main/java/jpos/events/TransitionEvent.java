/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
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
