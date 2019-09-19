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

public abstract interface MICRConst
{
	public static final int MICR_CT_PERSONAL = 1;
	public static final int MICR_CT_BUSINESS = 2;
	public static final int MICR_CT_UNKNOWN = 99;
	public static final int MICR_CC_USA = 1;
	public static final int MICR_CC_CANADA = 2;
	public static final int MICR_CC_MEXICO = 3;
	public static final int MICR_CC_CMC7 = 4;
	public static final int MICR_CC_OTHER = 5;
	public static final int MICR_CC_UNKNOWN = 99;
	public static final int JPOS_EMICR_NOCHECK = 201;
	public static final int JPOS_EMICR_CHECK = 202;
	public static final int JPOS_EMICR_BADDATA = 203;
	public static final int JPOS_EMICR_NODATA = 204;
	public static final int JPOS_EMICR_BADSIZE = 205;
	public static final int JPOS_EMICR_JAM = 206;
	public static final int JPOS_EMICR_CHECKDIGIT = 207;
	public static final int JPOS_EMICR_COVEROPEN = 208;
}
