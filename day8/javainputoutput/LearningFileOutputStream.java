package day8.javainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearningFileOutputStream
{
	// throws IOException is to declare that a method might encounter
	// a file or network error during its execution.
	// Makes the program to be able to handle that error.
	public static void main(String[] args) throws IOException
	{
		try
		{
			FileOutputStream output = new FileOutputStream("test.dat");
			
			for(int i=1 ; i<=10 ; i++)
			{
				output.write(i);	// Writing data inside test.dat file	
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
