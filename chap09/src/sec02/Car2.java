package sec02;

public class Car2 {
	Car car = new Car() {
		int speed;

		void speedUp(int speed) {
			this.speed = speed;
			System.out.println("�ӵ��� " + speed + "��ŭ �����մϴ�.");
		}

		@Override
		void stop() {
			System.out.println("�ڵ����� ����ϴ�.");
			speedUp(50);
		}

	};

	void speedDown() {// ���� �͸� ��ü ����
		Car downCar = new Car() {

			@Override
			void stop() {
				System.out.println("�ӷ����Ϸ� �ڵ��� ����");
				speedDown(30);
			}

			void speedDown(int speed) {
				this.speed = speed;
				System.out.println("�ӵ��� " + speed + "��ŭ �����մϴ�.");
			}

		};
		downCar.stop(); // speedDown �޼ҵ带 ȣ���ϸ� �͸� ��ü���� �޼ҵ尡 �ڵ����� ������� ����.
	}

}
