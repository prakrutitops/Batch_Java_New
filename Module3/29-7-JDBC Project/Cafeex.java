package com.waiter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cafeex
{
	JFrame frame;
	JLabel l1;
	JCheckBox chk1,chk2,chk3;
	JButton btnorder;
	
	public Cafeex() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		String data = new AdminLogin().imob;
		System.out.println("Welcome "+data);
		
		l1 = new JLabel("Cafe Ordering System");
		l1.setBounds(170, 11, 146, 14);
		
		chk1 = new JCheckBox("Pizza - Rs. 100");
		chk1.setBounds(55, 35, 197, 23);
		
		
		chk2 = new JCheckBox("Burger - Rs.70");
		chk2.setBounds(55, 75, 197, 23);
		
		chk3 = new JCheckBox("Coffee - Rs.120");
		chk3.setBounds(55, 115, 197, 23);
		
		btnorder = new JButton("Order");
		btnorder.setBounds(75, 152, 89, 23);
		
		btnorder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					
					int amount =0;
					StringBuffer buffer =new StringBuffer("\n selected items");
					
					StringBuffer itembuffer =new StringBuffer();
					StringBuffer itemprice =new StringBuffer();
					StringBuffer itemtotal =new StringBuffer();
					
					if(chk1.isSelected())
					{
						buffer.append("\n pizza @ rs. 100");
						amount+=100;
						itembuffer.append("\n pizza - Rs.100");
						itemprice.append("\n 100");
						
					}
					
					if(chk2.isSelected())
					{
						buffer.append("\n burger @ rs. 70");
						amount+=70;
						itembuffer.append("\n burger - Rs.70");
						itemprice.append("\n 70");
					}
					
					if(chk3.isSelected())
					{
						buffer.append("\n coffee @ rs. 120");
						amount+=120;
						itembuffer.append("\n coffee");
						itemprice.append("\n 120");
					}
					buffer.append("\n -------------------------------");
					buffer.append("\n Total: "+ amount);
				
					
					
					String host ="jdbc:mysql://localhost:3306/";
					String db="restaurant_management";
					String url = host+db;
					
					try 
					{
						Class.forName("com.mysql.jdbc.Driver");//package for connection 
						Connection con = DriverManager.getConnection(url,"root","");//Connection establish
						
						
						String myitem = itembuffer.toString();
						String myitemprice = itemprice.toString();
						String myitemtotal = String.valueOf(amount).toString();
						String mybill = buffer.toString();
						
						String query ="insert into bill values (null,'"+myitem+"','"+myitemtotal+"','"+mybill+"')";

						Statement stmt = con.createStatement();
						
						int data = stmt.executeUpdate(query);//query run
						
						if(data>0)
						{
							frame.setVisible(false);
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
					
					
					
					//JOptionPane.showMessageDialog(frame, buffer.toString());
				
			}
		});
		
		frame.add(l1);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btnorder);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) 
	{
		new Cafeex();
	}


	
}
