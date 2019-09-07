package io.amelia.pos;

import javax.swing.UIManager;

import java.awt.*;

public class Step9Main
{
	/**
	 * The application program starts from this point
	 */
	public Step9Main()
	{
		Step9Frame frame = new Step9Frame();
		//For center the window on the display.
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = frame.getSize();
		frame.setLocation( ( screenSize.width - frameSize.width ) / 2, ( screenSize.height - frameSize.height ) / 2 );
		frame.setVisible( true );
	}

	/**
	 * The method "Main"
	 */
	public static void main( String[] args )
	{
		try
		{
			UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
		new Step9Main();
	}
}