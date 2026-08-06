package day3;

public class LearningNestedFor
{
	public static void main(String[] args)
	{
		for(int i=1 ; i<=4 ; i++)		// Row
		{
			for(int j=1 ; j<=5 ; j++)		// Column
			{
				System.out.print(i + "," + j + "\t");
			}
			System.out.println();
		}
	}
}
