package sec02;

public class StudentAExample {

	public static void main(String[] args) {
		StudentA a = new StudentA();
		StudentA.StudentB b = a.new StudentB();
		b.sleep();
		b.age = 20;
		b.name = "�̱���";

		a.person.wake();
		a.method1();
		// a.person.work(); �͸�ü�� ��ü���� override �Ȱ͸� �� ������.
		// ���� override method�� work�޼ҵ带 �־��ָ��.

		a.method2(
				// method2�� �Ű������� Person Ŭ���� Ÿ���� �Ѱ���� ��.
				new Person() {
					void study() {
						System.out.println("�����մϴ�.");
					}

					@Override
					void wake() {
						System.out.println("9�ÿ� �Ͼ�ϴ�.");
						study();
						// �������̵� �ȵ� study�޼ҵ带 �ٷ� ȣ�� �� ���� ����.
						// �������� �޼ҵ带 ȣ����.
					}

				}
		);
	}

}
