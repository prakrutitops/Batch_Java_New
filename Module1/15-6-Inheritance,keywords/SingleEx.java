package com.a156;

class A
{
	void a()
	{
		System.out.println("A Accessed");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("B Accessed");
	}
}


public class SingleEx 
{
		public static void main(String[] args) 
		{
			
			
			B b1 =new B();
			
			b1.a();
			b1.b();
			
		}
}
