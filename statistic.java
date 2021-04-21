package project;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class statistic extends JPanel
{
	
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
    String sum = "0";
	public void window() 
	{
		fun.titels(440, 20, 500, 50, p, "statistics", 40);
		String s[] = {"All","1","tadam"};
		fun.titels(370, 120, 500, 50, p, "Select song:", 30);
	    fun.comboBox(520, 130, 140, 30, p, s);
	  
	    fun.titels(140, 200, 500, 50, p, "Total words: " + sum, 20);
	    fun.titels(440, 200, 500, 50, p, "Total lins: "+ sum, 20);
	    fun.titels(740, 200, 500, 50, p, "Total verse: "+ sum, 20);
	    fun.titels(140, 250, 500, 50, p, "Total charcters: "+ sum, 20);
	    fun.titels(440, 250, 500, 50, p, "Average words in verse: "+ sum, 20);
	    fun.titels(740, 250, 500, 50, p, "Average words in line: "+ sum, 20);
	    fun.titels(140, 300, 500, 50, p, "Average words in song: "+ sum, 20);
	    fun.titels(440, 300, 500, 50, p, "Average lines in verse: "+ sum, 20);
	    fun.titels(740, 300, 500, 50, p, "Average char in line: "+ sum, 20);
	    
	    fun.titels(180, 450, 500, 50, p, "Total songs: " + sum, 45);
	    fun.titels(610, 450, 500, 50, p, "Total groups: "+ sum, 45);
	}  
	
	public void removeMe(JFrame f)
	{
		f.remove(p);
		f.repaint();
	}

}
