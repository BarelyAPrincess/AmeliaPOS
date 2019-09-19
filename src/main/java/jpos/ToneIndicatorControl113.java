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

public abstract interface ToneIndicatorControl113 extends ToneIndicatorControl112
{
	public abstract int getCapMelody() throws JposException;

	public abstract int getMelodyType() throws JposException;

	public abstract void setMelodyType( int paramInt ) throws JposException;

	public abstract int getMelodyVolume() throws JposException;

	public abstract void setMelodyVolume( int paramInt ) throws JposException;
}
