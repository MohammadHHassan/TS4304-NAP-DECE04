package day7.studentapplication;

public class Module
{
	private String code;
	private String name;
	private Student [] students;		// Creating array of students
	private int currentNumberOfStudents=0;
	
	public Module(String code, String name, int maxNumberOfStudents) 
	{
		this.code = code;
		this.name = name;
		students = new Student[maxNumberOfStudents];
	}
	
	public String getCode()
	{
		return code;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Student [] getStudents()
	{
		return students;
	}
	
	public void editCode(String code)
	{
		this.code = code;
	}
	
	public void editName(String name)
	{
		this.name = name;
	}
	
	public boolean addStudent(Student student)
	{
		if(currentNumberOfStudents >= students.length)		// If the capacity is full
		{
			return false;		// Fail to enroll the student
		}
		
		for(int i=0 ; i<students.length ; i++)
		{
			if(students[i] != null)		// If the student array is not empty
			{
				if(students[i].getId() == student.getId())
				{
					return false;		// Fail to enroll the student
				}
			}
		}
		
		students[currentNumberOfStudents] = student;	// Enroll the student
		currentNumberOfStudents++;
		return true;		// Successfully enrolled the student
	}
}
