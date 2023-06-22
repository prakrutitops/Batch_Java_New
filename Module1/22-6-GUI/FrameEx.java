package com.a226;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameEx 
{
	JFrame frame;
	JButton btn;
	
	public FrameEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		btn = new JButton("Submit");
		btn.setBounds(148, 11, 111, 58);
		
		frame.add(btn);
		
		frame.setSize(350,350);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		
		new FrameEx();
	}
	
}
