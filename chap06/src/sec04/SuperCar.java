package sec04;

public class SuperCar {

	int speed; // �ʵ尪

	int getSpeed() { // ���ǵ� �޼ҵ�
		return speed;
	}

	void keyTurnOn() { // �õ�Ű�� �޼ҵ�. ���ϰ� ����.
		System.out.println("Ű�� �����ϴ�.");
	}

	void run() { // 0~50���� 10������, 6�� �ݺ��Ͽ� ����ӵ� ����ϴ� �޼ҵ�, ���ϰ� ����.
		for (int i = 0; i <= 50; i += 10) {
			speed = i;
			System.out.println("�޸��ϴ�.(�ü�:" + speed + "km/h)");
		}
	}
	
}
