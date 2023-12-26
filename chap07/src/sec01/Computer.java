package sec01;

public class Computer {
	String maker;
	String price;
	String productionYear;

	void pcOn() {
		System.out.println("컴퓨터를 킵니다.");
	}

	void pcOff() {
		System.out.println("컴퓨터를 끕니다.");
	}

	void internetOn() {
		System.out.println("인터넷을 연결합니다.");
	}

	void internetOff() {
		System.out.println("인터넷을 끕니다.");
	}

	String gameOn(String game) {
		String result = game + "게임을 합니다.";
		return result;
	}

	void gameOff() {
		System.out.println("게임을 종료합니다.");
	}
}
