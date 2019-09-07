package jpos.profile;

public abstract interface PropInfo
{
	public abstract String getName();

	public abstract PropType getType();

	public abstract PropValue getDefaultValue();

	public abstract PropValueList getValues();

	public abstract DevCat getDevCat();

	public abstract PropInfoViewer getViewer();

	public abstract Profile getProfile();

	public abstract String getDescription();

	public abstract String getShortDescription();
}
