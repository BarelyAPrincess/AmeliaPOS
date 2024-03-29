/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
/* Step 2 Check the status of the cash drawer.*/

package io.amelia.pos.client;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

import jpos.*;
import jpos.events.*;

import java.lang.Thread;

/**
 * Outline      The code to show the condition of
 * "status" and "power" is added.
 *
 * @author s.muroga
 * @version 1.00  (2001.04.23)
 */
public class Step2Frame extends JFrame implements StatusUpdateListener
{
	CashDrawerControl114 draw = new CashDrawer();

	JPanel contentPane;
	JPanel jPanel_cashDrawer = new JPanel();
	JPanel jPanel_statusNow = new JPanel();
	TitledBorder titledBorder1;
	TitledBorder titledBorder2;
	GridBagLayout gridBagLayout1 = new GridBagLayout();
	GridBagLayout gridBagLayout2 = new GridBagLayout();
	GridBagLayout gridBagLayout3 = new GridBagLayout();
	JLabel jLabel_status = new JLabel();
	JLabel jLabel_power = new JLabel();
	JTextField jTextField_status = new JTextField();
	JTextField jTextField_power = new JTextField();
	JButton jButton_open = new JButton();
	JButton jButton_close = new JButton();

	/**
	 * Constract "Frame"
	 */
	public Step2Frame()
	{
		enableEvents( AWTEvent.WINDOW_EVENT_MASK );
		try
		{
			jbInit();
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}

	/**
	 * Form the conponent
	 */
	private void jbInit() throws Exception
	{
		//setIconImage(Toolkit.getDefaultToolkit().createImage(Step2Frame.class.getResource("[Your Icon]")));
		contentPane = ( JPanel ) this.getContentPane();
		titledBorder1 = new TitledBorder( BorderFactory.createEtchedBorder( Color.white, new Color( 134, 134, 134 ) ), "Cash Drawer" );
		titledBorder2 = new TitledBorder( BorderFactory.createEtchedBorder( Color.white, new Color( 134, 134, 134 ) ), "Status now" );
		contentPane.setLayout( gridBagLayout1 );
		this.setSize( new Dimension( 300, 300 ) );
		this.setTitle( "Step 2 Check the status of the cash drawer." );
		jPanel_cashDrawer.setBorder( titledBorder1 );
		jPanel_cashDrawer.setLayout( gridBagLayout2 );
		jButton_open.setText( "Open" );
		jButton_open.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent e )
			{
				jButton_open_actionPerformed( e );
			}
		} );
		jButton_close.setText( "Close" );
		jButton_close.addActionListener( new ActionListener()
		{
			public void actionPerformed( ActionEvent e )
			{
				jButton_close_actionPerformed( e );
			}
		} );
		jPanel_statusNow.setBorder( titledBorder2 );
		jPanel_statusNow.setLayout( gridBagLayout3 );
		jLabel_status.setText( "Status" );
		jLabel_power.setText( "Power" );
		jTextField_status.setBackground( Color.lightGray );
		jTextField_status.setBorder( BorderFactory.createLoweredBevelBorder() );
		jTextField_power.setBackground( Color.lightGray );
		jTextField_power.setBorder( BorderFactory.createLoweredBevelBorder() );
		contentPane.add( jPanel_cashDrawer, new GridBagConstraints( 0, 0, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 15, 0, 0, 0 ), 20, 20 ) );
		jPanel_cashDrawer.add( jButton_open, new GridBagConstraints( 0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 5, 15, 5, 15 ), 130, 0 ) );
		contentPane.add( jPanel_statusNow, new GridBagConstraints( 0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets( 15, 0, 0, 0 ), 40, 20 ) );
		jPanel_statusNow.add( jLabel_status, new GridBagConstraints( 0, 0, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 5, 10, 5, 10 ), 0, 0 ) );
		jPanel_statusNow.add( jLabel_power, new GridBagConstraints( 0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 5, 10, 5, 10 ), 0, 0 ) );
		jPanel_statusNow.add( jTextField_status, new GridBagConstraints( 2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 50, 0 ) );
		jPanel_statusNow.add( jTextField_power, new GridBagConstraints( 2, 1, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 50, 0 ) );
		contentPane.add( jButton_close, new GridBagConstraints( 1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.SOUTHEAST, GridBagConstraints.NONE, new Insets( 0, 0, 0, 0 ), 0, 0 ) );
	}

	/**
	 * Outline     The processing code required in order to enable
	 *            or to disable use of service is written here.
	 * @param
	 * @exception JposException  This exception is fired toward the failure of
	 *                          the method which JavaPOS defines.
	 *
	 */
	/**
	 * When the window was closed
	 */
	protected void processWindowEvent( WindowEvent e )
	{
		super.processWindowEvent( e );
		if ( e.getID() == WindowEvent.WINDOW_CLOSING )
		{
			this.closing();
		}
		//When the window was opened
		else if ( e.getID() == WindowEvent.WINDOW_OPENED )
		{

			// JavaPOS's code for Step2
			// Set StatusUpdataEvent listener
			draw.addStatusUpdateListener( this );
			// JavaPOS's code for Step2--END

			// JavaPOS's code for Step1
			try
			{
				//Open the device.
				//Use the name of the device that connected with your computer.
				draw.open( "CashDrawer" );

				//Get the exclusive control right for the opened device.
				//Then the device is disable from other application.
				draw.claim( 1000 );

				// JavaPOS's code for Step2
				// Enable the PowerNotify
				if ( draw.getCapPowerReporting() != JposConst.JPOS_PR_NONE )
					draw.setPowerNotify( JposConst.JPOS_PN_ENABLED );
				// JavaPOS's code for Step2--END

				//Enable the device.
				draw.setDeviceEnabled( true );
			}
			catch ( JposException ex )
			{
			}
			// JavaPOS's code for Step1--END
		}
	}

	//*****************************Event*******************************************

	/**
	 * Outline      The condition of "status" and
	 * "power" is shown in each TextField.
	 */
	// JavaPOS's code for Step2
	public void statusUpdateOccurred( StatusUpdateEvent sue )
	{
		CashDrawerControl114 control = ( CashDrawerControl114 ) sue.getSource();

		switch ( sue.getStatus() )
		{
			case CashDrawerConst.CASH_SUE_DRAWERCLOSED:          //Drawer is closed.
				jTextField_status.setText( "Close" );
				jButton_open.setEnabled( true );
				this.setCursor( new Cursor( Cursor.DEFAULT_CURSOR ) );
				break;

			case CashDrawerConst.CASH_SUE_DRAWEROPEN:            //Drawer is opened.
				this.setCursor( new Cursor( Cursor.WAIT_CURSOR ) );
				jButton_open.setEnabled( false );
				jTextField_status.setText( "Open" );
				break;

			//The Power Reporting Requirements fires the event when the device power status is changed.
			case JposConst.JPOS_SUE_POWER_ONLINE:
				jTextField_power.setText( "ready" );
				break;

			case JposConst.JPOS_SUE_POWER_OFF:
				jTextField_power.setText( "OFF" );
				break;

			case JposConst.JPOS_SUE_POWER_OFFLINE:
				jTextField_power.setText( "not ready" );
				break;

			case JposConst.JPOS_SUE_POWER_OFF_OFFLINE:
				jTextField_power.setText( "Offline" );
				break;
		}
	}
	// JavaPOS's code for Step2--END

	//*****************************Button******************************************

	/**
	 * Outline      The code for opening a drawer are described.
	 */
	// JavaPOS's code for Step2
	void jButton_open_actionPerformed( ActionEvent e )
	{
		try
		{
			draw.openDrawer();
		}
		catch ( JposException ex )
		{
		}
	}
	// JavaPOS's code for Step2--END

	/**
	 * Outline      When the button "close" is pushed, The method
	 * "closing" is called.
	 */
	void jButton_close_actionPerformed( ActionEvent e )
	{
		this.closing();
	}

	//***********************Method*************************************************

	/**
	 * Outline     The code to finish a service.
	 */
	void closing()
	{
		// JavaPOS's code for Step1
		try
		{

			// JavaPOS's code for Step2

			// Remove StatusUpdateEvent listener
			draw.removeStatusUpdateListener( this );
			// JavaPOS's code for Step2--END

			//Cancel the device
			draw.setDeviceEnabled( false );

			//Release the device exclusive control right.
			draw.release();

			//Finish using the device.
			draw.close();
		}
		catch ( JposException ex )
		{
		}
		// JavaPOS's code for Step1--END
		System.exit( 0 );
	}
}
