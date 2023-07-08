package com.a87;

import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) {
		
		
		Vector<String> v =new Vector<>(5);
		
		v.addElement("android");
		v.addElement("java");
		v.addElement("php");
		v.addElement("ios");
		v.addElement("ios");
		v.addElement("ios");
		v.addElement("php");
		v.addElement("ios");
		v.addElement("ios");
		v.addElement("ios");
		v.addElement("ios");
		
		System.out.println("Vector Capacity: "+v.capacity());
		System.out.println("Vector Size: "+v.size());
		
		if(v.contains("php2"))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("No");
		}
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
	}
}
