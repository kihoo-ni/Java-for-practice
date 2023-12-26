package sec02;

import java.util.Scanner;

public class 배열5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("배열 개수를 알려주세요");
		int arraynum = s.nextInt();

		int[] num1 = new int[arraynum];
		// 사용자가 입력한 숫자로 배열 개수 생성
		// for 문을 이용하여 배열에 숫자를 1부터 사용자가 입력한 숫자만큼 데이터 추가
		// 입력된 데이터의 평균값 출력
		for (int i = 0; i < arraynum; i++) {
			num1[i] = i + 1;
		}
		int sum = 0;
		for (int j = 0; j < arraynum; j++) {
			sum += num1[j];
		}
		double avg = (double) sum / arraynum;
		System.out.println("평균값은 : " + avg + "입니다.");
	}

}
