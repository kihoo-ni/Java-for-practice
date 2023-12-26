package sec03.exam02;

import java.util.Scanner;

public class 실수타입변환예제2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요");

		int a = s.nextInt();

		System.out.println("두번째 숫자를 입력하세요");

		int b = s.nextInt();
		System.out.println("연산기호를 입력하세요");
		

		// int c = a / b;

		double c = (double) a /  b; 

		System.out.println("입력하신 두 수의 나누기 결과는  " + c + "입니다.");

	}

}
