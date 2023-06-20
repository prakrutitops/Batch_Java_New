package com.a206;

public class ExceptionEx1 
{
	public static void main(String[] args) 
	{
		//logic
		try
		{
			int data = 10/0;
			System.out.println(data);//Error
		}
		//catch -error
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("done");
		
		
	}
}
