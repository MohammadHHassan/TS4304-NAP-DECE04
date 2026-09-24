package day8.circlecalculatorapp;

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
			// Request socket to server using local host with port number 9101
			Socket socket = new Socket("localhost", 9101);
			
			// Enable writing data to the server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			// Enable reading data from the server
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			
			// Enable user's input in client
			Scanner scanner = new Scanner(System.in);
			
			while(true)		// Forever loop
			{
				// Prompt a message for the user to enter a radius value
				System.out.print("\nPlease enter a radius value: ");
				// Store the user's input as radius
				double radius = scanner.nextDouble();
				
				// Send the radius value to the server
				toServer.writeDouble(radius);
				
				// Receive the area value from the server
				double area = fromServer.readDouble();
				
				System.out.println("Sent radius: " + radius);
				System.out.println("Received area: " + area);
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
