package day9.chatapplication;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server 
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket socketServer = new ServerSocket(9101);
			System.out.println("Server started at " + new Date());
			
			// To retrieve the local IP address for the server
			InetAddress ip = InetAddress.getLocalHost();
			// Display the IP address for the server
			System.out.println("Server's IP Address: " + ip.getHostAddress());
			
			while(true)			// Forever loop to accept multiple clients
			{
				Socket client1 = socketServer.accept();
				Socket client2 = socketServer.accept();
				
				// Use constructor to create chat session
				ChatSession chatSession = new ChatSession(client1,client2);
				
				// Enable multiple chat sessions running simultaneously
				new Thread(chatSession).start();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
