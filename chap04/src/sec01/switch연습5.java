package sec01;

import java.util.Scanner;

public class switch연습5 {

	public static void main(String[] args) {
		/*
		 * 직원코드 예시) A부장1234, B과장4567, C차장9874 A : 인사부 B : 기획부 C : 총무부 보너스금액 부장:100만원,
		 * 과장:70만원, 차장:50만원 예) A부장1234 의경우 출력 예시 : 인사부 부장님 보너스금액은 1000000원 입니다. switch
		 * 2번사용 1차로 영어대문자 추출, 2차로 문자열 특정 부분 추출(substring(1,3))
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("직원 코드를 입력해 주세요.");
		String code = s.next();
		char code1 = code.charAt(0);
		String code2 = code.substring(1, 3);
		switch (code1) {
		case 'A':
			System.out.print("인사부 ");
			break;
		case 'B':
			System.out.print("기획부 ");
			break;
		default:
			System.out.print("총무부 ");
		}
		switch (code2) {
		case "부장":
			System.out.print("부장님 보너스 금액은 1000000원 입니다.");
			break;
		case "과장":
			System.out.print("과장님 보너스 금액은 700000원 입니다.");
			break;
		default:
			System.out.print("차장님 보너스 금액은 500000원 입니다.");
		}
	}

}
