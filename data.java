package project;

import java.awt.Color;

//import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JTextField;

public class data extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	JLabel l;
	JPanel p;
	
	functions fun = new functions();
	
	JButton b1=new JButton();
	JButton b2=new JButton();
	
	grapy g = new grapy();
	
	public void panel(JFrame f)
	{
		p = new JPanel();
		f.add(p);
		p.setBounds(240, 20, 1020, 620);
		p.setBackground(Color.pink);
		
	
		window();
	}

	public void window() 
	{
		fun.titels(400, 20, 500, 50, p, "Data retrievel", 40);
		
		String st[] = {"Songs:", "Verse:", "Line:", "Num of Word:"};
		
		fun.titels(150, 60, 500, 50, p, "Display word by index", 30);		
		fun.titels(650, 60, 500, 50, p, "Display index by word", 30);
		
		int y=130;
		String s[] = {"All","1","tadam"};

		for(int i=0; i<4; i++)
		{
			fun.titels(120, y, 200, 30, p, st[i], 25);
			if(i==0)
			    fun.comboBox(250, y, 140, 30, p, s);
			else
				fun.feildT(250, y, 140, 30,p);
			
			y+=40;
		
		}
		fun.titels(660, 130, 200, 30, p, st[0], 25);
		fun.comboBox(750, 130, 140, 30, p, s);
		
		b1=fun.button(210, 290, 100, 30, p, "search"); //כפתור של חיפוש
		b2=fun.button(720, 170, 100, 30, p, "enter"); //כפתור של  
		
		g.location(600, 380, 950, 380);
    	p.add(g);
    	
    	
	} 
	
	public void removeMe(JFrame f)
	{
		
		f.remove(p);
		f.repaint();
	}
	

}
