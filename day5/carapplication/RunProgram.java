package day5.carapplication;

public class RunProgram
{
	public static void main(String[] args)
	{
		// Instantiate car1 object
		Car car1 = new Car();
		car1.brand = "Toyota";
		car1.model = "Vios";
		car1.colour = "Black";
		car1.engineSize = 1.6;
		car1.numberOfDoors = 5;
		
		System.out.println("Car 1: " + car1);
		
		// Instantiate car2 object
		Car car2 = new Car();
		car2.brand = "Kia";
		car2.model = "Optima";
		car2.colour = "Red";
		car2.engineSize = 2.4;
		car2.numberOfDoors = 5;
		
		System.out.println("\nCar 2: " + car2);
		
		System.out.println("\nCurrent speed of Car 2 = " + car2.currentSpeed + " km/h");
		car2.pressAccelerator();
		System.out.println("Speed of Car 2 after accelerating = " + car2.currentSpeed + " km/h");
		car2.pressBrake();
		car2.pressBrake();
		car2.pressBrake();
		System.out.println("Speed of Car 2 after braking = " + car2.currentSpeed + " km/h");
		
		Wheels wheel1 = new Wheels();
		wheel1.brand = "Bridgestone";
		wheel1.size = 19;
		
		Wheels wheel2 = new Wheels();
		wheel2.brand = "Westlake";
		wheel2.size = 16;
		
		car1.wheels = wheel2;
		car2.wheels = wheel1;
		
		System.out.println("\nCar 1 wheels: " + car1.wheels);
		System.out.println("Car 2 wheels: " + car2.wheels);
	}
}
