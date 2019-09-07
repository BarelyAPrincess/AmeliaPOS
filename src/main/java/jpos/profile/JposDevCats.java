package jpos.profile;

import java.util.Hashtable;

public class JposDevCats
{
	private static final Hashtable DEVCAT_TABLE = new Hashtable();
	public static final DevCat UNKNOWN_DEVCAT = Unknown.getInstance();
	public static final DevCat BUMPBAR_DEVCAT = BumpBar.getInstance();
	public static final DevCat CASHCHANGER_DEVCAT = CashChanger.getInstance();
	public static final DevCat CASHDRAWER_DEVCAT = CashDrawer.getInstance();
	public static final DevCat CHECKSCANNER_DEVCAT = CheckScanner.getInstance();
	public static final DevCat CAT_DEVCAT = CAT.getInstance();
	public static final DevCat COINDISPENSER_DEVCAT = CoinDispenser.getInstance();
	public static final DevCat FISCALPRINTER_DEVCAT = FiscalPrinter.getInstance();
	public static final DevCat HARDTOTALS_DEVCAT = HardTotals.getInstance();
	public static final DevCat KEYLOCK_DEVCAT = Keylock.getInstance();
	public static final DevCat LINEDISPLAY_DEVCAT = LineDisplay.getInstance();
	public static final DevCat MICR_DEVCAT = MICR.getInstance();
	public static final DevCat MOTIONSENSOR_DEVCAT = MotionSensor.getInstance();
	public static final DevCat MSR_DEVCAT = MSR.getInstance();
	public static final DevCat PINPAD_DEVCAT = Pinpad.getInstance();
	public static final DevCat POINTCARDRW_DEVCAT = PointCardRW.getInstance();
	public static final DevCat POSKEYBOARD_DEVCAT = POSKeyboard.getInstance();
	public static final DevCat POSPOWER_DEVCAT = POSPower.getInstance();
	public static final DevCat POSPRINTER_DEVCAT = POSPrinter.getInstance();
	public static final DevCat REMOTEORDERDISPLAY_DEVCAT = RemoteOrderDisplay.getInstance();
	public static final DevCat SCANNER_DEVCAT = Scanner.getInstance();
	public static final DevCat SCALE_DEVCAT = Scale.getInstance();
	public static final DevCat SIGNATURECAPTURE_DEVCAT = SignatureCapture.getInstance();
	public static final DevCat TONEINDICATOR_DEVCAT = ToneIndicator.getInstance();
	public static final DevCat[] DEVCAT_ARRAY = {BUMPBAR_DEVCAT, CASHCHANGER_DEVCAT, CASHDRAWER_DEVCAT, CHECKSCANNER_DEVCAT, CAT_DEVCAT, COINDISPENSER_DEVCAT, FISCALPRINTER_DEVCAT, HARDTOTALS_DEVCAT, KEYLOCK_DEVCAT, LINEDISPLAY_DEVCAT, MICR_DEVCAT, MOTIONSENSOR_DEVCAT, MSR_DEVCAT, PINPAD_DEVCAT, POSKEYBOARD_DEVCAT, POSPOWER_DEVCAT, POSPRINTER_DEVCAT, REMOTEORDERDISPLAY_DEVCAT, SCANNER_DEVCAT, SCALE_DEVCAT, SIGNATURECAPTURE_DEVCAT, TONEINDICATOR_DEVCAT, POINTCARDRW_DEVCAT};

	public static DevCat getDevCatForName( String paramString )
	{
		if ( DEVCAT_TABLE.containsKey( paramString ) )
		{
			return ( DevCat ) DEVCAT_TABLE.get( paramString );
		}
		return UNKNOWN_DEVCAT;
	}

	static
	{
		DEVCAT_TABLE.put( BUMPBAR_DEVCAT.toString(), BUMPBAR_DEVCAT );
		DEVCAT_TABLE.put( CASHCHANGER_DEVCAT.toString(), CASHCHANGER_DEVCAT );
		DEVCAT_TABLE.put( CASHDRAWER_DEVCAT.toString(), CASHDRAWER_DEVCAT );
		DEVCAT_TABLE.put( CHECKSCANNER_DEVCAT.toString(), CHECKSCANNER_DEVCAT );
		DEVCAT_TABLE.put( CAT_DEVCAT.toString(), CAT_DEVCAT );
		DEVCAT_TABLE.put( COINDISPENSER_DEVCAT.toString(), COINDISPENSER_DEVCAT );
		DEVCAT_TABLE.put( FISCALPRINTER_DEVCAT.toString(), FISCALPRINTER_DEVCAT );
		DEVCAT_TABLE.put( HARDTOTALS_DEVCAT.toString(), HARDTOTALS_DEVCAT );
		DEVCAT_TABLE.put( KEYLOCK_DEVCAT.toString(), KEYLOCK_DEVCAT );
		DEVCAT_TABLE.put( LINEDISPLAY_DEVCAT.toString(), LINEDISPLAY_DEVCAT );
		DEVCAT_TABLE.put( MICR_DEVCAT.toString(), MICR_DEVCAT );
		DEVCAT_TABLE.put( MOTIONSENSOR_DEVCAT.toString(), MOTIONSENSOR_DEVCAT );
		DEVCAT_TABLE.put( MSR_DEVCAT.toString(), MSR_DEVCAT );
		DEVCAT_TABLE.put( PINPAD_DEVCAT.toString(), PINPAD_DEVCAT );
		DEVCAT_TABLE.put( POINTCARDRW_DEVCAT.toString(), POINTCARDRW_DEVCAT );
		DEVCAT_TABLE.put( POSKEYBOARD_DEVCAT.toString(), POSKEYBOARD_DEVCAT );
		DEVCAT_TABLE.put( POSPOWER_DEVCAT.toString(), POSPOWER_DEVCAT );
		DEVCAT_TABLE.put( POSPRINTER_DEVCAT.toString(), POSPRINTER_DEVCAT );
		DEVCAT_TABLE.put( REMOTEORDERDISPLAY_DEVCAT.toString(), REMOTEORDERDISPLAY_DEVCAT );
		DEVCAT_TABLE.put( SCANNER_DEVCAT.toString(), SCANNER_DEVCAT );
		DEVCAT_TABLE.put( SCALE_DEVCAT.toString(), SCALE_DEVCAT );
		DEVCAT_TABLE.put( SIGNATURECAPTURE_DEVCAT.toString(), SIGNATURECAPTURE_DEVCAT );
		DEVCAT_TABLE.put( TONEINDICATOR_DEVCAT.toString(), TONEINDICATOR_DEVCAT );
	}

	public static class PointCardRW extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new PointCardRW();
			}
			return instance;
		}

		public String toString()
		{
			return "PointCardRW";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitPointCardRW( this );
		}
	}

	public static class ToneIndicator extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new ToneIndicator();
			}
			return instance;
		}

		public String toString()
		{
			return "ToneIndicator";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitToneIndicator( this );
		}
	}

	public static class Scale extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new Scale();
			}
			return instance;
		}

		public String toString()
		{
			return "Scale";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitScale( this );
		}
	}

	public static class SignatureCapture extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new SignatureCapture();
			}
			return instance;
		}

		public String toString()
		{
			return "SignatureCapture";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitSignatureCapture( this );
		}
	}

	public static class Scanner extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new Scanner();
			}
			return instance;
		}

		public String toString()
		{
			return "Scanner";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitScanner( this );
		}
	}

	public static class RemoteOrderDisplay extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new RemoteOrderDisplay();
			}
			return instance;
		}

		public String toString()
		{
			return "RemoteOrderDisplay";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitRemoteOrderDisplay( this );
		}
	}

	public static class POSPrinter extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new POSPrinter();
			}
			return instance;
		}

		public String toString()
		{
			return "POSPrinter";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitPOSPrinter( this );
		}
	}

	public static class POSPower extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new POSPower();
			}
			return instance;
		}

		public String toString()
		{
			return "POSPower";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitPOSPower( this );
		}
	}

	public static class POSKeyboard extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new POSKeyboard();
			}
			return instance;
		}

		public String toString()
		{
			return "POSKeyboard";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitPOSKeyboard( this );
		}
	}

	public static class Pinpad extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new Pinpad();
			}
			return instance;
		}

		public String toString()
		{
			return "Pinpad";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitPinpad( this );
		}
	}

	public static class MSR extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new MSR();
			}
			return instance;
		}

		public String toString()
		{
			return "MSR";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitMSR( this );
		}
	}

	public static class MotionSensor extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new MotionSensor();
			}
			return instance;
		}

		public String toString()
		{
			return "MotionSensor";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitMotionSensor( this );
		}
	}

	public static class MICR extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new MICR();
			}
			return instance;
		}

		public String toString()
		{
			return "MICR";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitMICR( this );
		}
	}

	public static class LineDisplay extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new LineDisplay();
			}
			return instance;
		}

		public String toString()
		{
			return "LineDisplay";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitLineDisplay( this );
		}
	}

	public static class Keylock extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new Keylock();
			}
			return instance;
		}

		public String toString()
		{
			return "Keylock";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitKeylock( this );
		}
	}

	public static class HardTotals extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new HardTotals();
			}
			return instance;
		}

		public String toString()
		{
			return "HardTotals";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitHardTotals( this );
		}
	}

	public static class FiscalPrinter extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new FiscalPrinter();
			}
			return instance;
		}

		public String toString()
		{
			return "FiscalPrinter";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitFiscalPrinter( this );
		}
	}

	public static class CoinDispenser extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new CoinDispenser();
			}
			return instance;
		}

		public String toString()
		{
			return "CoinDispenser";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitCoinDispenser( this );
		}
	}

	public static class CAT extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new CAT();
			}
			return instance;
		}

		public String toString()
		{
			return "CAT";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitCAT( this );
		}
	}

	public static class CheckScanner extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new CheckScanner();
			}
			return instance;
		}

		public String toString()
		{
			return "CheckScanner";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitCheckScanner( this );
		}
	}

	public static class CashDrawer extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new CashDrawer();
			}
			return instance;
		}

		public String toString()
		{
			return "CashDrawer";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitCashDrawer( this );
		}
	}

	public static class CashChanger extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
			{
				instance = new CashChanger();
			}
			return instance;
		}

		public String toString()
		{
			return "CashChanger";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitCashChanger( this );
		}
	}

	public static class BumpBar extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
				instance = new BumpBar();
			return instance;
		}

		public String toString()
		{
			return "BumpBar";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
			paramDevCatVisitor.visitBumpBar( this );
		}
	}

	public static class Unknown extends AbstractDevCat implements DevCat
	{
		private static DevCat instance = null;

		public static DevCat getInstance()
		{
			if ( instance == null )
				instance = new Unknown();
			return instance;
		}

		public String toString()
		{
			return "Unknown";
		}

		public void accept( DevCatVisitor paramDevCatVisitor )
		{
		}
	}

	public static abstract class AbstractDevCat implements DevCat
	{
		public abstract String toString();

		public boolean equals( Object paramObject )
		{
			if ( paramObject == null )
			{
				return false;
			}
			if ( !( paramObject instanceof DevCat ) )
			{
				return false;
			}
			return toString().equals( paramObject.toString() );
		}
	}
}
