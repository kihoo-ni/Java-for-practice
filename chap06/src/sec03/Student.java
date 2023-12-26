package sec03;

public class Student {
	String name; // 이름 <<주석달기 습관
	int age; // 나이
	String studentId; // 학번
	String gender; // 성별
	String phoneNumber; // 연락처 <<숫자 계산작업이 필요없는 것은 무조건 String

	Student() { // 기본생성자

	}

	Student(String name, int age) { // 매개변수 2개 생성자
		this.name = name;
		this.age = age;
	}

	Student(String name, String studentId, String phoneNumber) { // 매개변수 3개 생성자
		this.name = name;
		this.studentId = studentId;
		this.phoneNumber = phoneNumber;
	}
	// 마우스 오른쪽 클릭 source, generate constructor using field 로 쉽게 만들수있음.

}
