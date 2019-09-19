/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.services;

import jpos.JposException;

public abstract interface FiscalPrinterService112 extends FiscalPrinterService111
{
	public abstract void printRecItemRefund( String paramString1, long paramLong1, int paramInt1, int paramInt2, long paramLong2, String paramString2 ) throws JposException;

	public abstract void printRecItemRefundVoid( String paramString1, long paramLong1, int paramInt1, int paramInt2, long paramLong2, String paramString2 ) throws JposException;
}
