package com.a156;

interface Print
{
	void print();
	
}
interface Show
{
	void show();
}

public class MultipleEx implements Print,Show
{
	public static void main(String[] args) 
	{
		
		MultipleEx m1 = new MultipleEx();
		m1.print();
		m1.show();
		
	}

	@Override
	public void show() {
		System.out.println("showing");
		
	}

	@Override
	public void print() {
		
		System.out.println("printing");
		
	}

	
}
