package com.a47;

public class GarbageEx 
{
	
	@Override
	protected void finalize() throws Throwable
	{
	
		System.out.println("Garbage collection called");
	}
	
	public static void main(String[] args) 
	{
		
		GarbageEx g1 =new GarbageEx();
		GarbageEx g2 =new GarbageEx();
		GarbageEx g3 =new GarbageEx();
		GarbageEx g4 =new GarbageEx();
		GarbageEx g5 =new GarbageEx();
		
		g1=null;//null
		g2=null;//null
		
		System.gc();//garbage collection call method
		
		
	}
	
}
