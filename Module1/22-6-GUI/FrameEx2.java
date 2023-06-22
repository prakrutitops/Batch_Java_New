package com.a226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FrameEx2 extends WindowAdapter
{
	JFrame frame;
	JLabel lname,lsurname,lemail,lpass,lconfirmpass;
	JTextField tname,tsurname,temail;
	JPasswordField tpass,tconfirmpass;
	JButton btnsubmit;
	
	public FrameEx2() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		lname =new JLabel("Enter Firstname: ");
		lname.setBounds(55, 10, 146, 14);
		
		lsurname =new JLabel("Enter Lastname: ");
		lsurname.setBounds(55, 50, 146, 14);
		
		lemail =new JLabel("Enter Email: ");
		lemail.setBounds(55, 90, 146, 14);
		
		lpass =new JLabel("Enter Password: ");
		lpass.setBounds(55, 130, 146, 14);
		
		lconfirmpass =new JLabel("Enter Confirm Password: ");
		lconfirmpass.setBounds(55, 170, 146, 14);
		
		tname = new JTextField();
		tname.setBounds(200, 10, 186, 20);
		
		tsurname = new JTextField();
		tsurname.setBounds(200, 50, 186, 20);
		
		temail = new JTextField();
		temail.setBounds(200, 90, 186, 20);
		
		tpass = new JPasswordField();
		tpass.setBounds(200, 130, 186, 20);
		
		tconfirmpass = new JPasswordField();
		tconfirmpass.setBounds(200, 170, 186, 20);
		
		btnsubmit =new JButton("Submit");
		btnsubmit.setBounds(144, 230, 89, 23);
		
		frame.addWindowListener(this);
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		btnsubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				String fname = tname.getText().toString();
				String lname = tsurname.getText().toString();
				String email= temail.getText().toString();
				String pass = tpass.getText().toString();
				String cpass = tconfirmpass.getText().toString();
				
				if(pass.equals(cpass))
				{
					
					String fn="\n Your Firstname is: ";
					String ln="\n Your Lastname is: ";
					String em="\n Your Email is: ";
					String ps="\n Your Password is: ";
					
					try 
					{
						FileOutputStream fout =new FileOutputStream("E://tops.txt");
						
						fout.write(fn.getBytes());
						fout.write(fname.getBytes());
						
						fout.write(ln.getBytes());
						fout.write(lname.getBytes());
						
						fout.write(em.getBytes());
						fout.write(email.getBytes());
						
						fout.write(ps.getBytes());
						fout.write(pass.getBytes());
						
					}
					catch (Exception e1)
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					System.out.println("Executed");
					new FrameEx3();
				}
				else
				{
					//System.out.println("Your Password and Confirm Password are not same");
					JOptionPane.showMessageDialog(frame, " Your Password and Confirm Password are not same ");
				
				}
				
				
				
				
				
				
			}
		});
		
		frame.add(lname);
		frame.add(lsurname);
		frame.add(lemail);
		frame.add(lpass);
		frame.add(lconfirmpass);
		frame.add(tname);
		frame.add(tsurname);
		frame.add(temail);
		frame.add(tpass);
		frame.add(tconfirmpass);
		frame.add(btnsubmit);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	@Override
	public void windowClosing(WindowEvent e)
	{
		// TODO Auto-generated method stub
		//super.windowClosing(e);
		int ans = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?");
		
		if(ans==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(ans==JOptionPane.NO_OPTION)
		{
			//JOptionPane.showMessageDialog(frame, "NO Clicked");
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
		if(ans==JOptionPane.CANCEL_OPTION)
		{
			//JOptionPane.showMessageDialog(frame, "Cancel Clicked");
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
		
		
		
	
	}
	
	public static void main(String[] args)
	{
		new FrameEx2();
	}
	
}
