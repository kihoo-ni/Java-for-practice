package sec01;

import java.util.Scanner;

public class switch����3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����ȣ�� �Է��ϼ���.");
		System.out.println("�����ȣ�� ����6�ڸ��� ���� �빮���� �����Դϴ�.");
		String number = s.next();
		char number1 = number.charAt(6);
		switch (number1) {
		case 'A': //ĳ���ͷ� ����ȯ �߱� ������ ���� ����ǥ�� case �������ش�. ���� ��Ʈ���� ��� ���ڿ��� ����ȯ�Ͽ� ū����ǥ�� case ������.
			System.out.println("������Ұ� 201ȣ�Դϴ�.");
			break;
		case 'B':
			System.out.println("������Ұ� 202ȣ�Դϴ�.");
			break;
		default:
			System.out.println("������Ұ� 203ȣ�Դϴ�.");
			break;
		}

	}

}
