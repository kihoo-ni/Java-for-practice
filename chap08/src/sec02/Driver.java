package sec02;

public class Driver {

	public void drive(Vehicle vehicle) { //�Ű������� �������̽� ��ü�� �޼ҵ�
		vehicle.run();
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Driver driver = new Driver(); // Driver ��ü����
		Bus bus = new Bus(); // Bus ��ü ����
		Taxi taxi =new Taxi(); // Taxi ��ü ����
		
		driver.drive(bus); 
		//bus ��ü�� �Ű������� �Ѱ��� 
		//bus�� Vehicle �������̽��� ���� ��ü�̹Ƿ� Vehicle Ÿ������ �ڵ� ��ȯ�Ǿ� ��.
		
	}

}
