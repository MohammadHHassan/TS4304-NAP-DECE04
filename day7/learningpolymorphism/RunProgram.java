package day7.learningpolymorphism;

public class RunProgram
{
	/*	Polymorphism means "many forms" and it allows objects, methods or operators
	 * 	to take on different meaning depending on the context.
	 * 	This makes our program more flexible and reusable.
	 */
	
	public static void main(String[] args)
	{
		Animals animal1 = new Animals();
		animal1.makeSound();
		
		animal1 = new Cats();		// Polymorphism
		animal1.makeSound();		// Method overriding
		
		Dogs dog1 = new Dogs();
		dog1.makeSound();
	}
}
