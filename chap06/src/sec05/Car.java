package sec05;

public class Car {
	// �ʵ弱��
	String model;
	int speed;

	// �⺻������
	Car() {

	}

	// �Ű����� 1�� ������
	Car(String model) {
		this.model = model;
	}

	// �Ű����� 1�� �޼ҵ�, ����x
	void setSpeed(int speed) {
		this.speed = speed;
	}

	// �Ű����� x ���� x �޼ҵ�
	// 10~50���� 5�� �ݺ��ؼ� �ӵ��� �����ϰ� ���
	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü�:" + this.speed + "km/h)");
		}
	}

	public static void main(String[] args) {
		Car myCar = new Car("������");
		myCar.run();

		// speed=60; ��ü�������ؼ� ����Ұ�
		Car yourCar = new Car();
		yourCar.speed = 60;
	}
}
