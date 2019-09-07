package jpos.config.simple.xml;

import java.net.URL;
import java.util.Enumeration;

import jpos.config.simple.AbstractRegPopulator;

public class SimpleXmlRegPopulator extends AbstractRegPopulator implements XmlRegPopulator
{
	private XmlRegPopulator regPopulator = new XercesRegPopulator();

	public SimpleXmlRegPopulator()
	{
		super( SimpleXmlRegPopulator.class.getName() );
	}

	public SimpleXmlRegPopulator( String paramString )
	{
		super( paramString );
	}

	public String getClassName()
	{
		return SimpleXmlRegPopulator.class.getName();
	}

	public void save( Enumeration paramEnumeration ) throws Exception
	{
		regPopulator.save( paramEnumeration );
	}

	public void save( Enumeration paramEnumeration, String paramString ) throws Exception
	{
		regPopulator.save( paramEnumeration, paramString );
	}

	public void load()
	{
		regPopulator.load();
	}

	public void load( String paramString )
	{
		regPopulator.load( paramString );
	}

	public Enumeration getEntries()
	{
		return regPopulator.getEntries();
	}

	public URL getEntriesURL()
	{
		return regPopulator.getEntriesURL();
	}

	public String getName()
	{
		return regPopulator.getName();
	}

	public Exception getLastLoadException()
	{
		return regPopulator.getLastLoadException();
	}
}
