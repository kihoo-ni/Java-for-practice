package sec02;

public class ATMexample {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mother = new Thread(atm, "����");
		Thread son = new Thread(atm, "�Ƶ�");
		mother.start();
		son.start();
	}

}
