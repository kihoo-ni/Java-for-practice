package sec01.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car car =new Truck();
		
		car.speedUp(30);
		car.speedUp(300);
		
		car=new SportCar();
		car.speedUp(50);
		car.speedDown(20);
		// ���� Car�� ������ SportCar Ŭ������ �ִٸ� 
		// car = new SportCar();�� �̿��Ͽ�
		// car �������̽� �ϳ��� �ΰ�ü�� ���������� ������.
	}

}
