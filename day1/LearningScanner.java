package day1;

import java.util.Scanner;		// Library for Scanner class

public class LearningScanner
{
	public static void main(String[] args)
	{
		// Declaration of Scanner class
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your first name: ");
		String firstName = scanner.nextLine();
		
		System.out.print("Please enter your last name: ");
		String lastName = scanner.nextLine();
		
		System.out.println("Your full name is " + firstName + " " + lastName);
	}
}
