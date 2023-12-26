package sec01;

import java.util.Scanner;

public class IfDiceExample2 {

	public static void main(String[] args) {
		// 1. 컴퓨터가 무작위 산출 (1~6)
		// 2. 사용자가 선택(1~6)
		// 두수가 일치할경우 두수가 일치합니다 출력
		// 컴퓨터 숫자가 더크면 컴퓨터 숫자가 더큽니다 출력
		// 사용자 숫자가 더크면 사용자 숫자가 더큽니다 출력
		int num = (int) (Math.random() * 6) + 1;
		System.out.println("컴퓨터 무작위 산출값은? " + num);
		Scanner s = new Scanner(System.in);
		System.out.println("사용자는 1~6번 중 한개의 번호를 입력해주세요");
		int num2 = s.nextInt();
		if (num == num2) {
			System.out.println("두 숫자가 일치합니다.");
		} else if (num > num2) {
			System.out.println("컴퓨터 숫자가 더큽니다.");
		} else {
			System.out.println("사용자 숫자가 더큽니다.");
		}
	}
}
