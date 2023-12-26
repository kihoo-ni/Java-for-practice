package test;

import java.util.Scanner;

public class 확인문제1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name=s.next();
		System.out.println("당신의 나이는?");
		int age=s.nextInt();
		System.out.println("당신의 휴대폰 번호 가운데 4자리는?");
		String middlenumber=s.next();
		System.out.println("당신의 휴대폰 번호 끝 4자리는?");
		String lastnumber=s.next();
		
		System.out.println("이름: "+name);
		
		System.out.print("나이: "+age+"\n");
		
		System.out.printf("전화: 010-%s-%s", middlenumber, lastnumber);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
