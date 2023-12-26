package sec01;

public class Student {
	int age;

	public Student(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Student s = new Student(40); // 객체를 호출하면 클래스이름 해시코드값이 나옴
		// object 클래스의 tostring 디폴트값이 나오는것
		// 이것을 tostring의 오버라이드로 재정의할경우 다른 형태로 나오게 할 수 있음.
		System.out.println(s);
	}

}
