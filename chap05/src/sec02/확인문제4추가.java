package sec02;

import java.util.Scanner;

public class 확인문제4추가 {

	public static void main(String[] args) {
		// 사용자로부터 배열갯수를 입력받으세요
		// 배열갯수 만큼 숫자를 입력받아서 배열에 삽입하세요. 해당배열에서 가장작은 숫자를 출력하세요 (숫자는 양수만 가능함)

		Scanner s = new Scanner(System.in);
		System.out.println("배열 갯수를 입력하세요.");
		int x = s.nextInt();
		int[] y = new int[x];

		for (int i = 0; i < y.length; i++) {
			System.out.println((i + 1) + "번째 배열 숫자를 입력하세요");
			y[i] = s.nextInt();
		}
		int min = y[0];
		for (int k = 0; k < y.length; k++) {
			if (min > y[k]) {
				min = y[k];
			}
		}
		System.out.println("최솟값은 : " + min);

	}

}
