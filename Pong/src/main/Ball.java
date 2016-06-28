package main;

public class Ball
{
	private final int height = 15; 
	private final int width = 15;
	private int velY;
	private int ballX;
	private int ballY;
	
	
	public Ball()
	{
		ballX = 350;
		ballY = 250;
		velY = 2;
		
		
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getX()
	{
		return ballX;
	}
	
	public int getY()
	{
		return ballY;
	}
	
	public int getVelY()
	{
		return velY;
	}

	public void grav()
	{
		
		ballY = ballY + velY;

		
	}
}
