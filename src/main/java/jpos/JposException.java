package jpos;

public class JposException extends Exception
{
	protected int errorCode;
	protected int errorCodeExtended;
	private Exception origException;

	public JposException( int paramInt )
	{
		this( paramInt, 0, "" + paramInt, null );
	}

	public JposException( int paramInt1, int paramInt2 )
	{
		this( paramInt1, paramInt2, "" + paramInt1 + ", " + paramInt2, null );
	}

	public JposException( int paramInt, String paramString )
	{
		this( paramInt, 0, paramString, null );
	}

	public JposException( int paramInt1, int paramInt2, String paramString )
	{
		this( paramInt1, paramInt2, paramString, null );
	}

	public JposException( int paramInt, String paramString, Exception paramException )
	{
		this( paramInt, 0, paramString, paramException );
	}

	public JposException( int paramInt1, int paramInt2, String paramString, Exception paramException )
	{
		super( paramString );
		errorCode = paramInt1;
		errorCodeExtended = paramInt2;
		origException = paramException;
	}

	public int getErrorCode()
	{
		return errorCode;
	}

	public int getErrorCodeExtended()
	{
		return errorCodeExtended;
	}

	public Exception getOrigException()
	{
		return origException;
	}
}