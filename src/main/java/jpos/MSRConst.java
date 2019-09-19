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

public abstract interface MSRConst
{
	public static final int MSR_TR_NONE = 0;
	public static final int MSR_TR_1 = 1;
	public static final int MSR_TR_2 = 2;
	public static final int MSR_TR_3 = 4;
	public static final int MSR_TR_4 = 8;
	public static final int MSR_TR_1_2 = 3;
	public static final int MSR_TR_1_3 = 5;
	public static final int MSR_TR_1_4 = 9;
	public static final int MSR_TR_2_3 = 6;
	public static final int MSR_TR_2_4 = 10;
	public static final int MSR_TR_3_4 = 12;
	public static final int MSR_TR_1_2_3 = 7;
	public static final int MSR_TR_1_2_4 = 11;
	public static final int MSR_TR_1_3_4 = 13;
	public static final int MSR_TR_2_3_4 = 14;
	public static final int MSR_TR_1_2_3_4 = 15;
	public static final int MSR_ERT_CARD = 0;
	public static final int MSR_ERT_TRACK = 1;
	public static final int MSR_DE_NONE = 1;
	public static final int MSR_DE_3DEA_DUKPT = 2;
	public static final int MSR_DA_NOT_SUPPORTED = 0;
	public static final int MSR_DA_OPTIONAL = 1;
	public static final int MSR_DA_REQUIRED = 2;
	public static final int MSR_AP_NONE = 0;
	public static final int MSR_AP_CHALLENGERESPONSE = 1;
	public static final String MSR_CT_AAMVA = "AAMVA";
	public static final String MSR_CT_BANK = "BANK";
	public static final String MSR_RCP_AccountNumber = "AccountNumber";
	public static final String MSR_RCP_Address = "Address";
	public static final String MSR_RCP_BirthDate = "BirthDate";
	public static final String MSR_RCP_City = "City";
	public static final String MSR_RCP_Class = "Class";
	public static final String MSR_RCP_Endorsements = "Endorsements";
	public static final String MSR_RCP_ExpirationDate = "ExpirationDate";
	public static final String MSR_RCP_EyeColor = "EyeColor";
	public static final String MSR_RCP_FirstName = "FirstName";
	public static final String MSR_RCP_Gender = "Gender";
	public static final String MSR_RCP_HairColor = "HairColor";
	public static final String MSR_RCP_Height = "Height";
	public static final String MSR_RCP_LicenseNumber = "LicenseNumber";
	public static final String MSR_RCP_MiddleInitial = "MiddleInitial";
	public static final String MSR_RCP_PostalCode = "PostalCode";
	public static final String MSR_RCP_Restrictions = "Restrictions";
	public static final String MSR_RCP_ServiceCode = "ServiceCode";
	public static final String MSR_RCP_State = "State";
	public static final String MSR_RCP_Suffix = "Suffix";
	public static final String MSR_RCP_Surname = "Surname";
	public static final String MSR_RCP_Title = "Title";
	public static final String MSR_RCP_Weight = "Weight";
	public static final int MSR_SUE_DEVICE_AUTHENTICATED = 11;
	public static final int MSR_SUE_DEVICE_DEAUTHENTICATED = 12;
	public static final int JPOS_EMSR_START = 201;
	public static final int JPOS_EMSR_END = 202;
	public static final int JPOS_EMSR_PARITY = 203;
	public static final int JPOS_EMSR_LRC = 204;
	public static final int JPOS_EMSR_DEVICE_AUTHENTICATION_FAILED = 205;
	public static final int JPOS_EMSR_DEVICE_DEAUTHENTICATION_FAILED = 206;
}
