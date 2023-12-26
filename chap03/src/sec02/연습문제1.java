package sec02;

import java.util.Scanner;

public class 연습문제1 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("x의 초기값을 입력해주세요");
		int num1 = x.nextInt();
		System.out.println("y의 초기값을 입력해주세요");
		int num2 = x.nextInt();
		System.out.println("증감 기호를 입력해 주세요");
		String sign = x.next();

		if (sign.equals("+")) {
			num1++;
			System.out.println(num1);
		} else {
			num2--;
			System.out.println(num2);
		}
	}

}
