package jpos.profile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class DefaultPropInfoList implements PropInfoList
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

	public void add( PropInfo paramPropInfo )
	{
		list.add( paramPropInfo );
	}

	public void remove( PropInfo paramPropInfo )
	{
		list.remove( paramPropInfo );
	}

	public void removeAll()
	{
		list.clear();
	}

	public boolean contains( PropInfo paramPropInfo )
	{
		return list.contains( paramPropInfo );
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

		public PropInfo next()
		{
			return ( PropInfo ) iterator.next();
		}

		public boolean hasNext()
		{
			return iterator.hasNext();
		}
	}
}
