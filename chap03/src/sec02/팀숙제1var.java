package sec02;

import java.util.Scanner;

public class ������1var {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�л�����?");
		int student = s.nextInt();
		System.out.println("���ٿ� ��� �ɳ���");
		int seat = s.nextInt();

		double line1 = (double) student / (double) seat;
		int line2 = student / seat;
		if (line1 - line2 > 0) {
			line1++;
		}
		int resultline = (int) line1;
		int remainseat = resultline * seat - student;
		System.out.printf("�� %d ���̰� ���� �¼����� %d�Դϴ�.", resultline, remainseat);
	}
}