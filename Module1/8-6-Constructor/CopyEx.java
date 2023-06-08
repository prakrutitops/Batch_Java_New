package com.a86;

public class CopyEx 
{
	int id;
	String name;
	
	CopyEx(String name) 
	{
		// TODO Auto-generated constructor stub
		System.out.println(name);
	}
	CopyEx(String name,String surname) 
	{
		// TODO Auto-generated constructor stub
		System.out.println(name+" "+surname);
		
	}
	CopyEx(CopyEx c) 
	{
		// TODO Auto-generated constructor stub
		id = c.id;
		name = c.name;
		
		System.out.println(id);
		System.out.println(name);
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		CopyEx c1 = new CopyEx("Ronak");
		CopyEx c2 =new CopyEx("Mihir","Kalariya");
		CopyEx c3 =new CopyEx(c1);
		c3.display();
	}
}
