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

public abstract interface CashChangerConst
{
	public static final int CHAN_STATUS_OK = 0;
	public static final int CHAN_STATUS_EMPTY = 11;
	public static final int CHAN_STATUS_NEAREMPTY = 12;
	public static final int CHAN_STATUS_EMPTYOK = 13;
	public static final int CHAN_STATUS_FULL = 21;
	public static final int CHAN_STATUS_NEARFULL = 22;
	public static final int CHAN_STATUS_FULLOK = 23;
	public static final int CHAN_STATUS_JAM = 31;
	public static final int CHAN_STATUS_JAMOK = 32;
	public static final int CHAN_STATUS_ASYNC = 91;
	public static final int CHAN_STATUS_DEPOSIT_START = 1;
	public static final int CHAN_STATUS_DEPOSIT_END = 2;
	public static final int CHAN_STATUS_DEPOSIT_NONE = 3;
	public static final int CHAN_STATUS_DEPOSIT_COUNT = 4;
	public static final int CHAN_STATUS_DEPOSIT_JAM = 5;
	public static final int CHAN_DEPOSIT_CHANGE = 1;
	public static final int CHAN_DEPOSIT_NOCHANGE = 2;
	public static final int CHAN_DEPOSIT_REPAY = 3;
	public static final int CHAN_DEPOSIT_PAUSE = 11;
	public static final int CHAN_DEPOSIT_RESTART = 12;
	public static final int JPOS_ECHAN_OVERDISPENSE = 201;
}
