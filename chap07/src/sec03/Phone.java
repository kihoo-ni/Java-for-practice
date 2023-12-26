package sec03;

public abstract class Phone {
	public String owner;// 소유자 필드

	public Phone(String owner) { // 생성자
		this.owner = owner;
	}

	// 리턴 x 매개변수 x 메소드 추상메소드는 abstract 적어야함.
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	// 리턴 x 매개변수 x 메소드
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

}
