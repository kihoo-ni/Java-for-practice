package sec03;

public class Student���� {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println("�̸� : " + st1.name);
		System.out.println("���� : " + st1.age);
		System.out.println();

		Student st2 = new Student("ȫ����", 30);
		System.out.println("�̸� : " + st2.name);
		System.out.println("���� : " + st2.age);
		System.out.println();


		Student st3 = new Student("ȫ�浿", "20231111", "010-5555-7777");
		System.out.println("�̸� : " + st3.name);
		System.out.println("�й� : " + st3.studentId);
		System.out.println("����ó : " + st3.phoneNumber);
	}

}
