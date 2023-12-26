package test;

import java.util.Scanner;

public class 확인문제3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하세요");
		String num1 = s.next();
		System.out.println("두 번째 수를 입력하세요");
		String num2 = s.next();

		// 첫번째 수와 두번째 수가 같으면 두수가 같아요.
		// 첫번째 수와 두번쨰 수가 다르면 두수가 달라요. (IF구문 equals 사용)

		if (num1.equals(num2)) {
			System.out.println("두수가 같아요");
		} else {
			System.out.println("두수가 달라요");
		}
	}
}
