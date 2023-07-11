package com.a117;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student2 implements Comparable<Student2>
{
	
	int sid;
	String sname;
	
	
	public Student2(int sid,String sname) 
	{
		// TODO Auto-generated constructor stub
		
		this.sid = sid;
		this.sname=sname;
	}
	

	


	@Override
	public int compareTo(Student2 o) 
	{
		
		int value=0;
		
		if(this.sid>o.sid)
		{
			return 1;
		}
		else if (this.sid<o.sid) 
		{
			return -1;
		}
		else if(this.sid==o.sid) 
		{
			return 0;
		}
		
		return value;
		
	}
	
}

public class ComparableEx 
{
	public static void main(String[] args) {
		
		
		Student2 s =new Student2(101,"Ronak");
		Student2 s2 =new Student2(104,"Rahul");
		Student2 s3 =new Student2(103,"Ajay");
		Student2 s4 =new Student2(102,"Vijay");
		
		ArrayList<Student2>al =new ArrayList<>();
		
		al.add(s);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Collections.sort(al);
		
		for(Student2 s5: al)
		{
			System.out.println(s5.sid+" "+s5.sname);
		}
		
	}
	
	
}
