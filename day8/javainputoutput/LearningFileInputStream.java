package day8.javainputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearningFileInputStream
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			FileInputStream input = new FileInputStream("test.dat");
			
			int value;
			value = input.read();	// Read the first line of data
			
			while(value!=-1)		// While the is still data inside the file to be read
			{
				System.out.println(value);		// Display the current line of data
				value = input.read();			// Read the next line of data
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
