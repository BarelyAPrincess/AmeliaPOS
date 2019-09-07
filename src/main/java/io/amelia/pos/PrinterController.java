package io.amelia.pos;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class PrinterController
{
	private ByteBuf buffer = Unpooled.buffer();

	public static final byte BEL = 0x07;
	public static final byte ESC = 0x1b;
	public static final byte GS = 0x1d;
	public static final byte NUL = 0x00;

	public static final int PAPER_TYPE_RECEIPT = 0;
	public static final int PAPER_TYPE_SLIP = 1;
	public static final int PAPER_TYPE_ENDORSE = 2;
	public static final int PAPER_TYPE_VALIDATION = 3;
	public static final int METHOD_WAITINSERTION = 0;
	public static final int METHOD_SENDDATA = 1;
	public static final int METHOD_CANCELINSERTION = 2;
	public static final int METHOD_EJECTPAPER = 3;
	public static final int METHOD_READMICRDATA = 4;
	public static final int METHOD_CLEANMICRREADER = 5;
	public static final int MICR_FONT_E13B = 0;
	public static final int MICR_FONT_CMC7 = 1;
	public static final int INSERTION_WAIT_SLIP = 0;
	public static final int INSERTION_WAIT_VALIDATION = 1;
	public static final int INSERTION_WAIT_MICR = 2;
	public static final int INSERTION_WAIT_NONE = 3;
	public static final int REMOVAL_WAIT_PAPER = 0;
	public static final int REMOVAL_WAIT_NONE = 1;
	public static final int SLIP_PAPER_OK = 0;
	public static final int SLIP_PAPER_EMPTY = 1;
	public static final int EVENT_INSERTION_WAIT_SLIP = 12;
	public static final int EVENT_INSERTION_WAIT_VALIDATION = 13;
	public static final int EVENT_INSERTION_WAIT_MICR = 14;
	public static final int EVENT_INSERTION_WAIT_NONE = 15;
	public static final int EVENT_REMOVAL_WAIT_PAPER = 16;
	public static final int EVENT_REMOVAL_WAIT_NONE = 17;
	public static final int EVENT_SLIP_PAPER_OK = 18;
	public static final int EVENT_SLIP_PAPER_EMPTY = 19;
	public static final int TRUE = 1;
	public static final int FALSE = 0;
	public static final int PARAM_UNSPECIFIED = -1;
	public static final int PARAM_DEFAULT = -2;
	public static final int UNKNOWN = -3;
	public static final int MODEL_ANK = 0;
	public static final int MODEL_JAPANESE = 1;
	public static final int MODEL_CHINESE = 2;
	public static final int MODEL_TAIWAN = 3;
	public static final int MODEL_KOREAN = 4;
	public static final int MODEL_THAI = 5;
	public static final int MODEL_SOUTHASIA = 6;
	public static final int ALIGN_LEFT = 0;
	public static final int ALIGN_CENTER = 1;
	public static final int ALIGN_RIGHT = 2;
	public static final int LANG_EN = 0;
	public static final int LANG_JA = 1;
	public static final int LANG_ZH_CN = 2;
	public static final int LANG_ZH_TW = 3;
	public static final int LANG_KO = 4;
	public static final int LANG_TH = 5;
	public static final int LANG_VI = 6;
	public static final int FONT_A = 0;
	public static final int FONT_B = 1;
	public static final int FONT_C = 2;
	public static final int FONT_D = 3;
	public static final int FONT_E = 4;
	public static final int COLOR_NONE = 0;
	public static final int COLOR_1 = 1;
	public static final int COLOR_2 = 2;
	public static final int COLOR_3 = 3;
	public static final int COLOR_4 = 4;
	public static final int MODE_MONO = 0;
	public static final int MODE_GRAY16 = 1;
	public static final int MODE_MONO_HIGH_DENSITY = 2;
	public static final int HALFTONE_DITHER = 0;
	public static final int HALFTONE_ERROR_DIFFUSION = 1;
	public static final int HALFTONE_THRESHOLD = 2;
	public static final int COMPRESS_NONE = 0;
	public static final int COMPRESS_DEFLATE = 1;
	public static final int COMPRESS_AUTO = 2;
	public static final int BARCODE_UPC_A = 0;
	public static final int BARCODE_UPC_E = 1;
	public static final int BARCODE_EAN13 = 2;
	public static final int BARCODE_JAN13 = 3;
	public static final int BARCODE_EAN8 = 4;
	public static final int BARCODE_JAN8 = 5;
	public static final int BARCODE_CODE39 = 6;
	public static final int BARCODE_ITF = 7;
	public static final int BARCODE_CODABAR = 8;
	public static final int BARCODE_CODE93 = 9;
	public static final int BARCODE_CODE128 = 10;
	public static final int BARCODE_GS1_128 = 11;
	public static final int BARCODE_GS1_DATABAR_OMNIDIRECTIONAL = 12;
	public static final int BARCODE_GS1_DATABAR_TRUNCATED = 13;
	public static final int BARCODE_GS1_DATABAR_LIMITED = 14;
	public static final int BARCODE_GS1_DATABAR_EXPANDED = 15;
	public static final int HRI_NONE = 0;
	public static final int HRI_ABOVE = 1;
	public static final int HRI_BELOW = 2;
	public static final int HRI_BOTH = 3;
	public static final int SYMBOL_PDF417_STANDARD = 0;
	public static final int SYMBOL_PDF417_TRUNCATED = 1;
	public static final int SYMBOL_QRCODE_MODEL_1 = 2;
	public static final int SYMBOL_QRCODE_MODEL_2 = 3;
	public static final int SYMBOL_QRCODE_MICRO = 4;
	public static final int SYMBOL_MAXICODE_MODE_2 = 5;
	public static final int SYMBOL_MAXICODE_MODE_3 = 6;
	public static final int SYMBOL_MAXICODE_MODE_4 = 7;
	public static final int SYMBOL_MAXICODE_MODE_5 = 8;
	public static final int SYMBOL_MAXICODE_MODE_6 = 9;
	public static final int SYMBOL_GS1_DATABAR_STACKED = 10;
	public static final int SYMBOL_GS1_DATABAR_STACKED_OMNIDIRECTIONAL = 11;
	public static final int SYMBOL_GS1_DATABAR_EXPANDED_STACKED = 12;
	public static final int SYMBOL_AZTECCODE_FULLRANGE = 13;
	public static final int SYMBOL_AZTECCODE_COMPACT = 14;
	public static final int SYMBOL_DATAMATRIX_SQUARE = 15;
	public static final int SYMBOL_DATAMATRIX_RECTANGLE_8 = 16;
	public static final int SYMBOL_DATAMATRIX_RECTANGLE_12 = 17;
	public static final int SYMBOL_DATAMATRIX_RECTANGLE_16 = 18;
	public static final int LEVEL_0 = 0;
	public static final int LEVEL_1 = 1;
	public static final int LEVEL_2 = 2;
	public static final int LEVEL_3 = 3;
	public static final int LEVEL_4 = 4;
	public static final int LEVEL_5 = 5;
	public static final int LEVEL_6 = 6;
	public static final int LEVEL_7 = 7;
	public static final int LEVEL_8 = 8;
	public static final int LEVEL_L = 9;
	public static final int LEVEL_M = 10;
	public static final int LEVEL_Q = 11;
	public static final int LEVEL_H = 12;
	public static final int DIRECTION_LEFT_TO_RIGHT = 0;
	public static final int DIRECTION_BOTTOM_TO_TOP = 1;
	public static final int DIRECTION_RIGHT_TO_LEFT = 2;
	public static final int DIRECTION_TOP_TO_BOTTOM = 3;
	public static final int LINE_THIN = 0;
	public static final int LINE_MEDIUM = 1;
	public static final int LINE_THICK = 2;
	public static final int LINE_THIN_DOUBLE = 3;
	public static final int LINE_MEDIUM_DOUBLE = 4;
	public static final int LINE_THICK_DOUBLE = 5;
	public static final int CUT_NO_FEED = 0;
	public static final int CUT_FEED = 1;
	public static final int CUT_RESERVE = 2;
	public static final int DRAWER_2PIN = 0;
	public static final int DRAWER_5PIN = 1;
	public static final int PULSE_100 = 0;
	public static final int PULSE_200 = 1;
	public static final int PULSE_300 = 2;
	public static final int PULSE_400 = 3;
	public static final int PULSE_500 = 4;
	public static final int PAPER_OK = 0;
	public static final int PAPER_NEAR_END = 1;
	public static final int PAPER_EMPTY = 2;
	public static final int SWITCH_OFF = 0;
	public static final int SWITCH_ON = 1;
	public static final int DRAWER_HIGH = 0;
	public static final int DRAWER_LOW = 1;
	public static final int NO_ERR = 0;
	public static final int MECHANICAL_ERR = 1;
	public static final int AUTOCUTTER_ERR = 2;
	public static final int UNRECOVER_ERR = 3;
	public static final int AUTORECOVER_ERR = 4;
	public static final int HEAD_OVERHEAT = 0;
	public static final int MOTOR_OVERHEAT = 1;
	public static final int BATTERY_OVERHEAT = 2;
	public static final int WRONG_PAPER = 3;
	public static final int COVER_OPEN = 4;
	public static final int EVENT_ONLINE = 0;
	public static final int EVENT_OFFLINE = 1;
	public static final int EVENT_POWER_OFF = 2;
	public static final int EVENT_COVER_CLOSE = 3;
	public static final int EVENT_COVER_OPEN = 4;
	public static final int EVENT_PAPER_OK = 5;
	public static final int EVENT_PAPER_NEAR_END = 6;
	public static final int EVENT_PAPER_EMPTY = 7;
	public static final int EVENT_DRAWER_HIGH = 8;
	public static final int EVENT_DRAWER_LOW = 9;
	public static final int EVENT_RECONNECTING = 0;
	public static final int EVENT_RECONNECT = 1;
	public static final int EVENT_DISCONNECT = 2;
	static final int NO_EXCEPTION = 0;
	static final int RETURN_NULL = 257;
	static final int RETURN_NULL_CHARACTER = 256;
	private static final int INTERVAL_DEFAULT = 3000;
	private static final int MIN_IMAGE_HEIGHT = 1;
	private static final int MIN_IMAGE_WIDTH = 1;
	private static final int MODE40CPL_DEFAULT = 1;
	private static final int PAPER_TYPE_DEFAULT = 0;
	private static final int WAITTIME_DEFAULT = 500;
	Class<?> APMClass;
	Object APMInstance;
	boolean APMPresent;
	int mInterval = 3000;
	long mPrinterHandle = 0L;
	private CommPort commPort = CommPort.linuxLPT( "/dev/usb/lp4" );
	// private PrinterConnectionListener mConnectionListener;
	private int mMode40Cpl;
	private int mPaperType;
	// private PrinterReceiveListener mReceiveListener;
	// private PrinterStatusChangeListener mStatusChangeListener;
	private int mWaitTime;

	public PrinterController( int lang ) throws PrinterException
	{
		this();
		// this.initializePrinterInstance( lang );
	}

	private PrinterController()
	{
		this.mWaitTime = 500;
		this.mMode40Cpl = 1;
		this.mPaperType = 0;
	}

	/*public void addBarcode( String data, int type, int hri, int font, int width, int height ) throws PrinterException
	{
		try
		{
			this.checkHandle();
			if ( null == data )
			{
				throw new PrinterException( 1 );
			}

			int errStatus = this.nativeEpos2AddBarcode( this.getEdcHandle(), data, type, hri, font, ( long ) width, ( long ) height );
			if ( 0 != errStatus )
				throw new PrinterException( errStatus );

		}
		catch ( PrinterException var8 )
		{
			this.outputException( "addBarcode", var8 );
			this.outputLogReturnFunction( "addBarcode", var8.getErrorStatus(), data, type, hri, font, width );
			throw var8;
		}

		this.outputLogReturnFunction( "addBarcode", 0, data, type, hri, font, width );
	}*/

	public void addBytes( Object... seq ) throws PrinterException
	{
		ByteBuf values = Unpooled.buffer();

		for ( int i = 0; i < seq.length; i++ )
		{
			Object obj = seq[i];

			if ( obj instanceof Byte )
			{
				values.writeByte( ( byte ) obj );
			}
			if ( obj instanceof String )
			{
				values.writeBytes( ( ( String ) obj ).getBytes() );
			}
			if ( obj instanceof Character )
			{
				values.writeChar( ( Integer ) obj );
			}
			else if ( obj instanceof Integer )
			{
				values.writeInt( ( Integer ) obj );
			}
			else if ( obj instanceof Long )
			{
				values.writeLong( ( Long ) obj );
			}
			else
				throw new PrinterException( "Only values, numbers, and strings can be sent to the printer. {obj=" + obj + "}" );
		}

		buffer.writeBytes( values );
	}

	public void addCut( int type ) throws PrinterException
	{
		addBytes( GS, 0x41, type );
	}

	public void addFeedLine( int line ) throws PrinterException
	{
/*		this.outputLogCallFunction( "addFeedLine", line );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddFeedLine( this.getEdcHandle(), ( long ) line );
			if ( 0 != errStatus )
				throw new PrinterException( errStatus );
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "addFeedLine", var3 );
			this.outputLogReturnFunction( "addFeedLine", var3.getErrorStatus(), line );
			throw var3;
		}

		this.outputLogReturnFunction( "addFeedLine", 0, line );*/
	}

	public void addFeedUnit( int unit ) throws PrinterException
	{
		/*try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddFeedUnit( this.getEdcHandle(), ( long ) unit );
			if ( 0 != errStatus )
				throw new PrinterException( errStatus );
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "addFeedUnit", var3 );
			this.outputLogReturnFunction( "addFeedUnit", var3.getErrorStatus(), unit );
			throw var3;
		}*/
	}

	public void addHPosition( int x ) throws PrinterException
	{
		/*try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddHPosition( this.getEdcHandle(), ( long ) x );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "addTextPosition", var3 );
			this.outputLogReturnFunction( "addTextPosition", var3.getErrorStatus(), x );
			throw var3;
		}*/
	}

	/*public void addImage( Bitmap data, int x, int y, int width, int height, int color, int mode, int halftone, double brightness, int compress ) throws PrinterException
	{
		this.outputLogCallFunction( "addImage", data, x, y, width, height, color, mode );

		try
		{
			this.checkHandle();
			if ( null == data )
			{
				throw new PrinterException( 1 );
			}

			int bgrBytePerPixel = true;
			int maxByteValue = true;
			int srcWidth = data.getWidth();
			int srcHeight = data.getHeight();
			int byteMask = true;
			int shiftBitForAlpha = true;
			int shiftBitForRed = true;
			int shiftBitForGreen = true;
			int srcPos = false;
			int dstPos = 0;
			int alpha = false;
			int r = false;
			int g = false;
			int b = false;
			int line = false;
			int row = false;
			int[] lineBuf = new int[srcWidth];
			int divTableSize = true;
			double[] divTable = new double[256];
			if ( 1 > srcWidth || 1 > srcHeight )
			{
				throw new PrinterException( 1 );
			}

			Bitmap image = null;
			if ( data.getConfig() == Config.ARGB_8888 )
			{
				image = data;
			}
			else
			{
				image = data.copy( Config.ARGB_8888, false );
				if ( image == null )
				{
					throw new PrinterException( 4 );
				}
			}

			for ( int i = 0; i < 256; ++i )
			{
				divTable[i] = 1.0D - ( double ) i / 255.0D;
			}

			byte[] imageBGR = new byte[3 * srcWidth * srcHeight];
			int line = 0;

			while ( true )
			{
				if ( line >= srcHeight )
				{
					int errStatus = this.nativeEpos2AddImage( this.getEdcHandle(), imageBGR, ( long ) srcWidth, ( long ) srcHeight, ( long ) x, ( long ) y, ( long ) width, ( long ) height, color, mode, halftone, brightness, compress );
					if ( 0 != errStatus )
					{
						throw new PrinterException( errStatus );
					}
					break;
				}

				image.getPixels( lineBuf, 0, srcWidth, 0, line, srcWidth, 1 );
				int srcPos = 0;

				for ( int row = 0; row < srcWidth; ++row )
				{
					int alpha = lineBuf[srcPos] >> 24 & 255;
					int r = lineBuf[srcPos] >> 16 & 255;
					int g = lineBuf[srcPos] >> 8 & 255;
					int b = lineBuf[srcPos] & 255;
					if ( 255 == alpha )
					{
						imageBGR[dstPos] = ( byte ) b;
						imageBGR[dstPos + 1] = ( byte ) g;
						imageBGR[dstPos + 2] = ( byte ) r;
					}
					else if ( 0 == alpha )
					{
						imageBGR[dstPos] = -1;
						imageBGR[dstPos + 1] = -1;
						imageBGR[dstPos + 2] = -1;
					}
					else
					{
						imageBGR[dstPos] = ( byte ) ( ( int ) ( 255.0D - ( double ) alpha * divTable[b] ) );
						imageBGR[dstPos + 1] = ( byte ) ( ( int ) ( 255.0D - ( double ) alpha * divTable[g] ) );
						imageBGR[dstPos + 2] = ( byte ) ( ( int ) ( 255.0D - ( double ) alpha * divTable[r] ) );
					}

					dstPos += 3;
					++srcPos;
				}

				++line;
			}
		}
		catch ( PrinterException var34 )
		{
			this.outputException( "addImage", var34 );
			this.outputLogReturnFunction( "addImage", var34.getErrorStatus(), data, x, y, width, height, color, mode );
			throw var34;
		}
		catch ( OutOfMemoryError var35 )
		{
			PrinterException eposEx = new PrinterException( 4 );
			this.outputException( "addImage", eposEx );
			throw eposEx;
		}

		this.outputLogReturnFunction( "addImage", 0, data, x, y, width, height, color, mode );
	}

	public void addLineSpace( int linespc ) throws PrinterException
	{
		addBytes( ESC, "d", linespc );
	}

	public void addLogo( int key1, int key2 ) throws PrinterException
	{
		this.outputLogCallFunction( "addLogo", key1, key2 );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddLogo( this.getEdcHandle(), ( long ) key1, ( long ) key2 );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var4 )
		{
			this.outputException( "addLogo", var4 );
			this.outputLogReturnFunction( "addLogo", var4.getErrorStatus(), key1, key2 );
			throw var4;
		}

		this.outputLogReturnFunction( "addLogo", 0, key1, key2 );
	}

	public void addPageArea( int x, int y, int width, int height ) throws PrinterException
	{
		this.outputLogCallFunction( "addPageArea", x, y, width, height );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddPageArea( this.getEdcHandle(), ( long ) x, ( long ) y, ( long ) width, ( long ) height );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var6 )
		{
			this.outputException( "addPageArea", var6 );
			this.outputLogReturnFunction( "addPageArea", var6.getErrorStatus(), x, y, width, height );
			throw var6;
		}

		this.outputLogReturnFunction( "addPageArea", 0, x, y, width, height );
	}

	public void addPageBegin() throws PrinterException
	{
		this.outputLogCallFunction( "addPageBegin" );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddPageBegin( this.getEdcHandle() );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var2 )
		{
			this.outputException( "addPageBegin", var2 );
			this.outputLogReturnFunction( "addPageBegin", var2.getErrorStatus() );
			throw var2;
		}

		this.outputLogReturnFunction( "addPageBegin", 0 );
	}

	public void addPageDirection( int direction ) throws PrinterException
	{
		this.outputLogCallFunction( "addPageDirection", direction );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddPageDirection( this.getEdcHandle(), direction );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "addPageDirection", var3 );
			this.outputLogReturnFunction( "addPageDirection", var3.getErrorStatus(), direction );
			throw var3;
		}

		this.outputLogReturnFunction( "addPageDirection", 0, direction );
	}

	public void addPageEnd() throws PrinterException
	{
		this.outputLogCallFunction( "addPageEnd" );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddPageEnd( this.getEdcHandle() );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var2 )
		{
			this.outputException( "addPageEnd", var2 );
			this.outputLogReturnFunction( "addPageEnd", var2.getErrorStatus() );
			throw var2;
		}

		this.outputLogReturnFunction( "addPageEnd", 0 );
	}

	public void addPageLine( int x1, int y1, int x2, int y2, int style ) throws PrinterException
	{
		this.outputLogCallFunction( "addPageLine", x1, y1, x2, y2, style );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddPageLine( this.getEdcHandle(), ( long ) x1, ( long ) y1, ( long ) x2, ( long ) y2, style );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var7 )
		{
			this.outputException( "addPageLine", var7 );
			this.outputLogReturnFunction( "addPageLine", var7.getErrorStatus(), x1, y1, x2, y2, style );
			throw var7;
		}

		this.outputLogReturnFunction( "addPageLine", 0, x1, y1, x2, y2, style );
	}

	public void addPagePosition( int x, int y ) throws PrinterException
	{
		this.outputLogCallFunction( "addPagePosition", x, y );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddPagePosition( this.getEdcHandle(), ( long ) x, ( long ) y );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var4 )
		{
			this.outputException( "addPagePosition", var4 );
			this.outputLogReturnFunction( "addPagePosition", var4.getErrorStatus(), x, y );
			throw var4;
		}

		this.outputLogReturnFunction( "addPagePosition", 0, x, y );
	}

	public void addPageRectangle( int x1, int y1, int x2, int y2, int style ) throws PrinterException
	{
		this.outputLogCallFunction( "addPageRectangle", x1, y1, x2, y2, style );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddPageRectangle( this.getEdcHandle(), ( long ) x1, ( long ) y1, ( long ) x2, ( long ) y2, style );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var7 )
		{
			this.outputException( "addPageRectangle", var7 );
			this.outputLogReturnFunction( "addPageRectangle", var7.getErrorStatus(), x1, y1, x2, y2, style );
			throw var7;
		}

		this.outputLogReturnFunction( "addPageRectangle", 0, x1, y1, x2, y2, style );
	}

	public void addPulse( int drawer, int time ) throws PrinterException
	{
		this.outputLogCallFunction( "addPulse", drawer, time );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddPulse( this.getEdcHandle(), drawer, time );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var4 )
		{
			this.outputException( "addPulse", var4 );
			this.outputLogReturnFunction( "addPulse", var4.getErrorStatus(), drawer, time );
			throw var4;
		}

		this.outputLogReturnFunction( "addPulse", 0, drawer, time );
	}

	public void addSymbol( String data, int type, int level, int width, int height, int size ) throws PrinterException
	{
		this.outputLogCallFunction( "addSymbol", data, type, level, width, height, size );

		try
		{
			this.checkHandle();
			if ( null == data )
			{
				throw new PrinterException( 1 );
			}

			int errStatus = this.nativeEpos2AddSymbol( this.getEdcHandle(), data, type, level, ( long ) width, ( long ) height, ( long ) size );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var8 )
		{
			this.outputException( "addSymbol", var8 );
			this.outputLogReturnFunction( "addSymbol", var8.getErrorStatus(), data, type, level, width, height, size );
			throw var8;
		}

		this.outputLogReturnFunction( "addSymbol", 0, data, type, level, width, height, size );
	}

	public void addText( String data ) throws PrinterException
	{
		this.outputLogCallFunction( "addText", data );

		try
		{
			this.checkHandle();
			if ( null == data )
			{
				throw new PrinterException( 1 );
			}

			try
			{
				this.APMClass = Class.forName( "eu.epson.rdc.apm.APMInterface" );
				Method APMProcessMethod;
				Object returnObj;
				if ( this.APMInstance == null )
				{
					this.APMInstance = this.APMClass.newInstance();
					APMProcessMethod = this.APMClass.getMethod( "APMInitialize", Context.class );
					returnObj = APMProcessMethod.invoke( this.APMInstance, this.mContext );
					this.APMPresent = ( Boolean ) returnObj;
				}

				if ( this.APMClass != null && this.APMInstance != null && this.APMPresent )
				{
					APMProcessMethod = this.APMClass.getMethod( "APMProcessChars", String.class );
					returnObj = APMProcessMethod.invoke( this.APMInstance, data );
					String returnText = ( String ) returnObj;
					data = returnText;
				}
			}
			catch ( ClassNotFoundException var5 )
			{
			}
			catch ( IllegalArgumentException var6 )
			{
				this.outputLogCallFunction( "APM IllegalArgumentException: ", var6.getMessage() );
			}
			catch ( IllegalAccessException var7 )
			{
				this.outputLogCallFunction( "APM IllegalAccessException: ", var7.getMessage() );
			}
			catch ( Exception var8 )
			{
				this.outputLogCallFunction( "APM Exception: ", var8.getMessage() );
			}

			int errStatus = this.nativeEpos2AddText( this.getEdcHandle(), data );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var9 )
		{
			this.outputException( "addText", var9 );
			this.outputLogReturnFunction( "addText", var9.getErrorStatus(), data );
			throw var9;
		}

		this.outputLogReturnFunction( "addText", 0, data );
	}

	public void addTextAlign( int align ) throws PrinterException
	{
		this.outputLogCallFunction( "addTextAlign", align );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddTextAlign( this.getEdcHandle(), align );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "addTextAlign", var3 );
			this.outputLogReturnFunction( "addTextAlign", var3.getErrorStatus(), align );
			throw var3;
		}

		this.outputLogReturnFunction( "addTextAlign", 0, align );
	}

	public void addTextFont( int font ) throws PrinterException
	{
		this.outputLogCallFunction( "addTextFont", font );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddTextFont( this.getEdcHandle(), font );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "addTextFont", var3 );
			this.outputLogReturnFunction( "addTextFont", var3.getErrorStatus(), font );
			throw var3;
		}

		this.outputLogReturnFunction( "addTextFont", 0, font );
	}

	public void addTextLang( int lang ) throws PrinterException
	{
		this.outputLogCallFunction( "addTextLang", lang );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddTextLang( this.getEdcHandle(), lang );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "addTextLang", var3 );
			this.outputLogReturnFunction( "addTextLang", var3.getErrorStatus(), lang );
			throw var3;
		}

		this.outputLogReturnFunction( "addTextLang", 0, lang );
	}

	public void addTextRotate( int rotate ) throws PrinterException
	{
		this.outputLogCallFunction( "addTextRotate", rotate );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddTextRotate( this.getEdcHandle(), rotate );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "addTextRotate", var3 );
			this.outputLogReturnFunction( "addTextRotate", var3.getErrorStatus(), rotate );
			throw var3;
		}

		this.outputLogReturnFunction( "addTextRotate", 0, rotate );
	}

	public void addTextSize( int width, int height ) throws PrinterException
	{
		this.outputLogCallFunction( "addTextSize", width, height );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddTextSize( this.getEdcHandle(), ( long ) width, ( long ) height );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var4 )
		{
			this.outputException( "addTextSize", var4 );
			this.outputLogReturnFunction( "addTextSize", var4.getErrorStatus(), width, height );
			throw var4;
		}

		this.outputLogReturnFunction( "addTextSize", 0, width, height );
	}

	public void addTextSmooth( int smooth ) throws PrinterException
	{
		this.outputLogCallFunction( "addTextSmooth", smooth );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddTextSmooth( this.getEdcHandle(), smooth );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "addTextSmooth", var3 );
			this.outputLogReturnFunction( "addTextSmooth", var3.getErrorStatus(), smooth );
			throw var3;
		}

		this.outputLogReturnFunction( "addTextSmooth", 0, smooth );
	}

	public void addTextStyle( int reverse, int ul, int em, int color ) throws PrinterException
	{
		this.outputLogCallFunction( "addTextStyle", reverse, ul, em, color );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2AddTextStyle( this.getEdcHandle(), reverse, ul, em, color );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var6 )
		{
			this.outputException( "addTextStyle", var6 );
			this.outputLogReturnFunction( "addTextStyle", var6.getErrorStatus(), reverse, ul, em, color );
			throw var6;
		}

		this.outputLogReturnFunction( "addTextStyle", 0, reverse, ul, em, color );
	}

	public void beginTransaction() throws PrinterException
	{
		this.outputLogCallFunction( "beginTransaction" );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2BeginTransaction( this.mPrinterHandle );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var2 )
		{
			this.outputException( "beginTransaction", var2 );
			this.outputLogReturnFunction( "beginTransaction", var2.getErrorStatus() );
			throw var2;
		}

		this.outputLogReturnFunction( "beginTransaction", 0 );
	}

	public void cancelInsertion() throws PrinterException
	{
		this.outputLogCallFunction( "cancelInsertion", new Object[0] );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2CancelInsertion( this.mPrinterHandle );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var2 )
		{
			this.outputException( "cancelInsertion", var2 );
			this.outputLogReturnFunction( "cancelInsertion", var2.getErrorStatus(), new Object[0] );
			throw var2;
		}

		this.outputLogReturnFunction( "cancelInsertion", 0, new Object[0] );
	}

	protected void checkHandle() throws PrinterException
	{
		if ( commPort == null )
			throw new PrinterException( 255 );
	}

	public void cleanMicrReader( int timeout ) throws PrinterException
	{
		this.outputLogCallFunction( "cleanMicrReader", new Object[] {this.mWaitTime, timeout} );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2CleanMicrReader( this.mPrinterHandle, ( long ) this.mWaitTime, ( long ) timeout );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "cleanMicrReader", var3 );
			this.outputLogReturnFunction( "cleanMicrReader", var3.getErrorStatus(), new Object[] {this.mWaitTime, timeout} );
			throw var3;
		}

		this.outputLogReturnFunction( "cleanMicrReader", 0, new Object[] {this.mWaitTime, timeout} );
	}

	public void clearCommandBuffer()
	{
		// I don't think this is correct
		buffer.clear();
	}

	public void connect( String target, int timeout ) throws PrinterException
	{
		commPort = CommPort.linuxLPT( target );
	}

	public void disconnect() throws PrinterException
	{
		commPort = null;
	}

	public void beeper()
	{
		addBytes( BEL );
	}

	public void ejectPaper() throws PrinterException
	{


		this.outputLogCallFunction( "ejectPaper", new Object[0] );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2EjectPaper( this.mPrinterHandle );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var2 )
		{
			this.outputException( "ejectPaper", var2 );
			this.outputLogReturnFunction( "ejectPaper", var2.getErrorStatus(), new Object[0] );
			throw var2;
		}

		this.outputLogReturnFunction( "ejectPaper", 0, new Object[0] );
	}

	public void endTransaction() throws PrinterException
	{
		this.outputLogCallFunction( "endTransaction" );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2EndTransaction( this.mPrinterHandle );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var2 )
		{
			this.outputException( "endTransaction", var2 );
			this.outputLogReturnFunction( "endTransaction", var2.getErrorStatus() );
			throw var2;
		}

		this.outputLogReturnFunction( "endTransaction", 0 );
	}

	protected void finalize() throws Throwable
	{
		this.mStatusChangeListener = null;
		this.mReceiveListener = null;
		this.mConnectionListener = null;

		try
		{
			if ( this.mPrinterHandle != 0L )
			{
				this.nativeEpos2Disconnect( this.mPrinterHandle );
				this.nativeEpos2ClearCommandBuffer( this.mPrinterHandle );
				this.nativeEpos2DestroyHandle( this.mPrinterHandle );
				this.mPrinterHandle = 0L;
			}
		}
		finally
		{
			super.finalize();
		}

		this.outputLogReturnFunction( "finalize", 0, new Object[0] );
	}

	public void forceCommand( byte[] data, int timeout ) throws PrinterException
	{
		this.outputLogCallFunction( "forceCommand", new Object[] {data, timeout} );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2ForceCommand( this.mPrinterHandle, data, this.mMode40Cpl, timeout );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var4 )
		{
			this.outputException( "forceCommand", var4 );
			this.outputLogReturnFunction( "forceCommand", var4.getErrorStatus(), new Object[] {data, timeout} );
			throw var4;
		}

		this.outputLogReturnFunction( "forceCommand", 0, new Object[] {data, timeout} );
	}

	public void forcePulse( int drawer, int pulseTime, int timeout ) throws PrinterException
	{
		this.outputLogCallFunction( "forcePulse", drawer, pulseTime, timeout );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2ForcePulse( this.mPrinterHandle, drawer, pulseTime, timeout );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var5 )
		{
			this.outputException( "forcePulse", var5 );
			this.outputLogReturnFunction( "forcePulse", var5.getErrorStatus(), drawer, pulseTime, timeout );
			throw var5;
		}

		this.outputLogReturnFunction( "forcePulse", 0, drawer, pulseTime, timeout );
	}

	public void forceRecover( int timeout ) throws PrinterException
	{
		this.outputLogCallFunction( "forceRecover", timeout );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2ForceRecover( this.mPrinterHandle, timeout );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "forceRecover", var3 );
			this.outputLogReturnFunction( "forceRecover", var3.getErrorStatus(), timeout );
			throw var3;
		}

		this.outputLogReturnFunction( "forceRecover", 0, timeout );
	}

	public void forceReset( int timeout ) throws PrinterException
	{
		this.outputLogCallFunction( "forceReset", timeout );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2ForceReset( this.mPrinterHandle, timeout );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "forceReset", var3 );
			this.outputLogReturnFunction( "forceReset", var3.getErrorStatus(), timeout );
			throw var3;
		}

		this.outputLogReturnFunction( "forceReset", 0, timeout );
	}

	public String getAdmin()
	{
		String admin = null;
		this.outputLogCallFunction( "getAdmin", new Object[0] );
		if ( this.mPrinterHandle == 0L )
		{
			this.outputLogReturnFunction( "getAdmin", 256, new Object[0] );
			return "";
		}
		else
		{
			admin = this.nativeEpos2GetAdmin( this.mPrinterHandle );
			if ( admin != null )
			{
				this.outputLogReturnFunction( "getAdmin", 0, new Object[] {admin} );
			}
			else
			{
				this.outputLogReturnFunction( "getAdmin", 256, new Object[0] );
			}

			return admin;
		}
	}

	private long getEdcHandle()
	{
		return this.mPrinterHandle;
	}

	public int getInterval()
	{
		return this.mInterval;
	}

	public void setInterval( int interval ) throws PrinterException
	{
		this.outputLogCallFunction( "setInterval", interval );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2SetInterval( this.mPrinterHandle, ( long ) interval );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}

			this.mInterval = interval;
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "setInterval", var3 );
			this.outputLogReturnFunction( "setInterval", var3.getErrorStatus(), interval );
			throw var3;
		}

		this.outputLogReturnFunction( "setInterval", 0, interval );
	}

	public String getLocation()
	{
		String location = null;
		this.outputLogCallFunction( "getLocation", new Object[0] );
		if ( this.mPrinterHandle == 0L )
		{
			this.outputLogReturnFunction( "getLocation", 256, new Object[0] );
			return "";
		}
		else
		{
			location = this.nativeEpos2GetLocation( this.mPrinterHandle );
			if ( location != null )
			{
				this.outputLogReturnFunction( "getLocation", 0, new Object[] {location} );
			}
			else
			{
				this.outputLogReturnFunction( "getLocation", 256, new Object[0] );
			}

			return location;
		}
	}

	public int getMode40Cpl()
	{
		return this.mMode40Cpl;
	}

	public void setMode40Cpl( int mode ) throws PrinterException
	{
		this.outputLogCallFunction( "setMode40Cpl", new Object[] {mode} );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2SetMode40Cpl( this.mPrinterHandle, mode );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}

			this.mMode40Cpl = mode;
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "setMode40Cpl", var3 );
			this.outputLogReturnFunction( "setMode40Cpl", var3.getErrorStatus(), new Object[] {mode} );
			throw var3;
		}

		this.outputLogReturnFunction( "setMode40Cpl", 0, new Object[] {mode} );
	}

	public int getPaperType()
	{
		return this.mPaperType;
	}

	public HybridPrinterStatusInfo getStatus()
	{
		this.outputLogCallFunction( "getStatus", new Object[0] );
		HybridPrinterStatusInfo statusInfo = this.nativeEpos2GetStatus( this.mPrinterHandle );
		if ( statusInfo != null )
		{
			int connection = statusInfo.getConnection();
			int online = statusInfo.getOnline();
			int coverOpen = statusInfo.getCoverOpen();
			int paper = statusInfo.getPaper();
			int paperFeed = statusInfo.getPaperFeed();
			int panelSwitch = statusInfo.getPanelSwitch();
			int waitOnline = statusInfo.getOnline();
			int drawer = statusInfo.getDrawer();
			int errorStatus = statusInfo.getErrorStatus();
			int autoRecoverError = statusInfo.getAutoRecoverError();
			int insertionWaiting = statusInfo.getInsertionWaiting();
			int removalWaiting = statusInfo.getRemovalWaiting();
			int slipPaper = statusInfo.getSlipPaper();
			this.outputLogReturnFunction( "getStatus", 0, new Object[] {"connection->" + connection, "online->" + online, "coverOpen->" + coverOpen, "paper->" + paper, "paperFeed->" + paperFeed, "panelSwitch->" + panelSwitch, "waitOnline->" + waitOnline, "drawer->" + drawer, "errorStatus->" + errorStatus, "autoRecoverError->" + autoRecoverError, "insertionWaiting->" + insertionWaiting, "removalWaiting->" + removalWaiting, "slipPaper->" + slipPaper} );
		}
		else
		{
			this.outputLogReturnFunction( "getStatus", 257, new Object[0] );
		}

		return statusInfo;
	}

	public int getWaitTime()
	{
		return this.mWaitTime;
	}

	public void setWaitTime( int time ) throws PrinterException
	{
		this.outputLogCallFunction( "setWaitTime", new Object[] {time} );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2SetWaitTime( this.mPrinterHandle, ( long ) time );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}

			this.mWaitTime = time;
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "setWaitTime", var3 );
			this.outputLogReturnFunction( "setWaitTime", var3.getErrorStatus(), new Object[] {time} );
			throw var3;
		}

		this.outputLogReturnFunction( "setWaitTime", 0, new Object[] {time} );
	}

	private void initializePrinterInstance( int lang ) throws PrinterException
	{
		// Nothing Yet
	}

	private void onConnection( int eventType )
	{
		this.outputLogCallFunction( "onConnection", new Object[] {eventType, this} );
		if ( null != this.mConnectionListener )
		{
			this.outputLogEvent( "onConnection", new Object[] {"eventType->", eventType} );
			this.mConnectionListener.onConnection( this, eventType );
		}

		this.outputLogReturnFunction( "onConnection", 0, new Object[] {eventType, this} );
	}

	private void onHybdReceive( int method, int code, String micrData, HybridPrinterStatusInfo status )
	{
		int connection = status.getConnection();
		int online = status.getOnline();
		int coverOpen = status.getCoverOpen();
		int paper = status.getPaper();
		int paperFeed = status.getPaperFeed();
		int panelSwitch = status.getPanelSwitch();
		int waitOnline = status.getOnline();
		int drawer = status.getDrawer();
		int errorStatus = status.getErrorStatus();
		int autoRecoverError = status.getAutoRecoverError();
		int insertionWaiting = status.getInsertionWaiting();
		int removalWaiting = status.getRemovalWaiting();
		int slipPaper = status.getSlipPaper();
		this.outputLogCallFunction( "onHybdReceive", new Object[] {method, code, status, this} );
		if ( null != this.mReceiveListener )
		{
			this.outputLogEvent( "onHybdReceive", new Object[] {"method->", method, "code->", code, "connection->", connection, "online->", online, "coverOpen->", coverOpen, "paper->", paper, "paperFeed->", paperFeed, "panelSwitch->", panelSwitch, "waitOnline->", waitOnline, "drawer->", drawer, "errorStatus->", errorStatus, "autoRecoverError->", autoRecoverError, "insertionWaiting->", insertionWaiting, "removalWaiting->", removalWaiting, "slipPaper->", slipPaper} );
			this.mReceiveListener.onHybdReceive( this, method, code, micrData, status );
		}

		this.outputLogReturnFunction( "onHybdReceive", 0, new Object[] {method, code, status, this} );
	}

	private void onHybdStatusChange( int eventType )
	{
		this.outputLogCallFunction( "onHybdStatusChange", new Object[] {eventType, this} );
		if ( null != this.mStatusChangeListener )
		{
			this.outputLogEvent( "onHybdStatusChange", new Object[] {"eventType->", eventType} );
			this.mStatusChangeListener.onHybdStatusChange( this, eventType );
		}

		this.outputLogReturnFunction( "onHybdStatusChange", 0, new Object[] {eventType, this} );
	}

	void outputException( String methodName, Exception exception )
	{
		try
		{
			this.mOutputExceptionMethod.invoke( this.mClassOutputLog, methodName, this.mPrinterHandle, exception );
		}
		catch ( Exception var4 )
		{
		}
	}

	void outputLogCallFunction( String methodName, Object... param )
	{
		try
		{
			this.mOutputLogCallFunctionMethod.invoke( this.mClassOutputLog, methodName, this.mPrinterHandle, param );
		}
		catch ( Exception var4 )
		{
		}
	}

	void outputLogEvent( String methodName, Object... param )
	{
		try
		{
			this.mOutputLogEventMethod.invoke( this.mClassOutputLog, methodName, this.mPrinterHandle, param );
		}
		catch ( Exception var4 )
		{
		}
	}

	void outputLogReturnFunction( String methodName, int result, Object... param )
	{
		try
		{
			this.mOutputLogReturnFunctionMethod.invoke( this.mClassOutputLog, methodName, this.mPrinterHandle, result, param );
		}
		catch ( Exception var5 )
		{
		}
	}

	public void readMicrData( int micrFont, int timeout ) throws PrinterException
	{
		this.outputLogCallFunction( "readMicrData", new Object[] {micrFont, this.mWaitTime, timeout} );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2ReadMicrData( this.mPrinterHandle, micrFont, ( long ) this.mWaitTime, ( long ) timeout );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var4 )
		{
			this.outputException( "readMicrData", var4 );
			this.outputLogReturnFunction( "readMicrData", var4.getErrorStatus(), new Object[] {micrFont, this.mWaitTime, timeout} );
			throw var4;
		}

		this.outputLogReturnFunction( "readMicrData", 0, new Object[] {micrFont, this.mWaitTime, timeout} );
	}

	public void selectPaperType( int paperType ) throws PrinterException
	{
		this.outputLogCallFunction( "selectPaperType", new Object[] {paperType} );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2SelectPaperType( this.mPrinterHandle, paperType );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}

			this.mPaperType = paperType;
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "selectPaperType", var3 );
			this.outputLogReturnFunction( "selectPaperType", var3.getErrorStatus(), new Object[] {paperType} );
			throw var3;
		}

		this.outputLogReturnFunction( "selectPaperType", 0, new Object[] {paperType} );
	}

	public void sendData( int timeout ) throws PrinterException
	{
		this.outputLogCallFunction( "sendData", new Object[] {this.mMode40Cpl, timeout} );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2SendData( this.mPrinterHandle, this.mMode40Cpl, ( long ) timeout, 0 );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "sendData", var3 );
			this.outputLogReturnFunction( "sendData", var3.getErrorStatus(), new Object[] {this.mMode40Cpl, timeout} );
			throw var3;
		}

		this.outputLogReturnFunction( "sendData", 0, new Object[] {this.mMode40Cpl, timeout} );
	}

	public void setConnectionEventListener( ConnectionListener listener )
	{
		this.outputLogCallFunction( "setConnectionEventListener", new Object[] {listener} );
		if ( this.mPrinterHandle != 0L )
		{
			if ( listener != null )
			{
				this.mConnectionListener = listener;
			}
			else
			{
				this.mConnectionListener = null;
			}

		}
	}

	public void setReceiveEventListener( HybdReceiveListener hybdReceiveListener )
	{
		this.outputLogCallFunction( "setReceiveEventListener", new Object[] {hybdReceiveListener} );
		if ( this.mPrinterHandle != 0L )
		{
			if ( hybdReceiveListener != null )
			{
				this.mReceiveListener = hybdReceiveListener;
			}
			else
			{
				this.mReceiveListener = null;
			}

		}
	}

	public void setStatusChangeEventListener( HybdStatusChangeListener hybdStatusChangeListener )
	{
		this.outputLogCallFunction( "setStatusChangeEventListener", new Object[] {hybdStatusChangeListener} );
		if ( this.mPrinterHandle != 0L )
		{
			if ( hybdStatusChangeListener != null )
			{
				this.mStatusChangeListener = hybdStatusChangeListener;
			}
			else
			{
				this.mStatusChangeListener = null;
			}

		}
	}

	public void startMonitor() throws PrinterException
	{
		this.outputLogCallFunction( "startMonitor" );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2StartMonitor( this.mPrinterHandle );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var2 )
		{
			this.outputException( "startMonitor", var2 );
			this.outputLogReturnFunction( "startMonitor", var2.getErrorStatus() );
			throw var2;
		}

		this.outputLogReturnFunction( "startMonitor", 0 );
	}

	public void stopMonitor() throws PrinterException
	{
		this.outputLogCallFunction( "stopMonitor" );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2StopMonitor( this.mPrinterHandle );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var2 )
		{
			this.outputException( "stopMonitor", var2 );
			this.outputLogReturnFunction( "stopMonitor", var2.getErrorStatus() );
			throw var2;
		}

		this.outputLogReturnFunction( "stopMonitor", 0 );
	}

	public void waitInsertion( int timeout ) throws PrinterException
	{
		this.outputLogCallFunction( "waitInsertion", new Object[] {this.mWaitTime, timeout} );

		try
		{
			this.checkHandle();
			int errStatus = this.nativeEpos2WaitInsertion( this.mPrinterHandle, ( long ) this.mWaitTime, ( long ) timeout );
			if ( 0 != errStatus )
			{
				throw new PrinterException( errStatus );
			}
		}
		catch ( PrinterException var3 )
		{
			this.outputException( "waitInsertion", var3 );
			this.outputLogReturnFunction( "waitInsertion", var3.getErrorStatus(), new Object[] {this.mWaitTime, timeout} );
			throw var3;
		}

		this.outputLogReturnFunction( "waitInsertion", 0, new Object[] {this.mWaitTime, timeout} );
	}*/
}
