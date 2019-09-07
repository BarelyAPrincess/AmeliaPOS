package io.amelia.pos;

public class PrinterException extends Exception
{
	private static final long serialVersionUID = 1L;
	public static final int ERR_PARAM = 1;
	public static final int ERR_CONNECT = 2;
	public static final int ERR_TIMEOUT = 3;
	public static final int ERR_MEMORY = 4;
	public static final int ERR_ILLEGAL = 5;
	public static final int ERR_PROCESSING = 6;
	public static final int ERR_NOT_FOUND = 7;
	public static final int ERR_IN_USE = 8;
	public static final int ERR_TYPE_INVALID = 9;
	public static final int ERR_DISCONNECT = 10;
	public static final int ERR_ALREADY_OPENED = 11;
	public static final int ERR_ALREADY_USED = 12;
	public static final int ERR_BOX_COUNT_OVER = 13;
	public static final int ERR_BOX_CLIENT_OVER = 14;
	public static final int ERR_UNSUPPORTED = 15;
	public static final int ERR_FAILURE = 255;
	private int mErrorStatus = 255;

	public PrinterException( String message )
	{
		super( message );
	}

	public PrinterException( String message, Throwable cause )
	{
		super( message, cause );
	}

	public PrinterException( int value )
	{
		this.mErrorStatus = value;
	}

	public int getErrorStatus()
	{
		return this.mErrorStatus;
	}
}
