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

public abstract interface ElectronicValueRWConst
{
	public static final int EVRW_CCS_ENTRY = 1;
	public static final int EVRW_CCS_DETECT = 2;
	public static final int EVRW_CCS_CAPTURE = 4;
	public static final int EVRW_CDC_RWCONTROL = 1;
	public static final int EVRW_CDC_APPLICATIONCONTROL = 2;
	public static final int EVRW_DS_NOCARD = 1;
	public static final int EVRW_DS_DETECTED = 2;
	public static final int EVRW_DS_ENTERED = 3;
	public static final int EVRW_DS_CAPTURED = 4;
	public static final int EVRW_LS_OK = 1;
	public static final int EVRW_LS_NEARFULL = 2;
	public static final int EVRW_LS_FULL = 3;
	public static final int EVRW_PIN_ENTRY_NONE = 1;
	public static final int EVRW_PIN_ENTRY_EXTERNAL = 2;
	public static final int EVRW_PIN_ENTRY_INTERNAL = 3;
	public static final int EVRW_PIN_ENTRY_UNKNOWN = 4;
	public static final int EVRW_ST_UNSPECIFIED = 0;
	public static final int EVRW_ST_ELECTRONIC_MONEY = 1;
	public static final int EVRW_ST_POINT = 2;
	public static final int EVRW_ST_VOUCHER = 3;
	public static final int EVRW_ST_MEMBERSHIP = 4;
	public static final int EVRW_TM_FALSE = 1;
	public static final int EVRW_TM_TRUE = 2;
	public static final int EVRW_TM_UNKNOWN = 3;
	public static final int EVRW_AD_KEY = 1;
	public static final int EVRW_AD_NEGATIVE_LIST = 2;
	public static final int EVRW_AD_OTHERS = 3;
	public static final int EVRW_AL_REPORTING = 1;
	public static final int EVRW_AL_SETTLEMENT = 2;
	public static final int EVRW_BD_ANY = 1;
	public static final int EVRW_BD_SPECIFIC = 2;
	public static final int EVRW_TAG_AS_AUTHENTICATED = 1;
	public static final int EVRW_TAG_AS_UNAUTHENTICATED = 2;
	public static final int EVRW_TAG_CTT_CANCEL = 1;
	public static final int EVRW_TAG_CTT_CHARGE = 2;
	public static final int EVRW_TAG_CTT_RETURN = 3;
	public static final int EVRW_TAG_CTT_SALES = 4;
	public static final int EVRW_TAG_CM_CASH = 1;
	public static final int EVRW_TAG_CM_CREDIT = 2;
	public static final int EVRW_TAG_CM_POINT = 3;
	public static final int EVRW_TAG_NIT_ALL = 1;
	public static final int EVRW_TAG_NIT_UPDATED = 2;
	public static final int EVRW_TAG_PC_INSTALLMENT_1 = 1;
	public static final int EVRW_TAG_PC_INSTALLMENT_2 = 2;
	public static final int EVRW_TAG_PC_INSTALLMENT_3 = 3;
	public static final int EVRW_TAG_PC_BONUS_1 = 4;
	public static final int EVRW_TAG_PC_BONUS_2 = 5;
	public static final int EVRW_TAG_PC_BONUS_3 = 6;
	public static final int EVRW_TAG_PC_BONUS_4 = 7;
	public static final int EVRW_TAG_PC_BONUS_5 = 8;
	public static final int EVRW_TAG_PC_BONUS_COMBINATION_1 = 9;
	public static final int EVRW_TAG_PC_BONUS_COMBINATION_2 = 10;
	public static final int EVRW_TAG_PC_BONUS_COMBINATION_3 = 11;
	public static final int EVRW_TAG_PC_BONUS_COMBINATION_4 = 12;
	public static final int EVRW_TAG_PC_LUMP = 13;
	public static final int EVRW_TAG_PC_REVOLVING = 14;
	public static final int EVRW_TAG_PM_COMBINED = 1;
	public static final int EVRW_TAG_PM_FULL_SETTLEMENT = 2;
	public static final int EVRW_TAG_PMFP_CASH = 1;
	public static final int EVRW_TAG_PMFP_CREDIT = 2;
	public static final int EVRW_TAG_PMFP_EM = 3;
	public static final int EVRW_TAG_PMFP_OTHER = 4;
	public static final int EVRW_TAG_ROS_NG = 1;
	public static final int EVRW_TAG_ROS_OK = 2;
	public static final int EVRW_TAG_ROS_UNKNOWN = 3;
	public static final int EVRW_TAG_STT_1 = 1;
	public static final int EVRW_TAG_STT_2 = 2;
	public static final int EVRW_TAG_STT_3 = 3;
	public static final int EVRW_TAG_TT_ADD = 1;
	public static final int EVRW_TAG_TT_CANCEL_CHARGE = 2;
	public static final int EVRW_TAG_TT_CANCEL_RETURN = 3;
	public static final int EVRW_TAG_TT_CANCEL_SALES = 4;
	public static final int EVRW_TAG_TT_GET_LOG = 5;
	public static final int EVRW_TAG_TT_READ = 6;
	public static final int EVRW_TAG_TT_RETURN = 7;
	public static final int EVRW_TAG_TT_SUBTRACT = 8;
	public static final int EVRW_TAG_TT_WRITE = 9;
	public static final int EVRW_TA_TRANSACTION = 11;
	public static final int EVRW_TA_NORMAL = 12;
	public static final int EVRW_SUE_LS_OK = 11;
	public static final int EVRW_SUE_LS_NEARFULL = 12;
	public static final int EVRW_SUE_LS_FULL = 13;
	public static final int EVRW_SUE_DS_NOCARD = 21;
	public static final int EVRW_SUE_DS_DETECTED = 22;
	public static final int EVRW_SUE_DS_ENTERED = 23;
	public static final int EVRW_SUE_DS_CAPTURED = 24;
	public static final int EVRW_TE_NOTIFY_TOUCH_RETRY = 1;
	public static final int EVRW_TE_NOTIFY_TOUCH_RETRY_CANCELABLE = 2;
	public static final int EVRW_TE_CONFIRM_TOUCH_RETRY = 3;
	public static final int EVRW_TE_CONFIRM_CANCEL = 4;
	public static final int EVRW_TE_NOTIFY_INVALID_OPERATION = 5;
	public static final int EVRW_TE_CONFIRM_INVALID_OPERATION = 6;
	public static final int EVRW_TE_CONFIRM_REMAINDER_SUBTRACTION = 7;
	public static final int EVRW_TE_CONFIRM_CENTER_CHECK = 8;
	public static final int EVRW_TE_CONFIRM_TOUCH_TIMEOUT = 9;
	public static final int EVRW_TE_CONFIRM_AUTO_CHARGE = 10;
	public static final int EVRW_TE_NOTIFY_CAPTURE_CARD = 11;
	public static final int EVRW_TE_NOTIFY_PIN = 12;
	public static final int EVRW_TE_NOTIFY_CENTER_CHECK = 13;
	public static final int EVRW_TE_NOTIFY_COMPLETE = 14;
	public static final int EVRW_TE_NOTIFY_TOUCH = 15;
	public static final int EVRW_TE_NOTIFY_BUSY = 16;
	public static final int EVRW_TE_CONFIRM_CENTER_CHECK_COMPLETE = 17;
	public static final int EVRW_TE_CONFIRM_SELECT = 18;
	public static final int EVRW_TE_NOTIFY_LOCK = 19;
	public static final int EVRW_TE_NOTIFY_CENTER_CHECK_COMPLETE = 20;
	public static final int EVRW_TE_CONFIRM_PIN_ENTRY_BY_OUTER_PINPAD = 21;
	public static final int EVRW_TE_NOTIFY_PROGRESS_1_TO_100 = 22;
	public static final int EVRW_TE_CONFIRM_DEVICE_DATA = 23;
	public static final int OPOS_EVRW_NOCARD = 201;
	public static final int OPOS_EVRW_RELEASE = 202;
	public static final int OPOS_EVRW_CENTERERROR = 203;
	public static final int OPOS_EVRW_COMMANDERROR = 204;
	public static final int OPOS_EVRW_RESET = 205;
	public static final int OPOS_EVRW_COMMUNICATIONERROR = 206;
	public static final int OPOS_EVRW_LOGOVERFLOW = 207;
	public static final int OPOS_EVRW_DAILYLOGOVERFLOW = 208;
	public static final int OPOS_EVRW_DEFICIENT = 209;
	public static final int OPOS_EVRW_OVERDEPOSIT = 210;
}
