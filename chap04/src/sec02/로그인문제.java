package sec02;

import java.util.Scanner;

public class �α��ι��� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean x = true;

		while (true) {
			System.out.println("���̵� �Է��ϼ���");
			String id = s.next();
			System.out.println("��й�ȣ�� �Է��ϼ���");
			int password = s.nextInt();
			/*
			 * if (id.equals("abc")) { if (password != 1234) {
			 * System.out.println("��й�ȣ�� �޶��"); System.out.println();
			 * 
			 * } else { System.out.println("ȯ���մϴ�"); x = false; } } else {
			 * System.out.println("���̵� �������� �ʽ��ϴ�"); System.out.println(); }
			 */

			if (id.equals("abc") && (password == 1234)) {
				System.out.println("ȯ���մϴ�");
				break; // switch�� ��ü�극��ũ, if���� while�� �극��ũ ��.
			} else if (id.equals("abc") && (password != 1234)) {
				System.out.println("��й�ȣ�� �޶��");
			} else {
				System.out.println("���̵� �������� �ʽ��ϴ�");

			}

		}

	}
}
