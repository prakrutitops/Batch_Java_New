package com.a47;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DigitalWatchEx implements Runnable
{
	JFrame frame;
	JButton button;
	Thread t;
	int hours=0, minutes=0, seconds=0;  
	String timeString;
	public DigitalWatchEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		
		t =new Thread(this);
		t.start();
		
		button =new JButton();
		button.setBounds(100,100,100,50);
		
		
		
		frame.add(button);
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new DigitalWatchEx();
	}


	@Override
	public void run() 
	{
		
		try
		{
	         while (true) 
	         {
	        	 Calendar cal = Calendar.getInstance();//calender initialize
	        	 
	        	 hours = cal.get(Calendar.HOUR_OF_DAY);  
	        	 minutes = cal.get(Calendar.MINUTE);  
	             seconds = cal.get(Calendar.SECOND);  
	             
	             if ( hours > 12 ) hours -= 12;  
	             
	             SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
	             
	             Date date = cal.getTime(); 
	             timeString = formatter.format( date );  
	        	 printTime();
	        	 //button.setText(timeString);
	        	 t.sleep(1000);
	         }
	        	 	
	        	 
			
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
		
		
	}
	public void printTime()
	{  
		button.setText(timeString);  
	}  
	
}
