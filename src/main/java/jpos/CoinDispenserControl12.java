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

import jpos.events.DirectIOListener;
import jpos.events.StatusUpdateListener;

public abstract interface CoinDispenserControl12 extends BaseControl
{
	public abstract boolean getCapEmptySensor() throws JposException;

	public abstract boolean getCapJamSensor() throws JposException;

	public abstract boolean getCapNearEmptySensor() throws JposException;

	public abstract int getDispenserStatus() throws JposException;

	public abstract void dispenseChange( int paramInt ) throws JposException;

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
