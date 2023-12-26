package sec02.exam01;

public class Car {
	String color; // 자동차 색상
	String company;// 제조회사
	int speed; // 속도
	int cost; // 가격

	public Car(String color, String company) { // 매개변수가 2개인 생성자, 기본생성자x
		this.color = color;
		this.company = company;
	}

	void speedUp(int speed) { // 매개변수 int 1개짜리 메소드, 리턴타입 X , 매개변수의 숫자만큼 필드값 speed 증가
		this.speed += speed;
	}

	void speedDown(int speed) { // 매개변수 int 1개짜리 메소드, 리턴타입 X , 매개변수의 숫자만큼 필드값 speed 감소
		this.speed -= speed;
	}

	void start() { // 매개변수 x, 리턴타입x
		System.out.println("시동을 걸었습니다.");
	}

	void stop() { // 매개변수 x, 리턴타입x
		System.out.println("차를 멈춥니다.");
	}

}
