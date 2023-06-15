package com.a156;

class M
{
	void m()
	{
		System.out.println("M Accessed");
	}
}
class N extends M
{
	void n()
	{
		System.out.println("N Accessed");
	}
}

interface Y 
{
	void y();
}

class Z extends N implements Y
{
	void z()
	{
		System.out.println("Z Accessed");
	}

	@Override
	public void y() 
	{
		System.out.println("Y Accessed");
	}
}

public class HybridEx 
{
	public static void main(String[] args) {
		
		
		Z z1 =new Z();
		
		z1.m();
		z1.n();
		z1.y();
		z1.z();
		
	}
}
