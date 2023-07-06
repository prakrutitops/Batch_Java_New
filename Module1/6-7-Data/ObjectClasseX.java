package com.a67;

public class ObjectClasseX 
{
	public static void main(String[] args) {
		
		//Object o1 = new Object();
		
		String s1 ="Hello";
		String s2 ="Hello";
		
		//String s4="a";
		
		//ObjectClasseX o;//refrence variable
		
		String s3 =new String("Hello");//object
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
	}
}
