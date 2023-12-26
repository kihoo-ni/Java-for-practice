package sec03.exam01;

import java.util.Scanner;

public class PromotionExample2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("한 글자를 입력하세요.");

		String a = s.next();
		char b = a.charAt(0); //charAt(숫자) : 문자열에서 해당 숫자 위치에 해당하는 문자열을 char 타입으로 변환
							 // toString(데이터) : 데이터를 String 타입으로 변환
		int c = b;

		System.out.println("입력하신" + a + "의 유니코드는 " + c + "입니다.");

		
	}

}
