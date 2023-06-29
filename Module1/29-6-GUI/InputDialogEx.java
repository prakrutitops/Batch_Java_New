package com.a296;

import javax.swing.JOptionPane;

public class InputDialogEx 
{
	public InputDialogEx() 
	{
		// TODO Auto-generated constructor stub
		String name = JOptionPane.showInputDialog("Enter Your Name");
		System.out.println("Welcome: "+name);
	}
	
	public static void main(String[] args) 
	{
		new InputDialogEx();
	}
}
