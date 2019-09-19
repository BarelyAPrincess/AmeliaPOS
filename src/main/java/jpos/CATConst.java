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

public abstract interface CATConst
{
	public static final int CAT_PAYMENT_LUMP = 10;
	public static final int CAT_PAYMENT_BONUS_1 = 21;
	public static final int CAT_PAYMENT_BONUS_2 = 22;
	public static final int CAT_PAYMENT_BONUS_3 = 23;
	public static final int CAT_PAYMENT_BONUS_4 = 24;
	public static final int CAT_PAYMENT_BONUS_5 = 25;
	public static final int CAT_PAYMENT_INSTALLMENT_1 = 61;
	public static final int CAT_PAYMENT_INSTALLMENT_2 = 62;
	public static final int CAT_PAYMENT_INSTALLMENT_3 = 63;
	public static final int CAT_PAYMENT_BONUS_COMBINATION_1 = 31;
	public static final int CAT_PAYMENT_BONUS_COMBINATION_2 = 32;
	public static final int CAT_PAYMENT_BONUS_COMBINATION_3 = 33;
	public static final int CAT_PAYMENT_BONUS_COMBINATION_4 = 34;
	public static final int CAT_PAYMENT_REVOLVING = 80;
	public static final int CAT_PAYMENT_DEBIT = 110;
	public static final int CAT_PAYMENT_ELECTRONIC_MONEY = 111;
	public static final int CAT_TRANSACTION_SALES = 10;
	public static final int CAT_TRANSACTION_VOID = 20;
	public static final int CAT_TRANSACTION_REFUND = 21;
	public static final int CAT_TRANSACTION_VOIDPRESALES = 29;
	public static final int CAT_TRANSACTION_COMPLETION = 30;
	public static final int CAT_TRANSACTION_PRESALES = 40;
	public static final int CAT_TRANSACTION_CHECKCARD = 41;
	public static final int CAT_TRANSACTION_CASHDEPOSIT = 50;
	public static final int CAT_MEDIA_UNSPECIFIED = 0;
	public static final int CAT_MEDIA_NONDEFINE = 0;
	public static final int CAT_MEDIA_CREDIT = 1;
	public static final int CAT_MEDIA_DEBIT = 2;
	public static final int CAT_MEDIA_ELECTRONIC_MONEY = 3;
	public static final int CAT_DL_NONE = 0;
	public static final int CAT_DL_REPORTING = 1;
	public static final int CAT_DL_SETTLEMENT = 2;
	public static final int CAT_DL_REPORTING_SETTLEMENT = 3;
	public static final int CAT_LOGSTATUS_OK = 1;
	public static final int CAT_LOGSTATUS_NEARFULL = 2;
	public static final int CAT_LOGSTATUS_FULL = 3;
	public static final int JPOS_ECAT_CENTERERROR = 1;
	public static final int JPOS_ECAT_COMMANDERROR = 90;
	public static final int JPOS_ECAT_RESET = 91;
	public static final int JPOS_ECAT_COMMUNICATIONERROR = 92;
	public static final int JPOS_ECAT_DAILYLOGOVERFLOW = 200;
	public static final int JPOS_ECAT_DEFICIENT = 201;
	public static final int JPOS_ECAT_OVERDEPOSIT = 202;
}
