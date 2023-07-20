package com.a187;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AllOperations 
{
	JFrame insertframe,deleteframe,updateframe;
	JTextField tfhname,tfhprice,tfhtype,tfid;
	JButton insert,delete,update,edit;
	JPanel jp,jp2;
	
	public void insertdata()
	{
		insertframe =new JFrame();
		
		tfhname =new JTextField(20);
		tfhprice =new JTextField(10);
		tfhtype =new JTextField(20);
		insert =new JButton("INSERT");
		
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				//Connection Configuration Detail
				String host ="jdbc:mysql://localhost:3306/";
				String db="fingers";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");//package for connection 
					Connection con = DriverManager.getConnection(url,"root","");//Connection establish
					
					String headphone_name = tfhname.getText().toString();
					String headphone_price = tfhprice.getText().toString();
					String headphone_type = tfhtype.getText().toString();
					
					String query ="insert into products values (null,'"+headphone_name+"','"+headphone_price+"','"+headphone_type+"')";

					Statement stmt = con.createStatement();
					
					int data = stmt.executeUpdate(query);//query run
					
					if(data>0)
					{
						insertframe.setVisible(false);
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
		
		insertframe.add(tfhname);
		insertframe.add(tfhprice);
		insertframe.add(tfhtype);
		insertframe.add(insert);
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
	
	public void viewdata()
	{
		//Connection Configuration Detail
		String host ="jdbc:mysql://localhost:3306/";
		String db="fingers";
		String url = host+db;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");//Connection establish
			
			String sql ="Select * from products";
			
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(sql);
			
			System.out.println("ID"+" "+"NAME"+" "+"PRICE"+" "+"TYPE");
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String price = set.getString(3);
				String type = set.getString(4);
				
				System.out.println(id+" "+name+" "+price+" "+type);
			}
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//package for connection 
		
	}
	
	public void deletedata()
	{
		deleteframe =new JFrame();
		
		tfid =new JTextField(15);
		delete =new JButton("DELETE");
		
		
		deleteframe.add(tfid);
		deleteframe.add(delete);
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				
				//Connection Configuration Detail
				String host ="jdbc:mysql://localhost:3306/";
				String db="fingers";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");//Connection establish
					
					String id = tfid.getText().toString();
					
					String sql ="Delete from products where id ='"+id+"'";
					
					Statement stmt = con.createStatement();
					
					int data = stmt.executeUpdate(sql);
					
					if(data>0)
					{
						deleteframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
				
				
				}
				catch (Exception e2) 
				{
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
			}
		});
		
		
		
		
	}
	public void updatedata()
	{
		updateframe =new JFrame();
		
		tfhname =new JTextField(20);
		tfhprice =new JTextField(10);
		tfhtype =new JTextField(20);
		tfid =new JTextField(10);
		edit =new JButton("EDIT");
		update =new JButton("UPDATE");
		jp  = new JPanel();
		jp2 = new JPanel();
		
		jp.add(tfhname);
		jp.add(tfhprice);
		jp.add(tfhtype);
		jp.add(update);
		
		
		jp2.add(tfid);
		jp2.add(edit);
		
		jp2.add(jp);
		
		jp.setVisible(false);
		updateframe.add(jp2);
		updateframe.add(jp);
		updateframe.setSize(500,500);
		updateframe.setLayout(new FlowLayout());
		updateframe.setVisible(true);
		
		
		
		edit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String host ="jdbc:mysql://localhost:3306/";
				String db="fingers";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");//Connection establish
					String id = tfid.getText().toString();
					
					String sql ="select * from products where id='"+id+"'";
					Statement stmt = con.createStatement();
					ResultSet set = stmt.executeQuery(sql);
					
					if(set.next())
					{
						int id1 = set.getInt(1);
						String h_name = set.getString(2);
						String h_price = set.getString(3);
						String h_type = set.getString(4);
						
						jp.setVisible(true);
						jp2.setVisible(false);
						
						tfhname.setText(h_name);
						tfhprice.setText(h_price);
						tfhtype.setText(h_type);
						
						update.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
						
								//Connection Configuration Detail
								String host ="jdbc:mysql://localhost:3306/";
								String db="fingers";
								String url = host+db;
								
								try 
								{
									Class.forName("com.mysql.jdbc.Driver");//package for connection 
									Connection con = DriverManager.getConnection(url,"root","");//Connection establish
									
									String headphone_name = tfhname.getText().toString();
									String headphone_price = tfhprice.getText().toString();
									String headphone_type = tfhtype.getText().toString();
									
									String query ="update products set h_name='"+headphone_name+"',h_price='"+headphone_price+"',h_type='"+headphone_type+"' where id='"+id1+"'";

									Statement stmt = con.createStatement();
									
									int data = stmt.executeUpdate(query);//query run
									
									if(data>0)
									{
										updateframe.setVisible(false);
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
					}
					
				}
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			
				
				
				
				
				
				
				
			}
		});
		
	}
	
}
