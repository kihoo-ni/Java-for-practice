package sec02.exam01;

public class Truck extends Car {
	int weight; // ���� �뷮
	String trunkSize; // Ʈ��ũ ������ ��) ��, ��, ��
	int maxSpeed; // �ִ� �ӵ�

	// ������ �Ű����� 4��(�θ�2��, �ڽ�2��)

	public Truck(String color, String company, int weight, String trunkSize) {
		super(color, company);
		this.weight = weight;
		this.trunkSize = trunkSize;
	}


	// �Ű����� int 1��¥�� �����޼ҵ�, ����Ÿ��x
	void maxSpeed(int maxSpeed) {
		this.maxSpeed += maxSpeed;
	}

	@Override
	void start() {
		System.out.println("Ʈ���� ����߽��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Ʈ���� ����ϴ�.");
	}
	
}
