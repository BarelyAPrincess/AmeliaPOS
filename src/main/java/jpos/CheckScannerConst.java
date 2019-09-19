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

public abstract interface CheckScannerConst
{
	public static final int CHK_CCL_MONO = 1;
	public static final int CHK_CCL_GRAYSCALE = 2;
	public static final int CHK_CCL_16 = 4;
	public static final int CHK_CCL_256 = 8;
	public static final int CHK_CCL_FULL = 16;
	public static final int CHK_CIF_NATIVE = 1;
	public static final int CHK_CIF_TIFF = 2;
	public static final int CHK_CIF_BMP = 4;
	public static final int CHK_CIF_JPEG = 8;
	public static final int CHK_CIF_GIF = 16;
	public static final int CHK_CL_MONO = 1;
	public static final int CHK_CL_GRAYSCALE = 2;
	public static final int CHK_CL_16 = 3;
	public static final int CHK_CL_256 = 4;
	public static final int CHK_CL_FULL = 5;
	public static final int CHK_AUTOMATIC_CONTRAST = -1;
	public static final int CHK_IF_NATIVE = 1;
	public static final int CHK_IF_TIFF = 2;
	public static final int CHK_IF_BMP = 3;
	public static final int CHK_IF_JPEG = 4;
	public static final int CHK_IF_GIF = 5;
	public static final int CHK_IMS_EMPTY = 1;
	public static final int CHK_IMS_OK = 2;
	public static final int CHK_IMS_FULL = 3;
	public static final int CHK_MM_DOTS = 1;
	public static final int CHK_MM_TWIPS = 2;
	public static final int CHK_MM_ENGLISH = 3;
	public static final int CHK_MM_METRIC = 4;
	public static final int CHK_CLR_ALL = 1;
	public static final int CHK_CLR_BY_FILEID = 2;
	public static final int CHK_CLR_BY_FILEINDEX = 3;
	public static final int CHK_CLR_BY_IMAGETAGDATA = 4;
	public static final int CHK_CROP_AREA_ENTIRE_IMAGE = -1;
	public static final int CHK_CROP_AREA_RESET_ALL = -2;
	public static final int CHK_CROP_AREA_RIGHT = -1;
	public static final int CHK_CROP_AREA_BOTTOM = -1;
	public static final int CHK_LOCATE_BY_FILEID = 1;
	public static final int CHK_LOCATE_BY_FILEINDEX = 2;
	public static final int CHK_LOCATE_BY_IMAGETAGDATA = 3;
	public static final int JPOS_ECHK_NOCHECK = 201;
	public static final int JPOS_ECHK_CHECK = 202;
	public static final int JPOS_ECHK_NOROOM = 203;
	public static final int CHK_SUE_SCANCOMPLETE = 11;
}
