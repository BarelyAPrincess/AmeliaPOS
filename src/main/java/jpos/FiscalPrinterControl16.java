package jpos;

public abstract interface FiscalPrinterControl16 extends FiscalPrinterControl15
{
	public abstract boolean getCapAdditionalHeader() throws JposException;

	public abstract boolean getCapAdditionalTrailer() throws JposException;

	public abstract boolean getCapChangeDue() throws JposException;

	public abstract boolean getCapEmptyReceiptIsVoidable() throws JposException;

	public abstract boolean getCapFiscalReceiptStation() throws JposException;

	public abstract boolean getCapFiscalReceiptType() throws JposException;

	public abstract boolean getCapMultiContractor() throws JposException;

	public abstract boolean getCapOnlyVoidLastItem() throws JposException;

	public abstract boolean getCapPackageAdjustment() throws JposException;

	public abstract boolean getCapPostPreLine() throws JposException;

	public abstract boolean getCapSetCurrency() throws JposException;

	public abstract boolean getCapTotalizerType() throws JposException;

	public abstract int getActualCurrency() throws JposException;

	public abstract String getAdditionalHeader() throws JposException;

	public abstract void setAdditionalHeader( String paramString ) throws JposException;

	public abstract String getAdditionalTrailer() throws JposException;

	public abstract void setAdditionalTrailer( String paramString ) throws JposException;

	public abstract String getChangeDue() throws JposException;

	public abstract void setChangeDue( String paramString ) throws JposException;

	public abstract int getContractorId() throws JposException;

	public abstract void setContractorId( int paramInt ) throws JposException;

	public abstract int getDateType() throws JposException;

	public abstract void setDateType( int paramInt ) throws JposException;

	public abstract int getFiscalReceiptStation() throws JposException;

	public abstract void setFiscalReceiptStation( int paramInt ) throws JposException;

	public abstract int getFiscalReceiptType() throws JposException;

	public abstract void setFiscalReceiptType( int paramInt ) throws JposException;

	public abstract int getMessageType() throws JposException;

	public abstract void setMessageType( int paramInt ) throws JposException;

	public abstract String getPostLine() throws JposException;

	public abstract void setPostLine( String paramString ) throws JposException;

	public abstract String getPreLine() throws JposException;

	public abstract void setPreLine( String paramString ) throws JposException;

	public abstract int getTotalizerType() throws JposException;

	public abstract void setTotalizerType( int paramInt ) throws JposException;

	public abstract void setCurrency( int paramInt ) throws JposException;

	public abstract void printRecCash( long paramLong ) throws JposException;

	public abstract void printRecItemFuel( String paramString1, long paramLong1, int paramInt1, int paramInt2, long paramLong2, String paramString2, long paramLong3, String paramString3 ) throws JposException;

	public abstract void printRecItemFuelVoid( String paramString, long paramLong1, int paramInt, long paramLong2 ) throws JposException;

	public abstract void printRecPackageAdjustment( int paramInt, String paramString1, String paramString2 ) throws JposException;

	public abstract void printRecPackageAdjustVoid( int paramInt, String paramString ) throws JposException;

	public abstract void printRecRefundVoid( String paramString, long paramLong, int paramInt ) throws JposException;

	public abstract void printRecSubtotalAdjustVoid( int paramInt, long paramLong ) throws JposException;

	public abstract void printRecTaxID( String paramString ) throws JposException;
}
