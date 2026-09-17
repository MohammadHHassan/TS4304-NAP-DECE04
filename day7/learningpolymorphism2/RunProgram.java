package day7.learningpolymorphism2;

public class RunProgram
{
	/*	Method overloading = Occurs when multiple methods in the same class have
	 * 						the same name but different parameters
	 */
	
	public static void main(String[] args)
	{
		Calculator calculator1 = new Calculator();
		
		System.out.println("int:	2+3 = " + calculator1.add(2,3));
		System.out.println("double:	4.5+2.2 = " + calculator1.add(4.5,2.2));
	}
}
