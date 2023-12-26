package sec03.exam01;

public class Dog extends Animal { // 추상클래스로 부터 상속받으면 추상메소드 오버라이드 해줘야함.

	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("강아지는 멍멍");
	}

}
