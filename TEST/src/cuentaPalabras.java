
public class cuentaPalabras 
{
	String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	int numeroDeLetras;
	public cuentaPalabras()
	{
		
	}
	
	public cuentaPalabras(int numero)
	{
		this.numeroDeLetras = numero;
	}
	
	public void cuentaLetras()
	{
		System.out.println("//////////////////////Buscar hasta que encuentre la primera\\\\\\\\\\\\\\\\\\\\");
		for(int f = 0; f < meses.length; f++)
		{
			if(meses[f].length() == numeroDeLetras)
			{
				System.out.println(meses[f]+" : "+numeroDeLetras);
				break;
			}
		}
		
		System.out.println("//////////////////////Buscar hasta terminar\\\\\\\\\\\\\\\\\\\\");
		
				for(int f = 0; f < meses.length; f++)
		{
			if(meses[f].length() == numeroDeLetras)
			{
				System.out.println(meses[f]+" : "+numeroDeLetras);
			}
		}
	}
	
	//Crear metodo aqui
	
	public void cuentaHistorias()
	{
		System.out.println("Te contare una linda historia");
	}
}
