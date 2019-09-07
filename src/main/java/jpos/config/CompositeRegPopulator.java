package jpos.config;

import java.util.Iterator;

public abstract interface CompositeRegPopulator extends JposRegPopulator
{
	public static final String COMPOSITE_REG_POPULATOR_STRING = "JCL Composite Entries Populator";

	public abstract JposRegPopulator getDefaultPopulator();

	public abstract void add( JposRegPopulator paramJposRegPopulator );

	public abstract void remove( JposRegPopulator paramJposRegPopulator );

	public abstract Iterator getPopulators();

	public abstract JposRegPopulator getPopulator( String paramString );

	public abstract int size();
}
