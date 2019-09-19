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

public abstract interface BillDispenserConst
{
	public static final int BDSP_STATUS_OK = 0;
	public static final int BDSP_STATUS_EMPTY = 11;
	public static final int BDSP_STATUS_NEAREMPTY = 12;
	public static final int BDSP_STATUS_EMPTYOK = 13;
	public static final int BDSP_STATUS_JAM = 31;
	public static final int BDSP_STATUS_JAMOK = 32;
	public static final int BDSP_STATUS_ASYNC = 91;
	public static final int JPOS_EBDSP_OVERDISPENSE = 201;
}
