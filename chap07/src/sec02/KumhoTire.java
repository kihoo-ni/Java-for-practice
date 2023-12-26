package sec02;

public class KumhoTire extends Tire {

	// 부모 클래스 생성자 호출
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드 매개변수x, 리턴타입 boolean
	//무조건 오버라이드 붙혀야 인식함.
	@Override 
	public boolean roll() {
		++accumulatedRotation; // 누적회전수 1씩 증가
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}

}
