package jpos.services;

import jpos.JposException;

public abstract interface MSRService113 extends MSRService112
{
	public abstract void retrieveDeviceAuthenticationData( byte[][] paramArrayOfByte ) throws JposException;
}
