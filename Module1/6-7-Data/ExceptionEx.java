package com.a67;

import java.util.Scanner;

public class ExceptionEx 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter 2 Numbers: ");
		Scanner sc =new Scanner(System.in);
	
		try
		{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int ans = num1/num2;
			System.out.println(ans);
			
		}
		catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		finally 
		{
			//Always Executed
			System.out.println("Executed");
		}
		
		
		
		
		
	}
}
