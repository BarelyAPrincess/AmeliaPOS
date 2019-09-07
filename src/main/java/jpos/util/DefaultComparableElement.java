package jpos.util;

public class DefaultComparableElement implements Comparable
{
	private Object object = null;

	public DefaultComparableElement( Object paramObject )
	{
		object = paramObject;
	}

	public int compareTo( Object paramObject )
	{
		return object.toString().compareTo( paramObject.toString() );
	}

	public boolean equals( Object paramObject )
	{
		return object.toString().equals( paramObject.toString() );
	}

	public Object getObject()
	{
		return object;
	}

	public String toString()
	{
		return object.toString();
	}
}
