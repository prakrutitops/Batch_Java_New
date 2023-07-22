package com.a227;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;

public class Signup 
{
	JFrame signupframe;
	JTextField Uname, Fname, Email;
	JPasswordField Pass;
	JLabel Un, Fn, Em, Ps, Er;
	JButton signupbtn;
	
	public Signup() 
	{
	
			signupframe =new JFrame();
			
			//Labels
			Un = new JLabel("Userame");
			Un.setBounds(44, 25, 70, 17);
			
			Ps = new JLabel("Password");
			Ps.setBounds(44, 67, 70, 17);
			
			Fn = new JLabel("Full Name");
			Fn.setBounds(44, 107, 70, 17);
			
			Em = new JLabel("Email Id");
			Em.setBounds(44, 145, 70, 17);
			
			
			
			//TextFields
			
			Uname = new JTextField();
			Uname.setBounds(115, 22, 195, 20);
			
			Pass = new JPasswordField();
			Pass.setBounds(115, 64, 195, 20);
			
			Fname = new JTextField();
			Fname.setBounds(115, 104, 195, 20);
			
			Email = new JTextField();
			Email.setBounds(115, 142, 195, 20);
			
			//Button
			signupbtn= new JButton("Sign Up");
			signupbtn.setBounds(115, 188, 89, 23);
			
			signupbtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
			
					String host ="jdbc:mysql://localhost:3306/";
					String db="fingers";
					String url = host+db;
					
					try 
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection(url,"root","");
						
						String uname = Uname.getText().toString();
						String pass = Pass.getText().toString();
						String fname = Fname.getText().toString();
						String email = Email.getText().toString();
						
						String sql ="insert into details values(null,'"+uname+"','"+pass+"','"+fname+"','"+email+"')";
						
						Statement stmt = con.createStatement();
						
						int status = stmt.executeUpdate(sql);
						
						if(status>0)
						{
							signupframe.setVisible(false);
						}
						else
						{
							System.out.println("Error");
						}
						
						
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
				}
			});
			
			signupframe.add(Un);
			signupframe.add(Ps);
			signupframe.add(Fn);
			signupframe.add(Em);
			signupframe.add(Uname);
			signupframe.add(Pass);
			signupframe.add(Fname);
			signupframe.add(Email);
			signupframe.add(signupbtn);
			signupframe.setSize(400,400);
			signupframe.setLayout(null);
			signupframe.setVisible(true);
		
	}
	
	public static void signup()
	{
		new Signup();
	}
}
