package jpos;

public abstract interface SmartCardRWConst
{
	public static final int SC_CMODE_TRANS = 1;
	public static final int SC_CMODE_BLOCK = 2;
	public static final int SC_CMODE_APDU = 4;
	public static final int SC_CMODE_XML = 8;
	public static final int SC_CMODE_ISO = 1;
	public static final int SC_CMODE_EMV = 2;
	public static final int SC_CTRANS_PROTOCOL_T0 = 1;
	public static final int SC_CTRANS_PROTOCOL_T1 = 2;
	public static final int SC_MODE_TRANS = 1;
	public static final int SC_MODE_BLOCK = 2;
	public static final int SC_MODE_APDU = 4;
	public static final int SC_MODE_XML = 8;
	public static final int SC_MODE_ISO = 1;
	public static final int SC_MODE_EMV = 2;
	public static final int SC_TRANS_PROTOCOL_T0 = 1;
	public static final int SC_TRANS_PROTOCOL_T1 = 2;
	public static final int SC_READ_DATA = 11;
	public static final int SC_READ_PROGRAM = 12;
	public static final int SC_EXECUTE_AND_READ_DATA = 13;
	public static final int SC_XML_READ_BLOCK_DATA = 14;
	public static final int SC_STORE_DATA = 21;
	public static final int SC_STORE_PROGRAM = 22;
	public static final int SC_EXECUTE_DATA = 23;
	public static final int SC_XML_BLOCK_DATA = 24;
	public static final int SC_SECURITY_FUSE = 25;
	public static final int SC_RESET = 26;
	public static final int SC_SUE_NO_CARD = 1;
	public static final int SC_SUE_CARD_PRESENT = 2;
	public static final int JPOS_ESC_READ = 201;
	public static final int JPOS_ESC_WRITE = 202;
	public static final int JPOS_ESC_TORN = 203;
	public static final int JPOS_ESC_NO_CARD = 204;
}
