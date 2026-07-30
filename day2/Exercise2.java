/* Implement a Scanner class
 * Prompt the user to enter their marks
 * If marks is in between 50-100 (inclusive), "Pass"
 * Else if marks>=0 and <50, "Fail"
 * Else, "Invalid marks"
 * 
 * Additionally if "Pass",
 * 		marks>=80, "Dictinction"
 * 		marks>=65 and <80, "Merit"
 * 		marks<65, "Just Pass"
 */

package day2;

import java.util.Scanner;

public class Exercise2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your marks: ");
		double marks = scanner.nextDouble();
		
		if(marks>=50 && marks<=100)
		{
			System.out.println("Pass");
			
			if(marks>=80)
			{
				System.out.println("Distinction");
			}
			else if(marks>=65 && marks<80)
			{
				System.out.println("Merit");
			}
			else
			{
				System.out.println("Just Pass");
			}
		}
		else if(marks>=0 && marks<50)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid marks");
		}
		
		scanner.close();
	}
}
