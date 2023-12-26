package sec03.exam07;

import java.util.Scanner;

public class 연습문제1 {

	public static void main(String[] args) {
		// % 나머지
		Scanner s = new Scanner(System.in);
		System.out.println("얼마를 받았습니까?");
		int a = s.nextInt();

		System.out.println("오만원권 : " + a / 50000 + "개");
		a = a % 50000;
		System.out.println("만원권 : " + a / 10000 + "개");
		a = a % 10000;
		System.out.println("천원권 : " + a / 1000 + "개");
		a = a % 1000;
		System.out.println("백원동전 : " + a / 100 + "개");
		a = a % 100;
		System.out.println("오십원동전 : " + a / 50 + "개");
		a = a % 50;
		System.out.println("십원동전 : " + a / 10 + "개");
		a = a % 10;
		
		
		
	}

}
