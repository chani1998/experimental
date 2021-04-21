package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class myFrame extends JFrame implements ActionListener, ItemListener
{
	JFrame f = new JFrame();
	
	private insert ins = new insert();
	private data dat = new data();
	private group gro = new group();
	private statistic stat = new statistic();
	
	private String titel = "Welcome";
	JLabel l;
	 
	private JButton b1,b2,b3,b4,b5;
	
	private Image img;
	//private PicPanel picture=new PicPanel();
	
	Graphics gg;
	grapy g = new grapy();

	ImageIcon icon;
	
	public myFrame()
	{
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.setSize(1300,700);
    	f.setVisible(true);
    	
    	//titel at home page
    	l = new JLabel(titel);
		l.setBounds(600, 280, 500, 100);
		l.setFont(new Font("Sn_chedva", Font.BOLD, 100));
		l.setBackground(Color.pink);
		f.add(l);
		
    	createB(f);
    	
		//הוספת קיווקוים
		//f.getContentPane().add(new grapy());
		g.location(600, 380, 950, 380);
    	f.add(g);
    	
    	/*הצגת תמונה - שיטה אחת
    	img = Toolkit.getDefaultToolkit().getImage("bb.jpeg");
    	g.drawImage(gg,img,0,0,400,400,f);
    	//שיטה שתים
    	icon = new ImageIcon("file:///C:/Users/1/eclipse-workspace/project/img.png");
		icon.paintIcon(f,gg,1,1);
		
		f.add(new JLabel(new ImageIcon("file:///C:/Users/1/eclipse-workspace/project/img.png")));*/
	}
	

	public void createB(JFrame f)
	{
		b1 = new JButton("Insert");
		b2 = new JButton("data retrieval");
		b3 = new JButton("groups & expression");
		b4 = new JButton("statistics");
		b5 = new JButton("Home");
		
    	f.add(b1);
    	f.add(b2);
    	f.add(b3);
    	f.add(b4);
    	f.add(b5);
    	
    	b1.setBounds(20, 20, 200, 80);
    	b2.setBounds(20, 120, 200, 80);
    	b3.setBounds(20, 220, 200, 80);
    	b4.setBounds(20, 320, 200, 80);
    	b5.setBounds(20, 550, 200, 80);
    	
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	b4.addActionListener(this);
    	b5.addActionListener(this);
    	
	}
	

		@Override
		public void itemStateChanged(ItemEvent e) {
			/*if(e.getStateChange() == ItemEvent.SELECTED)
			/*	  ins.setFull(true);
			  else 
				  ins.setFull(false);*/
			
		}
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == b1)
			{
				  ins.panel(f);
				  try {
			        dat.removeMe(f);
			        stat.removeMe(f);
			        gro.removeMe(f);
				  } catch (Exception e1) {
				      System.out.println("Something went wrong1.");}
			}
		    else
		    {
		    	 if(e.getSource() == b2)
		    	 {
		    		 dat.panel(f);
		    		 try {
		    		  ins.removeMe(f);  
    			      stat.removeMe(f);
    			      gro.removeMe(f);
		    		 } catch (Exception e1) {
					      System.out.println("Something went wrong2.");}
		    	 }
		    	 else
		    	 {
		    		  if(e.getSource() == b3)
		    		  {
		    			  
		    		      try {
		    		        gro.panel(f);
	    				    ins.removeMe(f);
	    			        dat.removeMe(f);
	    			        stat.removeMe(f);
	    			      }catch (Exception e1) {
						      System.out.println("Something went wrong3.");}
		    		  }
		    		  else
			    	  {
			    		  if(e.getSource() == b4)
			    		  {
			    			  
			    			  try {
			    				  stat.panel(f);
			    				  ins.removeMe(f);
			    			      dat.removeMe(f);
			    			      gro.removeMe(f);
			    			     }catch (Exception e1) {
								      System.out.println("Something went wrong4.");}
			    		  }
			    		  else
			    		  {
			    			  if(e.getSource() == b5)
			    			  {
			    				  try {
			    				  ins.removeMe(f);
			    			      dat.removeMe(f);
			    			      stat.removeMe(f);
			    			      gro.removeMe(f);
			    			      }catch (Exception e1) {
								      System.out.println("Something went wrong5.");}
						    	  
			    		      }
			    	     }
		    	     }
		        }
		    }
		}
		
	
	public static void main(String[] args) 
	{
		 myFrame p = new myFrame();	  
	}
	
	

}