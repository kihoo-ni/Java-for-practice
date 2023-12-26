package sec02;

public class Driver {

	public void drive(Vehicle vehicle) { //매개변수가 인터페이스 객체인 메소드
		vehicle.run();
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Driver driver = new Driver(); // Driver 객체생성
		Bus bus = new Bus(); // Bus 객체 생성
		Taxi taxi =new Taxi(); // Taxi 객체 생성
		
		driver.drive(bus); 
		//bus 객체를 매개변수로 넘겨줌 
		//bus는 Vehicle 인터페이스의 구현 객체이므로 Vehicle 타입으로 자동 변환되어 들어감.
		
	}

}
