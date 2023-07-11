package com.a117;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	
	public static void main(String[] args) {
		
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("A", 101);
		map.put("B", 102);
		map.put("C", 103);
		map.put("D", 104);
		
		System.out.println(map);
		System.out.println(map.get("B"));
		
		System.out.println("---------------------");
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
		
		
		
		
		
	}
	
}
