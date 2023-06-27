package com.a276;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class EditeMenuEx implements ActionListener
{
	JFrame frame;
	
	JMenuBar menuBar;
	JMenu file,edit,help;
	JMenuItem cut,copy,paste,selectall;
	JTextArea textarea;
	
	
	public EditeMenuEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame("New Notepad");
		
		menuBar =new JMenuBar();
		
		file =new JMenu("File");
		edit =new JMenu("Edit");
		help =new JMenu("Help");
		
		textarea =new JTextArea();
		textarea.setBounds(106, 36, 241, 101);
		
		cut =new JMenuItem("Cut");
		copy =new JMenuItem("Copy");
		paste =new JMenuItem("Paste");
		selectall =new JMenuItem("Select All");
		
		
		
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);
		
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectall);
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectall.addActionListener(this);
		
		frame.add(textarea);
		
		frame.setJMenuBar(menuBar);
		frame.setSize(500,500);
		//frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	
	public static void main(String[] args)
	{
		
		new EditeMenuEx();
		
	}



	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
		if(e.getSource()==cut)
		{
			System.out.println("cut");
			textarea.cut();
		}
		if(e.getSource()==copy)
		{
			textarea.copy();
		}
		if(e.getSource()==paste)
		{
			textarea.paste();
		}
		if(e.getSource()==selectall)
		{
			textarea.selectAll();
		}
	}
	
}
