package sec06.exam04.package1;

public class A {
	A a1 = new A(true); // 매개변수 boolean이 있는 생성자 호출
	A a2 = new A(1); // 매개변수가 int 인 생성자 호출
	A a3 = new A("문자열"); // 매개변수 String 인 생성자 호출

	public A(boolean a) {
	}

	A(int a) {
	}

	private A(String s) {
	}

}
