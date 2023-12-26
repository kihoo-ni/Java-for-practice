package sec01;

import java.util.Scanner;

public class if연습7 {

	public static void main(String[] args) {
		// 중간고사와 기말고사의 평균점수가 90점 이상이면 A학점 출력
		// 중간고사와 기말고사의 평균점수가 80점 이상이면 B학점 출력
		// 나머지는 C학점 이되 어느 한과목이라도 60점미만이면 재수강 출력

		Scanner s = new Scanner(System.in);
		System.out.println("중간고사 성적은?");
		int mid = s.nextInt();
		System.out.println("기말고사 성적은?");
		int last = s.nextInt();
		//우선순위 파악이 굉장히 중요함.
		int result = (mid + last) / 2;
		if (mid < 60 || last < 60) {
			System.out.println("어느 한과목의 점수가 60점 미만입니다.");
			System.out.println("재수강입니다.");
		} else if (result >= 90) {
			System.out.println("평균점수가 90~100입니다.");
			System.out.println("등급은 A입니다.");
		} else if (result >= 80) {
			System.out.println("평균점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else {
			System.out.println("평균점수가 80점 미만입니다.");
			System.out.println("등급은 C입니다.");
		}

	}

}
