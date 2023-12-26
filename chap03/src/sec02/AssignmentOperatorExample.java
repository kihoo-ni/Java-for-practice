package sec02;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// 예) 숫자 5, 연산자 -, num -=5;
		// 복합연산자를 이용하여 100에서 5를 뺀 num1의 결과를출력.
		// 연산자 -+*/% 5가지 이용

		Scanner s = new Scanner(System.in);
		int num1 = 100;
		System.out.println("숫자를 입력하세요.");
		int a = s.nextInt();
		System.out.println("연산자를 입력하세요.");
		String b = s.next();

		if (b.equals("+")) {
			num1 += a;
		}
		if (b.equals("-")) {
			num1 -= a;
		}
		if (b.equals("*")) {
			num1 *= a;
		}
		if (b.equals("/")) {
			num1 /= a;
		}
		if (b.equals("%")) {
			num1 %= a;
		}
		System.out.println("결과 값은 : " + num1);
	}

}
