package com.a86;

public class Default2 
{
	static int count =0;
	
	public Default2() 
	{
		// TODO Auto-generated constructor stub
		
		count++;
		System.out.println(count);
		
	}
	
	public static void main(String[] args) 
	{
		Default2 d =new Default2();//1
		Default2 d2 =new Default2();//2
		Default2 d3 =new Default2();//3
		
	}
}
