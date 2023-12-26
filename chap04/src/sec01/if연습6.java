package sec01;

import java.util.Scanner;

public class if연습6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자는?");
		int num1 = s.nextInt();
		System.out.println("두번째 숫자는?");
		int num2 = s.nextInt();
		// 첫번째 숫자가 두번째 숫자보다 크면 첫번째 숫자가 큽니다 출력
		// 첫번째 숫자가 두번째 숫자보다 작으면 두번째 숫자가 큽니다 출력
		// 첫번째 숫자가 두번째 숫자와 같으면 두 숫자가 같습니다 출력
		if (num1 > num2) {
			System.out.println("첫번째 숫자가 큽니다.");
		}
		if (num1 < num2) {
			System.out.println("두번째 숫자가 큽니다.");
		}
		if (num1 == num2) {
			System.out.println("두 숫자가 같습니다.");
		}
	}

}
