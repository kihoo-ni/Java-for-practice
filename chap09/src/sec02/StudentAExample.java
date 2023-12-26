package sec02;

public class StudentAExample {

	public static void main(String[] args) {
		StudentA a = new StudentA();
		StudentA.StudentB b = a.new StudentB();
		b.sleep();
		b.age = 20;
		b.name = "이기훈";

		a.person.wake();
		a.method1();
		// a.person.work(); 익명객체는 모객체에서 override 된것만 쓸 수있음.
		// 따라서 override method에 work메소드를 넣어주면됨.

		a.method2(
				// method2는 매개변수로 Person 클래스 타입을 넘겨줘야 함.
				new Person() {
					void study() {
						System.out.println("공부합니다.");
					}

					@Override
					void wake() {
						System.out.println("9시에 일어납니다.");
						study();
						// 오버라이드 안된 study메소드를 바로 호출 할 수가 없음.
						// 이중으로 메소드를 호출함.
					}

				}
		);
	}

}
