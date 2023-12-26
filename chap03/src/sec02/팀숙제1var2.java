package sec02;

import java.util.Scanner;

public class 팀숙제1var2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("학생수는?");
		int student = s.nextInt();
		System.out.println("한줄에 몇명씩 앉나요");
		int seat = s.nextInt();

		int a = student / seat;
		int b = student % seat;

		int result = (b == 0) ? a : a + 1;
		int result2 = (b == 0) ? b : seat - b;
		System.out.printf("총 %d 줄이고 남은 좌석수는 %d입니다.", result, result2);
	}
}