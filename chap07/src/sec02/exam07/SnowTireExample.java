package sec02.exam07;

public class SnowTireExample {

	public static void main(String[] args) {
		
		SnowTire snowTire=new SnowTire();
		Tire tire=snowTire;
		
		snowTire.run();
		tire.run();
	}

}
