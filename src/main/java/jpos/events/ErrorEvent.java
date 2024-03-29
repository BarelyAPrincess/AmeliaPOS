/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.events;

public class ErrorEvent extends JposEvent
{
	protected int errorCode;
	protected int errorCodeExtended;
	protected int errorLocus;
	protected int errorResponse;

	public ErrorEvent( Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4 )
	{
		super( paramObject );
		errorCode = paramInt1;
		errorCodeExtended = paramInt2;
		errorLocus = paramInt3;
		errorResponse = paramInt4;
	}

	public int getErrorCode()
	{
		return errorCode;
	}

	public int getErrorCodeExtended()
	{
		return errorCodeExtended;
	}

	public int getErrorLocus()
	{
		return errorLocus;
	}

	public int getErrorResponse()
	{
		return errorResponse;
	}

	public void setErrorResponse( int paramInt )
	{
		errorResponse = paramInt;
	}
}
