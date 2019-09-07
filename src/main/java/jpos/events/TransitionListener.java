package jpos.events;

import java.util.EventListener;

public abstract interface TransitionListener extends EventListener
{
	public abstract void transitionOccurred( TransitionEvent paramTransitionEvent );
}
