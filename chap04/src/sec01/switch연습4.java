package sec01;

import java.util.Scanner;

public class switch����4 {

	public static void main(String[] args) {
							/* ����� �ڵ�� A115 (�빮�ڿ� ������ ����), a115(�ҹ��ڿ� ������ ����)ó�� �Է��Ѵ�.
							 ����� �ڵ忡�� �� �� ���� �ѱ��ڸ� �̱�.
							 ��� a��� "�λ�ο� �����Ǽ̽��ϴ�."
							 ��� b��� "��ȹ�ο� �����Ǽ̽��ϴ�."
							 ��� c��� "�ѹ��ο� �����Ǽ̽��ϴ�."*/
		Scanner s = new Scanner(System.in);
		System.out.println("����� �ڵ带 �Է��� �ּ���.");
		String code = s.next();
		char code1=code.charAt(0);

		switch(code1) {
		case 'A':
		case 'a':
			System.out.println("�λ�ο� �����Ǽ̽��ϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("��ȹ�ο� �����Ǽ̽��ϴ�.");
			break;
		default :
			System.out.println("�ѹ��ο� �����Ǽ̽��ϴ�.");
			break;
		}

	}

}
