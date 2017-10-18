package Carro;

public class carMover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SporstCar class");
		SportsCar run = new SportsCar();
		run.getVelocity();
		run.getAerodinamicalCoef();
		System.out.println(run.getVelocity());
		System.out.println("Crossover class");
		Crossover cros = new Crossover();
		cros.getSuspensionHeight();
		System.out.println(cros.setVelocity());
	}

}
