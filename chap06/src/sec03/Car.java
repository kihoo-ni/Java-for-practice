package sec03;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;

	public Car() {
		// 기본생성자
	}

//	public Car(String model, int speed) {
	// 모델명과 속도가 들어가는 생성자 만듦.
	// 생성자가 하나 있으므로 컴퓨터가 자동으로 만들지는 않음.
//	}
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public Car(String model, String color) { 
		this(model,color,250);
	}

}
