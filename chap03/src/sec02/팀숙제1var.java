package sec02;

import java.util.Scanner;

public class 팀숙제1var {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("학생수는?");
		int student = s.nextInt();
		System.out.println("한줄에 몇명씩 앉나요");
		int seat = s.nextInt();

		double line1 = (double) student / (double) seat;
		int line2 = student / seat;
		if (line1 - line2 > 0) {
			line1++;
		}
		int resultline = (int) line1;
		int remainseat = resultline * seat - student;
		System.out.printf("총 %d 줄이고 남은 좌석수는 %d입니다.", resultline, remainseat);
	}
}