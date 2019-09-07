package jpos;

import jpos.events.DirectIOListener;
import jpos.events.StatusUpdateListener;

public abstract interface BeltControl112 extends BaseControl
{
	public abstract boolean getCapAutoStopBackward() throws JposException;

	public abstract boolean getCapAutoStopBackwardItemCount() throws JposException;

	public abstract boolean getCapAutoStopForward() throws JposException;

	public abstract boolean getCapAutoStopForwardItemCount() throws JposException;

	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapLightBarrierBackward() throws JposException;

	public abstract boolean getCapLightBarrierForward() throws JposException;

	public abstract boolean getCapMoveBackward() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapRealTimeData() throws JposException;

	public abstract boolean getCapSecurityFlapBackward() throws JposException;

	public abstract boolean getCapSecurityFlapForward() throws JposException;

	public abstract int getCapSpeedStepsBackward() throws JposException;

	public abstract int getCapSpeedStepsForward() throws JposException;

	public abstract boolean getCapStatisticsReporting() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract boolean getCapUpdateStatistics() throws JposException;

	public abstract boolean getAutoStopBackward() throws JposException;

	public abstract void setAutoStopBackward( boolean paramBoolean ) throws JposException;

	public abstract int getAutoStopBackwardDelayTime() throws JposException;

	public abstract void setAutoStopBackwardDelayTime( int paramInt ) throws JposException;

	public abstract int getAutoStopBackwardItemCount() throws JposException;

	public abstract boolean getAutoStopForward() throws JposException;

	public abstract void setAutoStopForward( boolean paramBoolean ) throws JposException;

	public abstract int getAutoStopForwardDelayTime() throws JposException;

	public abstract void setAutoStopForwardDelayTime( int paramInt ) throws JposException;

	public abstract int getAutoStopForwardItemCount() throws JposException;

	public abstract boolean getLightBarrierBackwardInterrupted() throws JposException;

	public abstract boolean getLightBarrierForwardInterrupted() throws JposException;

	public abstract int getMotionStatus() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract boolean getSecurityFlapBackwardOpened() throws JposException;

	public abstract boolean getSecurityFlapForwardOpened() throws JposException;

	public abstract void adjustItemCount( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void moveBackward( int paramInt ) throws JposException;

	public abstract void moveForward( int paramInt ) throws JposException;

	public abstract void resetBelt() throws JposException;

	public abstract void resetItemCount( int paramInt ) throws JposException;

	public abstract void resetStatistics( String paramString ) throws JposException;

	public abstract void retrieveStatistics( String[] paramArrayOfString ) throws JposException;

	public abstract void stopBelt() throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;

	public abstract void updateStatistics( String paramString ) throws JposException;

	public abstract void addDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void removeDirectIOListener( DirectIOListener paramDirectIOListener );

	public abstract void addStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );

	public abstract void removeStatusUpdateListener( StatusUpdateListener paramStatusUpdateListener );
}
