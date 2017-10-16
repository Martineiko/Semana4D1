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
		
		
	}

}
