package com.a117;

import java.util.Stack;

//Push,Pop -Entry,Exit
public class Stackex 
{
	
	static void Push(Stack st,Integer i)
	{
		st.push(i);//Inbuilt
		
		System.out.println(i);
		System.out.println(st);
	
	}
	static void Pop(Stack st)
	{
		Integer i =(Integer) st.pop();//Inbuilt
		
		System.out.println(i);
		System.out.println(st);
		
	}
	public static void main(String[] args) 
	{
		Stack st =new Stack<>();
		
		Push(st, 10);
		Push(st, 20);
		Push(st, 30);
		Push(st, 40);
		try
		{
			Pop(st);
			Pop(st);
			Pop(st);
			Pop(st);
			Pop(st);
		}
		catch(Exception e)
		{
			System.out.println("No Data");
		}
		
	}
}
