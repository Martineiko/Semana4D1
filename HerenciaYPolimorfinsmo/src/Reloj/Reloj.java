package Reloj;

public class Reloj {
	String color;
	//constructor
	public Reloj()
	{
		
	}
	public Reloj(String c)
	{
		setColor(c);
	}
	public void setColor(String c)
	{
		this.color = c;
	}
	public String getColor()
	{
		return color;
	}
}
