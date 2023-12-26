package test;

import java.util.Scanner;

public class 확인문제2 {

	public static void main(String[] args) {
		// 두수를 입력
		// 첫번째 수가 두번째 수보다 크면 뺄셈 실행 (if구문 추가)
		// 첫번쨰 수가 두번째 수보다 작으면 덧셈 실행
		// 예) 5,3 5-3=2 뺄셈 결과 :2
		// 예) 3,5 3+5=8 덧셈 결과 :8
		
		Scanner s=new Scanner(System.in);
		System.out.println("첫 번째 수를 입력하세요");
		String num1=s.next();
		System.out.println("두 번째 수를 입력하세요");
		String num2=s.next();
		
		int a=Integer.parseInt(num1);
		int b=Integer.parseInt(num2);
		int result;
		
		
		if(a>b) {
			result=a-b;
			System.out.println("뺄셈 결과 : "+result);
		} else {
			result=a+b;
			System.out.println("덧셈 결과 : "+result);
		
			
		
		
		
		
		
	}
	}
}
