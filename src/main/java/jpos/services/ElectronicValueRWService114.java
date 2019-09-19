/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.services;

import jpos.JposException;

public abstract interface ElectronicValueRWService114 extends ElectronicValueRWService113
{
	public abstract boolean getCapPINDevice() throws JposException;

	public abstract boolean getCapMembershipCertificate() throws JposException;

	public abstract boolean getCapTrainingMode() throws JposException;

	public abstract int getPINEntry() throws JposException;

	public abstract void setPINEntry( int paramInt ) throws JposException;

	public abstract int getServiceType() throws JposException;

	public abstract int getTrainingModeState() throws JposException;

	public abstract void setTrainingModeState( int paramInt ) throws JposException;

	public abstract void accessData( int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException;

	public abstract void activateEVService( int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException;

	public abstract void checkServiceRegistrationToMedium( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void clearParameterInformation() throws JposException;

	public abstract void closeDailyEVService( int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException;

	public abstract void deactivateEVService( int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException;

	public abstract void openDailyEVService( int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException;

	public abstract void queryLastSuccessfulTransactionResult() throws JposException;

	public abstract void registerServiceToMedium( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void retrieveResultInformation( String paramString, String[] paramArrayOfString ) throws JposException;

	public abstract void setParameterInformation( String paramString1, String paramString2 ) throws JposException;

	public abstract void unregisterServiceToMedium( int paramInt1, int paramInt2 ) throws JposException;

	public abstract void updateData( int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject ) throws JposException;
}
