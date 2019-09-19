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

public abstract interface LineDisplayControl16 extends LineDisplayControl15
{
	public abstract boolean getCapBlinkRate() throws JposException;

	public abstract int getCapCursorType() throws JposException;

	public abstract boolean getCapCustomGlyph() throws JposException;

	public abstract int getCapReadBack() throws JposException;

	public abstract int getCapReverse() throws JposException;

	public abstract int getBlinkRate() throws JposException;

	public abstract void setBlinkRate( int paramInt ) throws JposException;

	public abstract int getCursorType() throws JposException;

	public abstract void setCursorType( int paramInt ) throws JposException;

	public abstract String getCustomGlyphList() throws JposException;

	public abstract int getGlyphHeight() throws JposException;

	public abstract int getGlyphWidth() throws JposException;

	public abstract void defineGlyph( int paramInt, byte[] paramArrayOfByte ) throws JposException;

	public abstract void readCharacterAtCursor( int[] paramArrayOfInt ) throws JposException;
}
