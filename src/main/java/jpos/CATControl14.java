package jpos;

import jpos.events.DirectIOListener;
import jpos.events.ErrorListener;
import jpos.events.OutputCompleteListener;
import jpos.events.StatusUpdateListener;

public abstract interface CATControl14 extends BaseControl
{
	public abstract boolean getCapAdditionalSecurityInformation() throws JposException;

	public abstract boolean getCapAuthorizeCompletion() throws JposException;

	public abstract boolean getCapAuthorizePreSales() throws JposException;

	public abstract boolean getCapAuthorizeRefund() throws JposException;

	public abstract boolean getCapAuthorizeVoid() throws JposException;

	public abstract boolean getCapAuthorizeVoidPreSales() throws JposException;

	public abstract boolean getCapCenterResultCode() throws JposException;

	public abstract boolean getCapCheckCard() throws JposException;

	public abstract int getCapDailyLog() throws JposException;

	public abstract boolean getCapInstallments() throws JposException;

	public abstract boolean getCapPaymentDetail() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapTaxOthers() throws JposException;

	public abstract boolean getCapTransactionNumber() throws JposException;

	public abstract boolean getCapTrainingMode() throws JposException;

	public abstract String getAccountNumber() throws JposException;

	public abstract String getAdditionalSecurityInformation() throws JposException;

	public abstract void setAdditionalSecurityInformation( String paramString ) throws JposException;

	public abstract String getApprovalCode() throws JposException;

	public abstract boolean getAsyncMode() throws JposException;

	public abstract void setAsyncMode( boolean paramBoolean ) throws JposException;

	public abstract String getCardCompanyID() throws JposException;

	public abstract String getCenterResultCode() throws JposException;

	public abstract String getDailyLog() throws JposException;

	public abstract int getPaymentCondition() throws JposException;

	public abstract String getPaymentDetail() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract int getSequenceNumber() throws JposException;

	public abstract String getSlipNumber() throws JposException;

	public abstract boolean getTrainingMode() throws JposException;

	public abstract void setTrainingMode( boolean paramBoolean ) throws JposException;

	public abstract String getTransactionNumber() throws JposException;

	public abstract String getTransactionType() throws JposException;

	public abstract void accessDailyLog( int paramInt1, int paramInt2, int paramInt3 ) throws JposException;

	public abstract void authorizeCompletion( int paramInt1, long paramLong1, long paramLong2, int paramInt2 ) throws JposException;

	public abstract void authorizePreSales( int paramInt1, long paramLong1, long paramLong2, int paramInt2 ) throws JposException;

	public abstract void authorizeRefund( int paramInt1, long paramLong1, long paramLong2, int paramInt2 ) throws JposException;

	public abstract void authorizeSales( int paramInt1, long paramLong1, long paramLong2, int paramInt2 ) throws JposException;

	public abstract void authorizeVoid( int paramInt1, long paramLong1, long paramLong2, int paramInt2 ) throws JposException;

	public abstract void authorizeVoidPreSales( int paramInt1, long paramLong1, long paramLong2, int paramInt2 ) throws JposException;

	public abstract void checkCard( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addErrorListener( ErrorListener paramErrorListener );

	public abstract void removeErrorListener( ErrorListener paramErrorListener );

	public abstract void addOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener );

	public abstract void removeOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
