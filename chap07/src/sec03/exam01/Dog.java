package sec03.exam01;

public class Dog extends Animal { // �߻�Ŭ������ ���� ��ӹ����� �߻�޼ҵ� �������̵� �������.

	public Dog() {
		this.kind = "������";
	}

	@Override
	public void sound() {
		System.out.println("�������� �۸�");
	}

}
