package sec02.exam01;

public class Truck extends Car {
	int weight; // 적재 용량
	String trunkSize; // 트렁크 사이즈 예) 대, 중, 소
	int maxSpeed; // 최대 속도

	// 생성자 매개변수 4개(부모2개, 자식2개)

	public Truck(String color, String company, int weight, String trunkSize) {
		super(color, company);
		this.weight = weight;
		this.trunkSize = trunkSize;
	}


	// 매개변수 int 1개짜리 고유메소드, 리턴타입x
	void maxSpeed(int maxSpeed) {
		this.maxSpeed += maxSpeed;
	}

	@Override
	void start() {
		System.out.println("트럭이 출발했습니다.");
	}

	@Override
	void stop() {
		System.out.println("트럭을 멈춥니다.");
	}
	
}
