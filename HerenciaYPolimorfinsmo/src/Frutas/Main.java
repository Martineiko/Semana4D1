package Frutas;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Papaya
		Papaya papaya = new Papaya();
		papaya.setExpiracion(5);
		//Sandia
		Sandia sandia = new Sandia();
		sandia.setExpiracion(7);
		//Banana
		Banana banana = new Banana();
		banana.setExpiracion(3);
		//Arreglo para llenar la caja
		Papaya[] papayas = new Papaya[4];
		Sandia[] sandias = new Sandia[5];
		Banana[] bananas = new Banana[3];
		//Caja de frutas para mover la fruta
				cajaFrutas caja = new cajaFrutas();
				caja.bananas = bananas;
				caja.papayas = papayas;
				caja.sandias = sandias;
				
		//Refrigerador nuevo
				Refrigerador refri = new Refrigerador();
				refri.setTemperatura(4);
				refri.setCaja(caja);
				
		/*//Bucle
		for(int x = 0; x < papayas.length; x++)
		{
			papayas[x] = papaya;
		}
		for(int y = 0; y < sandias.length; y++)
		{
			sandias[y] = sandia;
		}
		for(int z = 0; z < bananas.length; z++)
		{
			bananas[z] = banana;
		}
		for(int i = 0; i < refri.getCaja().papayas.length; i++)
		{
			System.out.println("Papaya numero: #"+(i+1));
			System.out.println("Semillas: "+refri.getCaja().papayas[i].getSemillas());
			System.out.println("Dias para expiracion: "+refri.getCaja().papayas[i].getExpiracion());
			System.out.println("\n");
		}
		for(int i = 0; i < refri.getCaja().bananas.length; i++)
		{
			System.out.println("Banana numero: #"+(i+1));
			System.out.println("Dias para expiracion: "+refri.getCaja().bananas[i].getExpiracion());
			System.out.println("\n");
		}*/
				refri.getCaja().Metodo();
	}

}
