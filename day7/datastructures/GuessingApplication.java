package day7.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessingApplication
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> guessedNumber = new ArrayList<Integer>();
		
		int randomNumber = 1 + (int)(Math.random()*((10-1)+1));
		System.out.println("A random number between 1-10 has been generated.\n");
		
		while(true)
		{
			System.out.println("Cuba teka: ");
			int guess = scanner.nextInt();
			
			if(guess == randomNumber)
			{
				System.out.println("Lurus!");
				break;		// Exit from forever loop
			}
			else
			{
				// Loop to check/compare the guessed numbers one by one
				for(int i=0 ; i<guessedNumber.size() ; i++)
				{
					if(guessedNumber.get(i) == guess)
					{
						System.out.println("Sudah teka.");
						break;		// Exit from for loop
					}
				}
				
				guessedNumber.add(guess);
				System.out.println("Salah teka. Sila cuba lagi.\n");
			}
		}
	}
}
