/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos;

public abstract interface MSRControl110 extends MSRControl19
{
	public abstract int getCapWritableTracks() throws JposException;

	public abstract int getEncodingMaxLength() throws JposException;

	public abstract int getTracksToWrite() throws JposException;

	public abstract void setTracksToWrite( int paramInt ) throws JposException;

	public abstract void clearInputProperties() throws JposException;

	public abstract void writeTracks( byte[][] paramArrayOfByte, int paramInt ) throws JposException;
}
