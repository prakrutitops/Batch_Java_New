package com.a206;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileIoExScanner 
{
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your Id");
		String id = sc.next();
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("Enter Your Surname");
		String surname = sc.next();
		
		System.out.println("Enter Your Email");
		String email = sc.next();
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("E://details.txt");
			
			String aid ="\n Your Id is: ";
			String aname ="\n Your Name is: ";
			String asurname ="\n Your Surname is: ";
			String aemail ="\n Your Email is: ";
			
			fout.write(aid.getBytes());
			fout.write(id.getBytes());
			fout.write(aname.getBytes());
			fout.write(name.getBytes());
			fout.write(asurname.getBytes());
			fout.write(surname.getBytes());
			fout.write(aemail.getBytes());
			fout.write(email.getBytes());
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Data Saved");
		
	}
}
