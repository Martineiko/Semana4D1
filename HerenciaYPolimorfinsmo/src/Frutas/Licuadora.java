package Frutas;

public class Licuadora implements Clavija 
{
	int otrovoltaje;
	@Override
	public void conectarse() {
		// TODO Auto-generated method stub
		otrovoltaje = voltaje;
		System.out.println(voltaje);
	}
	
}
