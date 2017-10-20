package Frutas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Vector;

@SuppressWarnings("unused")
@Deprecated
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
		//Areglo con listas
		ArrayList <Papaya> listaPapaya = new ArrayList<Papaya>();
		//Agregar un elemento en la lista de papaya
		listaPapaya.add(papaya);
		//arreglo para agregar elementos papaya
		for(int x = 0; x < 1000; x++)
		{
			listaPapaya.add(papaya);
		}
		listaPapaya.remove(999);
		System.out.println("Aqui esta tu index "+listaPapaya.get(999).getSemillas());
		for(int x = 0; x < listaPapaya.size(); x++)
		{
			System.out.println("Lista papaya: "+listaPapaya.get(x).getExpiracion());
		}
		//listaPapaya.add(sandia);
		
		//lista de frutas
		ArrayList <Frutas> listaFrutas = new ArrayList<Frutas>();
		listaFrutas.add(banana);
		listaFrutas.add(sandia);
		listaFrutas.add(papaya);
		
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
		//refri.getCaja().getTodas();
		//Obtener verduras
		//refri.getCajaVer().getVerduras();
		
		System.out.println("Tamaño de listaPapaya: "+listaPapaya.size());
		System.out.println("Tamaño de listaFrutas: "+listaFrutas.size());
		System.out.println("\n");
		//Iterator de lista de papaya
		Iterator<Papaya> itr = listaPapaya.iterator();
		/*while(itr.hasNext())
		{
			System.out.println("La fecha de la expiracion es: "+itr.next().getExpiracion());
		}*/
		
		//Vector frutas
		Vector <Frutas> miVector = new Vector(100);
		miVector.add(papaya);
		miVector.add(banana);
		miVector.add(sandia);
		Enumeration <Frutas> en = miVector.elements();
		while(en.hasMoreElements())
		{
			System.out.println("Fruta: "+en.nextElement().getExpiracion());
		}
		
		//Vector papayas
		Vector <Papaya> miVectorP = new Vector(10);
			miVectorP.add(papaya);
			miVectorP.add(papaya);
			miVectorP.add(papaya);
		Enumeration <Papaya> enP = miVectorP.elements();
		while(enP.hasMoreElements())
		{
			System.out.println("Papaya: "+enP.nextElement().getExpiracion());
		}
		//Vector Sandias
				Vector <Sandia> miVectorS = new Vector(10);
				miVectorS.add(sandia);
				miVectorS.add(sandia);
				miVectorS.add(sandia);
				Enumeration <Sandia> enS = miVectorS.elements();
				while(enS.hasMoreElements())
				{
					System.out.println("Sandia: "+enS.nextElement().getExpiracion());
				}
		//Vector bananas
				Vector <Banana> miVectorB = new Vector(20);
				miVectorB.add(banana);
				miVectorB.add(banana);
				miVectorB.add(banana);
				Enumeration <Banana> enB = miVectorB.elements();
				while(enB.hasMoreElements())
				{
					System.out.println("Banana: "+enB.nextElement().getExpiracion());
				}
				
				HashMap <Integer, String> miTabla = new HashMap <Integer, String>();
				miTabla.put(100, "Hola");
				miTabla.put(101, "Mundo");
				miTabla.put(102, "KPasa");
				for(Map.Entry entry:miTabla.entrySet()){
					System.out.println(entry.getKey()+" : "+entry.getValue());
					} 
				System.out.println("\nAqui inicia la Hash Table");
				Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
				hashTable.put(100, "Hola");
				hashTable.put(101, "Mundo");
				hashTable.put(102, "KPasa");
				for(Map.Entry entry:hashTable.entrySet()){
					System.out.println(entry.getKey()+" : "+entry.getValue());
					} 
				/*
				Scanner scanner = new Scanner( System.in ); 
				System.out.print("Enter your age "); 
				int value = scanner.nextInt(); 
				assert value>=18:" Not valid"; 
				System.out.println("value is "+value); 
				*/
	
		
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
				
			//Enum
			/*	for (miEnum s : miEnum.values())
				{
					System.out.println(s);
				}
				*/
				System.out.println("\nLambas");
				//Sin Lamba
				Clavija miClavija = new Clavija()
						{
							@Override
							public void conectarse()
							{
								System.out.println("\nClavija 1!!!");
							}
						};
						miClavija.conectarse();
				//Con lamba
				Clavija miClavija2 = ()->{
					System.out.println("\nClavija 2!!!");
				};
		miClavija2.conectarse();
		
		//Otra lamba
		OtraClase otra = (algo)->{
			return algo;
		};
			System.out.println("\nOtra clase "+otra.loQueSea("QueLePacho"));
			//Lamba For Each
			ArrayList <Papaya> listaPapayas = new ArrayList<Papaya>();
			listaPapayas.add(papaya);
			listaPapayas.add(papaya);
			listaPapayas.add(papaya);
			for(int x =0; x < 1000; x++)
			{
				listaPapayas.add(papaya);
			}
			listaPapayas.forEach(
					n->{ 
						System.out.println(n.getExpiracion());
						System.out.println(n.getColor());
						}
					);
			System.out.println("\n");
			listaPapayas.forEach(
					(Papaya n)->{
							System.out.println(n.getExpiracion());
							System.out.println(n.getColor());
					}
					);
			System.out.println("Comparador");
			List<Producto> list=new ArrayList<Producto>(); 
			//Adding Products 
			list.add(new Producto(1,"HP Laptop",25000f)); 
			list.add(new Producto(3,"Keyboard",300f)); 
			list.add(new Producto(2,"Dell Mouse",150f));
			list.add(new Producto(4,"Asus ROG",26000f));
			System.out.println("\nSorting on the basis of name..."); 
			// implementing lambda expression 
			Collections.sort(list,(p1,p2)->{ 
				return p1.nombre.compareTo(p2.nombre);
				//return String.valueOf(p1.id).compareTo(String.valueOf(p2.id)); 
				}); 
			for(Producto p:list)
			{ 
				System.out.println(p.id+" "+p.nombre+" "+p.precio); 
			}
			
	}
	public enum miEnum 
	{
		LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
	}

}
