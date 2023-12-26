package sec02;

import java.util.Scanner;

public class switch연습문제 {

	public static void main(String[] args) {
		/*
		 * 학습코드를 입력하세요 학습코드 예시는 20M456 두개 숫자는 신청년도 세번째 문자는 과목 
		 * 출력 예시 22K123 => 2022년도 국어과목 신청자입니다. 연도는 substring 과목은 charAt
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("학습코드를 입력하세요.");
		String code = s.next();
		char code1 = code.charAt(2);
		String code2 = code.substring(0, 2);
		switch (code1) {
		case 'M':
			System.out.println(code2 + "년도 " + "수학과목 신청자입니다.");
			break;
		case 'K':
			System.out.println(code2 + "년도 " + "국어과목 신청자입니다.");
			break;
		default:
			System.out.println(code2 + "년도 " + "영어과목 신청자입니다.");
		}
		
	}

}
