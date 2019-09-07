package jpos.services;

import jpos.JposException;

public abstract interface ToneIndicatorService12 extends BaseService
{
	public abstract boolean getCapPitch() throws JposException;

	public abstract boolean getCapVolume() throws JposException;

	public abstract boolean getAsyncMode() throws JposException;

	public abstract void setAsyncMode( boolean paramBoolean ) throws JposException;

	public abstract int getInterToneWait() throws JposException;

	public abstract void setInterToneWait( int paramInt ) throws JposException;

	public abstract int getOutputID() throws JposException;

	public abstract int getTone1Duration() throws JposException;

	public abstract void setTone1Duration( int paramInt ) throws JposException;

	public abstract int getTone1Pitch() throws JposException;

	public abstract void setTone1Pitch( int paramInt ) throws JposException;

	public abstract int getTone1Volume() throws JposException;

	public abstract void setTone1Volume( int paramInt ) throws JposException;

	public abstract int getTone2Duration() throws JposException;

	public abstract void setTone2Duration( int paramInt ) throws JposException;

	public abstract int getTone2Pitch() throws JposException;

	public abstract void setTone2Pitch( int paramInt ) throws JposException;

	public abstract int getTone2Volume() throws JposException;

	public abstract void setTone2Volume( int paramInt ) throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void sound( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void soundImmediate() throws JposException;
}
