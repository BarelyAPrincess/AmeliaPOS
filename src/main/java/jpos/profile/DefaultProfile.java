/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.profile;

import java.io.Serializable;
import java.net.URL;

class DefaultProfile implements Profile, Serializable
{
	private String name = "";
	private String version = "";
	private String description = "";
	private String vendorName = "";
	private URL vendorUrl = null;
	private DevCatInfoList devCatInfoList = new DefaultDevCatInfoList();

	DefaultProfile( String paramString )
	{
		name = paramString;
	}

	public String getName()
	{
		return name;
	}

	public String getVersion()
	{
		return version;
	}

	public String getDescription()
	{
		return description;
	}

	public String getVendorName()
	{
		return vendorName;
	}

	public URL getVendorUrl()
	{
		return vendorUrl;
	}

	public DevCatInfoList getDevCatInfoList()
	{
		return devCatInfoList;
	}

	public String toString()
	{
		StringBuffer localStringBuffer = new StringBuffer();
		localStringBuffer.append( "<Profile name='" + getName() + "'>\n" );
		localStringBuffer.append( "    <ProfileInfo version='" + getVersion() + "' vendorName='" + getVendorName() + "'\n" );
		localStringBuffer.append( "                 vendorUrl=" + ( getVendorUrl() == null ? "'null'" : new StringBuffer().append( "'" ).append( getVendorUrl().toString() ).append( "'" ).toString() ) + "\n" );
		localStringBuffer.append( "                 description='" + getDescription() + "'/>\n" );
		localStringBuffer.append( "</Profile>" );
		return localStringBuffer.toString();
	}

	void setVersion( String paramString )
	{
		version = paramString;
	}

	void setDescription( String paramString )
	{
		description = paramString;
	}

	void setVendorName( String paramString )
	{
		vendorName = paramString;
	}

	void setVendorUrl( URL paramURL )
	{
		vendorUrl = paramURL;
	}
}
