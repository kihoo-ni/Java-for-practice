package sec01;

public class Car {
	String company; // 제조회사
	int speed; // 속도
	int cost; // 가격
	static String color; // 색상

	Car() { // 기본 생성자
		System.out.println("Car 호출");
	}

	void speedUp(int speed) {
		this.speed += speed;
	}

	void speedDown(int speed) {
		this.speed -= speed;
	}

	void stop() {
		System.out.println("Car 멈춤.");
	}

	static void stop2() {
		System.out.println("Car 멈춤.");
	}

	class OldCar { // 중첩클래스 (인스턴스 멤버 클래스)
		// 중첩의 경우에는 static(정적)으로 선언한게 아니라면 static 필드선언불가, 메소드에서 객체 못만듦
		// 최상위클래스인 Car의 경우에는 class가 정적이든 일반이든간에 상관없이
		// 정적메소드, 정적필드 선언 가능함.
		// 단, 정적메소드 선언시 메소드 리턴구문안에 Car클래스의 인스턴스 필드나 메소드 선언하려면
		// 무조건 Car클래스의 객체를 생성해야만 적용가능함.

		int speed; // 속도
		int cost; // 가격

		OldCar() {
			System.out.println("OldCar 호출");
		}

		void speedUp(int speed) {
			this.speed += speed;
		}

		void carCall() {// 인스턴스 메소드에서 바깥 클래스의 필드와 메소드 접근 가능함(정적x)
			company = "현대";
			stop();
		}
	}

	static class Truck { // 중첩클래스중 static으로 선언하면 상위 클래스 필드의 초기값이나 모든 메소드에서 객체를 생성가능함.
		int cost;
		int speed;
		static int speedUp;

		Truck() {
			System.out.println("Truck 호출");
		}

		void carCall() {

			/*
			 * company="현대"; stop(); 정적클래스의 메소드에서 바깥 클래스의 필드와 메소드 접근안됨.
			 */
			color = "빨강";
			stop2();
			// 정적클래스의 메소드에서 바깥클래스의 필드와 메소드가 정적이면 접근가능함.
		}

		void speedUp(int speed) {
			this.speed += speed;
		}

	}
}
