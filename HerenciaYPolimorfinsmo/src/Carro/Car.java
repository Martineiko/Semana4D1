package Carro;

public class Car {
	int velocity = 5;
	String [] wheels;
	boolean v = true,w = false;
	public Car()
	{
		
	}
	public boolean setVelocity()
	{
		return v;
	}
	public int getVelocity()
	{
		return velocity;
	}
	public void setWheels(boolean w)
	{
		this.w = true;
	}
	public String[] getWheels()
	{
		return wheels;
	}
}
