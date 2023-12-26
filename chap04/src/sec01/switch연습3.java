package sec01;

import java.util.Scanner;

public class switch연습3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("수험번호를 입력하세요.");
		System.out.println("수험번호는 생일6자리와 영어 대문자의 조합입니다.");
		String number = s.next();
		char number1 = number.charAt(6);
		switch (number1) {
		case 'A': //캐릭터로 형변환 했기 때문에 작은 따옴표로 case 지정해준다. 만약 스트링일 경우 문자열로 형변환하여 큰따옴표로 case 지정함.
			System.out.println("시험장소가 201호입니다.");
			break;
		case 'B':
			System.out.println("시험장소가 202호입니다.");
			break;
		default:
			System.out.println("시험장소가 203호입니다.");
			break;
		}

	}

}
