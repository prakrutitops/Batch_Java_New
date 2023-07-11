package com.a117;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student 
{
	String ename;
	int salary;
	
	public Student(String ename,int salary) 
	{
		// TODO Auto-generated constructor stub
		this.ename=ename;
		this.salary=salary;
	}
	
	
	
}
class Emp implements Comparator<Student>
{
	

	@Override
	public int compare(Student o1, Student o2) 
	{
		int value = 0;
		
		if(o1.salary>o2.salary) 
		{
			return 1;
		}
		else if(o1.salary<o2.salary) 
		{
			return -1;
		}
		else if(o1.salary==o2.salary) 
		{
			return 0;
		}
		return value;
	}
		
	
}

public class ComparatorEx 
{
	public static void main(String[] args) {
		
		Student s1 =new Student("Ronak", 10000);
		Student s2 =new Student("Rahul", 15000);
		Student s3 =new Student("Ajay", 5000);
		Student s4 =new Student("Vijay", 20000);
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		
		Collections.sort(al,new Emp());
		
		for(Student s: al)
		{
			System.out.println(s.salary+"   "+s.ename);
		}
		
	}
}
