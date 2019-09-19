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

public abstract interface DevCatVisitor
{
	public abstract void visitBumpBar( DevCat paramDevCat );

	public abstract void visitCashChanger( DevCat paramDevCat );

	public abstract void visitCashDrawer( DevCat paramDevCat );

	public abstract void visitCheckScanner( DevCat paramDevCat );

	public abstract void visitCAT( DevCat paramDevCat );

	public abstract void visitCoinDispenser( DevCat paramDevCat );

	public abstract void visitFiscalPrinter( DevCat paramDevCat );

	public abstract void visitHardTotals( DevCat paramDevCat );

	public abstract void visitKeylock( DevCat paramDevCat );

	public abstract void visitLineDisplay( DevCat paramDevCat );

	public abstract void visitMICR( DevCat paramDevCat );

	public abstract void visitMotionSensor( DevCat paramDevCat );

	public abstract void visitMSR( DevCat paramDevCat );

	public abstract void visitPinpad( DevCat paramDevCat );

	public abstract void visitPOSKeyboard( DevCat paramDevCat );

	public abstract void visitPOSPower( DevCat paramDevCat );

	public abstract void visitPOSPrinter( DevCat paramDevCat );

	public abstract void visitRemoteOrderDisplay( DevCat paramDevCat );

	public abstract void visitScanner( DevCat paramDevCat );

	public abstract void visitSignatureCapture( DevCat paramDevCat );

	public abstract void visitScale( DevCat paramDevCat );

	public abstract void visitToneIndicator( DevCat paramDevCat );

	public abstract void visitPointCardRW( DevCat paramDevCat );
}
