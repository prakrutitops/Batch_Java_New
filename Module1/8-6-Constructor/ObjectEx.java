package com.a86;

import java.util.Scanner;

public class ObjectEx 
{
	
	int id;
	String name;
	
	public static void main(String[] args) 
	{
		
		//classname objname = new classname();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		int id2 = sc.nextInt();
		
		System.out.println("Enter Your Name");
		String name2 = sc.next();
		
		
		ObjectEx o1 = new ObjectEx();
		
		o1.id=id2;
		o1.name=name2;
		
		System.out.println(o1.id+" "+o1.name);
		
		
		
		
	}
}
