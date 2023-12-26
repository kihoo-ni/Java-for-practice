package sec02;

public class Tire {

	public int maxRotation; // 최대회전수(타이어수명)
	public int accumulatedRotation; // 누적회전수
	public String location; // 타이어의 위치

	// 매개변수 2개 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드 매개변수x, 리턴타입 boolean

	public boolean roll() {
		++accumulatedRotation; // 누적회전수 1씩 증가
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
