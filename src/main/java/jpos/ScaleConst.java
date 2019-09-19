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

public abstract interface ScaleConst
{
	public static final int SCAL_WU_GRAM = 1;
	public static final int SCAL_WU_KILOGRAM = 2;
	public static final int SCAL_WU_OUNCE = 3;
	public static final int SCAL_WU_POUND = 4;
	public static final int SCAL_SN_DISABLED = 1;
	public static final int SCAL_SN_ENABLED = 2;
	public static final int SCAL_SFR_MANUAL_TARE = 1;
	public static final int SCAL_SFR_WEIGHTED_TARE = 2;
	public static final int SCAL_SFR_PERCENT_TARE = 4;
	public static final int SCAL_SFR_UNITPRICE = 8;
	public static final int SCAL_PCM_PRICE_LABELING = 1;
	public static final int SCAL_PCM_SELF_SERVICE = 2;
	public static final int SCAL_PCM_OPERATOR = 3;
	public static final int SCAL_SST_DEFAULT = 1;
	public static final int SCAL_SST_MANUAL = 2;
	public static final int SCAL_SST_PERCENT = 3;
	public static final int SCAL_SST_WEIGHTED = 4;
	public static final int SCAL_STP_FIRST = 1;
	public static final int SCAL_STP_NONE = 2;
	public static final int SCL_SUE_STABLE_WEIGHT = 11;
	public static final int SCL_SUE_WEIGHT_UNSTABLE = 12;
	public static final int SCL_SUE_WEIGHT_ZERO = 13;
	public static final int SCL_SUE_WEIGHT_OVERWEIGHT = 14;
	public static final int SCL_SUE_NOT_READY = 15;
	public static final int SCL_SUE_WEIGHT_UNDER_ZERO = 16;
	public static final int SCAL_SUE_STABLE_WEIGHT = 11;
	public static final int SCAL_SUE_WEIGHT_UNSTABLE = 12;
	public static final int SCAL_SUE_WEIGHT_ZERO = 13;
	public static final int SCAL_SUE_WEIGHT_OVERWEIGHT = 14;
	public static final int SCAL_SUE_NOT_READY = 15;
	public static final int SCAL_SUE_WEIGHT_UNDER_ZERO = 16;
	public static final int JPOS_ESCAL_OVERWEIGHT = 201;
	public static final int JPOS_ESCAL_UNDER_ZERO = 202;
	public static final int JPOS_ESCAL_SAME_WEIGHT = 203;
}
