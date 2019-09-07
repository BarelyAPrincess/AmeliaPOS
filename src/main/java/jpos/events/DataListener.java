package jpos.events;

import java.util.EventListener;

public abstract interface DataListener extends EventListener
{
	public abstract void dataOccurred( DataEvent paramDataEvent );
}
