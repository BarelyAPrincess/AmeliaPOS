package jpos;

public abstract interface MSRControl18 extends MSRControl17
{
	public abstract boolean getCapStatisticsReporting() throws JposException;

	public abstract boolean getCapUpdateStatistics() throws JposException;

	public abstract void resetStatistics( String paramString ) throws JposException;

	public abstract void retrieveStatistics( String[] paramArrayOfString ) throws JposException;

	public abstract void updateStatistics( String paramString ) throws JposException;
}
