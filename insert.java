package project;

import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.*;
import java.sql.Statement;

import javax.swing.*;

import java.awt.Graphics;
import java.awt.TextField;
//import java.awt.Graphics2D;
//import java.awt.GridLayout;
import java.awt.event.*;
import java.io.File;
import java.sql.CallableStatement;
import java.sql.Connection;

public class insert extends JPanel implements ActionListener, ItemListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel p;
	JLabel l;
	functions fun = new functions();
	sql ss = new sql();
	Connection cc;
	Statement statement;
	ResultSet rs;
	String cer;
	
	grapy g = new grapy();
	
	JButton b1=new JButton();
	JButton b3=new JButton();
	JButton b4=new JButton();
	
	JTextField t1 = new JTextField(30);
	JTextField t2 = new JTextField(30);
	JTextField t3 = new JTextField(30);
	JTextField t4 = new JTextField(30);
	//JTextField t5;
	JTextField t6 = new JTextField(30);
	JTextField t7 = new JTextField(30);
	JTextField t8 = new JTextField(30);

	public insert() {

	}

	public void removeMe(JFrame f) {

		f.remove(p);
		f.repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

	}

	public void panel(JFrame f) 
	{
		p = new JPanel();
		f.add(p);
		p.setBounds(240, 20, 1020, 620);
		p.setBackground(Color.pink);

	    //הוספת קיווקוים
    	p.add(g);
		g.location(600, 380, 600, 100);
		g.setBackground(Color.black);

		window();
	}

	public void window() 
	{
		
		String st[] = {"Name of song:", "Lyrics:", "Performer:", "Music:", "Path:"};
		String st1[] = {"Name of song:", "Performer:", "Word:"};
		fun.titels(150, 40, 500, 50, p, "Loud a new song", 45);
		fun.titels(600, 40, 500, 50, p, "Show Song", 45);
		
		int y=100;
		for(int i=0; i<5; i++)
		{
			fun.titels(70, y, 200, 30, p, st[i], 25);
			y+=40;
		}
		
		//t5 = fun.feildT(200, 260, 140, 30,p);
		//t5.setBounds(200, 260, 140, 30);
		//t5.setFont(new Font("Ariel", Font.ITALIC, 20));
		//p.add(t5);
		
		t1 = fun.feildT(200, 100, 235, 30,p);
		t2 = fun.feildT(200, 140, 235, 30,p);
		t3 = fun.feildT(200, 180, 235, 30,p);
		t4 = fun.feildT(200, 220, 235, 30,p);
		
		t6 = fun.feildT(700,100,235,30,p);
		t7 = fun.feildT(700,140,235,30,p);
		t8 = fun.feildT(700,180,235,30,p);
		
		y=100;
		
		for(int i=0; i<3; i++)
		{
			fun.titels(550, y, 200, 30, p, st1[i], 25);
			y+=40;
		}
		
		b1 = fun.button(250, 300, 150, 30, p, "insert"); //כפתור של ינסרט=הכנסה
        b3 = fun.button(350, 260, 85, 30, p, "browse"); //כפתור של ברווז
		b4 = fun.button(710, 220, 100, 30, p, "search");
		b1.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	public boolean createNewPerson(String songName, String l, String p, String m, String f, int x,int y,int w,int z )
	{
		//הוספה לטבלת השירים
		try {
			CallableStatement stmt = sql.getConnection().prepareCall(sql.INSERT_SUBJECT);
			int i = 1;
			stmt.setString(i++, songName);
			stmt.setString(i++, l);
			stmt.setString(i++, p);
			stmt.setString(i++, m);
			stmt.setString(i++, f);

			stmt.setInt(i++, x);
			stmt.setInt(i++, y);
			stmt.setInt(i++, w);
			stmt.setInt(i++, z);

			stmt.executeUpdate();
			return true;
		}catch (SQLException e) {
			 e.printStackTrace();
		}
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1)//insert
		{
			
			if(createNewPerson(t1.getText(), t2.getText(), t3.getText(), t4.getText(), cer, 0,0,0,0)==true)
			{
			      fun.titels(250, 350, 150, 30, p, "The song was successfully inserted", 25);
			      
		    }
			else
			      fun.titels(250, 350, 150, 30, p, "The song wasn't inserted. Try again ", 25);

			fun.titels(200, 350, 300, 30, p, "The song was successfully inserted", 25);	
			/*try {
				   if(createNewPerson(t1.getText(), t2.getText(), t3.getText(), t4.getText(), cer, 0,0,0,0))
				   {
				      fun.titels(250, 350, 150, 30, p, "The song was successfully inserted", 25);
			       }
			    }catch (Exception e1) {
			      System.out.println("Something went wrong in insert.");
			      fun.titels(250, 350, 150, 30, p, "The song wasn't inserted. Try again ", 25);
		        }*/
		}
		else
		{
				if(e.getSource() == b3)//browse
				{
					b3.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							JFileChooser jfc = new JFileChooser(new File("Documents"));
							int returnValue = jfc.showOpenDialog(null);
							if(returnValue == JFileChooser.APPROVE_OPTION)
							{
								File selected = jfc.getSelectedFile();
								cer = selected.getPath();
								System.out.println("Something browse.");
								//t5 = new JTextField(cer);
								fun.titels(200, 260, 140, 30, p, cer, 25);
							}
						}
					});
				}
				else
				{
					if(e.getSource() == b4)//search
					{
						
					}
				}
		}
		
	}
	

}
