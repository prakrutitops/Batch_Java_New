package com.a86;

public class Student 
{
	//Data Members
	int id;
	String name;
	
	//constructor - parameterized
	public Student(int id,String name)
	{
		// TODO Auto-generated constructor stub
		
		//value assign
		this.id = id;//refrence pass on -refrence keyword - this
		this.name = name;
	
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args)
	{
	
		Student s1 =new Student(101,"tops");
		Student s2 =new Student(102, "tech");
		
		s1.display();
		s2.display();
		
		/*
		 * System.out.println(s1.id+" "+s1.name); 
		 * System.out.println(s2.id+" "+s2.name);
		 */
		
		
	}
	
}
