package jpos.config;

import java.io.Serializable;

public abstract interface JposEntryConst extends RS232Const, Serializable
{
	public static final String[] REQUIRED_PROPS = {"serviceInstanceFactoryClass", "logicalName", "serviceClass", "vendorName", "vendorURL", "deviceCategory", "jposVersion", "productName", "productDescription", "productURL"};
	public static final String LOGICAL_NAME_DEFAULT_PROP_VALUE = "UnknownDevice";
	public static final String SI_FACTORY_CLASS_DEFAULT_PROP_VALUE = "UnknownServiceInstanceFactoryClass";
	public static final String SERVICE_CLASS_DEFAULT_PROP_VALUE = "UnknownServiceClass";
	public static final String DEVICE_CATEGORY_DEFAULT_PROP_VALUE = "CashDrawer";
	public static final String JPOS_VERSION_DEFAULT_PROP_VALUE = "1.5";
	public static final String VENDOR_NAME_DEFAULT_PROP_VALUE = "Unknown Vendor Name";
	public static final String VENDOR_URL_DEFAULT_PROP_VALUE = "http://www.UnknownVerdorURL.com";
	public static final String PRODUCT_NAME_DEFAULT_PROP_VALUE = "Unknown Product Name";
	public static final String PRODUCT_URL_DEFAULT_PROP_VALUE = "http://www.UnknownProductURL.com";
	public static final String PRODUCT_DESCRIPTION_DEFAULT_PROP_VALUE = "Unknown Product Description";
	public static final String[] JPOS_VERSION_PROPS = {"1.2", "1.3", "1.4", "1.5", "1.6", "1.7", "1.8"};
	public static final String DEVICE_BUS_PROP_NAME = "deviceBus";
	public static final String RS232_DEVICE_BUS = "RS232";
	public static final String PARALLEL_DEVICE_BUS = "Parallel";
	public static final String USB_DEVICE_BUS = "USB";
	public static final String RS485_DEVICE_BUS = "RS485";
	public static final String HID_DEVICE_BUS = "HID";
	public static final String PROPRIETARY_DEVICE_BUS = "Proprietary";
	public static final String UNKNOWN_DEVICE_BUS = "Unknown";
	public static final String[] DEVICE_BUS_VALUES = {"RS232", "Parallel", "USB", "RS485", "HID", "Proprietary", "Unknown"};
	public static final Class DEFAULT_PROP_TYPE = String.class;
	public static final Class[] PROP_TYPES = {String.class, Boolean.class, Byte.class, Character.class, Double.class, Float.class, Integer.class, Long.class, Short.class};
	public static final String[] PROP_TYPES_SHORT_NAMES = {"String", "Boolean", "Byte", "Character", "Double", "Float", "Integer", "Long", "Short"};
}