package Frutas;

public class cajaFrutas 
{
	public Papaya[] papayas;
	public Sandia[] sandias;
	public Banana[] bananas;
	public cajaFrutas()
	{
		
	}
	public void Metodo()
	{
		
		for(int x = 0; x < papayas.length; x++)
		{
			System.out.println("Papaya numero: #"+(x+1));
			System.out.println("Semillas: "+papayas[x].getSemillas());
			System.out.println("Dias para expiracion: "+papayas[x].getExpiracion());
			
		}
		for(int y = 0; y < bananas.length; y++)
		{
			System.out.println("Banana numero: #"+(y+1));
			System.out.println("Dias para expiracion: "+bananas[y].getExpiracion());
			
		}
		for(int z = 0; z < sandias.length; z++)
		{
			System.out.println("Sandia numero: #"+(z+1));
			System.out.println("Dias para expiracion: "+sandias[z].getExpiracion());
			
		}
	}
}
