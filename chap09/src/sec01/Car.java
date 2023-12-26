package sec01;

public class Car {
	String company; // ����ȸ��
	int speed; // �ӵ�
	int cost; // ����
	static String color; // ����

	Car() { // �⺻ ������
		System.out.println("Car ȣ��");
	}

	void speedUp(int speed) {
		this.speed += speed;
	}

	void speedDown(int speed) {
		this.speed -= speed;
	}

	void stop() {
		System.out.println("Car ����.");
	}

	static void stop2() {
		System.out.println("Car ����.");
	}

	class OldCar { // ��øŬ���� (�ν��Ͻ� ��� Ŭ����)
		// ��ø�� ��쿡�� static(����)���� �����Ѱ� �ƴ϶�� static �ʵ弱��Ұ�, �޼ҵ忡�� ��ü ������
		// �ֻ���Ŭ������ Car�� ��쿡�� class�� �����̵� �Ϲ��̵簣�� �������
		// �����޼ҵ�, �����ʵ� ���� ������.
		// ��, �����޼ҵ� ����� �޼ҵ� ���ϱ����ȿ� CarŬ������ �ν��Ͻ� �ʵ峪 �޼ҵ� �����Ϸ���
		// ������ CarŬ������ ��ü�� �����ؾ߸� ���밡����.

		int speed; // �ӵ�
		int cost; // ����

		OldCar() {
			System.out.println("OldCar ȣ��");
		}

		void speedUp(int speed) {
			this.speed += speed;
		}

		void carCall() {// �ν��Ͻ� �޼ҵ忡�� �ٱ� Ŭ������ �ʵ�� �޼ҵ� ���� ������(����x)
			company = "����";
			stop();
		}
	}

	static class Truck { // ��øŬ������ static���� �����ϸ� ���� Ŭ���� �ʵ��� �ʱⰪ�̳� ��� �޼ҵ忡�� ��ü�� ����������.
		int cost;
		int speed;
		static int speedUp;

		Truck() {
			System.out.println("Truck ȣ��");
		}

		void carCall() {

			/*
			 * company="����"; stop(); ����Ŭ������ �޼ҵ忡�� �ٱ� Ŭ������ �ʵ�� �޼ҵ� ���پȵ�.
			 */
			color = "����";
			stop2();
			// ����Ŭ������ �޼ҵ忡�� �ٱ�Ŭ������ �ʵ�� �޼ҵ尡 �����̸� ���ٰ�����.
		}

		void speedUp(int speed) {
			this.speed += speed;
		}

	}
}
