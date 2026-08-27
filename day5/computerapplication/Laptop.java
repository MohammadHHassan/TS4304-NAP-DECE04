package day5.computerapplication;

public class Laptop extends Portable
{
	String graphicCard;
	boolean sleeping;

	public Laptop(String operatingSystem, String graphicCard)
	{
		super(operatingSystem);
		this.graphicCard = graphicCard;
		sleep();
	}
	
	public void sleep()
	{
		sleeping = true;
	}
	
	public void wakeUp()
	{
		sleeping = false;
	}
}
