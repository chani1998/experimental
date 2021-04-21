package project;

import java.awt.Color;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class group extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l;
	JPanel p;
	grapy g = new grapy();
	
	functions fun = new functions();

	
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
		fun.titels(400, 20, 500, 50, p, "Groups & Expression", 40);

	} 
	
	public void removeMe(JFrame f)
	{
		
		f.remove(p);
		f.repaint();
	}

}
