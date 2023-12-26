package sec01;

public class StudentExample {

	public static void main(String[] args) {
		Student st1 = new Student(70,60,123213); // 매개변수 저장

		String food = st1.eat("햄버거"); // 부모 메소드 eat호출
		System.out.println(food);
		String speed = st1.run(70); // 부모메소드 speed 호출
		System.out.println(speed);
		st1.study("전남대 도서관"); // 자기메소드 호출
		st1.awake(); // 부모메소드 호출
	}

}
