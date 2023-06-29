package com.a296;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx 
{
	JFrame frame;
	JButton insret,view,udpate,delete;
	
	public FlowLayoutEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		insret =new JButton("Insertghghghghghg");
		view =new JButton("View");
		udpate =new JButton("Update");
		delete =new JButton("Delete");
		
		frame.add(insret);
		frame.add(view);
		frame.add(udpate);
		frame.add(delete);
		
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	
	
	}
	public static void main(String[] args) 
	{
		new FlowLayoutEx();
	}
}
