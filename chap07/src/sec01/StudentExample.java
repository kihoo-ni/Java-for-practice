package sec01;

public class StudentExample {

	public static void main(String[] args) {
		Student st1 = new Student(70,60,123213); // �Ű����� ����

		String food = st1.eat("�ܹ���"); // �θ� �޼ҵ� eatȣ��
		System.out.println(food);
		String speed = st1.run(70); // �θ�޼ҵ� speed ȣ��
		System.out.println(speed);
		st1.study("������ ������"); // �ڱ�޼ҵ� ȣ��
		st1.awake(); // �θ�޼ҵ� ȣ��
	}

}
