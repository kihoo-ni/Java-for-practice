package sec01.보강;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean x = true;
		while (x) {
			System.out.println("게임을 시작합니다.\n");
			System.out.println("한 문장의 글을 입력하세요");
			String word1 = s.nextLine();
			if (word1.equals("그만")) {
				System.out.println("종료합니다.");
				x = false;
			} else {
				String[] wordarr = word1.split(" ");
				System.out.println("어절 갯수는 " + wordarr.length);

			}

		}
	}

}
