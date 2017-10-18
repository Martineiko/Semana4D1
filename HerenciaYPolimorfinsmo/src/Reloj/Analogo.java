package Reloj;

public class Analogo extends Reloj {
	String [] manecillas;
	public Analogo()
	{
		
	}
	public Analogo(String []m)
	{
		super("Verde");
		setManecillas(m);
	}
	public void setManecillas(String[]m)
	{
		this.manecillas = m;
	}
	public String[] getManecillas()
	{
		return manecillas;
	}
	
}
