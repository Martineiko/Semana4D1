package Frutas;

public class cajaFrutas
{
	public Papaya[] papayas;
	public Sandia[] sandias;
	public Banana[] bananas;
	
	public cajaFrutas()
	{
		
	}
	
	/*public String[] getAllFruits()
	{
		int x=0;
			
		for (int i=0;i<papayas.length;i++)
		{
			allFruits[x]="Papaya #"+i+" , " + papayas[i].getExpiracion();
			x++;
		}			
		for (int i=0;i<sandias.length;i++)
		{				
			allFruits[x]="Sandia #"+i+" , " + sandias[i].getExpiracion();
			x++;
		}
			
		for (int i=0;i<bananas.length;i++)
		{
			allFruits[x]="Banana #"+i+" , " + bananas[i].getExpiracion();
			x++;
		}
			
		return allFruits;
	}*/
	
	public void getTodas()
	{
		for (int i=0;i<papayas.length;i++)
		{
			System.out.println("Papaya #"+(i+1));
			System.out.println("Semillas: "+ papayas[i].getSemillas());
			System.out.println("Expiración: "+ papayas[i].getExpiracion());
			System.out.println();
		}
		for (int i=0;i<sandias.length;i++)
		{
			System.out.println("Sandia #"+(i+1));
			System.out.println("Expiración: "+ sandias[i].getExpiracion());
			System.out.println();
		}
		for (int i=0;i<bananas.length;i++)
		{
			System.out.println("Banana #"+(i+1));
			System.out.println("Expiración: "+ bananas[i].getExpiracion());
			System.out.println();
		}
	}
	
}