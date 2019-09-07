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
