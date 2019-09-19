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

public abstract interface MSRControl15 extends MSRControl14
{
	public abstract boolean getCapTransmitSentinels() throws JposException;

	public abstract byte[] getTrack4Data() throws JposException;

	public abstract boolean getTransmitSentinels() throws JposException;

	public abstract void setTransmitSentinels( boolean paramBoolean ) throws JposException;
}
