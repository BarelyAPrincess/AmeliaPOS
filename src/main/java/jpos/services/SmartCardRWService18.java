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

public abstract interface SmartCardRWService18 extends BaseService, JposServiceInstance
{
	public abstract boolean getCapCardErrorDetection() throws JposException;

	public abstract int getCapInterfaceMode() throws JposException;

	public abstract int getCapIsoEmvMode() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract int getCapSCPresentSensor() throws JposException;

	public abstract int getCapSCSlots() throws JposException;

	public abstract boolean getCapStatisticsReporting() throws JposException;

	public abstract int getCapTransmissionProtocol() throws JposException;

	public abstract boolean getCapUpdateStatistics() throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract int getInterfaceMode() throws JposException;

	public abstract void setInterfaceMode( int paramInt ) throws JposException;

	public abstract int getIsoEmvMode() throws JposException;

	public abstract void setIsoEmvMode( int paramInt ) throws JposException;

	public abstract int getOutputID() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract int getSCPresentSensor() throws JposException;

	public abstract int getSCSlot() throws JposException;

	public abstract void setSCSlot( int paramInt ) throws JposException;

	public abstract boolean getTransactionInProgress() throws JposException;

	public abstract int getTransmissionProtocol() throws JposException;

	public abstract void beginInsertion( int paramInt ) throws JposException;

	public abstract void beginRemoval( int paramInt ) throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void endInsertion() throws JposException;

	public abstract void endRemoval() throws JposException;

	public abstract void readData( int paramInt, int[] paramArrayOfInt, String[] paramArrayOfString ) throws JposException;

	public abstract void resetStatistics( String paramString ) throws JposException;

	public abstract void retrieveStatistics( String[] paramArrayOfString ) throws JposException;

	public abstract void updateStatistics( String paramString ) throws JposException;

	public abstract void writeData( int paramInt1, int paramInt2, String paramString ) throws JposException;
}
