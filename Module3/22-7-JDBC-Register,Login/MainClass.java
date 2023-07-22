package com.a227;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass implements ActionListener
{
	JFrame frame;
	JButton registerbtn,loginbtn;
	JLabel l1;
	
	public MainClass() 
	{
		// TODO Auto-generated constructor stub
	
		frame =new JFrame();
		
		registerbtn =new JButton("SIGN UP");
		registerbtn.setBounds(110, 48, 89, 23);
		
		loginbtn =new JButton("LOG IN");
		loginbtn.setBounds(110, 92, 89, 23);

		l1 =new JLabel("Welcome");
		l1.setBounds(125, 11, 146, 14);
		
		registerbtn.addActionListener(this);
		loginbtn.addActionListener(this);
		
		
		frame.add(l1);
		frame.add(registerbtn);
		frame.add(loginbtn);
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args)
	{
		new MainClass();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==registerbtn)
		{
			Signup.signup();
		}
		if(e.getSource()==loginbtn)
		{
			Login.login();
		}
	}
	
}
