package project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class functions extends JPanel implements ActionListener, ItemListener
{

	private static final long serialVersionUID = 6290212209133516728L;

	public JTextField feildT(int x, int y, int w,int h, JPanel p)
	{
		JTextField t = new JTextField(30);
		t.setBounds(x, y, w, h);
		t.setFont(new Font("Ariel", Font.ITALIC, 20));
		p.add(t);
		return t;
	}
	
	public void titels(int x, int y, int w,int h, JPanel p, String s, int font)
	{
		JLabel l = new JLabel(s);
		l.setBounds(x, y, w, h);
		l.setFont(new Font("Sn_chedva", Font.BOLD, font));
		p.add(l);
	}
	
	public JButton button(int x, int y, int w, int h, JPanel p, String s)
	{
		JButton b = new JButton(s);
		b.setBounds(x, y, w, h);
		p.add(b);
		//b.addActionListener(this);
		return b;
	}
	
	public void comboBox(int x, int y, int w,int h, JPanel p, String[] s)
	{
		JComboBox<?> c = new JComboBox<Object>(s);
		c.setBounds(x, y, w, h);
		p.add(c);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
