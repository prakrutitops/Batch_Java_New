package com.a106;

public class StringOthersEx 
{
	public static void main(String[] args) 
	{
		
		String s1 ="SACHIN";
		String s2="tops";
		String s3="  abcd  ";
		String s4="PHP is a programming language,PHP is a open source .PHP is a One web Platform";
		
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s3.trim());
		System.out.println(s2.charAt(1));
		System.out.println(s4.replace("PHP", "JAVA"));
		System.out.println(s2.startsWith("t"));
		System.out.println(s2.endsWith("s"));
	
	}
}
