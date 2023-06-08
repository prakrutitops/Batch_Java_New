package com.a86;



public class CopyEx2
{
	
	int id;
	String name;
	

	public CopyEx2(int id,String name)
	{
		
		
		this.id = id;
		this.name = name;
	
	}
	public CopyEx2(CopyEx2 c) 
	{
		// TODO Auto-generated constructor stub
		id = c.id;
		name = c.name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args)
	{
	
		CopyEx2 s1 =new CopyEx2(101,"tops");
		CopyEx2 s2 =new CopyEx2(s1);
		
		s1.display();
		s2.display();
		
		/*
		 * System.out.println(s1.id+" "+s1.name); 
		 * System.out.println(s2.id+" "+s2.name);
		 */
		
		
	}
	
}
