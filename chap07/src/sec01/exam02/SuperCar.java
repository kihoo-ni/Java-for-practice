package sec01.exam02;

public class SuperCar extends Car {
	int maxSpeed;
	String engine;

	public SuperCar(String model, String company, int maxSpeed) { // �Ű����� 3�� ������ �ִ� ������.
		super(model, company); //�θ������ ȣ��
		this.maxSpeed = maxSpeed;
	}
	
}
