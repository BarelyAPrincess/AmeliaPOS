/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.services;

import jpos.BaseControl;
import jpos.events.DataEvent;
import jpos.events.DirectIOEvent;
import jpos.events.ErrorEvent;
import jpos.events.OutputCompleteEvent;
import jpos.events.StatusUpdateEvent;

public abstract interface EventCallbacks
{
	public abstract void fireDataEvent( DataEvent paramDataEvent );

	public abstract void fireDirectIOEvent( DirectIOEvent paramDirectIOEvent );

	public abstract void fireErrorEvent( ErrorEvent paramErrorEvent );

	public abstract void fireOutputCompleteEvent( OutputCompleteEvent paramOutputCompleteEvent );

	public abstract void fireStatusUpdateEvent( StatusUpdateEvent paramStatusUpdateEvent );

	public abstract BaseControl getEventSource();
}
