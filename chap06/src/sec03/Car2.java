package sec03;

public class Car2 {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	Car2() {

	}

	public Car2(String model) {
		this(model, "����", 250); // model�� �Ѱ��� �Ű������� ������ ������ ������ 250�� �������� ������ �����ڿ��� ������.
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
