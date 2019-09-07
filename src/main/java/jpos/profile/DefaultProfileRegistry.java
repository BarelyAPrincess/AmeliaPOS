package jpos.profile;

import java.util.Enumeration;
import java.util.Hashtable;

public class DefaultProfileRegistry implements ProfileRegistry
{
	private Hashtable table = new Hashtable();

	public int getSize()
	{
		return table.size();
	}

	public boolean isEmpty()
	{
		return table.isEmpty();
	}

	public boolean hasProfile( String paramString )
	{
		return table.containsKey( paramString );
	}

	public boolean hasProfile( Profile paramProfile )
	{
		return table.containsValue( paramProfile );
	}

	public Enumeration getProfiles()
	{
		return table.elements();
	}

	public Profile getProfile( String paramString )
	{
		return ( Profile ) table.get( paramString );
	}

	public void addProfile( Profile paramProfile )
	{
		table.put( paramProfile.getName(), paramProfile );
	}

	public void addProfile( String paramString, Profile paramProfile )
	{
		table.put( paramString, paramProfile );
	}

	public void removeProfile( Profile paramProfile )
	{
		table.remove( paramProfile.getName() );
	}

	public void removeProfile( String paramString )
	{
		table.remove( paramString );
	}
}
