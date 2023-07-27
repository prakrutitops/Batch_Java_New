package com.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JTextField;

public class AddProducts 
{
	
	JFrame addFrame;
	JLabel labelmenu;
	JLabel l1,l2,l3,l4;
	JTextField tfname,tfprice,tfin,tfqun;
	JButton btnadd;
	
	public AddProducts() 
	{
		addFrame =new JFrame("Add Items");
		
		labelmenu =new JLabel("MENU");
		labelmenu.setBounds(202, 11, 46, 14);
		
		l1 =new JLabel("Item Name");
		l1.setBounds(77, 70, 146, 14);
	
		tfname =new JTextField();
		tfname.setBounds(182, 70, 186, 20);
		
		l2 =new JLabel("Item Price");
		l2.setBounds(77, 110, 146, 14);
		
		tfprice =new JTextField();
		tfprice.setBounds(182, 110, 186, 20);
		
		l3 =new JLabel("Item Ingridients");
		l3.setBounds(77, 150, 146, 14);
		
		tfin =new JTextField();
		tfin.setBounds(182, 150, 186, 20);
		
		l4 =new JLabel("Item Quantity");
		l4.setBounds(77, 190, 146, 14);
		
		tfqun = new JTextField();
		tfqun.setBounds(182, 190,186, 20);
		
		btnadd = new JButton("ADD PRODUCT");
		btnadd.setBounds(145, 240, 130, 23);
		
		btnadd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String host ="jdbc:mysql://localhost:3306/";
				String db="restaurant_management";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");//package for connection 
					Connection con = DriverManager.getConnection(url,"root","");//Connection establish
					
					String p_name = tfname.getText().toString();
					String p_price = tfprice.getText().toString();
					String p_ingri= tfin.getText().toString();
					String p_quantity = tfqun.getText().toString();
					
					
					String query ="insert into menu_items values (null,'"+p_name+"','"+p_price+"','"+p_ingri+"','"+p_quantity+"')";

					Statement stmt = con.createStatement();
					
					int data = stmt.executeUpdate(query);//query run
					
					if(data>0)
					{
						addFrame.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
					
					
					
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		addFrame.add(labelmenu);
		addFrame.add(tfname);
		addFrame.add(tfprice);
		addFrame.add(tfin);
		addFrame.add(tfqun);
		addFrame.add(l1);
		addFrame.add(l2);
		addFrame.add(l3);
		addFrame.add(l4);
		addFrame.add(btnadd);
		addFrame.setSize(500,500);
		addFrame.setLayout(null);
		addFrame.setVisible(true);
		
		
	}
}
