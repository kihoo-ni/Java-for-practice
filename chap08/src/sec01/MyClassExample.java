package sec01;

public class MyClassExample {

	public static void main(String[] args) {
		MyClass my1 = new MyClass();
		// 디폴트 생성자 호출
		my1.rc.turnOn();
		my1.rc.setVolume(7);

		MyClass my2 = new MyClass(new Television());
		// 매개변수 1개 생성자 호출
		my2.rc.turnOn();
		my2.rc.setVolume(7);
		
		MyClass my3 = new MyClass(new Audio());
		// 매개변수 1개 생성자 호출
		my3.rc.turnOn();
		my3.rc.setVolume(7);
		
		MyClass my4 = new MyClass();
		// 매개변수가 없는 메소드 호출
		my4.methodA();
		
		MyClass my5 = new MyClass();
		my5.methodB(new Television());
		
		
		
	}

}
