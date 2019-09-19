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

public abstract interface BaseControl
{
	public abstract String getCheckHealthText() throws JposException;

	public abstract boolean getClaimed() throws JposException;

	public abstract String getDeviceControlDescription();

	public abstract int getDeviceControlVersion();

	public abstract boolean getDeviceEnabled() throws JposException;

	public abstract void setDeviceEnabled( boolean paramBoolean ) throws JposException;

	public abstract String getDeviceServiceDescription() throws JposException;

	public abstract int getDeviceServiceVersion() throws JposException;

	public abstract boolean getFreezeEvents() throws JposException;

	public abstract void setFreezeEvents( boolean paramBoolean ) throws JposException;

	public abstract String getPhysicalDeviceDescription() throws JposException;

	public abstract String getPhysicalDeviceName() throws JposException;

	public abstract int getState();

	public abstract void claim( int paramInt ) throws JposException;

	public abstract void close() throws JposException;

	public abstract void checkHealth( int paramInt ) throws JposException;

	public abstract void directIO( int paramInt, int[] paramArrayOfInt, Object paramObject ) throws JposException;

	public abstract void open( String paramString ) throws JposException;

	public abstract void release() throws JposException;
}
