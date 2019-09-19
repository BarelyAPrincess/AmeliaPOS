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

import java.util.EventObject;

public abstract class JposEvent extends EventObject
{
	protected long sequenceNumber;
	private static long globalSequenceNumber = 0L;
	private long when;

	public JposEvent( Object paramObject )
	{
		super( paramObject );
		updateSequenceNumber();
		when = System.currentTimeMillis();
	}

	public final synchronized void updateSequenceNumber()
	{
		sequenceNumber = incrSequenceNumber();
	}

	public static final synchronized long incrSequenceNumber()
	{
		return ++globalSequenceNumber;
	}

	public final long getSequenceNumber()
	{
		return sequenceNumber;
	}

	public long getWhen()
	{
		return when;
	}
}
