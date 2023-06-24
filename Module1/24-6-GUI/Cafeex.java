package com.a246;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cafeex 
{
	JFrame frame;
	JLabel l1;
	JCheckBox chk1,chk2,chk3;
	JButton btnorder;
	
	public Cafeex() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		l1 = new JLabel("Cafe Ordering System");
		l1.setBounds(170, 11, 146, 14);
		
		chk1 = new JCheckBox("Pizza - Rs. 100");
		chk1.setBounds(55, 35, 197, 23);
		
		chk2 = new JCheckBox("Burger - Rs.70");
		chk2.setBounds(55, 75, 197, 23);
		
		chk3 = new JCheckBox("Coffee - Rs.120");
		chk3.setBounds(55, 115, 197, 23);
		
		btnorder = new JButton("Order");
		btnorder.setBounds(75, 152, 89, 23);
		
		btnorder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					
					int amount =0;
					StringBuffer buffer =new StringBuffer("\n selected items");
				
					if(chk1.isSelected())
					{
						buffer.append("\n pizza @ rs. 100");
						amount+=100;
					}
					
					if(chk2.isSelected())
					{
						buffer.append("\n burger @ rs. 70");
						amount+=70;
					}
					
					if(chk3.isSelected())
					{
						buffer.append("\n coffee @ rs. 120");
						amount+=120;
					}
					buffer.append("\n -------------------------------");
					buffer.append("\n Total: "+ amount);
				
					JOptionPane.showMessageDialog(frame, buffer.toString());
				
			}
		});
		
		frame.add(l1);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btnorder);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) 
	{
		new Cafeex();
	}
	
}
