package com.a296;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableEx 
{
	JFrame frame;
	JTable table;
	String column[]={"ID","NAME","SALARY"};   
	String data[][]={ 
						{"101","Amit","670000"},    
						{"102","Jai","780000"},    
						{"101","Sachin","700000"}
					};    
	public TableEx() 
	{
		frame =new JFrame();
		
		table =new JTable(data,column);
		table.setBounds(30,40,200,300);
		
		
		JScrollPane jp =new JScrollPane(table);
		frame.add(jp);          
		frame.setSize(500,500);
		//frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new TableEx();
	}
}
