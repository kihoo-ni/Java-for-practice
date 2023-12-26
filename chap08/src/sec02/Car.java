package sec02;

public class Car {
	Tire frontLeftTire=new HankookTire();
	Tire frontRightTire=new HankookTire();
	Tire backLeftTire=new HankookTire();
	Tire backRightTire=new HankookTire();
	//Tire 인터페이스로 자동변환 시킴. 오버라이드 된 roll 메소드는 가지고 넘어감.
	//인터페이스 타입의 필드
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
		
	}
	
	public static void main(String[] args) {
		Car myCar =new Car();
		myCar.run();
		
		myCar.frontLeftTire=new	KumhoTire(); //myCar 변수의 필드인 frontLeftTire를 금호타이어로 바꿈 
		myCar.run();
	}
}
