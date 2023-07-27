package com.admin;

import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DashboardPage implements MouseListener
{
	
	JLabel l1,l2;
	JPanel panel;
	
	public DashboardPage() 
	{
		// TODO Auto-generated constructor stub
		
		panel = new JPanel();
		l1 =new JLabel(new ImageIcon("E:/Photos/add.png"));
		l2 =new JLabel(new ImageIcon("E:/Photos/view.png"));
		
		l1.addMouseListener(this); 
		l2.addMouseListener(this); 
		
		panel.add(l1);
		panel.add(l2);
		
		JFrame frame = new JFrame ("Display multiple images from files.");

         frame.getContentPane().add (panel);

         frame.pack();
         	
         frame.setVisible(true);

        
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		if(e.getSource()==l1)
		{
			new AddProducts();
		}
		if(e.getSource()==l2)
		{
			new ViewProducts();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
