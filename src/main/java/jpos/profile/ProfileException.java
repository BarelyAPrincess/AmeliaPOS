package jpos.profile;

public class ProfileException extends Exception
{
	private Exception origException = null;

	public ProfileException( String paramString )
	{
		super( paramString );
	}

	public ProfileException( String paramString, Exception paramException )
	{
		this( paramString );
	}

	public Exception getOrigException()
	{
		return origException;
	}
}
