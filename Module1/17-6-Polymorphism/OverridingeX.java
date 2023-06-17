package com.a176;

class Rbi
{
	int rateofintrest()
	{
		return 0;
	}
}
class Sbi extends Rbi
{
	int rateofintrest()
	{
		return 7;
	}
}
class Icici extends Rbi
{
	int rateofintrest()
	{
		return 8;
	}
}
class Axis extends Rbi
{
	int rateofintrest()
	{
		return 9;
	}
}

public class OverridingeX 
{
	public static void main(String[] args) 
	{
		///refrence variable
		Rbi r;
		
		 r =new Sbi();
		 System.out.println(r.rateofintrest());
		 
		 r =new Icici();
		 System.out.println(r.rateofintrest());
		 
		 r =new Axis();
		 System.out.println(r.rateofintrest());
	}
}
