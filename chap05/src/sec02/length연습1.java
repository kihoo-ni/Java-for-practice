package sec02;

import java.util.Scanner;

public class length연습1 {

	public static void main(String[] args) {
//		배열의 갯수는? (scanner를 통해 입력받음)
//		입력받은 갯수의 배열을 선언하세요. 반복문으로 선언한 배열에 숫자를 넣어주세요.
//		해당 숫자들의 합계와 평균을 출력하세요.
		Scanner s = new Scanner(System.in);
		System.out.println("배열의 갯수는?");
		int num = s.nextInt();
		int[] scores = new int[num]; // 입력받은 숫자로 배열갯수 생성

		for (int i = 0; i < scores.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요.");
			int num1 = s.nextInt();
			scores[i] = num1;
		}
		int sum = 0;
		for (int j = 0; j < scores.length; j++) {
			sum += scores[j];
		}
		System.out.println("총합 : " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
		
	}

}
