package sec02;

import java.util.Scanner;

public class 다차원배열2 {

	public static void main(String[] args) {
		// 반복문을 이용하여 3명의 이름을 입력받으세요. (배열로 입력받기)
		// int[][]num=new int[3][2]; 3줄 2칸 짜리 배열생성
		// 첫번째칸은 중간고사 두번째칸은 기말고사 성적
		// 사용자로부터 시험점수를 반복문을 이용하여 입력받으세요.
		// 3명의 평균점수를 각각따로 출력하세요
		Scanner s = new Scanner(System.in);
		String[] person = new String[3];
		for (int i = 0; i < person.length; i++) {
			System.out.println((i + 1) + "번째 사람 이름을 입력하세요.");
			person[i] = s.next();
		}

		int[][] num = new int[3][2];
		for (int i = 0; i < num.length; i++) {
			int sum = 0;
			for (int k = 0; k < num[i].length; k++) {
				if (k == 0) {
					System.out.println(person[i] + "의 중간점수는?");
				} else {
					System.out.println(person[i] + "의 기말점수는?");
				}
				num[i][k] = s.nextInt();
				sum += num[i][k];
			}
			double avg = (double) sum / 2;
			System.out.println(person[i] + "의 평균점수는 : " + avg + "입니다.");
			System.out.println();

		}

	}
}
