package sec01;

import java.util.Scanner;

public class NewIndexOfExample {

	public static void main(String[] args) {
		// 주소를 입력받습니다.
		// 주소에 중흥, 두암, 운암, 용봉들어가면 북구 거주민입니다. 출력
		// 아니면 북구 거주민이 아닙니다. 출력 indexOf 사용

		Scanner s = new Scanner(System.in);
		System.out.println("주소를 입력하세요");
		String address = s.next();

		if ((address.indexOf("중흥") != -1) || (address.indexOf("두암") != -1) || (address.indexOf("운암") != -1)
				|| (address.indexOf("용봉") != -1)) {
			System.out.println("북구 거주민 입니다.");
		} else {
			System.out.println("북구 거주민이 아닙니다.");
		}
	}

}
