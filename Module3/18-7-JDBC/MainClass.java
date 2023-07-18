package com.a187;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass implements ActionListener
{
	JFrame frame;
	JButton insertbtn,viewbtn,updatebtn,deletebtn;
	
	public MainClass()
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		insertbtn = new JButton("INSERT");
		viewbtn = new JButton("VIEW");
		updatebtn = new JButton("UPDATE");
		deletebtn = new JButton("DELETE");
		
		insertbtn.addActionListener(this);
		viewbtn.addActionListener(this);
		deletebtn.addActionListener(this);
		
		frame.add(insertbtn);
		frame.add(viewbtn);
		frame.add(updatebtn);
		frame.add(deletebtn);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	
	}
	public static void main(String[] args) {
		
		new MainClass();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		AllOperations a =new AllOperations();
		
		if(e.getSource()==insertbtn)
		{
			a.insertdata();
		}
		if(e.getSource()==viewbtn)
		{
			a.viewdata();
		}
		if(e.getSource()==updatebtn)
		{
			
		}
		if(e.getSource()==deletebtn)
		{
			a.deletedata();
		}
		
	}
}
