package com.a117;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetEx2 
{
	public static void main(String[] args) 
	{
	
		
		HashSet<String> set = new HashSet<String>();
		  
        // Adding elements into HashSet using add()
        set.add("Ajay");
        set.add("Vivek");
        set.add("Vijay");
        set.add("Bhargav");
        
        System.out.println(set);
        
        List<String> list = new ArrayList<String>(set);
        Collections.sort(list);
        
        System.out.println(list);
		
	}
	
	
	
}
