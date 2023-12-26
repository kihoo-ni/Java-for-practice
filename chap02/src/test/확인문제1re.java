package test;

import java.util.Scanner;

public class 확인문제1re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("당신의 이름은?");
		String name = s.next();
		System.out.println("중간고사 점수는?"); // 예)83.67 소숫점 두자리까지 입력
		double mid = s.nextDouble();
		System.out.println("기말고사 점수는?");
		double last = s.nextDouble();
		System.out.println("리포트 점수는?");
		double report = s.nextDouble();
		// printf 사용해서 한번에 출력, 홍길동님의 평균 점수는 : 73.25입니다. %5.2f로 설정
		double averagescore = (mid + last + report) / 3;

		System.out.printf("%s님의 평균 점수는 : %5.2f 입니다.", name, averagescore);
		
		
		
	}
}
