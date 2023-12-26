package sec02;

import java.util.Scanner;

public class 팀숙제1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("학생수는?");
		int student = s.nextInt();
		System.out.println("한줄에 몇명씩 앉나요");
		int p = s.nextInt();

		if (student % p == 0) {
			int x = student / p;
			int y = student % p;
			System.out.printf("총 %d줄이고 남은 좌석수는 %d개 입니다.", x, y);
		} else {
			int x = (student / p) + 1;
			int y = x * p % student;
			System.out.printf("총 %d줄이고 남은 좌석수는 %d개 입니다.", x, y);
		}
		// 학생수 32명 한줄에 6명 5줄 2명남음 6줄
		// 학생수 60명 한줄에 6명 10줄
		// 학생수 5명 한줄에 6명 1줄
		// 학생수 7명 한줄에 6명 2줄 남은좌석 4개 

	}
}