package com.a227;

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

public class Login 
{
	JFrame loginframe;
	JTextField Email;
	JPasswordField Pass;
	JLabel Em, Ps;
	JButton loginbtn;
	String iemail,ipass;
	
	public Login() 
	{
	
		loginframe =new JFrame();
		
		//Labels
		Em = new JLabel("Email Id");
		Em.setBounds(44, 60, 70, 17);
		
		Ps = new JLabel("Password");
		Ps.setBounds(44, 120, 70, 17);
		
		
		//TextFields
		
		Email = new JTextField();
		Email.setBounds(115, 60, 195, 20);
		
		Pass = new JPasswordField();
		Pass.setBounds(115, 120, 195, 20);
		
	
	
		
		//Button
		loginbtn= new JButton("Log in");
		loginbtn.setBounds(115, 188, 89, 23);

		loginbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				
				String email = Email.getText().toString();
				String pass = Pass.getText().toString();
				
				String host ="jdbc:mysql://localhost:3306/";
				String db="fingers";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
				
					String sql ="select email,password from details where email='"+email+"'";
					
					Statement stmt = con.createStatement();
					ResultSet set = stmt.executeQuery(sql);
					
					if(set.next())
					{
						
						 iemail = set.getString(1);
						 ipass = set.getString(2);
							
						if(pass.equals(ipass))
						{
							JOptionPane.showMessageDialog(loginframe,"logged in succesfully");
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
		loginframe.add(Email);
		
		loginframe.add(loginbtn);
		loginframe.setSize(400,400);
		loginframe.setLayout(null);
		loginframe.setVisible(true);
	}
	
	public static void login() 
	{
		new Login();
	}
	
}
