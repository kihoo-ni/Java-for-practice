package sec01;

public class Computer {
	String maker;
	String price;
	String productionYear;

	void pcOn() {
		System.out.println("��ǻ�͸� ŵ�ϴ�.");
	}

	void pcOff() {
		System.out.println("��ǻ�͸� ���ϴ�.");
	}

	void internetOn() {
		System.out.println("���ͳ��� �����մϴ�.");
	}

	void internetOff() {
		System.out.println("���ͳ��� ���ϴ�.");
	}

	String gameOn(String game) {
		String result = game + "������ �մϴ�.";
		return result;
	}

	void gameOff() {
		System.out.println("������ �����մϴ�.");
	}
}
