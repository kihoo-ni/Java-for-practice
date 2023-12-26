package sec02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver(); // Driver 클래스 객체 생성
		Bus bus = new Bus(); // Bus 클래스 객체 생성
		Taxi taxi = new Taxi(); // Taxi 클래스 객체 생성
		Vehicle vehicle = new Vehicle(); // Vehicle 클래스 객체 생성

		driver.drive(bus); //  매개변수 안넣으면 실행안됨.
		driver.drive(taxi);
		driver.drive(vehicle);
	}

}
