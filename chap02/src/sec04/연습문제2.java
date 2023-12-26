package sec04;

import java.util.Scanner;

public class 연습문제2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String password;

		while (true) {
			System.out.println("도어락 비밀번호를 입력하세요");
			password = s.nextLine();

			if (password.equals("1234")) {
				System.out.println("환영합니다.");
				break;

			}

			System.out.println("비밀번호가 틀립니다.");

		}

	}
}
