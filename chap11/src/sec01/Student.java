package sec01;

public class Student {
	int age;

	public Student(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Student s = new Student(40); // ��ü�� ȣ���ϸ� Ŭ�����̸� �ؽ��ڵ尪�� ����
		// object Ŭ������ tostring ����Ʈ���� �����°�
		// �̰��� tostring�� �������̵�� �������Ұ�� �ٸ� ���·� ������ �� �� ����.
		System.out.println(s);
	}

}
