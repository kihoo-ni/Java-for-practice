package sec02;

public class 타입변환예제1 {

	public static void main(String[] args) {
		Car car = new Car();
		Sedan sedan = new Sedan();
		Sonata sonata = new Sonata();
		
		
		Car car2 = sedan; // Sedan 클래스 타입은 Car 클래스의 자식클래스 이므로 Car 클래스 타입으로 자동변환됨.
		Car car3 = sonata; // Sonata 클래스 타입은 Car 클래스의 자식클래스 이므로 Car 클래스 타입으로 자동변환됨.

		/* Truck truck=sonata; 서로다른관계라서 자동변환 안됨. */

		/*
		 * 부모타입으로 자동타입변환 이후에는 부모클래스에 선언된 필드 및 메소드만 접근가능 
		 * 예외적으로 메소드가 자식클래스에서 재정의될 경우 자식클래스의 메소드가 대신 호출
		 */
		
		
	
	}

}
