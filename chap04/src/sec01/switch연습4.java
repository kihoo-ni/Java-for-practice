package sec01;

import java.util.Scanner;

public class switch연습4 {

	public static void main(String[] args) {
							/* 사용자 코드는 A115 (대문자와 숫자의 조합), a115(소문자와 숫자의 조합)처럼 입력한다.
							 사용자 코드에서 맨 앞 영어 한글자를 뽑기.
							 영어가 a라면 "인사부에 배정되셨습니다."
							 영어가 b라면 "기획부에 배정되셨습니다."
							 영어가 c라면 "총무부에 배정되셨습니다."*/
		Scanner s = new Scanner(System.in);
		System.out.println("사용자 코드를 입력해 주세요.");
		String code = s.next();
		char code1=code.charAt(0);

		switch(code1) {
		case 'A':
		case 'a':
			System.out.println("인사부에 배정되셨습니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("기획부에 배정되셨습니다.");
			break;
		default :
			System.out.println("총무부에 배정되셨습니다.");
			break;
		}

	}

}
