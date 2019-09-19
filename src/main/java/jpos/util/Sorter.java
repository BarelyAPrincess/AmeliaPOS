/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.util;

import java.util.Enumeration;
import java.util.Vector;

public final class Sorter
{
	public static Comparable min( Vector paramVector )
	{
		Object localObject = null;
		Enumeration localEnumeration = paramVector.elements();
		while ( localEnumeration.hasMoreElements() )
		{
			Comparable localComparable = ( Comparable ) localEnumeration.nextElement();
			if ( localObject != null )
			{
				if ( ( ( Comparable ) localObject ).compareTo( localComparable ) > 0 )
				{
					localObject = localComparable;
				}
			}
			else
			{
				localObject = localComparable;
			}
		}
		return ( Comparable ) localObject;
	}

	public static Comparable max( Vector paramVector )
	{
		Object localObject = null;
		Enumeration localEnumeration = paramVector.elements();
		while ( localEnumeration.hasMoreElements() )
		{
			Comparable localComparable = ( Comparable ) localEnumeration.nextElement();
			if ( localObject != null )
			{
				if ( ( ( Comparable ) localObject ).compareTo( localComparable ) < 0 )
				{
					localObject = localComparable;
				}
			}
			else
			{
				localObject = localComparable;
			}
		}
		return ( Comparable ) localObject;
	}

	public static Vector insertionSort( Vector paramVector )
	{
		Comparable localComparable1 = min( paramVector );
		paramVector.removeElement( localComparable1 );
		paramVector.insertElementAt( localComparable1, 0 );
		for ( int i = 2; i < paramVector.size(); i++ )
		{
			Comparable localComparable2 = ( Comparable ) paramVector.elementAt( i );
			int j = 0;
			for ( j = i; ( j > 0 ) && ( localComparable2.compareTo( ( Comparable ) paramVector.elementAt( j - 1 ) ) < 0 ); j-- )
			{
				paramVector.setElementAt( paramVector.elementAt( j - 1 ), j );
			}
			paramVector.setElementAt( localComparable2, j );
		}
		return paramVector;
	}

	public static Vector mergeSort( Vector paramVector )
	{
		throw new RuntimeException( "Not yet implemented!" );
	}
}
