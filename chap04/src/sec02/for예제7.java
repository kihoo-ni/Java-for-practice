package sec02;

import java.util.Scanner;

public class for����7 {

	public static void main(String[] args) {
		/* 100������ �ٸ� ���� 2���� �Է¹޾� Ȧ���� ���� ���� ������ ū������ ����ϴ� ���α׷��� �ۼ�.
		 *temp �̿��ؼ� ���ϱ�
		*/
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ������ �Է��ϼ��� (100����)");
		int num1 = s.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ��� (100����)");
		int num2 = s.nextInt();

		int temp;

		if (num1 <= 100 && num2 <= 100) {
			if (num1 > num2) {
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
		}
	}
}

