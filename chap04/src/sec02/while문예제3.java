package sec02;

import java.util.Scanner;

public class while문예제3 {

	public static void main(String[] args) {
		// int 타입의 변수 num 을 선언하고 키보드로 값을 입력받기
		// 1~변수 num 까지 합을 출력하는 프로그램을 작성.
		Scanner s= new Scanner(System.in);
		
		System.out.print("값을 입력하세요: ");
		int num=s.nextInt();
		int i = 1;
		int sum=0;
		while (i <= num) {
			sum=sum+i;
			i++; //i++순서에 조심해야한다. 
		} 
		System.out.println("1~"+num+" 합: "+sum); //만약 num이 아니라 i일경우 i++; 때문에 +1값이 증가된것으로 보이게됨.
	}

}
