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

class DefaultDevCatInfo implements DevCatInfo
{
	private Profile profile = null;
	private DevCat devCat = null;
	private PropInfoList standardProps = new DefaultPropInfoList();
	private PropInfoList requiredProps = new DefaultPropInfoList();
	private PropInfoList optionalProps = new DefaultPropInfoList();

	DefaultDevCatInfo( Profile paramProfile, DevCat paramDevCat )
	{
		profile = paramProfile;
		devCat = paramDevCat;
	}

	public Profile getProfile()
	{
		return profile;
	}

	public DevCat getDevCat()
	{
		return devCat;
	}

	public PropInfoList getStandardProps()
	{
		return standardProps;
	}

	public PropInfoList getRequiredProps()
	{
		return requiredProps;
	}

	public PropInfoList getOptionalProps()
	{
		return optionalProps;
	}

	public String toString()
	{
		StringBuffer localStringBuffer = new StringBuffer();
		localStringBuffer.append( "<DevCatInfo>\n" );
		localStringBuffer.append( "   <Profile name = " + profile.getName() + " vendorName = " + profile.getVendorName() + "/>\n" );
		localStringBuffer.append( "   <DevCat name = " + devCat.toString() + "/>\n" );
		localStringBuffer.append( "</DevCatInfo>\n" );
		return localStringBuffer.toString();
	}
}
