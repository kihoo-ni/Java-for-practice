package test;

import java.util.Scanner;

public class Ȯ�ι���3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է��ϼ���");
		String num1 = s.next();
		System.out.println("�� ��° ���� �Է��ϼ���");
		String num2 = s.next();

		// ù��° ���� �ι�° ���� ������ �μ��� ���ƿ�.
		// ù��° ���� �ι��� ���� �ٸ��� �μ��� �޶��. (IF���� equals ���)

		if (num1.equals(num2)) {
			System.out.println("�μ��� ���ƿ�");
		} else {
			System.out.println("�μ��� �޶��");
		}
	}
}
