package sec01;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {
		// 2���� �̸��� ó���ڵ带 �Է¹�������.
		// ��) ȫ�浿 C88, �嵿�� B70
		// �� �� ���ڴ� ���, ������ 2���ڴ� �����Դϴ�.
		// ����� A~D��ޱ��� ������.
		// A����� ������ 20% ����
		// B����� ������ 10% ����
		// C����� ������ 5% ����
		// ���������� 90�� �̻��̸� "�ֿ��", 80�� �̻��̸� "���"
		// �������� "�Ϲ�"
		// ���� ��� "ȫ�浿���� �ֿ�� ����Դϴ�."

		Scanner s = new Scanner(System.in);
		String[] name = new String[2];
		String[] code = new String[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			name[i] = s.next();
			System.out.println("ó���ڵ带 �Է��ϼ���");
			code[i] = s.next();
			char codeGrade = code[i].charAt(0);
			char codeScore = code[i].charAt(1);
			String score2 = code[i].substring(1);
			int score1 = Integer.parseInt(score2);
			String grade;
			String codeEv;
			double scorePlus;
			switch (codeGrade) {
			case 'A':
				scorePlus = score1 * 1.2;
				break;
			case 'B':
				scorePlus = score1 * 1.1;
				break;
			default:
				scorePlus = score1 * 1.05;
				break;
			}
			switch (codeScore) {
			case '9':
				codeEv = "�ֿ��";
				break;
			case '8':
				codeEv = "���";
				break;
			default:
				codeEv = "�Ϲ�";
				break;
			}

			System.out.println(name[i] + "���� " + codeEv + "����Դϴ�.");
			System.out.println("");
		}
	}

}
