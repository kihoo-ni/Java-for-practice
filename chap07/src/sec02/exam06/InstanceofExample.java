package sec02.exam06;

public class InstanceofExample {

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
	}

	public static void method1(Parent parent) {

		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("강제 변환 성공");
		} else {
			System.out.println("강제 변환 실패");
		}
	}

}
