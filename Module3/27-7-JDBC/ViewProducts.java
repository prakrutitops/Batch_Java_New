package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewProducts {

	JFrame ViewProductFrame;
	JCheckBox chk1;
	JLabel l1;
	
	
	public ViewProducts() 
	{
		// TODO Auto-generated constructor stub
		
		ViewProductFrame =new JFrame();
		
		chk1 =new JCheckBox();
		chk1.setBounds(70, 19, 30, 23);
		
		l1 =new JLabel("xyz");
		l1.setBounds(100, 19, 97, 23);
		
		
		//Connection Configuration Detail
		String host ="jdbc:mysql://localhost:3306/";
		String db="restaurant_management";
		String url = host+db;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");//Connection establish
			
			String sql ="Select * from menu_items";
			
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(sql);
			
			//System.out.println("ID"+" "+"NAME"+" "+"PRICE"+" "+"TYPE");
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String price = set.getString(3);
				String ingridients = set.getString(4);
				int qun = set.getInt(5);
				
				l1.setText(name);
				
				
				//System.out.println(id+" "+name+" "+price+" "+ingridients+" "+qun);
			}
			
			for(int i=1;i<set.getFetchSize();i++)
			{
				
			}
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//package for connection 
		
		
		ViewProductFrame.add(chk1);
		ViewProductFrame.add(l1);
		ViewProductFrame.setSize(500,500);
		ViewProductFrame.setLayout(null);
		ViewProductFrame.setVisible(true);
	}
}
