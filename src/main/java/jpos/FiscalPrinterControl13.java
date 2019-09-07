package jpos;

import jpos.events.DirectIOListener;
import jpos.events.ErrorListener;
import jpos.events.OutputCompleteListener;
import jpos.events.StatusUpdateListener;

public abstract interface FiscalPrinterControl13 extends BaseControl
{
	public abstract boolean getCapAdditionalLines() throws JposException;

	public abstract boolean getCapAmountAdjustment() throws JposException;

	public abstract boolean getCapAmountNotPaid() throws JposException;

	public abstract boolean getCapCheckTotal() throws JposException;

	public abstract boolean getCapCoverSensor() throws JposException;

	public abstract boolean getCapDoubleWidth() throws JposException;

	public abstract boolean getCapDuplicateReceipt() throws JposException;

	public abstract boolean getCapFixedOutput() throws JposException;

	public abstract boolean getCapHasVatTable() throws JposException;

	public abstract boolean getCapIndependentHeader() throws JposException;

	public abstract boolean getCapItemList() throws JposException;

	public abstract boolean getCapJrnEmptySensor() throws JposException;

	public abstract boolean getCapJrnNearEndSensor() throws JposException;

	public abstract boolean getCapJrnPresent() throws JposException;

	public abstract boolean getCapNonFiscalMode() throws JposException;

	public abstract boolean getCapOrderAdjustmentFirst() throws JposException;

	public abstract boolean getCapPercentAdjustment() throws JposException;

	public abstract boolean getCapPositiveAdjustment() throws JposException;

	public abstract boolean getCapPowerLossReport() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapPredefinedPaymentLines() throws JposException;

	public abstract boolean getCapReceiptNotPaid() throws JposException;

	public abstract boolean getCapRecEmptySensor() throws JposException;

	public abstract boolean getCapRecNearEndSensor() throws JposException;

	public abstract boolean getCapRecPresent() throws JposException;

	public abstract boolean getCapRemainingFiscalMemory() throws JposException;

	public abstract boolean getCapReservedWord() throws JposException;

	public abstract boolean getCapSetHeader() throws JposException;

	public abstract boolean getCapSetPOSID() throws JposException;

	public abstract boolean getCapSetStoreFiscalID() throws JposException;

	public abstract boolean getCapSetTrailer() throws JposException;

	public abstract boolean getCapSetVatTable() throws JposException;

	public abstract boolean getCapSlpEmptySensor() throws JposException;

	public abstract boolean getCapSlpFiscalDocument() throws JposException;

	public abstract boolean getCapSlpFullSlip() throws JposException;

	public abstract boolean getCapSlpNearEndSensor() throws JposException;

	public abstract boolean getCapSlpPresent() throws JposException;

	public abstract boolean getCapSlpValidation() throws JposException;

	public abstract boolean getCapSubAmountAdjustment() throws JposException;

	public abstract boolean getCapSubPercentAdjustment() throws JposException;

	public abstract boolean getCapSubtotal() throws JposException;

	public abstract boolean getCapTrainingMode() throws JposException;

	public abstract boolean getCapValidateJournal() throws JposException;

	public abstract boolean getCapXReport() throws JposException;

	public abstract int getAmountDecimalPlace() throws JposException;

	public abstract boolean getAsyncMode() throws JposException;

	public abstract void setAsyncMode( boolean paramBoolean ) throws JposException;

	public abstract boolean getCheckTotal() throws JposException;

	public abstract void setCheckTotal( boolean paramBoolean ) throws JposException;

	public abstract int getCountryCode() throws JposException;

	public abstract boolean getCoverOpen() throws JposException;

	public abstract boolean getDayOpened() throws JposException;

	public abstract int getDescriptionLength() throws JposException;

	public abstract boolean getDuplicateReceipt() throws JposException;

	public abstract void setDuplicateReceipt( boolean paramBoolean ) throws JposException;

	public abstract int getErrorLevel() throws JposException;

	public abstract int getErrorOutID() throws JposException;

	public abstract int getErrorState() throws JposException;

	public abstract int getErrorStation() throws JposException;

	public abstract String getErrorString() throws JposException;

	public abstract boolean getFlagWhenIdle() throws JposException;

	public abstract void setFlagWhenIdle( boolean paramBoolean ) throws JposException;

	public abstract boolean getJrnEmpty() throws JposException;

	public abstract boolean getJrnNearEnd() throws JposException;

	public abstract int getMessageLength() throws JposException;

	public abstract int getNumHeaderLines() throws JposException;

	public abstract int getNumTrailerLines() throws JposException;

	public abstract int getNumVatRates() throws JposException;

	public abstract int getOutputID() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract String getPredefinedPaymentLines() throws JposException;

	public abstract int getPrinterState() throws JposException;

	public abstract int getQuantityDecimalPlaces() throws JposException;

	public abstract int getQuantityLength() throws JposException;

	public abstract boolean getRecEmpty() throws JposException;

	public abstract boolean getRecNearEnd() throws JposException;

	public abstract int getRemainingFiscalMemory() throws JposException;

	public abstract String getReservedWord() throws JposException;

	public abstract boolean getSlpEmpty() throws JposException;

	public abstract boolean getSlpNearEnd() throws JposException;

	public abstract int getSlipSelection() throws JposException;

	public abstract void setSlipSelection( int paramInt ) throws JposException;

	public abstract boolean getTrainingModeActive() throws JposException;

	public abstract void beginFiscalDocument( int paramInt ) throws JposException;

	public abstract void beginFiscalReceipt( boolean paramBoolean ) throws JposException;

	public abstract void beginFixedOutput( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void beginInsertion( int paramInt ) throws JposException;

	public abstract void beginItemList( int paramInt ) throws JposException;

	public abstract void beginNonFiscal() throws JposException;

	public abstract void beginRemoval( int paramInt ) throws JposException;

	public abstract void beginTraining() throws JposException;

	public abstract void clearError() throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void endFiscalDocument() throws JposException;

	public abstract void endFiscalReceipt( boolean paramBoolean ) throws JposException;

	public abstract void endFixedOutput() throws JposException;

	public abstract void endInsertion() throws JposException;

	public abstract void endItemList() throws JposException;

	public abstract void endNonFiscal() throws JposException;

	public abstract void endRemoval() throws JposException;

	public abstract void endTraining() throws JposException;

	public abstract void getData( int paramInt, int[] paramArrayOfInt, String[] paramArrayOfString ) throws JposException;

	public abstract void getDate( String[] paramArrayOfString ) throws JposException;

	public abstract void getTotalizer( int paramInt1, int paramInt2, String[] paramArrayOfString ) throws JposException;

	public abstract void getVatEntry( int paramInt1, int paramInt2, int[] paramArrayOfInt ) throws JposException;

	public abstract void printDuplicateReceipt() throws JposException;

	public abstract void printFiscalDocumentLine( String paramString ) throws JposException;

	public abstract void printFixedOutput( int paramInt1, int paramInt2, String paramString ) throws JposException;

	public abstract void printNormal( int paramInt, String paramString ) throws JposException;

	public abstract void printPeriodicTotalsReport( String paramString1, String paramString2 ) throws JposException;

	public abstract void printPowerLossReport() throws JposException;

	public abstract void printRecItem( String paramString1, long paramLong1, int paramInt1, int paramInt2, long paramLong2, String paramString2 ) throws JposException;

	public abstract void printRecItemAdjustment( int paramInt1, String paramString, long paramLong, int paramInt2 ) throws JposException;

	public abstract void printRecMessage( String paramString ) throws JposException;

	public abstract void printRecNotPaid( String paramString, long paramLong ) throws JposException;

	public abstract void printRecRefund( String paramString, long paramLong, int paramInt ) throws JposException;

	public abstract void printRecSubtotal( long paramLong ) throws JposException;

	public abstract void printRecSubtotalAdjustment( int paramInt, String paramString, long paramLong ) throws JposException;

	public abstract void printRecTotal( long paramLong1, long paramLong2, String paramString ) throws JposException;

	public abstract void printRecVoid( String paramString ) throws JposException;

	public abstract void printRecVoidItem( String paramString, long paramLong1, int paramInt1, int paramInt2, long paramLong2, int paramInt3 ) throws JposException;

	public abstract void printReport( int paramInt, String paramString1, String paramString2 ) throws JposException;

	public abstract void printXReport() throws JposException;

	public abstract void printZReport() throws JposException;

	public abstract void resetPrinter() throws JposException;

	public abstract void setDate( String paramString ) throws JposException;

	public abstract void setHeaderLine( int paramInt, String paramString, boolean paramBoolean ) throws JposException;

	public abstract void setPOSID( String paramString1, String paramString2 ) throws JposException;

	public abstract void setStoreFiscalID( String paramString ) throws JposException;

	public abstract void setTrailerLine( int paramInt, String paramString, boolean paramBoolean ) throws JposException;

	public abstract void setVatTable() throws JposException;

	public abstract void setVatValue( int paramInt, String paramString ) throws JposException;

	public abstract void verifyItem( String paramString, int paramInt ) throws JposException;

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addErrorListener( ErrorListener paramErrorListener );

	public abstract void removeErrorListener( ErrorListener paramErrorListener );

	public abstract void addOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener );

	public abstract void removeOutputCompleteListener( OutputCompleteListener paramOutputCompleteListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
