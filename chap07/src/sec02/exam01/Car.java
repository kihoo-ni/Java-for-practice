package sec02.exam01;

public class Car {
	String color; // �ڵ��� ����
	String company;// ����ȸ��
	int speed; // �ӵ�
	int cost; // ����

	public Car(String color, String company) { // �Ű������� 2���� ������, �⺻������x
		this.color = color;
		this.company = company;
	}

	void speedUp(int speed) { // �Ű����� int 1��¥�� �޼ҵ�, ����Ÿ�� X , �Ű������� ���ڸ�ŭ �ʵ尪 speed ����
		this.speed += speed;
	}

	void speedDown(int speed) { // �Ű����� int 1��¥�� �޼ҵ�, ����Ÿ�� X , �Ű������� ���ڸ�ŭ �ʵ尪 speed ����
		this.speed -= speed;
	}

	void start() { // �Ű����� x, ����Ÿ��x
		System.out.println("�õ��� �ɾ����ϴ�.");
	}

	void stop() { // �Ű����� x, ����Ÿ��x
		System.out.println("���� ����ϴ�.");
	}

}
