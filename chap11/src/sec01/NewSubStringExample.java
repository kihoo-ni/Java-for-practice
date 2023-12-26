package sec01;

import java.util.Scanner;

public class NewSubStringExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이메일을 입력해 주세요");
		String email = s.next();

		// 예) 1313skd@naver.com ->> 아이디만 추출하기.
		int indexmail = email.indexOf("@");
		String subemail=email.substring(0, indexmail);
		String domain=email.substring(indexmail+1);
		System.out.println(subemail);
		System.out.println(domain);

	}

}
