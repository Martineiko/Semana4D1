
public class Garfield extends Animal 
{
	//String nombre;
	public Garfield()
	{
		super ("");
	}
	public Garfield(String nombre)
	{
		super(nombre);
	}
	@Override
	public void comer()
	{
		
	}
	public void comer(String comida)
	{
		super.comer();
		if(comida.equalsIgnoreCase("lasagna"))
		{
			System.out.println("YAY!");
		}else{
			System.out.println("NAY");
		}
	}
}
