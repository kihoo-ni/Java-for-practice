package sec03;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone("이기훈"); 컴파일 에러발생함. 추상클래스는  직접 객체 생성이 안됨.

		SmartPhone smartphone = new SmartPhone("홍길동", 1200000);

		smartphone.turnOn(); // 추상클래스의 메소드
		smartphone.internetSearch(); // 자기메소드

	}

}
