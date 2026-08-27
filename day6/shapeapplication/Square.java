package day6.shapeapplication;

public class Square extends Shape
{
	double side;		// Instance variable side
	
	public Square(String colour, double side) 
	{
		super(colour);
		this.side = side;
	}
	
	public double getArea()
	{
		return Math.pow(side, 2);
	}
	
	public double getPerimeter()
	{
		return 4.0*side;
	}
}
