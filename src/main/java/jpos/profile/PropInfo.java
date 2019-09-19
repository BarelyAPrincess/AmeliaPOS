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

public abstract interface PropInfo
{
	public abstract String getName();

	public abstract PropType getType();

	public abstract PropValue getDefaultValue();

	public abstract PropValueList getValues();

	public abstract DevCat getDevCat();

	public abstract PropInfoViewer getViewer();

	public abstract Profile getProfile();

	public abstract String getDescription();

	public abstract String getShortDescription();
}
