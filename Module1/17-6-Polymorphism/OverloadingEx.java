package com.a176;import java.util.Calendar;

public class OverloadingEx 
{
	
	static int cal(int a,int b)
	{
		return a+b;
	}
	
	static int cal(int a,int b,int c)
	{
		return a*b*c;
	}
	
	public static void main(String[] args) 
	{
		
		
		System.out.println(cal(4, 5));
		System.out.println(cal(4, 5, 6));
	}
}
