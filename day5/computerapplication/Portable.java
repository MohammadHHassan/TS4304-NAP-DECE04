package day5.computerapplication;

public class Portable extends Computer		// Portable inherits from Computer
{
	int batteryCapacity=0;			// Instance variable
	
	// Constructor for Portable with operatingSystem parameter
	public Portable(String operatingSystem)
	{
		super(operatingSystem);		// Inherited attribute from Computer
	}

	public int getBatteryCapacity()		// Method to retrieve the battery capacity value
	{
		return batteryCapacity;		// Return the battery capacity value
	}
	
	public void chargeBattery(int percentage)	// Charge the battery according to the percentage given
	{
		batteryCapacity+=percentage;	// Add the percentage to the battery capacity
		
		if(batteryCapacity>100)
		{
			batteryCapacity=100;		// Battery capacity capped at 100%
		}
	}
	
	public void useBattery()
	{
		batteryCapacity-=10;			// Decrease the battery by 10%
		
		if(batteryCapacity<0)
		{
			batteryCapacity=0;			// Avoid negative value on battery
		}
	}
}
