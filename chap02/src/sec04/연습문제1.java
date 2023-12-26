package sec04;

import java.util.Scanner;

public class 연습문제1 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = s.next();
		System.out.println("나이를 입력하세요.");
		int age=s.nextInt();
		
		System.out.println("순번\t이름\t나이");
		System.out.printf("%-3d\t%s\t%3d\n",1, name, age);
		System.out.printf("%-3d, %s, %3d\n",1, name, age);
		System.out.printf("%-3d,%s,%3d\n",1, name, age);
		
		

		System.out.printf("순번: %-3d, 이름: %s, 나이: %3d\n",1,"이기훈",29);
		System.out.printf("순번: %-3d,이름: %s,나이: %3d\n",1,"이기훈",29);
		System.out.printf("순번: %-3d,이름: %s,나이: %3d\n",1, "이기훈", 29);
		
		
		
		
	}


}
