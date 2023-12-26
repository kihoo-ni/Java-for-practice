package sec04;


public class 계산기예제1 {

	public static void main(String[] args) {
		계산기 myCalc = new 계산기();
		myCalc.powerOn();

		int result1 = myCalc.plus(5, 3);
		System.out.println(result1);

		int result2 = myCalc.minus(5, 3);
		System.out.println(result2);

		String result3 = myCalc.multi(3, 5);
		System.out.println(result3);

		double result4 = myCalc.divide(5, 3);
		System.out.println(result4);

		byte x = 10;
		byte y = 4;

		double result5 = myCalc.divide(x, y); // byte여도 int로 형변환됨. 따라서 문제없음.
		System.out.println(result5);
	}

}
