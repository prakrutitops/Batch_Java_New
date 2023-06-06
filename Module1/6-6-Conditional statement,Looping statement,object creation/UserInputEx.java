package com.a66;

import java.util.Scanner;

public class UserInputEx 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Your Id");//printf
		int id = sc.nextInt();//scanf
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Salary");
		double salary = sc.nextDouble();
		
		System.out.println(id+" "+name+" "+salary);
		
	}
}
