package com.a87;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx 
{
	
	/*<Generic Type> */
	
	
	
	public static void main(String[] args) 
	{
		ArrayList<String>arrayList =new ArrayList<>();
		
		arrayList.add("Java");
		arrayList.add("Php");
		arrayList.add("Kotlin");
		
		
		//System.out.println(arrayList);
		
		//Interface - Data Fetch from arraylist
		
		ArrayList<String>arrayList2 =new ArrayList<>();
		 arrayList2.add("Laravel");
		 arrayList2.add("Web Designing");
		 arrayList2.add("Flutter");
		 arrayList2.add("Kotlin");
		
		/*
		 * arrayList2.add("Laravel"); arrayList2.add("Web Designing");
		 * arrayList2.add("Flutter");
		 * 
		 * arrayList.addAll(arrayList2); arrayList.remove(1);
		 * arrayList.remove("Flutter"); arrayList.removeAll(arrayList2);
		 */
		
		arrayList.retainAll(arrayList2);//common detail
		
		Iterator<String> i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
