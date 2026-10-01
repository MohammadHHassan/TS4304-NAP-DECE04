package assignmenttemplate;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class GameSession implements Runnable
{
	private Socket client1, client2;
	private static int sessionNumber=0;
	
	public GameSession(Socket client1, Socket client2)
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
			
			String gameID1 = fromClient1.readUTF();
			String gameID2 = fromClient2.readUTF();
			
			System.out.println("\n" + gameID1 + " has been connected with " + gameID2);
			sessionNumber++;
			System.out.println("Game Session No. " + sessionNumber + " has started.");
			
			toClient1.writeUTF(gameID2);
			toClient2.writeUTF(gameID1);
			
			int round=0, player1Score=0, player2Score=0;
			
			while(true)
			{
				round++;
				
				String choice1 = fromClient1.readUTF();
				String choice2 = fromClient2.readUTF();
				
				System.out.print(gameID1 + " vs " + gameID2 + " | ROUND " + round + " ");
				
				if(choice1.equals(choice2))
				{
					String textDraw = "DRAW";
					System.out.println(textDraw);
					toClient1.writeUTF(textDraw);
					toClient2.writeUTF(textDraw);
				}
				else if ((choice1.equals("rock") && choice2.equals("scissors")) || 
						(choice1.equals("paper") && choice2.equals("rock")) ||
                        (choice1.equals("scissors") && choice2.equals("paper")))
				{
                    player1Score++;
                    String textPlayer1Win = gameID1 + " wins!";
                    System.out.println(textPlayer1Win);
                    toClient1.writeUTF(textPlayer1Win);
					toClient2.writeUTF(textPlayer1Win);
                }
				else
				{
					player2Score++;
                    String textPlayer2Win = gameID2 + " wins!";
                    System.out.println(textPlayer2Win);
                    toClient1.writeUTF(textPlayer2Win);
					toClient2.writeUTF(textPlayer2Win);
				}
				
				String text = "\nCurrent score: " + gameID1 + " " + player1Score + " : " + gameID2 + " " + player2Score + "\n";
				System.out.println(text);
				toClient1.writeUTF(text);
				toClient2.writeUTF(text);
				
				if(round==10)
				{
					String textGameOver = "GAME SESSION " + sessionNumber + ": " + gameID1 + " vs " + gameID2 + " IS OVER";
					System.out.println(textGameOver);
					toClient1.writeUTF(textGameOver);
					toClient2.writeUTF(textGameOver);
					
					String endResultText = "FINAL RESULT: " + gameID1 + " scores " + player1Score + " & " + gameID2 + " scores " + player2Score;
					System.out.println(endResultText);
					toClient1.writeUTF(endResultText);
					toClient2.writeUTF(endResultText);
					
					if(player1Score>player2Score)
					{
						String textPlayer1GameWin = gameID1 + " WINS!";
						System.out.println(textPlayer1GameWin);
						toClient1.writeUTF(textPlayer1GameWin);
						toClient2.writeUTF(textPlayer1GameWin);
					}
					else if(player2Score>player1Score)
					{
						String textPlayer2GameWin = gameID2 + " WINS!";
						System.out.println(textPlayer2GameWin);
						toClient1.writeUTF(textPlayer2GameWin);
						toClient2.writeUTF(textPlayer2GameWin);
					}
					else
					{
						String textGameDraw = "ITS A DRAW!";
						System.out.println(textGameDraw);
						toClient1.writeUTF(textGameDraw);
						toClient2.writeUTF(textGameDraw);
					}
					
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
