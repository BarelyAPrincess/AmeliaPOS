package jpos.events;

import java.util.EventListener;

public abstract interface ErrorListener extends EventListener
{
	public abstract void errorOccurred( ErrorEvent paramErrorEvent );
}
