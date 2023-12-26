package sec02;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findclass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

	public static void findclass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.util.Scaner"); //scanner로 하면 아무것도 안나옴
	}

}
