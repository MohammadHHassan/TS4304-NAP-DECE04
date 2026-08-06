package day3;

import java.util.Scanner;

public class Example1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the number of students in the class: ");
		int numberOfStudents = scanner.nextInt();
		// To avoid bugs (applied between nextInt/nextDouble/nextChar followed by nextLine)
		scanner.nextLine();
		
		String [] name = new String[numberOfStudents];
		
		for(int i=0 ; i<name.length ; i++)
		{
			System.out.print("Please enter the name of student no. " + (i+1) + ": ");
			name[i] = scanner.nextLine();
		}
		
		System.out.println("\n====================================\n");
		
		for(int j=0 ; j<name.length ; j++)
		{
			System.out.println("Name of student no. " + (j+1) + ": " + name[j]);
		}
	}
}
