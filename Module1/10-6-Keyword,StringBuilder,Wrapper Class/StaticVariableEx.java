package com.a106;

public class StaticVariableEx 
{
	int id;
	String name;
	static String college="Atmiya";//
	
	public StaticVariableEx(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	
	static void change()
	{
		college="VVP";
	}
	public static void main(String[] args) 
	{
		
		change();
		
		StaticVariableEx s1 =new StaticVariableEx(101,"Rahul");
		StaticVariableEx s2 =new StaticVariableEx(102,"Mihir");
		StaticVariableEx s3 =new StaticVariableEx(103,"Ronak");
	
		s1.display();
		s2.display();
		s3.display();
		
		
	}
	
}
