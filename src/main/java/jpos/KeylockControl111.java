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

public abstract interface KeylockControl111 extends KeylockControl110
{
	public abstract int getCapKeylockType() throws JposException;

	public abstract byte[] getElectronicKeyValue() throws JposException;
}
