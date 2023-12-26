package sec02;

import java.util.Scanner;

public class 로그인문제 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean x = true;

		while (true) {
			System.out.println("아이디를 입력하세요");
			String id = s.next();
			System.out.println("비밀번호를 입력하세요");
			int password = s.nextInt();
			/*
			 * if (id.equals("abc")) { if (password != 1234) {
			 * System.out.println("비밀번호가 달라요"); System.out.println();
			 * 
			 * } else { System.out.println("환영합니다"); x = false; } } else {
			 * System.out.println("아이디가 존재하지 않습니다"); System.out.println(); }
			 */

			if (id.equals("abc") && (password == 1234)) {
				System.out.println("환영합니다");
				break; // switch는 자체브레이크, if문은 while에 브레이크 검.
			} else if (id.equals("abc") && (password != 1234)) {
				System.out.println("비밀번호가 달라요");
			} else {
				System.out.println("아이디가 존재하지 않습니다");

			}

		}

	}
}
