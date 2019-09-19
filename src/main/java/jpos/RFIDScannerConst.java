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

public abstract interface RFIDScannerConst
{
	public static final int RFID_CWT_NONE = 0;
	public static final int RFID_CWT_ID = 1;
	public static final int RFID_CWT_USERDATA = 2;
	public static final int RFID_CWT_ALL = 3;
	public static final int RFID_PR_EPC0 = 1;
	public static final int RFID_PR_0PLUS = 2;
	public static final int RFID_PR_EPC1 = 4;
	public static final int RFID_PR_EPC1G2 = 8;
	public static final int RFID_PR_EPC2 = 16;
	public static final int RFID_PR_ISO14443A = 4096;
	public static final int RFID_PR_ISO14443B = 8192;
	public static final int RFID_PR_ISO15693 = 12288;
	public static final int RFID_PR_ISO180006B = 16384;
	public static final int RFID_PR_OTHER = 16777216;
	public static final int RFID_PR_ALL = 1073741824;
	public static final int RFID_RT_ID = 16;
	public static final int RFID_RT_FULLUSERDATA = 1;
	public static final int RFID_RT_PARTIALUSERDATA = 2;
	public static final int RFID_RT_ID_FULLUSERDATA = 17;
	public static final int RFID_RT_ID_PARTIALUSERDATA = 18;
}
