package main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paddle extends JPanel implements KeyListener
{
	private final int yPos = 550;
	//xPos changes depending on key press. 
	private int xPos = 330;
	
	public Paddle()
	{
		//adds keylistener to Paddle
		addKeyListener(this);
		//sets JPanel Focusable
		setFocusable(true);
	}
	//overriding the super class method to draw rectangle. 
	@Override 
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g); 
		setBackground(Color.BLACK);
		g.setColor(Color.WHITE);
		g.fillRect(xPos, yPos, 100, 20);
		
		
	}
	
	public void keyTyped(KeyEvent e) 
	{
		//not used
	}
	
	public void keyPressed(KeyEvent e)
	{
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_RIGHT)
		{
			repaint();
			xPos = xPos + 20;
		}
		else if (code == KeyEvent.VK_LEFT) 
		{
			repaint();
			xPos = xPos - 20;
		}
	}
	
	public void keyReleased(KeyEvent e)
	{
		//not used
	}
}
