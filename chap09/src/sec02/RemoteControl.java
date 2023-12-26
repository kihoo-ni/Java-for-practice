package sec02;

public interface RemoteControl {
	String COMPANY = "삼성"; // 인터페이스 필드는 상수이기 때문에 무조건 값을 넣어야함.
	int COST = 5000;

	// 둘다 추상메소드
	public void turnOn();

	public void turnOff();

}
