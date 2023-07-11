package com.a117;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetEx 
{
	public static void main(String[] args) 
	{
		/*
		 * //Integer value ->Order ->Asc HashSet set =new HashSet<>();
		 * 
		 * set.add(4); set.add(2); set.add(5); set.add(1); set.add(3);
		 * 
		 * 
		 * System.out.println(set);
		 */
		
		HashSet<String> set = new HashSet<String>();
		  
        // Adding elements into HashSet using add()
        set.add("geeks");
        set.add("practice");
        set.add("contribute");
        set.add("ide");
        
        System.out.println(set);
        
        List<String> list = new ArrayList<String>(set);
        Collections.sort(list);
        
        System.out.println(list);
		
	}
	
	
	
}
