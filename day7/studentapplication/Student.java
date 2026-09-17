package day7.studentapplication;

public class Student
{
	private int id;			// Instance variable id
	private String name;	// Instance variable name
	private int age;		// Instance variable age
	private static int numberOfStudents=0;		// Class variable to count the no. of students
	
	public Student(String name, int age)	// Constructor
	{
		this.name = name;
		editAge(age);
		numberOfStudents++;		// Increment the no. of student
		this.id = numberOfStudents;
	}
	
	public int getId()		// Method to retrieve the ID of student (getter)
	{
		return id;
	}
	
	public String getName()		// Method to retrieve the name of student (getter)
	{
		return name;
	}
	
	public int getAge()		// Method to retrieve the age of student (getter)
	{
		return age;
	}
	
	public void editAge(int age)	// Method to edit the age of existing student (setter)
	{
		this.age = age;
	}
}
