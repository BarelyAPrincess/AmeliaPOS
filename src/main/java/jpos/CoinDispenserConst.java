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

public abstract interface CoinDispenserConst
{
	public static final int COIN_STATUS_OK = 1;
	public static final int COIN_STATUS_EMPTY = 2;
	public static final int COIN_STATUS_NEAREMPTY = 3;
	public static final int COIN_STATUS_JAM = 4;
}
