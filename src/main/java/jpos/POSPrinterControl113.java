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

public abstract interface POSPrinterControl113 extends POSPrinterControl112
{
	public abstract int getCapRecRuledLine() throws JposException;

	public abstract int getCapSlpRuledLine() throws JposException;

	public abstract void drawRuledLine( int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, int paramInt5 ) throws JposException;
}
