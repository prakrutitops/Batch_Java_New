package com.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLogin 
{
	
	JFrame loginframe;
	JTextField Mobile;
	JPasswordField Pass;
	JLabel Em, Ps;
	JButton loginbtn;
	String imob,ipass;
	
	public AdminLogin() 
	{
		
	loginframe =new JFrame("Admin Login");
	
	//Labels
	Em = new JLabel("Mobile Number ");
	Em.setBounds(25, 60, 220, 17);
	
	Ps = new JLabel("Password");
	Ps.setBounds(25, 100, 70, 17);
	
	
	//TextFields
	
	Mobile = new JTextField();
	Mobile.setBounds(115, 60, 195, 20);
	
	Pass = new JPasswordField();
	Pass.setBounds(115, 100, 195, 20);
	


	
	//Button
	loginbtn= new JButton("Log in");
	loginbtn.setBounds(115, 140, 89, 23);

	loginbtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	
			
			String mob = Mobile.getText().toString();
			String pass = Pass.getText().toString();
			
			String host ="jdbc:mysql://localhost:3306/";
			String db="restaurant_management";
			String url = host+db;
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,"root","");
			
				String sql ="select mobile,password from admin_login where mobile='"+mob+"'";
				
				Statement stmt = con.createStatement();
				ResultSet set = stmt.executeQuery(sql);
				
				if(set.next())
				{
					
					 imob = set.getString(1);
					 ipass = set.getString(2);
						
					if(pass.equals(ipass))
					{
						
						JOptionPane.showMessageDialog(loginframe,"logged in succesfully");
						new DashboardPage();
					}
					else
					{
						JOptionPane.showMessageDialog(loginframe,"password is wrong");
					}
					
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(loginframe,"No USer Found");
				}
				
				
				
			}
			catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
		}
	});
	

	loginframe.add(Ps);
	loginframe.add(Em);
	
	loginframe.add(Pass);
	loginframe.add(Mobile);
	
	loginframe.add(loginbtn);
	loginframe.setSize(400,400);
	loginframe.setLayout(null);
	loginframe.setVisible(true);
	}
	public static void main(String[] args) 
	{
		
		new DashboardPage();
	}
	
}
