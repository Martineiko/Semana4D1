//Inicia Proyecto
public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello, World");
		//Imprime un Hello World en consolita
		
		int a = 1;
		int b = 81;
		int resultado = 0;
		resultado = a + b;
		//Suma
		System.out.println("Suma: "+resultado);
		
		float d = 3.1459f;
		float c = 10.31313131f;
		float resf = 0.0f;
		
		resf = d + c;
		
		System.out.println("Suma de flotante: "+resf);
		
		
		float restg = 0.0f;
		restg = b + d;
		
		System.out.println("Suma de flotante: "+restg);
		//Chicharronera
		double x1 = ((-b)+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
		double x2 = ((-b)+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
		System.out.println("Chicharronera: X1 = "+x1+ " , x2 = "+x2);
		
		String cadena = "Parangaricutirimicuaro";
		String cadenaCesar = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		int espacio =3;
		System.out.println("//Cadenas//");
		System.out.println("\n");
		System.out.println(cadena);
		//Moverse por el arreglo de la cadena
		for(int x = 0; x < cadena.length(); x++){
			System.out.println(cadena.charAt(x));
			//Substitucion de la cadena
			cadena = cadena.replace(cadena.charAt(x), cadenaCesar.charAt(x + espacio));
		}
		System.out.println(cadena);
		//Subcadenas
		System.out.println(cadena.substring(3, 6));
		//Convertir a minusculas
		System.out.println(cadena.toLowerCase());
		//float flotante = 0.0f;
		
		//Arrays
		String [] meses = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		String [] semana = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};		
		//Objetivo muestra enero, julio, noviembre, diciembre y marzo en la misma linea
		System.out.println(meses[0]+ " "+meses[6]+" "+meses[10]+" "+meses[11]+" "+meses[2]+" "+semana[0]+" "+semana[4]+" "+semana[1]);
		
		boolean x = true;
		boolean az = false;
		System.out.println(x==az);
		if(x || az){
			System.out.println("Son iguales");
		} else{
			System.out.println("No pues achi como si son diferentes");
		}
		System.out.println("\n \n");
		
		int testscore = 95; 
		char grade; 
		if (testscore >= 90) { 
			grade = 'A'; 
			} else if (testscore >= 80) { 
				grade = 'B'; 
				} else if (testscore >= 70) { 
					grade = 'C'; 
					} else if (testscore >= 60) { 
						grade = 'D'; 
						} else { 
							grade = 'F'; 
							} 
		System.out.println("Grade = " + grade);
	}

}
