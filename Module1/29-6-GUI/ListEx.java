package com.a296;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class ListEx 
{
	JFrame frame;
	JList<String>list;
	
	public ListEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		DefaultListModel<String> l1 = new DefaultListModel<>();  
		l1.add(0,"Java");
		l1.add(1,"Php");
		l1.add(2,"C#");
		l1.add(3,".net");
		l1.add(4,"Dart");
		
		list =new JList<>(l1);
		list.setBounds(100,100, 75,75);
		
		
		frame.add(list);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	public static void main(String[] args) 
	{
		new ListEx();
	}
}
