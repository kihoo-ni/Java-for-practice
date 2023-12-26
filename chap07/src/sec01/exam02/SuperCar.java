package sec01.exam02;

public class SuperCar extends Car {
	int maxSpeed;
	String engine;

	public SuperCar(String model, String company, int maxSpeed) { // 매개변수 3개 가지고 있는 생성자.
		super(model, company); //부모생성자 호출
		this.maxSpeed = maxSpeed;
	}
	
}
