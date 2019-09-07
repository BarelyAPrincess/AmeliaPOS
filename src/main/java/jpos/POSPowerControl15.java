package jpos;

import jpos.events.DirectIOListener;
import jpos.events.StatusUpdateListener;

public abstract interface POSPowerControl15 extends BaseControl
{
	public abstract boolean getCapFanAlarm() throws JposException;

	public abstract boolean getCapHeatAlarm() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapQuickCharge() throws JposException;

	public abstract boolean getCapShutdownPOS() throws JposException;

	public abstract int getCapUPSChargeState() throws JposException;

	public abstract int getEnforcedShutdownDelayTime() throws JposException;

	public abstract void setEnforcedShutdownDelayTime( int paramInt ) throws JposException;

	public abstract int getPowerFailDelayTime() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract boolean getQuickChargeMode() throws JposException;

	public abstract int getQuickChargeTime() throws JposException;

	public abstract int getUPSChargeState() throws JposException;

	public abstract void shutdownPOS() throws JposException;

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}