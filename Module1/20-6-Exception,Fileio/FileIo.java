package com.a206;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileIo 
{
	public static void main(String[] args) 
	{
		
		try 
		{
			//logic
			String data ="Welcome to tops";
			FileOutputStream fout = new FileOutputStream("E://ronak.txt");
			fout.write(data.getBytes());
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println("Success");
		
	}
}
