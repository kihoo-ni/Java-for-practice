package sec03.exam01;

public class Cat extends Animal { // �߻�Ŭ������ ���� ��ӹ����� �߻�޼ҵ� �������̵� �������.

	public Cat() {
		this.kind = "������";
	}

	@Override
	public void sound() {
		System.out.println("����̴� �߿�");
	}

}
