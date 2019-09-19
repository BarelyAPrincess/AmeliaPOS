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

public abstract interface PINPadConst
{
	public static final int PPAD_DISP_UNRESTRICTED = 1;
	public static final int PPAD_DISP_PINRESTRICTED = 2;
	public static final int PPAD_DISP_RESTRICTED_LIST = 3;
	public static final int PPAD_DISP_RESTRICTED_ORDER = 4;
	public static final int PPAD_DISP_NONE = 5;
	public static final int PPAD_MSG_ENTERPIN = 1;
	public static final int PPAD_MSG_PLEASEWAIT = 2;
	public static final int PPAD_MSG_ENTERVALIDPIN = 3;
	public static final int PPAD_MSG_RETRIESEXCEEDED = 4;
	public static final int PPAD_MSG_APPROVED = 5;
	public static final int PPAD_MSG_DECLINED = 6;
	public static final int PPAD_MSG_CANCELED = 7;
	public static final int PPAD_MSG_AMOUNTOK = 8;
	public static final int PPAD_MSG_NOTREADY = 9;
	public static final int PPAD_MSG_IDLE = 10;
	public static final int PPAD_MSG_SLIDE_CARD = 11;
	public static final int PPAD_MSG_INSERTCARD = 12;
	public static final int PPAD_MSG_SELECTCARDTYPE = 13;
	public static final int PPAD_LANG_NONE = 1;
	public static final int PPAD_LANG_ONE = 2;
	public static final int PPAD_LANG_PINRESTRICTED = 3;
	public static final int PPAD_LANG_UNRESTRICTED = 4;
	public static final int PPAD_TRANS_DEBIT = 1;
	public static final int PPAD_TRANS_CREDIT = 2;
	public static final int PPAD_TRANS_INQ = 3;
	public static final int PPAD_TRANS_RECONCILE = 4;
	public static final int PPAD_TRANS_ADMIN = 5;
	public static final int PPAD_EFT_NORMAL = 1;
	public static final int PPAD_EFT_ABNORMAL = 2;
	public static final int PPAD_SUCCESS = 1;
	public static final int PPAD_CANCEL = 2;
	public static final int JPOS_EPPAD_BAD_KEY = 201;
}
