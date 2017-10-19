package Frutas;

public class Main 
{
	public static void main(String[] args)
	{
		Refrigerador refri = new Refrigerador();
		refri.setTemperatura(4);
		
		// Creando nueva papaya y seteando su expiración
		Papaya papaya = new Papaya();
		papaya.setExpiracion(5);
		
		// Creando nueva sandia y seteando su expiración
		Sandia sandia = new Sandia();
		sandia.setExpiracion(7);
		
		// Creando nueva banana y seteando su expiración
		Banana banana = new Banana();
		banana.setExpiracion(3);
		
		//Creando nueva eddo
		Eddo eddo = new Eddo();
		eddo.setExpiracion(3);
		
		//Creando Jen
		Jengibre jengibre = new Jengibre();
		jengibre.setExpiracion(5);
		
		//Creando Yuca
		Yuca yuca = new Yuca();
		yuca.setExpiracion(10);
		//Arreglos para cargar el contenido
		Papaya[] papayas = new Papaya[4];
		Sandia[] sandias = new Sandia[5];
		Banana[] bananas = new Banana[3];
		Yuca[] yucas = new Yuca[4];
		Jengibre[] jengibres = new Jengibre[5];
		Eddo[] eddos = new Eddo[3];
		
		// Llenando arreglo de papayas
		for (int x=0; x<papayas.length;x++)
		{
			papayas[x]=papaya;
		}
		// Llenando arreglo de sandias
		for (int x=0; x<sandias.length;x++)
		{
			sandias[x]=sandia;
		}
		// Llenando arreglo de bananas
		for (int x=0; x<bananas.length;x++)
		{
			bananas[x]=banana;
		}
		// Llenando arreglo de yucas
		for (int x=0; x<yucas.length;x++)
		{
			yucas[x]=yuca;
		}
		// Llenando arreglo de jengibres
		for (int x=0; x<jengibres.length;x++)
		{
			jengibres[x]=jengibre;
		}
		// Llenando arreglo de eddos
		for (int x=0; x<eddos.length;x++)
		{
			eddos[x]=eddo;
		}
		
		// Creando una nueva caja de frutas
		cajaFrutas cajaFrutas = new cajaFrutas();
		
		// Llenando cajaFrutas de las frutas que se metieron en los arreglos anteriores
		cajaFrutas.papayas=papayas;
		cajaFrutas.sandias=sandias;
		cajaFrutas.bananas=bananas;
		
		//Creando una nueva caja de verduras
		cajaVerduras cajaVer = new cajaVerduras();
		
		// Llenando cajaVer de las verduras que se metieron en los arreglos anteriores
		cajaVer.yucas=yucas;
		cajaVer.eddos=eddos;
		cajaVer.jengibres=jengibres;
		
		//  Poner la caja de frutas en el refri
		refri.setCaja(cajaFrutas);
		
		//Poner la caja de verduras en el refri
		refri.setCajaVer(cajaVer);
		//Obtener la caja
		refri.getCaja().getTodas();
		//Obtener verduras
		refri.getCajaVer().getVerduras();
		
		// Ver una fruta de la caja que está en el refri
		
		/*for (int i=0;i<refri.getCajafrutas().papayas.length;i++)
		{
			System.out.println("Papaya #"+(i+1));
			System.out.println("Semillas: "+ refri.getCajafrutas().papayas[i].getSemillas());
			System.out.println("Expiración: "+ refri.getCajafrutas().papayas[i].getExpiracion());
			System.out.println();
		}
		for (int i=0;i<refri.getCajafrutas().sandias.length;i++)
		{
			System.out.println("Sandia #"+(i+1));
			System.out.println("Expiración: "+ refri.getCajafrutas().sandias[i].getExpiracion());
			System.out.println();
		}
		for (int i=0;i<refri.getCajafrutas().bananas.length;i++)
		{
			System.out.println("Banana #"+(i+1));
			System.out.println("Expiración: "+ refri.getCajafrutas().bananas[i].getExpiracion());
			System.out.println();
		}*/
		
		
	}

}
