package sec02.exam04;

import java.util.Scanner;

public class 응용문제3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("한 층의 높이가 5m일때, 건물의 높이와 최대 거주 인원은?");
		System.out.println("건물의 층수는 몇층인가?");
		int a = s.nextInt();

		int multi = a*5; 
		System.out.println("건물의 전체 높이는 " + multi + "m입니다.");
		
		System.out.println("건물의 전체 높이를 입력하시오");
		int b = s.nextInt();
		System.out.println("건물최대거주인원은 몇명인가?");
		
		int div = b/3; 
		System.out.println("건물의 최대거주인원은 " + div + "명입니다.");
	}

}
