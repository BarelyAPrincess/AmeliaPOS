package jpos.services;

import jpos.JposException;
import jpos.loader.JposServiceInstance;

public abstract interface ElectronicValueRWService112 extends BaseService, JposServiceInstance
{
	public abstract boolean getCapActivateService() throws JposException;

	public abstract boolean getCapAddValue() throws JposException;

	public abstract boolean getCapCancelValue() throws JposException;

	public abstract int getCapCardSensor() throws JposException;

	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract int getCapDetectionControl() throws JposException;

	public abstract boolean getCapElectronicMoney() throws JposException;

	public abstract boolean getCapEnumerateCardServices() throws JposException;

	public abstract boolean getCapIndirectTransactionLog() throws JposException;

	public abstract boolean getCapLockTerminal() throws JposException;

	public abstract boolean getCapLogStatus() throws JposException;

	public abstract boolean getCapMediumID() throws JposException;

	public abstract boolean getCapPoint() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapRealTimeData() throws JposException;

	public abstract boolean getCapStatisticsReporting() throws JposException;

	public abstract boolean getCapSubtractValue() throws JposException;

	public abstract boolean getCapTransaction() throws JposException;

	public abstract boolean getCapTransactionLog() throws JposException;

	public abstract boolean getCapUnlockTerminal() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract boolean getCapUpdateKey() throws JposException;

	public abstract boolean getCapUpdateStatistics() throws JposException;

	public abstract boolean getCapVoucher() throws JposException;

	public abstract boolean getCapWriteValue() throws JposException;

	public abstract String getAccountNumber() throws JposException;

	public abstract String getAdditionalSecurityInformation() throws JposException;

	public abstract void setAdditionalSecurityInformation( String paramString ) throws JposException;

	public abstract long getAmount() throws JposException;

	public abstract void setAmount( long paramLong ) throws JposException;

	public abstract String getApprovalCode() throws JposException;

	public abstract void setApprovalCode( String paramString ) throws JposException;

	public abstract boolean getAsyncMode() throws JposException;

	public abstract void setAsyncMode( boolean paramBoolean ) throws JposException;

	public abstract boolean getAutoDisable() throws JposException;

	public abstract void setAutoDisable( boolean paramBoolean ) throws JposException;

	public abstract long getBalance() throws JposException;

	public abstract long getBalanceOfPoint() throws JposException;

	public abstract String getCardServiceList() throws JposException;

	public abstract String getCurrentService() throws JposException;

	public abstract void setCurrentService( String paramString ) throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract boolean getDetectionControl() throws JposException;

	public abstract void setDetectionControl( boolean paramBoolean ) throws JposException;

	public abstract int getDetectionStatus() throws JposException;

	public abstract String getExpirationDate() throws JposException;

	public abstract String getLastUsedDate() throws JposException;

	public abstract int getLogStatus() throws JposException;

	public abstract String getMediumID() throws JposException;

	public abstract void setMediumID( String paramString ) throws JposException;

	public abstract int getOutputID() throws JposException;

	public abstract long getPoint() throws JposException;

	public abstract void setPoint( long paramLong ) throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract String getReaderWriterServiceList() throws JposException;

	public abstract int getSequenceNumber() throws JposException;

	public abstract long getSettledAmount() throws JposException;

	public abstract long getSettledPoint() throws JposException;

	public abstract String getTransactionLog() throws JposException;

	public abstract String getVoucherID() throws JposException;

	public abstract void setVoucherID( String paramString ) throws JposException;

	public abstract String getVoucherIDList() throws JposException;

	public abstract void setVoucherIDList( String paramString ) throws JposException;

	public abstract void accessLog( int paramInt1, int paramInt2, int paramInt3 ) throws JposException;

	public abstract void activateService( int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException;

	public abstract void addValue( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void beginDetection( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void beginRemoval( int paramInt ) throws JposException;

	public abstract void cancelValue( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void captureCard() throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void clearInputProperties() throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void endDetection() throws JposException;

	public abstract void endRemoval() throws JposException;

	public abstract void enumerateCardServices() throws JposException;

	public abstract void lockTerminal() throws JposException;

	public abstract void readValue( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void resetStatistics( String paramString ) throws JposException;

	public abstract void retrieveStatistics( String[] paramArrayOfString ) throws JposException;

	public abstract void subtractValue( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void transactionAccess( int paramInt ) throws JposException;

	public abstract void unlockTerminal() throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;

	public abstract void updateKey( int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException;

	public abstract void updateStatistics( String paramString ) throws JposException;

	public abstract void writeValue( int paramInt1, int paramInt2 ) throws JposException;
}
