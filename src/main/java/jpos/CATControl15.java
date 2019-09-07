package jpos;

public abstract interface CATControl15 extends CATControl14
{
	public abstract int getPaymentMedia() throws JposException;

	public abstract void setPaymentMedia( int paramInt ) throws JposException;
}
