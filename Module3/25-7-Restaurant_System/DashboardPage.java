package com.admin;

import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DashboardPage 
{
	
	public DashboardPage() 
	{
		// TODO Auto-generated constructor stub
		
		JPanel panel = new JPanel();
		panel.add(new JLabel (new ImageIcon ("E:/Photos/add.png")));	
		panel.add (new JLabel (new ImageIcon ("E:/Photos/view.png" )));
		
		 JFrame frame = new JFrame ("Display multiple images from files.");

         frame.getContentPane().add (panel);

         frame.pack();

         frame.setVisible(true);

        
	}
}
