package sec05;

public class Singleton {

	// 정적필드
	private static Singleton singleton = new Singleton();

	// 생성자
	private Singleton() {

	}

	// 정적 메소드
	static Singleton getInstance() {
		return singleton;
	}

	public static void main(String[] args) {
		/*
		 * Singleton obj1 = new Singleton(); 
		 * Singleton obj2 = new Singleton(); 두번이상 객체생성불가
		 */

		Singleton obj1 = Singleton.getInstance(); //캘린더클래스와 동일한논리 
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
	}
}
