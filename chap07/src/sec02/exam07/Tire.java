package sec02.exam07;

public class Tire {

	String company;
	String color;
	String productionYear;

	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}

	public void tireExchange() {
		System.out.println("타이어를 교체합니다.");
	}

	public void productionYear(String productionYear) {
		System.out.println("타이어 생산연도는 " + productionYear + "입니다.");
	}
}
