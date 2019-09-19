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
import jpos.loader.JposServiceInstance;

public abstract interface POSPrinterService15 extends POSPrinterService14, JposServiceInstance
{
	public abstract int getCapJrnCartridgeSensor() throws JposException;

	public abstract int getCapJrnColor() throws JposException;

	public abstract int getCapRecCartridgeSensor() throws JposException;

	public abstract int getCapRecColor() throws JposException;

	public abstract int getCapRecMarkFeed() throws JposException;

	public abstract boolean getCapSlpBothSidesPrint() throws JposException;

	public abstract int getCapSlpCartridgeSensor() throws JposException;

	public abstract int getCapSlpColor() throws JposException;

	public abstract int getCartridgeNotify() throws JposException;

	public abstract void setCartridgeNotify( int paramInt ) throws JposException;

	public abstract int getJrnCartridgeState() throws JposException;

	public abstract int getJrnCurrentCartridge() throws JposException;

	public abstract void setJrnCurrentCartridge( int paramInt ) throws JposException;

	public abstract int getRecCartridgeState() throws JposException;

	public abstract int getRecCurrentCartridge() throws JposException;

	public abstract void setRecCurrentCartridge( int paramInt ) throws JposException;

	public abstract int getSlpCartridgeState() throws JposException;

	public abstract int getSlpCurrentCartridge() throws JposException;

	public abstract void setSlpCurrentCartridge( int paramInt ) throws JposException;

	public abstract int getSlpPrintSide() throws JposException;

	public abstract void changePrintSide( int paramInt ) throws JposException;

	public abstract void markFeed( int paramInt ) throws JposException;
}
