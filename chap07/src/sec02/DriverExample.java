package sec02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver(); // Driver Ŭ���� ��ü ����
		Bus bus = new Bus(); // Bus Ŭ���� ��ü ����
		Taxi taxi = new Taxi(); // Taxi Ŭ���� ��ü ����
		Vehicle vehicle = new Vehicle(); // Vehicle Ŭ���� ��ü ����

		driver.drive(bus); //  �Ű����� �ȳ����� ����ȵ�.
		driver.drive(taxi);
		driver.drive(vehicle);
	}

}
