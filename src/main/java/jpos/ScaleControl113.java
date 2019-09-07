package jpos;

public abstract interface ScaleControl113 extends ScaleControl112
{
	public abstract boolean getZeroValid() throws JposException;

	public abstract void setZeroValid( boolean paramBoolean ) throws JposException;
}
