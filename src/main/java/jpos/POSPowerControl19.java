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

public abstract interface POSPowerControl19 extends POSPowerControl18
{
	public abstract boolean getCapBatteryCapacityRemaining() throws JposException;

	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapRestartPOS() throws JposException;

	public abstract boolean getCapStandbyPOS() throws JposException;

	public abstract boolean getCapSuspendPOS() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract boolean getCapVariableBatteryCriticallyLowThreshold() throws JposException;

	public abstract boolean getCapVariableBatteryLowThreshold() throws JposException;

	public abstract int getBatteryCapacityRemaining() throws JposException;

	public abstract int getBatteryCriticallyLowThreshold() throws JposException;

	public abstract void setBatteryCriticallyLowThreshold( int paramInt ) throws JposException;

	public abstract int getBatteryLowThreshold() throws JposException;

	public abstract void setBatteryLowThreshold( int paramInt ) throws JposException;

	public abstract int getPowerSource() throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void restartPOS() throws JposException;

	public abstract void standbyPOS( int paramInt ) throws JposException;

	public abstract void suspendPOS( int paramInt ) throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;
}
