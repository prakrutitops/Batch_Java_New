package com.a87;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 
{
	
	/*<Generic Type> */
	
	
	
	public static void main(String[] args) 
	{
		ArrayList<String>arrayList =new ArrayList<>();
		
		arrayList.add("Java");
		arrayList.add("Php");
		arrayList.add("Kotlin");
		arrayList.add(3, "xyz");
		arrayList.add("Kotlin");
		
		System.out.println(arrayList);
		
		
	}
}
