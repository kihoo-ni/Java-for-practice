package sec02;

import java.util.Scanner;

public class ��������1 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("x�� �ʱⰪ�� �Է����ּ���");
		int num1 = x.nextInt();
		System.out.println("y�� �ʱⰪ�� �Է����ּ���");
		int num2 = x.nextInt();
		System.out.println("���� ��ȣ�� �Է��� �ּ���");
		String sign = x.next();

		if (sign.equals("+")) {
			num1++;
			System.out.println(num1);
		} else {
			num2--;
			System.out.println(num2);
		}
	}

}
