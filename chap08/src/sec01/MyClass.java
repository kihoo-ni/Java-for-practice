package sec01;

public class MyClass {
	// 필드
	RemoteControl rc = new Television();

	// 디폴트생성자, 만약 호출시 Television에서 구현된 메소드 호출
	MyClass() {
	}

	// 인터페이스를 매개변수로 하는 생성자.
	// 매개변수 객체의 메소드 호출
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
		rc.tunrOff();
	}

	// Audio 객체의 메소드 호출
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.tunrOff();
	}

	// 매개변수 객체의 메소드 호출
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
		rc.tunrOff();
	}
}
