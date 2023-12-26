package sec02;

import java.util.Scanner;

public class for예제7 {

	public static void main(String[] args) {
		/* 100이하의 다른 정수 2개를 입력받아 홀수인 수를 작은 수부터 큰수까지 출력하는 프로그램을 작성.
		 *temp 이용해서 구하기
		*/
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요 (100이하)");
		int num1 = s.nextInt();
		System.out.println("두번째 정수를 입력하세요 (100이하)");
		int num2 = s.nextInt();

		int temp;

		if (num1 <= 100 && num2 <= 100) {
			if (num1 > num2) {
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
		}
	}
}

