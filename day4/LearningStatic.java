package day4;

public class LearningStatic
{
	// static member (variable, method, class) is share by all objects in the class
	static int y=10;	// Class variable
	
	public static void main(String[] args)
	{
		int x=5;		// Local variable
		
		System.out.println("1. x = " + x);
		System.out.println("2. x = " + incrementBy10(x));
		System.out.println("3. x = " + incrementBy10(x));
		System.out.println("4. x = " + x);
		
		System.out.println("\n1. y = " + y);
		System.out.println("2. y = " + incrementYBy20());
		System.out.println("3. y = " + incrementYBy20());
		System.out.println("4. y = " + y);
	}
	
	public static int incrementBy10(int value)
	{
		return value+10;
	}
	
	public static int incrementYBy20()
	{
		return y = y+20;
	}
}
