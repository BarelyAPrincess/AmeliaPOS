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
import jpos.loader.JposServiceInstance;

public abstract interface CashChangerService15 extends CashChangerService14, JposServiceInstance
{
	public abstract boolean getCapDeposit() throws JposException;

	public abstract boolean getCapDepositDataEvent() throws JposException;

	public abstract boolean getCapPauseDeposit() throws JposException;

	public abstract boolean getCapRepayDeposit() throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract int getDepositAmount() throws JposException;

	public abstract String getDepositCashList() throws JposException;

	public abstract String getDepositCodeList() throws JposException;

	public abstract String getDepositCounts() throws JposException;

	public abstract int getDepositStatus() throws JposException;

	public abstract void beginDeposit() throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void endDeposit( int paramInt ) throws JposException;

	public abstract void fixDeposit() throws JposException;

	public abstract void pauseDeposit( int paramInt ) throws JposException;
}
