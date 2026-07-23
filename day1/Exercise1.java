/* Implement a Scanner class
 * Prompt the user to enter their money in BND
 * Convert the BND into RM
 * (BND 1.00 = RM 3.12)
 * Display their money in RM
 * 
 * scanner.nextDouble();
 */

package day1;

import java.util.Scanner;

public class Exercise1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your money in BND: ");
		double bnd = scanner.nextDouble();
		
		double rm = bnd*3.12;
		
		System.out.println("Conversion rate:");
		System.out.println("BND 1.00 = RM 3.12");
		System.out.println("Your money:");
		System.out.println("BND " + bnd + " = RM " + rm);
	}
}
