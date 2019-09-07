package jpos.profile;

import java.io.Serializable;

class DefaultPropInfo implements PropInfo, Serializable
{
	private Profile profile = null;
	private String name = "";
	private PropType type = null;
	private PropValue defaultValue = null;
	private PropValueList values = new DefaultPropValueList();
	private DevCat devCat = null;
	private PropInfoViewer viewer = null;
	private String description = "";
	private String shortDescription = "";

	public DefaultPropInfo( String paramString, Profile paramProfile )
	{
		name = paramString;
		profile = paramProfile;
	}

	public Profile getProfile()
	{
		return profile;
	}

	public String getName()
	{
		return name;
	}

	public PropType getType()
	{
		return type;
	}

	public PropValue getDefaultValue()
	{
		return defaultValue;
	}

	public PropValueList getValues()
	{
		return values;
	}

	public DevCat getDevCat()
	{
		return devCat;
	}

	public PropInfoViewer getViewer()
	{
		return viewer;
	}

	public String getDescription()
	{
		return description;
	}

	public String getShortDescription()
	{
		return shortDescription;
	}

	void setType( PropType paramPropType )
	{
		type = paramPropType;
	}

	void setDefaultValue( PropValue paramPropValue )
	{
		defaultValue = paramPropValue;
	}

	void setDevCat( DevCat paramDevCat )
	{
		devCat = paramDevCat;
	}

	void setViewer( PropInfoViewer paramPropInfoViewer )
	{
		viewer = paramPropInfoViewer;
	}

	void setDescription( String paramString )
	{
		description = paramString;
	}

	void setShortDescription( String paramString )
	{
		shortDescription = paramString;
	}
}
