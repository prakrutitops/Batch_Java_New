package com.a296;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ImageEx extends Canvas
{
	
	@Override
	public void paint(Graphics g) 
	{
		// TODO Auto-generated method stub
		//super.paint(g);
		
		   Toolkit t=Toolkit.getDefaultToolkit();  
	       Image i=t.getImage("E:\\photos\\photo.jpg");  
	       g.drawImage(i, 120,100,this);  
	       
	       
	}
	
	JFrame frame;
	
	public static void main(String[] args)
	{
		ImageEx i =new ImageEx();
		
		 JFrame f=new JFrame();  
		 f.add(i);
		 f.setSize(400,400);  
	     f.setVisible(true);  
		 
	}
}
