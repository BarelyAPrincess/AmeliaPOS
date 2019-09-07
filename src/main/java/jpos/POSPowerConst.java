package jpos;

public abstract interface POSPowerConst
{
	public static final int PWR_UPS_FULL = 1;
	public static final int PWR_UPS_WARNING = 2;
	public static final int PWR_UPS_LOW = 4;
	public static final int PWR_UPS_CRITICAL = 8;
	public static final int PWR_SOURCE_NA = 1;
	public static final int PWR_SOURCE_AC = 2;
	public static final int PWR_SOURCE_BATTERY = 3;
	public static final int PWR_SOURCE_BACKUP = 4;
	public static final int PWR_REASON_REQUEST = 1;
	public static final int PWR_REASON_ALLOW = 2;
	public static final int PWR_REASON_DENY = 3;
	public static final int PWR_SUE_UPS_FULL = 11;
	public static final int PWR_SUE_UPS_WARNING = 12;
	public static final int PWR_SUE_UPS_LOW = 13;
	public static final int PWR_SUE_UPS_CRITICAL = 14;
	public static final int PWR_SUE_FAN_STOPPED = 15;
	public static final int PWR_SUE_FAN_RUNNING = 16;
	public static final int PWR_SUE_TEMPERATURE_HIGH = 17;
	public static final int PWR_SUE_TEMPERATURE_OK = 18;
	public static final int PWR_SUE_SHUTDOWN = 19;
	public static final int PWR_SUE_BAT_LOW = 20;
	public static final int PWR_SUE_BAT_CRITICAL = 21;
	public static final int PWR_SUE_BAT_CAPACITY_REMAINING = 22;
	public static final int PWR_SUE_RESTART = 23;
	public static final int PWR_SUE_STANDBY = 24;
	public static final int PWR_SUE_USER_STANDBY = 25;
	public static final int PWR_SUE_SUSPEND = 26;
	public static final int PWR_SUE_USER_SUSPEND = 27;
	public static final int PWR_SUE_PWR_SOURCE = 28;
}
