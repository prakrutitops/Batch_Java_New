package com.a246;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class DropDownEx 
{
	JFrame frame;
	JComboBox<String>combo;
	String city[]= {"Rajkot","Baroda","Surat"};
	JButton btn;
	
	public DropDownEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		combo = new JComboBox<>(city);
		combo.setBounds(55, 35, 197, 23);
		
		btn =new JButton("Submit");
		btn.setBounds(55, 75, 197, 23);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				System.out.println("Your Selected City is :"+combo.getItemAt(combo.getSelectedIndex()));   
				
				
			}
		});
		
		frame.add(combo);
		frame.add(btn);
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		
		new DropDownEx();
		
	}
}
