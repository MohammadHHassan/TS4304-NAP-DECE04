package day6.shape2d3dapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		Shape2D [] shape2D = new Shape2D[5];
		
		shape2D[0] = new Circle("Purple", 2.5);
		shape2D[1] = new Rectangle("Black", 5.2, 3.3);
		shape2D[2] = new Square("White", 10);
		shape2D[3] = new Circle("Pink", 8.9);
		shape2D[4] = new Square("Red", 5.555);
		
		for(int i=0 ; i<shape2D.length ; i++)
		{
			System.out.println("--- Shape [" + i + "] ---");
			System.out.println(shape2D[i] + "\n");
		}
		
		int noOfCircle=0, noOfRectangle=0, noOfSquare=0;
		
		for(int j=0 ; j<shape2D.length ; j++)
		{
			if(shape2D[j] instanceof Circle)		// If the shape is circle
			{
				noOfCircle++;
			}
			
			if(shape2D[j] instanceof Rectangle)		// If the shape is rectangle
			{
				noOfRectangle++;
			}
			
			if(shape2D[j] instanceof Square)		// If the shape is square
			{
				noOfSquare++;
			}
		}
		
		System.out.println("Number of circle: " + noOfCircle);
		System.out.println("Number of rectangle: " + noOfRectangle);
		System.out.println("Number of square: " + noOfSquare);
	}
}
