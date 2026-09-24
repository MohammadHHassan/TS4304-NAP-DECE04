package day8.learningthreads;

public class Message implements Runnable
{
	// Threads allow you to run lines of codes simultaneously
	
	String name;			// Instance variable
	
	public Message(String name)		// Constructor for Message
	{
		this.name = name;		// Transfer data from parameter to instance variable
	}

	@Override
	public void run() 
	{
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(i + ". " + name);
			
			// Surround with try and catch prevents your program from
			// crashing when an unexpected error occurs during execution.
			try
			{
				Thread.sleep(1000);		// Delay for 1000ms / 1s
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
