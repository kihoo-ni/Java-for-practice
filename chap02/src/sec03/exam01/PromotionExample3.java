package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("출신학교를 입력하세요.");

		String a = s.next();

		char b = a.charAt(2); //charAt(숫자) : 문자열에서 해당 숫자 위치에 해당하는 문자열을 char 타입으로 변환
							 // toString(데이터) : 데이터를 String 타입으로 변환
		if(b=='중') {	
		System.out.println("당신은 중학생입니다.");
	} else {
		System.out.println("당신은 고등학생입니다.");
	}
	}
}
