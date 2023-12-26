package sec02;

import java.util.Scanner;

public class 시험성적 {

	public static void main(String[] args) {
		// 비밀번호는 영어 소문자와 숫자의 조합 a5, b7
		// 사용자가 비밀번호를 제대로 입력했으면 환영합니다. 출력
		// 사용자가 비밀번호를 틀리면 비밀번호는 영어 소문자와 숫자의 조합입니다. 출력
		// 중간고사가 80점 이상이거나 기말고사가 80점 이상이면 "통과"아니면 "탈락"

		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name = s.next();
		System.out.println("접속 비밀번호를 입력해 주세요.");
		String pass = s.next();

		// char x=pass.charAt(0)
		// char y=pass.charAt(1) 로 먼저 선언하면 더빨리 풀 수 있음.
		// if ( (x>=97)&&(x<=122) &&(y>=48)&&(y<=57)

		if (((pass.charAt(0) >= 97) && (pass.charAt(0) <= 122)) && ((pass.charAt(1) >= 48) && (pass.charAt(1) <= 57))) {
			System.out.println(name + "님 환영합니다.");
		} else {
			System.out.println("비밀번호는 영어 소문자와 숫자의 조합입니다.");
		}
	
		System.out.println("중간고사 성적을 입력하세요.");
		int mid=s.nextInt();
		System.out.println("기말고사 성적을 입력하세요.");
		int last=s.nextInt();
		
		if(mid>=80 || last>=80 ) {
			System.out.println("통과");
		}else {
			System.out.println("탈락");
		}
		
	}
}
