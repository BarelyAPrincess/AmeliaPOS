package jpos.services;

import jpos.JposException;

public abstract interface MSRService12 extends BaseService
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
}
