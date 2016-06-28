package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paddle extends JPanel implements KeyListener
{
	// paddleY is final.
	private final int paddleY = 550;
	// paddleX changes depending on key press.
	private int paddleX = 330;
	private Ball ball;
	int x = 50;
	int y = 50;
	public Paddle()
	{
		// adds keylistener to Paddle
		addKeyListener(this);
		// sets JPanel Focusable
		setFocusable(true);
		ball = new Ball();

	}

	// overriding the super class method to draw rectangle.
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		setBackground(Color.BLACK);
		g.setColor(Color.WHITE);
		g.fillRect(paddleX, paddleY, 100, 20);
		g.fillOval(ball.getX(),ball.getY(),ball.getWidth(),ball.getHeight());
		
	}
	



	public void keyTyped(KeyEvent e)
	{
		// not used
	}

	public void keyPressed(KeyEvent e)
	{

		int code = e.getKeyCode();

		if (code == KeyEvent.VK_RIGHT)
		{
			repaint();
			paddleX = paddleX + 11;
		} else if (code == KeyEvent.VK_LEFT)
		{
			repaint();
			paddleX = paddleX - 11;
		}
		
//SUPER ADVANCED COLLISION CHECKING
		if (paddleX > 720 && paddleX < 740)
		{
			repaint();
			paddleX = paddleX - 21;
		}
		else if (paddleX < -20)
		{
			repaint();
			paddleX = paddleX + 21;
		}

	}

	public void keyReleased(KeyEvent e)
	{
		// not used
	}
	
	

}
