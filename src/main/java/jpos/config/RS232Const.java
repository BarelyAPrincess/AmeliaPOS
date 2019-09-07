package jpos.config;

public abstract interface RS232Const
{
	public static final String RS232_PORT_NAME_PROP_NAME = "portName";
	public static final String RS232_BAUD_RATE_PROP_NAME = "baudRate";
	public static final String RS232_DATA_BITS_PROP_NAME = "dataBits";
	public static final String RS232_PARITY_PROP_NAME = "parity";
	public static final String RS232_STOP_BITS_PROP_NAME = "stopBits";
	public static final String RS232_FLOW_CONTROL_PROP_NAME = "flowControl";
	public static final String[] RS232_PROPS = {"portName", "baudRate", "dataBits", "parity", "stopBits", "flowControl"};
	public static final String[] RS232_BAUD_RATE_VALUES = {"2400", "4800", "7200", "9600", "14400", "19200", "38400", "57600", "115200", "75", "110", "134", "150", "300", "600", "1200", "1800"};
	public static final String RS232_DATA_BITS_4 = "4";
	public static final String RS232_DATA_BITS_5 = "5";
	public static final String RS232_DATA_BITS_6 = "6";
	public static final String RS232_DATA_BITS_7 = "7";
	public static final String RS232_DATA_BITS_8 = "8";
	public static final String[] RS232_DATA_BITS_VALUES = {"8", "7", "6", "5", "4"};
	public static final String RS232_PARITY_EVEN = "Even";
	public static final String RS232_PARITY_ODD = "Odd";
	public static final String RS232_PARITY_NONE = "None";
	public static final String RS232_PARITY_MARK = "Mark";
	public static final String RS232_PARITY_SPACE = "Space";
	public static final String[] RS232_PARITY_VALUES = {"None", "Even", "Odd", "Mark", "Space"};
	public static final String RS232_STOP_BITS_1 = "1";
	public static final String RS232_STOP_BITS_1_5 = "1.5";
	public static final String RS232_STOP_BITS_2 = "2";
	public static final String[] RS232_STOP_BITS_VALUES = {"1", "1.5", "2"};
	public static final String RS232_FLOW_CONTROL_XON_XOFF = "Xon/Xoff";
	public static final String RS232_FLOW_CONTROL_HARDWARE = "Hardware";
	public static final String RS232_FLOW_CONTROL_NONE = "None";
	public static final String[] RS232_FLOW_CONTROL_VALUES = {"None", "Xon/Xoff", "Hardware"};
	public static final String DEFAULT_RS232_PORT_NAME_VALUE = "";
	public static final String DEFAULT_RS232_BAUD_RATE_VALUE = "9600";
	public static final String DEFAULT_RS232_DATA_BITS_VALUE = "8";
	public static final String DEFAULT_RS232_PARITY_VALUE = "None";
	public static final String DEFAULT_RS232_STOP_BITS_VALUE = "1";
	public static final String DEFAULT_RS232_FLOW_CONTROL_VALUE = "Xon/Xoff";
}
