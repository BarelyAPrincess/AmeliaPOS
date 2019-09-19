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

public abstract interface POSPowerService15 extends BaseService, JposServiceInstance
{
	public abstract boolean getCapFanAlarm() throws JposException;

	public abstract boolean getCapHeatAlarm() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapQuickCharge() throws JposException;

	public abstract boolean getCapShutdownPOS() throws JposException;

	public abstract int getCapUPSChargeState() throws JposException;

	public abstract int getEnforcedShutdownDelayTime() throws JposException;

	public abstract void setEnforcedShutdownDelayTime( int paramInt ) throws JposException;

	public abstract int getPowerFailDelayTime() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract boolean getQuickChargeMode() throws JposException;

	public abstract int getQuickChargeTime() throws JposException;

	public abstract int getUPSChargeState() throws JposException;

	public abstract void shutdownPOS() throws JposException;
}
