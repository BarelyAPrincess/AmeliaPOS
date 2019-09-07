package jpos.events;

import java.util.EventListener;

public abstract interface StatusUpdateListener extends EventListener
{
	public abstract void statusUpdateOccurred( StatusUpdateEvent paramStatusUpdateEvent );
}
