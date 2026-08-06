/*	Using loop control (while / do-while / for)
 * 	Ask 5 students to enter their marks
 * 	Calculate and display the total marks and the average marks.
 */

package day3;

import java.util.Scanner;

public class Exercise1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double marks, sum=0;
		
		for(int i=0 ; i<5 ; i++)
		{
			System.out.print("Enter the marks for student no. " + (i+1) + ": ");
			marks = scanner.nextDouble();
			
			sum = sum+marks;
		}
		
		System.out.println("Total marks: " + sum);
		System.out.println("Average marks: " + (sum/5));
	}
}
