package com.a136;

public class StringBufferExs 
{
	public static void main(String[] args) 
	{
		//Mutable
		StringBuffer buffer = new StringBuffer("Hello");
		
		//buffer.append(" Java");
		
		//System.out.println(buffer);
		
		//buffer.insert(1,"Java");
		//System.out.println(buffer);
		
		//buffer.delete(1, 3);
		
		//buffer.replace(1, 3, "Java");
		
		buffer.reverse();
		System.out.println(buffer);
	}
}
