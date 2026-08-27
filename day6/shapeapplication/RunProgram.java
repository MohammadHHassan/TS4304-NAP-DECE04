package day6.shapeapplication;

import java.text.DecimalFormat;

public class RunProgram
{
	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("#.##");
		
		Circle circle1 = new Circle("Blue", 2.67);
		System.out.println("Shape 1:	Circle");
		System.out.println("Colour:		" + circle1.colour);
		System.out.println("Radius:		" + circle1.radius);
		System.out.println("Area:		" + df.format(circle1.getArea()));
		System.out.println("Perimeter:	" + df.format(circle1.getPerimeter()));
		
		Triangle triangle1 = new Triangle("White", 3.333, 4.444);
		System.out.println("\nShape 2:	Triangle");
		System.out.println("Colour:		" + triangle1.colour);
		System.out.println("Base:		" + triangle1.base);
		System.out.println("Height:		" + triangle1.height);
		System.out.println("Area:		" + df.format(triangle1.getArea()));
		System.out.println("Perimeter:	" + df.format(triangle1.getPerimeter()));
		
		// Shape shape1 = new Shape("Black");
	}
}
