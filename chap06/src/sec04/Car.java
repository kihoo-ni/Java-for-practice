package sec04;

public class Car {
	
	private int speed = 100;

	void powerOn() {
		System.out.println("�õ�ON");
	}

	void powerOff() {
		System.out.println("�õ�OFF");
	}

	int speedUp(int x) {
		speed += x;
		return speed;

	}

	int speedDown(int x) {

		speed -= x;
		return speed;
	}

	int breakZero() {
		speed=0;
		return speed;
	}
}
