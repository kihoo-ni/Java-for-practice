package sec02;

import java.util.Scanner;

public class ������1var2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�л�����?");
		int student = s.nextInt();
		System.out.println("���ٿ� ��� �ɳ���");
		int seat = s.nextInt();

		int a = student / seat;
		int b = student % seat;

		int result = (b == 0) ? a : a + 1;
		int result2 = (b == 0) ? b : seat - b;
		System.out.printf("�� %d ���̰� ���� �¼����� %d�Դϴ�.", result, result2);
	}
}