package sec03.exam01;

public class Cat extends Animal { // 추상클래스로 부터 상속받으면 추상메소드 오버라이드 해줘야함.

	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("고양이는 야옹");
	}

}
