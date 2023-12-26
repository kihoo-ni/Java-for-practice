package sec04;

public class SuperCar {

	int speed; // 필드값

	int getSpeed() { // 스피드 메소드
		return speed;
	}

	void keyTurnOn() { // 시동키는 메소드. 리턴값 없음.
		System.out.println("키를 돌립니다.");
	}

	void run() { // 0~50까지 10씩증가, 6번 반복하여 현재속도 출력하는 메소드, 리턴값 없음.
		for (int i = 0; i <= 50; i += 10) {
			speed = i;
			System.out.println("달립니다.(시속:" + speed + "km/h)");
		}
	}
	
}
