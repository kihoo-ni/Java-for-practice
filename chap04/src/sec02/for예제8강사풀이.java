package sec02;

import java.util.Scanner;

public class for����8����Ǯ�� {

	public static void main(String[] args) {
		/*
		 * 30������ �ٸ����� 2���� �Է� �μ� ������ �� ���� ����ϴ� ���α׷��� �ۼ�. temp ����������� ���׿����� if-else �̿��ؼ�
		 * Ǯ��.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ϼ��� (30����)");
		int num1 = s.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ��� (30����)");
		int num2 = s.nextInt();
		int large = 0;
		int small = 0;

		if (num1 > num2) {
			large = num1;
			small = num2;
		} else {
			large = num2;
			small = num1;
		}
		int sum = 0;
		for (int i = small; i <= large; i++) {
			sum = sum + i;
			if (i == large) {
				System.out.print(i + "=" + sum);
			} else {
				System.out.print(i + "+");
			}
		}
	}

}
