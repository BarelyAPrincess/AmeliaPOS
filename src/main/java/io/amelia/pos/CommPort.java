package io.amelia.pos;

public class CommPort
{
	private String addr = null;
	private PortType portType = null;

	public static enum PortType
	{
		LPT
	}

	public String getAddress()
	{
		return addr;
	}

	public PortType getPortType()
	{
		return portType;
	}

	public CommPort setPortType( PortType type )
	{
		this.portType = type;
		return this;
	}

	public CommPort setAddress( String addr )
	{
		this.addr = addr;
		return this;
	}

	public static CommPort linuxLPT( String addr )
	{
		return new CommPort().setPortType( PortType.LPT ).setAddress( addr );
	}
}
