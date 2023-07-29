import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ex1 
{
	JFrame frame;
	JCheckBox[] checkBoxList;
	
	public Ex1() 
	{
		
		frame =new JFrame();
	
		checkBoxList=new JCheckBox[5];
		
		for(int i=0;i<checkBoxList.length;++i) 
		{
			checkBoxList[i]=new JCheckBox("A: "+i);
			frame.add(checkBoxList[i]);
		}
		
		/*
		 * for(int i=0;i<checkBoxList.length;++i) { checkBoxList[i]=new
		 * JCheckBox("CheckBox #"+i); //create the check boxes and add them to the
		 * jframe frame.add(checkBoxList[i]);
		 * 
		 * }
		 */
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(2,2));
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new Ex1();
	}
}
