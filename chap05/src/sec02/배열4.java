package sec02;

import java.util.Scanner;

public class 배열4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요");
		int a = s.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요");
		int b = s.nextInt();

		int[] c = new int[2]; // 두개 공간을 가진 int 배열 생성
		c[0] = a;
		c[1] = b;
		int sum = c[0] + c[1];
		System.out.println("합계는 " + sum);
	}

}


