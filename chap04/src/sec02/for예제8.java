package sec02;

import java.util.Scanner;

public class for����8 {

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
		int sum = 0;
		if (num1 <= 30 && num2 <= 30) {
			if (num1 > num2) {
				for (int i = num2; i <= num1; i++) {
					sum += i;
					if (i == num1) {
						System.out.print(i + "=" + sum);
					} else {
						System.out.print(i + "+");
					}
				}

			} else {
				for(int i=num1; i<=num2; i++) {
					sum+=i;
					if(i==num2) {
						System.out.print(i+"="+sum);
					} else {
						System.out.print(i+"+");
					}
				}
			}

		}

	}

}
