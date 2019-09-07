package jpos;

import jpos.events.DataListener;
import jpos.events.DirectIOListener;
import jpos.events.ErrorListener;
import jpos.events.StatusUpdateListener;

public abstract interface PINPadControl13 extends BaseControl
{
	public abstract int getCapDisplay() throws JposException;

	public abstract int getCapLanguage() throws JposException;

	public abstract boolean getCapKeyboard() throws JposException;

	public abstract boolean getCapMACCalculation() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapTone() throws JposException;

	public abstract String getAccountNumber() throws JposException;

	public abstract void setAccountNumber( String paramString ) throws JposException;

	public abstract String getAdditionalSecurityInformation() throws JposException;

	public abstract long getAmount() throws JposException;

	public abstract void setAmount( long paramLong ) throws JposException;

	public abstract String getAvailableLanguagesList() throws JposException;

	public abstract String getAvailablePromptsList() throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract String getEncryptedPIN() throws JposException;

	public abstract int getMaximumPINLength() throws JposException;

	public abstract void setMaximumPINLength( int paramInt ) throws JposException;

	public abstract String getMerchantID() throws JposException;

	public abstract void setMerchantID( String paramString ) throws JposException;

	public abstract int getMinimumPINLength() throws JposException;

	public abstract void setMinimumPINLength( int paramInt ) throws JposException;

	public abstract boolean getPINEntryEnabled() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract int getPrompt() throws JposException;

	public abstract void setPrompt( int paramInt ) throws JposException;

	public abstract String getPromptLanguage() throws JposException;

	public abstract void setPromptLanguage( String paramString ) throws JposException;

	public abstract String getTerminalID() throws JposException;

	public abstract void setTerminalID( String paramString ) throws JposException;

	public abstract byte[] getTrack1Data() throws JposException;

	public abstract void setTrack1Data( byte[] paramArrayOfByte ) throws JposException;

	public abstract byte[] getTrack2Data() throws JposException;

	public abstract void setTrack2Data( byte[] paramArrayOfByte ) throws JposException;

	public abstract byte[] getTrack3Data() throws JposException;

	public abstract void setTrack3Data( byte[] paramArrayOfByte ) throws JposException;

	public abstract int getTransactionType() throws JposException;

	public abstract void setTransactionType( int paramInt ) throws JposException;

	public abstract void beginEFTTransaction( String paramString, int paramInt ) throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void computeMAC( String paramString, String[] paramArrayOfString ) throws JposException;

	public abstract void enablePINEntry() throws JposException;

	public abstract void endEFTTransaction( int paramInt ) throws JposException;

	public abstract void updateKey( int paramInt, String paramString ) throws JposException;

	public abstract void verifyMAC( String paramString ) throws JposException;

	public abstract void addDataListener( DataListener paramDataListener );

	public abstract void removeDataListener( DataListener paramDataListener );

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addErrorListener( ErrorListener paramErrorListener );

	public abstract void removeErrorListener( ErrorListener paramErrorListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
