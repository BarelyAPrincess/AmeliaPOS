package jpos.services;

import jpos.JposException;
import jpos.loader.JposServiceInstance;

public abstract interface ImageScannerService111 extends BaseService, JposServiceInstance
{
	public abstract boolean getCapAim() throws JposException;

	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapDecodeData() throws JposException;

	public abstract boolean getCapHostTriggered() throws JposException;

	public abstract boolean getCapIlluminate() throws JposException;

	public abstract boolean getCapImageData() throws JposException;

	public abstract boolean getCapImageQuality() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapStatisticsReporting() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract boolean getCapUpdateStatistics() throws JposException;

	public abstract boolean getCapVideoData() throws JposException;

	public abstract boolean getAimMode() throws JposException;

	public abstract void setAimMode( boolean paramBoolean ) throws JposException;

	public abstract boolean getAutoDisable() throws JposException;

	public abstract void setAutoDisable( boolean paramBoolean ) throws JposException;

	public abstract int getBitsPerPixel() throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract byte[] getFrameData() throws JposException;

	public abstract int getFrameType() throws JposException;

	public abstract boolean getIlluminateMode() throws JposException;

	public abstract void setIlluminateMode( boolean paramBoolean ) throws JposException;

	public abstract int getImageHeight() throws JposException;

	public abstract int getImageLength() throws JposException;

	public abstract int getImageMode() throws JposException;

	public abstract void setImageMode( int paramInt ) throws JposException;

	public abstract int getImageQuality() throws JposException;

	public abstract void setImageQuality( int paramInt ) throws JposException;

	public abstract int getImageType() throws JposException;

	public abstract int getImageWidth() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract int getVideoCount() throws JposException;

	public abstract void setVideoCount( int paramInt ) throws JposException;

	public abstract int getVideoRate() throws JposException;

	public abstract void setVideoRate( int paramInt ) throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void clearInputProperties() throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void resetStatistics( String paramString ) throws JposException;

	public abstract void retrieveStatistics( String[] paramArrayOfString ) throws JposException;

	public abstract void startSession() throws JposException;

	public abstract void stopSession() throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;

	public abstract void updateStatistics( String paramString ) throws JposException;
}
