package sec02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int x = s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int y = s.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���(+,-,*,/)");
		String z = s.next();
		int temp;
		int result;
		double result2;
		if (y > x) {
			temp = x;
			x = y;
			y = temp;
		}
		// 5,2,+,7
		// 2,5,-,3
		// 5,2,*,10
		// 5,2,/,2.5

		if (z.equals("+")) {
			result = x + y;
			System.out.println("�� ���� �հ��:" + result + "�Դϴ�.");
		}
		if (z.equals("-")) {
			result = x - y;
			System.out.println("�� ���� ���̴�:" + result + "�Դϴ�.");
		}
		if (z.equals("*")) {
			result = x * y;
			System.out.println("�� ���� ����:" + result + "�Դϴ�.");
		}
		if (z.equals("/")) {
			result2 = (double)x / y;
			System.out.println("�� ���� ������:" + result2 + "�Դϴ�.");
		}

	}

}
