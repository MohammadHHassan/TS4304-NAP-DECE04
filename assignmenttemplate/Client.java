package assignmenttemplate;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("localhost", 9101);
			Scanner scanner = new Scanner(System.in);
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			System.out.print("Please enter your game ID: ");
			String gameID = scanner.nextLine();
			toServer.writeUTF(gameID);
			
			System.out.println("You are connected with " + fromServer.readUTF() + "\n");
			int round=0;
			
			while(true)
			{
				round++;
				
				System.out.println("ROUND " + round);
				
				while(true)
				{
					System.out.print("Enter your choice (Rock/Paper/Scissor): ");
					String choice = scanner.nextLine().toLowerCase();
					
					if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors"))
					{
						toServer.writeUTF(choice);
                        break;
                    }
					else
					{
                        System.out.println("Invalid choice. Please enter rock, paper or scissors.");
                    }
				}
				
				System.out.println(fromServer.readUTF());
				System.out.println(fromServer.readUTF());
				
				if(round==10)
				{
					System.out.println(fromServer.readUTF());
					System.out.println(fromServer.readUTF());
					System.out.println(fromServer.readUTF());
					System.out.println("\nThank you for playing :)");
					
					break;
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
