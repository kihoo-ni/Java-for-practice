package sec02;

import java.util.Scanner;

public class 확인문제7유사문제 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean x = true;
		int sum = 0;
		int sum1 = 0;
		while (x) {
			System.out.println("광주시립도서관 방문을 환영합니다.");
			System.out.println("작업코드와 개수를 입력해주세요.");
			System.out.println("(A는 대출, B는 반납, C는 종료입니다.)");
			String code = s.next();
			String code1 = code.substring(0, 1);
			String code2 = code.substring(1);
			int book1 = Integer.parseInt(code2);

			switch (code1) {
			case "A":
				System.out.println("책 " + code2 + "권 대출");
				System.out.println();

				sum = sum += book1;
				break;
			case "B":
				System.out.println("책 " + code2 + "권 반납");
				System.out.println();
				sum1 = sum1 += book1;
				break;
			default:
				System.out.println("책 " + code2 + "권 종료");
				System.out.println();
				x = false;
			}

			System.out.println("총 대출권수: " + sum + "총 반납권수: " + sum1);
			System.out.println();
		}
	}

}
