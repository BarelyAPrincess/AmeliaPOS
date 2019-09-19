/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.services;

import jpos.JposException;

public abstract interface CATService14 extends BaseService
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
}
