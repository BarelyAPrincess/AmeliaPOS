/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
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
