package sec01.보강;

import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("문자열을 입력하세요. 빈칸, 영어, 한글 모두 가능");
		String literal = s.nextLine();
		for (int i = 1; i <= literal.length(); i++) {
			System.out.print(literal.substring(i));
			System.out.println(literal.substring(0, i));
		}

	}
}
