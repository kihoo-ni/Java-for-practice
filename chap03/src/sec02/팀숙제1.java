package sec02;

import java.util.Scanner;

public class ������1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�л�����?");
		int student = s.nextInt();
		System.out.println("���ٿ� ��� �ɳ���");
		int p = s.nextInt();

		if (student % p == 0) {
			int x = student / p;
			int y = student % p;
			System.out.printf("�� %d���̰� ���� �¼����� %d�� �Դϴ�.", x, y);
		} else {
			int x = (student / p) + 1;
			int y = x * p % student;
			System.out.printf("�� %d���̰� ���� �¼����� %d�� �Դϴ�.", x, y);
		}
		// �л��� 32�� ���ٿ� 6�� 5�� 2���� 6��
		// �л��� 60�� ���ٿ� 6�� 10��
		// �л��� 5�� ���ٿ� 6�� 1��
		// �л��� 7�� ���ٿ� 6�� 2�� �����¼� 4�� 

	}
}