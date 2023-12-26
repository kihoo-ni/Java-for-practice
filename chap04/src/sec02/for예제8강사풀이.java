package sec02;

import java.util.Scanner;

public class for예제8강사풀이 {

	public static void main(String[] args) {
		/*
		 * 30이하의 다른정수 2개를 입력 두수 사이의 총 합을 출력하는 프로그램을 작성. temp 사용하지말고 삼항연산자 if-else 이용해서
		 * 풀기.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요 (30이하)");
		int num1 = s.nextInt();
		System.out.println("두번째 정수를 입력하세요 (30이하)");
		int num2 = s.nextInt();
		int large = 0;
		int small = 0;

		if (num1 > num2) {
			large = num1;
			small = num2;
		} else {
			large = num2;
			small = num1;
		}
		int sum = 0;
		for (int i = small; i <= large; i++) {
			sum = sum + i;
			if (i == large) {
				System.out.print(i + "=" + sum);
			} else {
				System.out.print(i + "+");
			}
		}
	}

}
