package jpos.profile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class DefaultDevCatInfoList implements DevCatInfoList
{
	private List list = new ArrayList();

	public int getSize()
	{
		return list.size();
	}

	public boolean isEmpty()
	{
		return list.isEmpty();
	}

	public void add( DevCatInfo paramDevCatInfo )
	{
		list.add( paramDevCatInfo );
	}

	public void remove( DevCatInfo paramDevCatInfo )
	{
		list.remove( paramDevCatInfo );
	}

	public void removeAll()
	{
		list.clear();
	}

	public boolean contains( DevCatInfo paramDevCatInfo )
	{
		return list.contains( paramDevCatInfo );
	}

	public Iterator iterator()
	{
		getClass();
		return new DefaultIterator();
	}

	class DefaultIterator implements Iterator
	{
		private Iterator iterator = null;

		DefaultIterator()
		{
		}

		public DevCatInfo next()
		{
			return ( DevCatInfo ) iterator.next();
		}

		public boolean hasNext()
		{
			return iterator.hasNext();
		}
	}
}
