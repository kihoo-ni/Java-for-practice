package sec02;

import java.util.Scanner;

public class switch�������� {

	public static void main(String[] args) {
		/*
		 * �н��ڵ带 �Է��ϼ��� �н��ڵ� ���ô� 20M456 �ΰ� ���ڴ� ��û�⵵ ����° ���ڴ� ���� 
		 * ��� ���� 22K123 => 2022�⵵ ������� ��û���Դϴ�. ������ substring ������ charAt
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("�н��ڵ带 �Է��ϼ���.");
		String code = s.next();
		char code1 = code.charAt(2);
		String code2 = code.substring(0, 2);
		switch (code1) {
		case 'M':
			System.out.println(code2 + "�⵵ " + "���а��� ��û���Դϴ�.");
			break;
		case 'K':
			System.out.println(code2 + "�⵵ " + "������� ��û���Դϴ�.");
			break;
		default:
			System.out.println(code2 + "�⵵ " + "������� ��û���Դϴ�.");
		}
		
	}

}
