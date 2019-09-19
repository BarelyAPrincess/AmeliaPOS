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

public abstract interface JposPropertiesConst
{
	public static final String JPOS_PROPERTIES_FILENAME = "jpos/res/jpos.properties";
	public static final String DEFAULT_ENTRIES_SER_FILE_NAME = "jpos.cfg";
	public static final String JPOS_SERVICE_MANAGER_CLASS_PROP_NAME = "jpos.config.serviceManagerClass";
	public static final String JPOS_SERVICE_MANAGER_CLASS_PROP_NAME2 = "jpos.loader.serviceManagerClass";
	public static final String JPOS_REG_POPULATOR_CLASS_PROP_NAME = "jpos.config.regPopulatorClass";
	public static final String JPOS_POPULATOR_FILE_PROP_NAME = "jpos.config.populatorFile";
	public static final String JPOS_POPULATOR_FILE_URL_PROP_NAME = "jpos.config.populatorFileURL";
	public static final String JPOS_TRACING_PROP_NAME = "jpos.util.tracing";
	public static final String JPOS_CONFIG_POPULATOR_CLASS_MULTIPROP_NAME = "jpos.config.populator.class";
	public static final String JPOS_CONFIG_POPULATOR_FILE_MULTIPROP_NAME = "jpos.config.populator.file";
	public static final String JPOS_TRACING_ON_PROP_VALUE = "ON";
	public static final String JPOS_TRACING_TRUE_PROP_VALUE = "TRUE";
	public static final String[] PROP_NAME_ARRAY = {"jpos.config.serviceManagerClass", "jpos.loader.serviceManagerClass", "jpos.config.regPopulatorClass", "jpos.config.populatorFile", "jpos.config.populatorFileURL", "jpos.util.tracing", "jpos.config.populator.class", "jpos.config.populator.file"};
}
