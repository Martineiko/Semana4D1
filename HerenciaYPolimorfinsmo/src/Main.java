
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Clase Oddie\n");
		Oddie chucho = new Oddie();
		chucho.comer();
		chucho.dormit();
		chucho.ladrar();
		System.out.println("\nClase Garfield\n");
		Garfield gatito = new Garfield();
		gatito.comer("LaSaGnA".toUpperCase());
		System.out.println("\nClase Nermal\n");
		Nermal gris = new Nermal();
		gris.molestar(gatito.nombre);
		gris.molestar(chucho.nombre);
		gris.comer();
		gris.dormit();
	}

}
