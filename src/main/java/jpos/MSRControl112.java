package jpos;

public abstract interface MSRControl112 extends MSRControl111
{
	public abstract String getCapCardAuthentication() throws JposException;

	public abstract int getCapDataEncryption() throws JposException;

	public abstract int getCapDeviceAuthentication() throws JposException;

	public abstract boolean getCapTrackDataMasking() throws JposException;

	public abstract byte[] getAdditionalSecurityInformation() throws JposException;

	public abstract byte[] getCardAuthenticationData() throws JposException;

	public abstract int getCardAuthenticationDataLength() throws JposException;

	public abstract String getCardPropertyList() throws JposException;

	public abstract String getCardType() throws JposException;

	public abstract String getCardTypeList() throws JposException;

	public abstract int getDataEncryptionAlgorithm() throws JposException;

	public abstract void setDataEncryptionAlgorithm( int paramInt ) throws JposException;

	public abstract boolean getDeviceAuthenticated() throws JposException;

	public abstract int getDeviceAuthenticationProtocol() throws JposException;

	public abstract byte[] getTrack1EncryptedData() throws JposException;

	public abstract int getTrack1EncryptedDataLength() throws JposException;

	public abstract byte[] getTrack2EncryptedData() throws JposException;

	public abstract int getTrack2EncryptedDataLength() throws JposException;

	public abstract byte[] getTrack3EncryptedData() throws JposException;

	public abstract int getTrack3EncryptedDataLength() throws JposException;

	public abstract byte[] getTrack4EncryptedData() throws JposException;

	public abstract int getTrack4EncryptedDataLength() throws JposException;

	public abstract String getWriteCardType() throws JposException;

	public abstract void setWriteCardType( String paramString ) throws JposException;

	public abstract void authenticateDevice( byte[] paramArrayOfByte ) throws JposException;

	public abstract void deauthenticateDevice( byte[] paramArrayOfByte ) throws JposException;

	public abstract void retrieveCardProperty( String paramString, String[] paramArrayOfString ) throws JposException;

	public abstract void retrieveDeviceAuthenticationData( byte[] paramArrayOfByte ) throws JposException;

	public abstract void updateKey( String paramString1, String paramString2 ) throws JposException;
}
