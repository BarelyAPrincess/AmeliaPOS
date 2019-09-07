package jpos.util;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.JComponent;
import javax.swing.JPopupMenu;

public class PopupHelper
{
	static Dictionary dictionary = new Hashtable();
	static MouseListener popupMouseListener = new MouseAdapter()
	{
		void tryPopup( MouseEvent paramAnonymousMouseEvent )
		{
			if ( !paramAnonymousMouseEvent.isPopupTrigger() )
			{
				return;
			}
			Component localComponent = paramAnonymousMouseEvent.getComponent();
			Object[] arrayOfObject = ( Object[] ) PopupHelper.dictionary.get( localComponent );
			if ( arrayOfObject == null )
			{
				return;
			}
			JPopupMenu localJPopupMenu = ( JPopupMenu ) arrayOfObject[0];
			PopupListener localPopupListener = ( PopupListener ) arrayOfObject[1];
			int i = paramAnonymousMouseEvent.getX();
			int j = paramAnonymousMouseEvent.getY();
			boolean bool = true;
			if ( localPopupListener != null )
			{
				bool = localPopupListener.startPopup( i, j );
			}
			if ( bool )
			{
				localJPopupMenu.show( localComponent, i - 20, j - 10 );
			}
		}

		public void mousePressed( MouseEvent paramAnonymousMouseEvent )
		{
			tryPopup( paramAnonymousMouseEvent );
		}

		public void mouseReleased( MouseEvent paramAnonymousMouseEvent )
		{
			tryPopup( paramAnonymousMouseEvent );
		}
	};

	public static void setPopup( JComponent paramJComponent, JPopupMenu paramJPopupMenu )
	{
		setPopup( paramJComponent, paramJPopupMenu, null );
	}

	public static void setPopup( JComponent paramJComponent, JPopupMenu paramJPopupMenu, PopupListener paramPopupListener )
	{
		Object[] arrayOfObject = {paramJPopupMenu, paramPopupListener};
		dictionary.put( paramJComponent, arrayOfObject );
		paramJComponent.addMouseListener( popupMouseListener );
	}

	public static void removePopup( JComponent paramJComponent )
	{
		dictionary.remove( paramJComponent );
	}
}
