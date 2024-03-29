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

public abstract interface RemoteOrderDisplayConst
{
	public static final int ROD_UID_1 = 1;
	public static final int ROD_UID_2 = 2;
	public static final int ROD_UID_3 = 4;
	public static final int ROD_UID_4 = 8;
	public static final int ROD_UID_5 = 16;
	public static final int ROD_UID_6 = 32;
	public static final int ROD_UID_7 = 64;
	public static final int ROD_UID_8 = 128;
	public static final int ROD_UID_9 = 256;
	public static final int ROD_UID_10 = 512;
	public static final int ROD_UID_11 = 1024;
	public static final int ROD_UID_12 = 2048;
	public static final int ROD_UID_13 = 4096;
	public static final int ROD_UID_14 = 8192;
	public static final int ROD_UID_15 = 16384;
	public static final int ROD_UID_16 = 32768;
	public static final int ROD_UID_17 = 65536;
	public static final int ROD_UID_18 = 131072;
	public static final int ROD_UID_19 = 262144;
	public static final int ROD_UID_20 = 524288;
	public static final int ROD_UID_21 = 1048576;
	public static final int ROD_UID_22 = 2097152;
	public static final int ROD_UID_23 = 4194304;
	public static final int ROD_UID_24 = 8388608;
	public static final int ROD_UID_25 = 16777216;
	public static final int ROD_UID_26 = 33554432;
	public static final int ROD_UID_27 = 67108864;
	public static final int ROD_UID_28 = 134217728;
	public static final int ROD_UID_29 = 268435456;
	public static final int ROD_UID_30 = 536870912;
	public static final int ROD_UID_31 = 1073741824;
	public static final int ROD_UID_32 = Integer.MIN_VALUE;
	public static final int ROD_ATTR_BLINK = 128;
	public static final int ROD_ATTR_BG_BLACK = 0;
	public static final int ROD_ATTR_BG_BLUE = 16;
	public static final int ROD_ATTR_BG_GREEN = 32;
	public static final int ROD_ATTR_BG_CYAN = 48;
	public static final int ROD_ATTR_BG_RED = 64;
	public static final int ROD_ATTR_BG_MAGENTA = 80;
	public static final int ROD_ATTR_BG_BROWN = 96;
	public static final int ROD_ATTR_BG_GRAY = 112;
	public static final int ROD_ATTR_INTENSITY = 8;
	public static final int ROD_ATTR_FG_BLACK = 0;
	public static final int ROD_ATTR_FG_BLUE = 1;
	public static final int ROD_ATTR_FG_GREEN = 2;
	public static final int ROD_ATTR_FG_CYAN = 3;
	public static final int ROD_ATTR_FG_RED = 4;
	public static final int ROD_ATTR_FG_MAGENTA = 5;
	public static final int ROD_ATTR_FG_BROWN = 6;
	public static final int ROD_ATTR_FG_GRAY = 7;
	public static final int ROD_BDR_SINGLE = 1;
	public static final int ROD_BDR_DOUBLE = 2;
	public static final int ROD_BDR_SOLID = 3;
	public static final int ROD_CLK_START = 1;
	public static final int ROD_CLK_PAUSE = 2;
	public static final int ROD_CLK_RESUME = 3;
	public static final int ROD_CLK_MOVE = 4;
	public static final int ROD_CLK_STOP = 5;
	public static final int ROD_CLK_SHORT = 1;
	public static final int ROD_CLK_NORMAL = 2;
	public static final int ROD_CLK_12_LONG = 3;
	public static final int ROD_CLK_24_LONG = 4;
	public static final int ROD_CRS_LINE = 1;
	public static final int ROD_CRS_LINE_BLINK = 2;
	public static final int ROD_CRS_BLOCK = 3;
	public static final int ROD_CRS_BLOCK_BLINK = 4;
	public static final int ROD_CRS_OFF = 5;
	public static final int ROD_CS_UNICODE = 997;
	public static final int ROD_CS_ASCII = 998;
	public static final int ROD_CS_ANSI = 999;
	public static final int ROD_TD_TRANSACTION = 11;
	public static final int ROD_TD_NORMAL = 12;
	public static final int ROD_UA_SET = 1;
	public static final int ROD_UA_INTENSITY_ON = 2;
	public static final int ROD_UA_INTENSITY_OFF = 3;
	public static final int ROD_UA_REVERSE_ON = 4;
	public static final int ROD_UA_REVERSE_OFF = 5;
	public static final int ROD_UA_BLINK_ON = 6;
	public static final int ROD_UA_BLINK_OFF = 7;
	public static final int ROD_DE_TOUCH_UP = 1;
	public static final int ROD_DE_TOUCH_DOWN = 2;
	public static final int ROD_DE_TOUCH_MOVE = 4;
	public static final int JPOS_EROD_BADCLK = 201;
	public static final int JPOS_EROD_NOCLOCKS = 202;
	public static final int JPOS_EROD_NOREGION = 203;
	public static final int JPOS_EROD_NOBUFFERS = 204;
	public static final int JPOS_EROD_NOROOM = 205;
}
