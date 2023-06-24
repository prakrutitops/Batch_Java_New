package com.a246;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class RadioButtonEx 
{
	JFrame frame;
	JRadioButton rb1,rb2;
	
	public RadioButtonEx()
	{
		frame = new JFrame();
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(55, 35, 197, 23);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(55, 75, 197, 23);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		rb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
				if(rb1.isSelected())
				{
					JOptionPane.showMessageDialog(frame,"You are Male");
				}
				
				
			}
		});
		
		rb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
				if(rb2.isSelected())
				{
					JOptionPane.showMessageDialog(frame,"You are Female");
				}
			}
		});
		
		
		frame.add(rb1);
		frame.add(rb2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) 
	{
		new RadioButtonEx();
	}
}
