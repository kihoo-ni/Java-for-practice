package sec02;

public class ATMexample {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mother = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		mother.start();
		son.start();
	}

}
