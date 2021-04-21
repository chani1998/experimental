package project;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class grapy extends JComponent 
{
	/**
	 * 
	 */
	 private int width=0, height=0; 

	private static final long serialVersionUID = 1L;
	int x,y,x2,y2;
	public void location(int X, int Y, int X2, int Y2)
	{
		x=X;
		y=Y;
		x2=X2;
		y2=Y2;
	}
	public void paint(Graphics g) 
	{
	  Graphics2D g2d = (Graphics2D) g;
      float[] dash1 = {2f, 0f, 2f};
	  BasicStroke bs1 = new BasicStroke(2,BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 1.0f, dash1,2f);
	  g2d.setStroke(bs1);
	  g2d.drawLine(x, y, x2, y2);
	  //(600, 380, 950, 380);
	 }
	public void drawImage(Graphics g, Image img, int i, int j, int k, int l, JFrame f) {
		//g.drawImage(img, i, j, k, l, f);
		width=img.getWidth(this); 
		height = img.getHeight(this);
		System.out.println(width);
		System.out.println(height);
		//g.drawImage(img,0,0,width,height,f);
		//g.drawImage(img,0,0,200,200,f);
	}
		
		

}
