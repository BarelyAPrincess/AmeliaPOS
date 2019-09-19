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

public abstract interface PointCardRWConst
{
	public static final int PCRW_CCS_ALPHA = 1;
	public static final int PCRW_CCS_ASCII = 998;
	public static final int PCRW_CCS_KANA = 10;
	public static final int PCRW_CCS_KANJI = 11;
	public static final int PCRW_CCS_UNICODE = 997;
	public static final int PCRW_CS_UNICODE = 997;
	public static final int PCRW_CS_ASCII = 998;
	public static final int PCRW_CS_ANSI = 999;
	public static final int PCRW_STATE_NOCARD = 1;
	public static final int PCRW_STATE_REMAINING = 2;
	public static final int PCRW_STATE_INRW = 3;
	public static final int PCRW_TRACK1 = 1;
	public static final int PCRW_TRACK2 = 2;
	public static final int PCRW_TRACK3 = 4;
	public static final int PCRW_TRACK4 = 8;
	public static final int PCRW_TRACK5 = 16;
	public static final int PCRW_TRACK6 = 32;
	public static final int PCRW_MM_DOTS = 1;
	public static final int PCRW_MM_TWIPS = 2;
	public static final int PCRW_MM_ENGLISH = 3;
	public static final int PCRW_MM_METRIC = 4;
	public static final int PCRW_RP_NORMAL = 1;
	public static final int PCRW_RP_RIGHT90 = 257;
	public static final int PCRW_RP_LEFT90 = 258;
	public static final int PCRW_RP_ROTATE180 = 259;
	public static final int PCRW_SUE_STATE_NOCARD = 1;
	public static final int PCRW_SUE_STATE_REMAINING = 2;
	public static final int PCRW_SUE_STATE_INRW = 3;
	public static final int PCRW_SUE_NOCARD = 1;
	public static final int PCRW_SUE_REMAINING = 2;
	public static final int PCRW_SUE_INRW = 3;
	public static final int JPOS_EPCRW_READ = 201;
	public static final int JPOS_EPCRW_WRITE = 202;
	public static final int JPOS_EPCRW_JAM = 203;
	public static final int JPOS_EPCRW_MOTOR = 204;
	public static final int JPOS_EPCRW_COVER = 205;
	public static final int JPOS_EPCRW_PRINTER = 206;
	public static final int JPOS_EPCRW_RELEASE = 207;
	public static final int JPOS_EPCRW_DISPLAY = 208;
	public static final int JPOS_EPCRW_NOCARD = 209;
	public static final int JPOS_EPCRW_START = 210;
	public static final int JPOS_EPCRW_END = 211;
	public static final int JPOS_EPCRW_PARITY = 212;
	public static final int JPOS_EPCRW_ENCODE = 213;
	public static final int JPOS_EPCRW_LRC = 214;
	public static final int JPOS_EPCRW_VERIFY = 215;
}
