package sec03;

public class Student예제 {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println("이름 : " + st1.name);
		System.out.println("나이 : " + st1.age);
		System.out.println();

		Student st2 = new Student("홍수아", 30);
		System.out.println("이름 : " + st2.name);
		System.out.println("나이 : " + st2.age);
		System.out.println();


		Student st3 = new Student("홍길동", "20231111", "010-5555-7777");
		System.out.println("이름 : " + st3.name);
		System.out.println("학번 : " + st3.studentId);
		System.out.println("연락처 : " + st3.phoneNumber);
	}

}
