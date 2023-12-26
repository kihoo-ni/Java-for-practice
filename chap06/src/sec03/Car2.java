package sec03;

public class Car2 {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car2() {

	}

	public Car2(String model) {
		this(model, "은색", 250); // model에 한개의 매개변수가 있지만 나머지 은색과 250은 세가지를 선언한 생성자에서 가져옴.
	}

	public Car2(String model, String color) {
		this(model, color, 250);
	}

	public Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
