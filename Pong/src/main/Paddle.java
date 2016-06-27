package main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paddle extends JPanel 
{
	private final int yPos = 550;
	//xPos will change. Haven't implemented mouse listener.
	private int xPos = 30;
	
	//overriding the super class method to draw rectangle. 
	@Override 
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g); 
		setBackground(Color.BLACK);
		g.setColor(Color.WHITE);
		g.fillRect(xPos, yPos, 100, 20);

		
	}
}
