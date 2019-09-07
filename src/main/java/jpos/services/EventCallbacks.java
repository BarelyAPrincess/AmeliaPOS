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
