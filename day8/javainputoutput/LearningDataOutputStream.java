package day8.javainputoutput;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearningDataOutputStream
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			DataOutputStream output = new DataOutputStream(new FileOutputStream("data.dat"));
			
			output.writeUTF("Didi");		// UTF = String
			output.writeDouble(3.14);
			output.writeBoolean(true);
			
			output.writeUTF("Jojo");
			output.writeDouble(9.9999);
			output.writeBoolean(false);
			
			output.writeUTF("Nana");
			output.writeDouble(15.151515);
			output.writeBoolean(true);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
