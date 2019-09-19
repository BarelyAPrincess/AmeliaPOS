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

public abstract interface ElectronicJournalConst
{
	public static final int EJ_S_RECEIPT = 1;
	public static final int EJ_S_SLIP = 2;
	public static final int EJ_S_JOURNAL = 4;
	public static final int EJ_MT_SESSION_BEG = 1;
	public static final int EJ_MT_SESSION_END = 2;
	public static final int EJ_MT_DOCUMENT = 3;
	public static final int EJ_MT_HEAD = 4;
	public static final int EJ_MT_TAIL = 5;
	public static final int JPOS_EEJ_EXISTING = 201;
	public static final int JPOS_EEJ_MEDIUM_FULL = 202;
	public static final int JPOS_EEJ_MULTIPLE_MARKER = 203;
	public static final int JPOS_EEJ_UNINITIALIZED_MEDIUM = 204;
	public static final int JPOS_EEJ_CORRUPTED_MEDIUM = 205;
	public static final int JPOS_EEJ_UNKNOWN_DATAFORMAT = 206;
	public static final int JPOS_EEJ_NOT_ENOUGH_SPACE = 207;
	public static final int JPOS_EEJ_MULTIPLE_MARKERS = 208;
	public static final int EJ_SUE_MEDIUM_NEAR_FULL = 1;
	public static final int EJ_SUE_MEDIUM_FULL = 2;
	public static final int EJ_SUE_MEDIUM_REMOVED = 3;
	public static final int EJ_SUE_MEDIUM_INSERTED = 4;
	public static final int EJ_SUE_SUSPENDED = 5;
	public static final int EJ_SUE_IDLE = 1001;
}
