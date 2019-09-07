package jpos;

public abstract interface CashChangerControl111 extends CashChangerControl110
{
	public abstract boolean getCapJamSensor() throws JposException;

	public abstract boolean getCapRealTimeData() throws JposException;

	public abstract int getCurrentService() throws JposException;

	public abstract void setCurrentService( int paramInt ) throws JposException;

	public abstract boolean getRealTimeDataEnabled() throws JposException;

	public abstract void setRealTimeDataEnabled( boolean paramBoolean ) throws JposException;

	public abstract int getServiceCount() throws JposException;

	public abstract int getServiceIndex() throws JposException;

	public abstract void adjustCashCounts( String paramString ) throws JposException;
}
