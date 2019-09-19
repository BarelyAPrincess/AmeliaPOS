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

import jpos.events.DataListener;
import jpos.events.DirectIOListener;
import jpos.events.ErrorListener;

public abstract interface MSRControl12 extends BaseControl
{
	public abstract boolean getCapISO() throws JposException;

	public abstract boolean getCapJISOne() throws JposException;

	public abstract boolean getCapJISTwo() throws JposException;

	public abstract String getAccountNumber() throws JposException;

	public abstract boolean getAutoDisable() throws JposException;

	public abstract void setAutoDisable( boolean paramBoolean ) throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract boolean getDecodeData() throws JposException;

	public abstract void setDecodeData( boolean paramBoolean ) throws JposException;

	public abstract int getErrorReportingType() throws JposException;

	public abstract void setErrorReportingType( int paramInt ) throws JposException;

	public abstract String getExpirationDate() throws JposException;

	public abstract String getFirstName() throws JposException;

	public abstract String getMiddleInitial() throws JposException;

	public abstract boolean getParseDecodeData() throws JposException;

	public abstract void setParseDecodeData( boolean paramBoolean ) throws JposException;

	public abstract String getServiceCode() throws JposException;

	public abstract String getSuffix() throws JposException;

	public abstract String getSurname() throws JposException;

	public abstract String getTitle() throws JposException;

	public abstract byte[] getTrack1Data() throws JposException;

	public abstract byte[] getTrack1DiscretionaryData() throws JposException;

	public abstract byte[] getTrack2Data() throws JposException;

	public abstract byte[] getTrack2DiscretionaryData() throws JposException;

	public abstract byte[] getTrack3Data() throws JposException;

	public abstract int getTracksToRead() throws JposException;

	public abstract void setTracksToRead( int paramInt ) throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void addDataListener( DataListener paramDataListener );

	public abstract void removeDataListener( DataListener paramDataListener );

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addErrorListener( ErrorListener paramErrorListener );

	public abstract void removeErrorListener( ErrorListener paramErrorListener );
}
