package jpos;

public abstract interface BeltConst
{
	public static final int BELT_MT_FORWARD = 1;
	public static final int BELT_MT_BACKWARD = 2;
	public static final int BELT_MT_STOPPED = 3;
	public static final int BELT_MT_EMERGENCY = 4;
	public static final int BELT_MT_MOTOR_FAULT = 5;
	public static final int BELT_AIC_BACKWARD = 1;
	public static final int BELT_AIC_FORWARD = 2;
	public static final int BELT_RIC_BACKWARD = 1;
	public static final int BELT_RIC_FORWARD = 2;
	public static final int BELT_SUE_AUTO_STOP = 11;
	public static final int BELT_SUE_EMERGENCY_STOP = 12;
	public static final int BELT_SUE_SAFETY_STOP = 13;
	public static final int BELT_SUE_TIMEOUT_STOP = 14;
	public static final int BELT_SUE_MOTOR_OVERHEATING = 15;
	public static final int BELT_SUE_MOTOR_FUSE_DEFECT = 16;
	public static final int BELT_SUE_LIGHT_BARRIER_BACKWARD_INTERRUPTED = 17;
	public static final int BELT_SUE_LIGHT_BARRIER_BACKWARD_OK = 18;
	public static final int BELT_SUE_LIGHT_BARRIER_FORWARD_INTERRUPTED = 19;
	public static final int BELT_SUE_LIGHT_BARRIER_FORWARD_OK = 20;
	public static final int BELT_SUE_SECURITY_FLAP_BACKWARD_OPENED = 21;
	public static final int BELT_SUE_SECURITY_FLAP_BACKWARD_CLOSED = 22;
	public static final int BELT_SUE_SECURITY_FLAP_FORWARD_OPENED = 23;
	public static final int BELT_SUE_SECURITY_FLAP_FORWARD_CLOSED = 24;
}
