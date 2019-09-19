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

public abstract interface CheckScannerService17 extends BaseService, JposServiceInstance
{
	public abstract boolean getCapAutoGenerateFileID() throws JposException;

	public abstract boolean getCapAutoGenerateImageTagData() throws JposException;

	public abstract boolean getCapAutoSize() throws JposException;

	public abstract int getCapColor() throws JposException;

	public abstract boolean getCapConcurrentMICR() throws JposException;

	public abstract boolean getCapDefineCropArea() throws JposException;

	public abstract int getCapImageFormat() throws JposException;

	public abstract boolean getCapImageTagData() throws JposException;

	public abstract boolean getCapMICRDevice() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapStoreImageFiles() throws JposException;

	public abstract boolean getCapValidationDevice() throws JposException;

	public abstract boolean getAutoDisable() throws JposException;

	public abstract void setAutoDisable( boolean paramBoolean ) throws JposException;

	public abstract int getColor() throws JposException;

	public abstract void setColor( int paramInt ) throws JposException;

	public abstract boolean getConcurrentMICR() throws JposException;

	public abstract void setConcurrentMICR( boolean paramBoolean ) throws JposException;

	public abstract int getCropAreaCount() throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract int getDocumentHeight() throws JposException;

	public abstract void setDocumentHeight( int paramInt ) throws JposException;

	public abstract int getDocumentWidth() throws JposException;

	public abstract void setDocumentWidth( int paramInt ) throws JposException;

	public abstract String getFileID() throws JposException;

	public abstract void setFileID( String paramString ) throws JposException;

	public abstract int getFileIndex() throws JposException;

	public abstract void setFileIndex( int paramInt ) throws JposException;

	public abstract byte[] getImageData() throws JposException;

	public abstract int getImageFormat() throws JposException;

	public abstract void setImageFormat( int paramInt ) throws JposException;

	public abstract int getImageMemoryStatus() throws JposException;

	public abstract String getImageTagData() throws JposException;

	public abstract void setImageTagData( String paramString ) throws JposException;

	public abstract int getMapMode() throws JposException;

	public abstract void setMapMode( int paramInt ) throws JposException;

	public abstract int getMaxCropAreas() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract int getQuality() throws JposException;

	public abstract void setQuality( int paramInt ) throws JposException;

	public abstract String getQualityList() throws JposException;

	public abstract int getRemainingImagesEstimate() throws JposException;

	public abstract void beginInsertion( int paramInt ) throws JposException;

	public abstract void beginRemoval( int paramInt ) throws JposException;

	public abstract void clearImage( int paramInt ) throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void defineCropArea( int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5 ) throws JposException;

	public abstract void endInsertion() throws JposException;

	public abstract void endRemoval() throws JposException;

	public abstract void retrieveImage( int paramInt ) throws JposException;

	public abstract void retrieveMemory( int paramInt ) throws JposException;

	public abstract void storeImage( int paramInt ) throws JposException;
}
