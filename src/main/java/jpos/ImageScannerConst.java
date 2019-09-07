package jpos;

public abstract interface ImageScannerConst
{
	public static final int IMG_FRAME_STILL = 1;
	public static final int IMG_FRAME_VIDEO = 2;
	public static final int IMG_ALL = 255;
	public static final int IMG_DECODE_ONLY = 1;
	public static final int IMG_STILL_ONLY = 2;
	public static final int IMG_STILL_DECODE = 3;
	public static final int IMG_VIDEO_DECODE = 5;
	public static final int IMG_VIDEO_STILL = 6;
	public static final int IMG_QUAL_LOW = 1;
	public static final int IMG_QUAL_MED = 2;
	public static final int IMG_QUAL_HIGH = 3;
	public static final int IMG_TYP_BMP = 1;
	public static final int IMG_TYP_JPEG = 2;
	public static final int IMG_TYP_GIF = 3;
	public static final int IMG_TYP_PNG = 4;
	public static final int IMG_TYP_TIFF = 5;
}
