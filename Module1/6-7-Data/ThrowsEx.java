package com.a67;

import java.io.IOException;

class M1
{
	void m1() throws IOException
	{
		System.out.println("M1 Accessed");
	}
}

class N1 extends M1
{
	void n1() throws IOException
	{
		System.out.println("N1 Accessed");
	}
}

class P1 extends N1
{
	void p1() throws IOException
	{
		System.out.println("P1 Accessed");
	}
}
public class ThrowsEx 
{
	public static void main(String[] args) throws IOException
	{
		P1 p =new P1();
		
		
			p.m1();
			p.n1();
			p.p1();
		
		
	}
}
