package sec02;

import java.util.Scanner;

public class for예제8 {

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
		int sum = 0;
		if (num1 <= 30 && num2 <= 30) {
			if (num1 > num2) {
				for (int i = num2; i <= num1; i++) {
					sum += i;
					if (i == num1) {
						System.out.print(i + "=" + sum);
					} else {
						System.out.print(i + "+");
					}
				}

			} else {
				for(int i=num1; i<=num2; i++) {
					sum+=i;
					if(i==num2) {
						System.out.print(i+"="+sum);
					} else {
						System.out.print(i+"+");
					}
				}
			}

		}

	}

}
