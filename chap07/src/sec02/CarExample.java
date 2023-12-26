package sec02;

public class CarExample {

	public static void main(String[] args) {
		// car 객체생성
		// car 객체는 Car 클래스의 필드, 메소드 사용가능함.
		Car car = new Car();

		for (int i = 1; i <= 5; i++) { // 5번 반복
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 한국타이어로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 한국타이어로 교체");
				car.frontRightTire = new HankookTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 금호타이어로 교체");
				car.frontLeftTire = new KumhoTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 금호타이어로 교체");
				car.frontRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("------------------------------");
		}
	}

}
