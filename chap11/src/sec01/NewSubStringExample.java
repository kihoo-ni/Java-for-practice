package sec01;

import java.util.Scanner;

public class NewSubStringExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����� �̸����� �Է��� �ּ���");
		String email = s.next();

		// ��) 1313skd@naver.com ->> ���̵� �����ϱ�.
		int indexmail = email.indexOf("@");
		String subemail=email.substring(0, indexmail);
		String domain=email.substring(indexmail+1);
		System.out.println(subemail);
		System.out.println(domain);

	}

}
