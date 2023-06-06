package com.a66;

import java.util.Scanner;

public class Student 
{
	int id;
	String name;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println("Enter Your Id");
		int id2 = sc.nextInt();
		System.out.println("Enter Your Name");
		String name2 = sc.next();
		
		s1.id=id2;
		s1.name=name2;
		
		System.out.println("\n Your Id is "+s1.id+" "+"\n Your Name is "+s1.name);
		
		
	}
}
