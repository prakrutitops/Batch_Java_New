package com.a276;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MenuEx implements ActionListener
{
	JFrame frame;
	JTextArea textArea;
	JButton btn,btn2;
	JLabel l1,l2;
	
	public MenuEx() 
	{
		frame = new JFrame();
		
		textArea =new JTextArea();
		textArea.setBounds(106, 36, 241, 101);
		
		btn =new JButton("Submit");
		btn.setBounds(189, 149, 89, 23);
		
		l1 =new JLabel("");
		l1.setBounds(106, 11, 146, 14);
		
		l2 = new JLabel("");
		l2.setBounds(301, 11, 146, 14);
		
		btn.addActionListener(this);
		//btn2.addActionListener(this);
		
		frame.add(textArea);
		frame.add(btn);
		frame.add(l1);
		frame.add(l2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new MenuEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource()==btn)
		{
			String data = textArea.getText().toString();
			
			String words[]=data.split("\\s");
			
			l1.setText("Words are: "+words.length);
			l2.setText("Characters are: "+data.length());
		}
	}
	
	
}
