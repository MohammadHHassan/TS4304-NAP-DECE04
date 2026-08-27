package day5.carapplication;

public class Car
{
	// List down attributes
	String brand;			// Instance variables
	String model;
	String colour;
	double engineSize;
	int numberOfDoors;
	double currentSpeed=0;
	Wheels wheels;
	
	@Override
	public String toString()
	{
		return "[ Brand = " + brand + ", Model = " + model + ", Colour = " + colour + ", Engine Size = " + engineSize
				+ ", Number of Doors = " + numberOfDoors + " ]";
	}
	
	// Behavior 1
	public void pressAccelerator()
	{
		currentSpeed+=10;		// Increase the speed by 10
	}
	
	// Behavior 2
	public void pressBrake()
	{
		currentSpeed-=5;		// Decrease the speed by 5
		
		if(currentSpeed<0)		// Prevent negative speed
		{
			currentSpeed=0;
		}
	}
}
