package com.a176;import java.util.Calendar;

public class OverloadingEx2 
{
	
	static int cal(int a,int b)
	{
		return a+b;
	}
	
	static double cal(double a,double b)
	{
		return a*b;
	}
	
	public static void main(String[] args) 
	{
		
		
		System.out.println(cal(4, 5));
		System.out.println(cal(4.00, 5.00));
	}
}
