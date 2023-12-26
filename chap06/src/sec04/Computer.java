package sec04;

public class Computer {

	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i]; // 배열의 전체 숫자의 합계 구하기 (배열의 갯수가 정해지지 않음.)
		}
		return sum;
	}

	public static void main(String[] args) {
		Computer myCom = new Computer();
		int[] values1 = { 1, 2, 3 };
		int result1 = myCom.sum1(values1);
		System.out.println(result1);

		int result2 = myCom.sum1(new int[] { 1, 2, 3 }); //둘다 같음.
		System.out.println(result2);
	}
}
