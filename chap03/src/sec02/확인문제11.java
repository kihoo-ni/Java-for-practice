package sec02;

import java.util.Scanner;

public class 확인문제11 {

	public static void main(String[] args) {

		// 관리자 접속코드를 입력하세요. 예)홍길동1234 < 문자3글자=id 숫자4글자=password(숫자로입력)
		// 문자열을 분리

		Scanner s = new Scanner(System.in);
		System.out.println("관리자 접속코드를 입력하세요");
		String code = s.next();
		String id = code.substring(0, 3);
		int password = Integer.parseInt(code.substring(3, 7)); //(3)으로 해도됨.
		System.out.println("아이디: ");
		String name = s.next();
		System.out.println("패스워드: ");
		String pass = s.next();
		int password1 = Integer.parseInt(pass);

		if (name.equals("id")) {
			if (password == password1) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}

		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}

	}

}
