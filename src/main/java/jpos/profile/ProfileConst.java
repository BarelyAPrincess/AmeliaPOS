/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.profile;

public abstract interface ProfileConst
{
	public static final PropType STRING_PROP_TYPE = StringPropType.getInstance();
	public static final PropType INTEGER_PROP_TYPE = IntegerPropType.getInstance();
	public static final PropType FLOAT_PROP_TYPE = FloatPropType.getInstance();
	public static final PropType BOOLEAN_PROP_TYPE = BooleanPropType.getInstance();
	public static final PropType CHARACTER_PROP_TYPE = CharacterPropType.getInstance();
	public static final PropType[] PROPTYPE_ARRAY = {STRING_PROP_TYPE, INTEGER_PROP_TYPE, FLOAT_PROP_TYPE, BOOLEAN_PROP_TYPE, CHARACTER_PROP_TYPE};
}
