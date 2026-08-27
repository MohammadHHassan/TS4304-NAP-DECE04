package day6.shape2d3dapplication;

import java.text.DecimalFormat;		// Library for decimal format

public abstract class Shape		// Abstract class Shape. Cannot instantiate
{
	DecimalFormat df = new DecimalFormat("#.##");	// Declare decimal format in 2 dp
	
	String colour;		// Instance variable colour

	public Shape(String colour)		// Shape constructor with parameter colour
	{
		this.colour = colour;		// Store from parameter to instance colour
	}
}
