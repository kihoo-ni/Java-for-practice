package sec01;

import java.util.Scanner;

public class switch����5 {

	public static void main(String[] args) {
		/*
		 * �����ڵ� ����) A����1234, B����4567, C����9874 A : �λ�� B : ��ȹ�� C : �ѹ��� ���ʽ��ݾ� ����:100����,
		 * ����:70����, ����:50���� ��) A����1234 �ǰ�� ��� ���� : �λ�� ����� ���ʽ��ݾ��� 1000000�� �Դϴ�. switch
		 * 2����� 1���� ����빮�� ����, 2���� ���ڿ� Ư�� �κ� ����(substring(1,3))
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("���� �ڵ带 �Է��� �ּ���.");
		String code = s.next();
		char code1 = code.charAt(0);
		String code2 = code.substring(1, 3);
		switch (code1) {
		case 'A':
			System.out.print("�λ�� ");
			break;
		case 'B':
			System.out.print("��ȹ�� ");
			break;
		default:
			System.out.print("�ѹ��� ");
		}
		switch (code2) {
		case "����":
			System.out.print("����� ���ʽ� �ݾ��� 1000000�� �Դϴ�.");
			break;
		case "����":
			System.out.print("����� ���ʽ� �ݾ��� 700000�� �Դϴ�.");
			break;
		default:
			System.out.print("����� ���ʽ� �ݾ��� 500000�� �Դϴ�.");
		}
	}

}
