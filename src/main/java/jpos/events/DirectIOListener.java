package jpos.events;

import java.util.EventListener;

public abstract interface DirectIOListener extends EventListener
{
	public abstract void directIOOccurred( DirectIOEvent paramDirectIOEvent );
}
