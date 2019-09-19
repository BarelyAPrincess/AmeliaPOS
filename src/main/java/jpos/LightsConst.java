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

public abstract interface LightsConst
{
	public static final int LGT_ALARM_NOALARM = 1;
	public static final int LGT_ALARM_SLOW = 16;
	public static final int LGT_ALARM_MEDIUM = 32;
	public static final int LGT_ALARM_FAST = 64;
	public static final int LGT_ALARM_CUSTOM1 = 65536;
	public static final int LGT_ALARM_CUSTOM2 = 131072;
	public static final int LGT_COLOR_PRIMARY = 1;
	public static final int LGT_COLOR_CUSTOM1 = 65536;
	public static final int LGT_COLOR_CUSTOM2 = 131072;
	public static final int LGT_COLOR_CUSTOM3 = 262144;
	public static final int LGT_COLOR_CUSTOM4 = 524288;
	public static final int LGT_COLOR_CUSTOM5 = 1048576;
}
