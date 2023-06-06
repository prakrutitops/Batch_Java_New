package com.a66;

import java.util.Scanner;

public class MarksEx 
{
	public static void main(String[] args) 
	{
		
			//int marks = 56;
			
		
			Scanner sc =new Scanner(System.in);
			
			System.out.println("Enter Your Marks");
			int marks = sc.nextInt();
		
		
			if(marks>=70)
			{
				System.out.println("A Grade");
			}
			else if(marks>=60)
			{
				System.out.println("B Grade");
			}
			else if(marks>=50)
			{
				System.out.println("C Grade");
			}
			else if(marks>=40)
			{
				System.out.println("D Grade");
			}
			else
			{
				System.out.println("Fail");
			}
		
	}
}
