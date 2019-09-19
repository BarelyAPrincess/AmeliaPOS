package io.amelia.net;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeoutException;

import io.amelia.foundation.Kernel;
import io.amelia.support.Pair;

public class RabbitMQHelper
{
	public static final String EXCHANGE_FANOUT = "amq.fanout";
	public static final String RABBITMQ_SERVER_URI = "amqp://10.8.1.190";// "amqp://messenger.pos.amelia.io";
	public static final String RABBITMQ_SERVER_USERNAME = "admin";
	public static final String RABBITMQ_SERVER_PASSWORD = "ramen1con";

	private static RabbitMQHelper instance;

	public static RabbitMQHelper getInstance()
	{
		if ( instance == null )
			instance = new RabbitMQHelper();
		return instance;
	}

	public void shutdown()
	{
		try
		{
			channel().close();
		}
		catch ( IOException | TimeoutException e )
		{
			e.printStackTrace();
		}
	}

	private Channel channel = null;
	private Connection connection = null;
	private int connectionCoolDown = 100;
	private ConnectionFactory factory = new ConnectionFactory();
	private BlockingDeque<Pair<String, String>> queue = new LinkedBlockingDeque<>();
	private boolean sending = false;

	public void start()
	{
		try
		{
			factory.setAutomaticRecoveryEnabled( false );
			factory.setUri( RABBITMQ_SERVER_URI );
			factory.setUsername( RABBITMQ_SERVER_USERNAME );
			factory.setPassword( RABBITMQ_SERVER_PASSWORD );
			factory.setVirtualHost( "/" );
		}
		catch ( KeyManagementException | NoSuchAlgorithmException | URISyntaxException e1 )
		{
			e1.printStackTrace();
		}

		connect();
	}

	public Channel channel()
	{
		try
		{
			if ( channel == null || !channel.isOpen() )
			{
				if ( connection == null || !connection.isOpen() )
					connect();
				channel = connection.createChannel();
				channel.confirmSelect();
			}
			else if ( connection == null || !connection.isOpen() )
			{
				connect();
				channel = connection.createChannel();
				channel.confirmSelect();
			}
			return channel;
		}
		catch ( IOException e )
		{
			e.printStackTrace();
			channel = null;
			return null;
		}
	}

	public void connect()
	{
		Kernel.L.debug( "Connecting to RabbitMQ Server" );

		if ( connection != null && connection.isOpen() )
			return;
		try
		{
			connection = factory.newConnection();
		}
		catch ( Exception e )
		{
			e.printStackTrace();
			connection = null;
		}
		channel = null;
	}

	public void flushMessages()
	{
		sending = true;
		while ( true )
		{
			try
			{
				Connection connection = factory.newConnection();
				Channel ch = connection.createChannel();
				ch.confirmSelect();

				while ( true )
				{
					Pair<String, String> message = queue.poll();
					try
					{
						ch.basicPublish( EXCHANGE_FANOUT, message.getLeft(), null, message.getRight().getBytes() );
						ch.waitForConfirmsOrDie();
					}
					catch ( Exception e )
					{
						queue.addLast( message );
						throw e;
					}
				}
			}
			catch ( InterruptedException e )
			{
				break;
			}
			catch ( Exception e )
			{
				try
				{
					connectionCoolDown = connectionCoolDown * 2;
					Thread.sleep( connectionCoolDown );
				}
				catch ( InterruptedException e1 )
				{
					break;
				}
			}
		}
		sending = false;
		connectionCoolDown = 100;
	}

	public boolean isConnected()
	{
		return connection != null && connection.isOpen();
	}

	public void publishMessageLater( String channel, String message )
	{
		queue.add( new Pair<>( channel, message ) );
	}

	public void publishMessageNow( final String exchange, final String routingKey, final String message )
	{
		try
		{
			Channel channel = channel();
			channel.basicPublish( exchange, routingKey, null, message.getBytes() );
			channel.waitForConfirmsOrDie();
			Kernel.L.debug( "Sent message " + message );
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}
}
