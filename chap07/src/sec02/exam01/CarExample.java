package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Truck truck = new Truck("���", "����", 3, "��");

		Car car = truck; // �ڵ� Ÿ�� ��ȯ
		
		car.speedUp(30); // �θ� �޼ҵ� ȣ��
		/* car.maxSpeed(50); �ڽ�Ÿ���� ��ȯ�Ǿ��� ������ �ڽ� �޼ҵ�� ȣ�� �Ұ���.
		 * truck.maxSpeed(50); �� ���� car�� �ƴ϶� �������. */
		
		car.start(); //�ڽ��� �޼ҵ������� �������̵��߱� ������ ȣ�� ����.
	}

}
