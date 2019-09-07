package jpos;

import jpos.events.DirectIOListener;
import jpos.events.ErrorListener;
import jpos.events.OutputCompleteListener;

public abstract interface ToneIndicatorControl12 extends BaseControl
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

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addErrorListener( ErrorListener paramErrorListener );

	public abstract void removeErrorListener( ErrorListener paramErrorListener );

	public abstract void addOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener );

	public abstract void removeOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener );
}
