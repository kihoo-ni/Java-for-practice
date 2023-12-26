package sec01;

import java.util.Scanner;

public class if연습2 {

	public static void main(String[] args) {
		// int type 정답갯수변수 3개 선언 한과목이라도 6개이하면 불합격출력 총합갯수가 30개 이상이면 합격 출력
		// if-else문사용 or 사용
		Scanner s = new Scanner(System.in);
		System.out.print("국어과목 맞춘 갯수는? ");
		int x = s.nextInt();
		System.out.print("수학과목 맞춘 갯수는? ");
		int y = s.nextInt();
		System.out.print("영어과목 맞춘 갯수는? ");
		int z = s.nextInt();

		if (x <= 6 || y <= 6 || z <= 6 || (x + y + z < 30)) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("합격입니다.");
		}

		// and 버전으로 적으면 다음과 같음.
		// if (x > 6 && y > 6 && z > 6 && (x + y + z >= 30)) {
		// System.out.println("합격 입니다.");
		// } else {
		// System.out.println("불합격 입니다.");
		// }

	}

}
