/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.loader;

import jpos.JposException;
import jpos.config.JposEntry;

public abstract interface JposServiceInstanceFactory
{
	public abstract JposServiceInstance createInstance( String paramString, JposEntry paramJposEntry ) throws JposException;
}
