package jpos.events;

import java.util.EventListener;

public abstract interface OutputCompleteListener extends EventListener
{
	public abstract void outputCompleteOccurred( OutputCompleteEvent paramOutputCompleteEvent );
}
