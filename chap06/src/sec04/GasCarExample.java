package sec04;

public class GasCarExample {

	public static void main(String[] args) {
		GasCar myCar = new GasCar();

		myCar.setGas(20);

		boolean gasState = myCar.isLeftGas();
		if (gasState) { // 무조건 만족하기때문에 출발합니다 출력.
			System.out.println("출발합니다.");
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else {
			System.out.println("가스를 주입하세요.");
		}
	}

}
