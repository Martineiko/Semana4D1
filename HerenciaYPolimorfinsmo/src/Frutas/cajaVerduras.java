package Frutas;

public class cajaVerduras
{
	public Eddo[] eddos;
	public Jengibre[] jengibres;
	public Yuca[] yucas;
	
	public cajaVerduras()
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
	
	public void getVerduras()
	{
		for (int i=0;i<eddos.length;i++)
		{
			System.out.println("Eddo #"+(i+1));
			System.out.println("Expiración: "+ eddos[i].getExpiracion());
			System.out.println();
		}
		for (int i=0;i<jengibres.length;i++)
		{
			System.out.println("Jengibre #"+(i+1));
			System.out.println("Expiración: "+ jengibres[i].getExpiracion());
			System.out.println();
		}
		for (int i=0;i<yucas.length;i++)
		{
			System.out.println("Yuca #"+(i+1));
			System.out.println("Expiración: "+ yucas[i].getExpiracion());
			System.out.println();
		}
	}
	
}