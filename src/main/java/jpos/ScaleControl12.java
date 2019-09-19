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

public abstract interface ScaleControl12 extends BaseControl
{
	public abstract boolean getCapDisplay() throws JposException;

	public abstract int getMaximumWeight() throws JposException;

	public abstract int getWeightUnit() throws JposException;

	public abstract void readWeight( int[] paramArrayOfInt, int paramInt ) throws JposException;

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );
}
