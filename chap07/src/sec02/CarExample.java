package sec02;

public class CarExample {

	public static void main(String[] args) {
		// car ��ü����
		// car ��ü�� Car Ŭ������ �ʵ�, �޼ҵ� ��밡����.
		Car car = new Car();

		for (int i = 1; i <= 5; i++) { // 5�� �ݺ�
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾�� ��ü");
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ����� �ѱ�Ÿ�̾�� ��ü");
				car.frontRightTire = new HankookTire("�տ�����", 13);
				break;
			case 3:
				System.out.println("�ڿ��� ��ȣŸ�̾�� ��ü");
				car.frontLeftTire = new KumhoTire("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�ڿ����� ��ȣŸ�̾�� ��ü");
				car.frontRightTire = new KumhoTire("�ڿ�����", 17);
				break;
			}
			System.out.println("------------------------------");
		}
	}

}
