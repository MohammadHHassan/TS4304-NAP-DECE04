package day9.chatapplication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

// Implement Runnable to be able to run multiple chat sessions simultaneously
public class ChatSession implements Runnable
{
	private Socket client1, client2;
	private static int sessionNumber=0;
	
	public ChatSession(Socket client1, Socket client2)
	{
		this.client1 = client1;
		this.client2 = client2;
	}

	@Override
	public void run()
	{
		try
		{
			DataInputStream fromClient1 = new DataInputStream(client2.getInputStream());
			DataOutputStream toClient1 = new DataOutputStream(client2.getOutputStream());
			
			DataInputStream fromClient2 = new DataInputStream(client1.getInputStream());
			DataOutputStream toClient2 = new DataOutputStream(client1.getOutputStream());
			
			String chatID1 = fromClient1.readUTF();
			String chatID2 = fromClient2.readUTF();
			
			System.out.println("\n" + chatID1 + " has been connected with " + chatID2);
			sessionNumber++;
			System.out.println("Chat Session No. " + sessionNumber + " has started.\n");
			
			toClient1.writeUTF(chatID2);
			toClient2.writeUTF(chatID1);
			
			while(true)
			{
				if(fromClient1.available()>0)
				{
					String msg1 = fromClient1.readUTF();
					toClient2.writeUTF(msg1);
				}
				
				if(fromClient2.available()>0)
				{
					String msg2 = fromClient2.readUTF();
					toClient1.writeUTF(msg2);
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
