package sec02;

import java.util.Scanner;

public class while문예제4 {

	public static void main(String[] args) {
//		랜덤으로 숫자 추출(1~20)해서 맞추기 무한반복
		Scanner s = new Scanner(System.in);

		int comNum = (int) (Math.random() * 20) + 1;

		while (true) {
			System.out.println("숫자 하나를 입력하세요(1~20)");
			int userNum = s.nextInt();
			if (userNum == comNum) {
				System.out.println("정답입니다.");
				break;
			} else if (userNum > comNum) {
				System.out.println("컴퓨터 숫자보다 값이 큽니다.");
			} else {
				System.out.println("컴퓨터 숫자보다 값이 작습니다.");
			}
		}
	}
}
