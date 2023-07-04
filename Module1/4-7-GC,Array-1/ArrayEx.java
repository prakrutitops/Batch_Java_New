package com.a47;

public class ArrayEx 
{
	public static void main(String[] args) {
		
		//new
		int marks[] = new int[5];//array initialize//fixed length
		
		marks[0]=10;
		marks[1]=20;
		marks[2]=30;
		marks[3]=40;
		marks[4]=50;
		
		
		marks[1]=70;
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		
		
		
	}
}
