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

public abstract interface KeylockService12 extends BaseService
{
	public abstract int getKeyPosition() throws JposException;

	public abstract int getPositionCount() throws JposException;

	public abstract void waitForKeylockChange( int paramInt1, int paramInt2 ) throws JposException;
}
