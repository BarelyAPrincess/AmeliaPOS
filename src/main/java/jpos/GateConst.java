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

public abstract interface GateConst
{
	public static final int GATE_GS_CLOSED = 1;
	public static final int GATE_GS_OPEN = 2;
	public static final int GATE_GS_BLOCKED = 3;
	public static final int GATE_GS_MALFUNCTION = 4;
	public static final int GATE_SUE_CLOSED = 11;
	public static final int GATE_SUE_OPEN = 12;
	public static final int GATE_SUE_BLOCKED = 13;
	public static final int GATE_SUE_MALFUNCTION = 14;
}
