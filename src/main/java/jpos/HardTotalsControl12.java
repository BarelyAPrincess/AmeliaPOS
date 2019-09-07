package jpos;

import jpos.events.DirectIOListener;

public abstract interface HardTotalsControl12 extends BaseControl
{
	public abstract boolean getCapErrorDetection() throws JposException;

	public abstract boolean getCapSingleFile() throws JposException;

	public abstract boolean getCapTransactions() throws JposException;

	public abstract int getFreeData() throws JposException;

	public abstract int getNumberOfFiles() throws JposException;

	public abstract int getTotalsSize() throws JposException;

	public abstract boolean getTransactionInProgress() throws JposException;

	public abstract void beginTrans() throws JposException;

	public abstract void claimFile( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void commitTrans() throws JposException;

	public abstract void create( String paramString, int[] paramArrayOfInt, int paramInt, boolean paramBoolean ) throws JposException;

	public abstract void delete( String paramString ) throws JposException;

	public abstract void find( String paramString, int[] paramArrayOfInt1, int[] paramArrayOfInt2 ) throws JposException;

	public abstract void findByIndex( int paramInt, String[] paramArrayOfString ) throws JposException;

	public abstract void read( int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3 ) throws JposException;

	public abstract void recalculateValidationData( int paramInt ) throws JposException;

	public abstract void releaseFile( int paramInt ) throws JposException;

	public abstract void rename( int paramInt, String paramString ) throws JposException;

	public abstract void rollback() throws JposException;

	public abstract void setAll( int paramInt, byte paramByte ) throws JposException;

	public abstract void validateData( int paramInt ) throws JposException;

	public abstract void write( int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3 ) throws JposException;

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );
}
