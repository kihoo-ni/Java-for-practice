package sec01;

public class 학생실행구문 {
	public static void main(String[] args) {
		Student s = new Student(80, 190, 12345);
		String result = s.eat("피자");
		System.out.println(result);

	}
}
