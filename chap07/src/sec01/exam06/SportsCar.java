package sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	/*
	 * @Override 
	 * public void stop() { System.out.println("스포츠카를 멈춤"); speed=0; }
	 * final 메소드 재정의 불가능.
	 */
	public void stop(int x) { System.out.println("스포츠카를 멈춤"); speed=0; }
	// 리턴값이나 매개변수를 변경하면 메소드 오버라이드 x 
	// 오버라이드는 내용을 건드는것 나머지 외부 파라미터,메소드는 같음.
	
	//오버로딩은 메소드이름 같아야하고 매개변수갯수타입순서가 달라야됨. 리턴타입이 달라도 오버로딩 아님.
	
	
}
