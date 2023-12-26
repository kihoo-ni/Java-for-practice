package sec02;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int x = s.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int y = s.nextInt();
		System.out.println("연산자를 입력하세요(+,-,*,/)");
		String z = s.next();
		int temp;
		int result;
		double result2;
		if (y > x) {
			temp = x;
			x = y;
			y = temp;
		}
		// 5,2,+,7
		// 2,5,-,3
		// 5,2,*,10
		// 5,2,/,2.5

		if (z.equals("+")) {
			result = x + y;
			System.out.println("두 수의 합계는:" + result + "입니다.");
		}
		if (z.equals("-")) {
			result = x - y;
			System.out.println("두 수의 차이는:" + result + "입니다.");
		}
		if (z.equals("*")) {
			result = x * y;
			System.out.println("두 수의 곱은:" + result + "입니다.");
		}
		if (z.equals("/")) {
			result2 = (double)x / y;
			System.out.println("두 수의 나눗셈:" + result2 + "입니다.");
		}

	}

}
