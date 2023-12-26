package sec02;

import java.util.Scanner;

public class 팀숙제연습 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("학생수는?");
		int x=s.nextInt();
		
		System.out.println("한줄에 몇명씩 앉나요?");
		int y=s.nextInt();
		
		int line=x/y;
		int remain=x%y;
		if(remain==0) {
			System.out.println("총 "+line+"줄이고 남은 좌석수는 0개 입니다.");
		}else {
			int result=line+1; int remain1=result*y-x;
			System.out.println("총 "+result+"줄이고 남은 좌석수는 "+remain1+"개 입니다.");
		}
	}

}
