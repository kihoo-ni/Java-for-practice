package sec03;

public abstract class Phone {
	public String owner;// ������ �ʵ�

	public Phone(String owner) { // ������
		this.owner = owner;
	}

	// ���� x �Ű����� x �޼ҵ� �߻�޼ҵ�� abstract �������.
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}

	// ���� x �Ű����� x �޼ҵ�
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}

}
