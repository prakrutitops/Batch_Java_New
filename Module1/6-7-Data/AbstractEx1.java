package com.a67;


abstract class M
{
	void m()
	{
		System.out.println("M");
	}
	abstract void m1();
}
abstract class N extends M
{
	void n()
	{
		System.out.println("N");
	}
	abstract void n1();
}

public class AbstractEx1 extends N
{
	public static void main(String[] args) {
		
		
		AbstractEx1 a1 =new AbstractEx1();
		a1.m();
		a1.m1();
		a1.n();
		a1.n1();
		
	}

	@Override
	void n1() {
		// TODO Auto-generated method stub
		System.out.println("N1");
	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("M1");
	}
	
	
}
