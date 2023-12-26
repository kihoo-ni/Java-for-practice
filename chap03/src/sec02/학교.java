package sec02;

import java.util.Scanner;

public class 학교 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("학생수는?");
		int student=s.nextInt();
		System.out.println("연필개수는?");
		int pencil=s.nextInt();
		
		int studentp=pencil/student;
		int remain=pencil%student;
		
		System.out.printf("학생 한 명당 %d개씩 연필을 가져가고 %d개가 남아요.\n", studentp, remain);
		System.out.println("학생 한 명당 "+studentp+"개씩 연필을 가져가고 "+remain+"개가 남아요.");
		
		
		
	}

}
