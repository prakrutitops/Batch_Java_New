package com.a156;

class Bank
{
	void bank()
	{
		System.out.println("banking");
	}
}

class Current extends Bank
{
	void current()
	{
		System.out.println("current");
	}
}

class Save extends Bank
{
	void save()
	{
		System.out.println("saving");
	}
}


public class HierarchicalEx 
{
	public static void main(String[] args) {
		
		Current c = new Current();
		Save s =new Save();
		
		c.current();
		s.save();
		s.bank();
		
	}
}
