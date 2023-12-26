package sec01;

import java.util.Scanner;

public class NewStringCharAtExample {

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
		String[] name = new String[2]; // �̸� ���� �迭
		String[] grade = new String[2]; // ��������� �����ϴ� �迭
		int[] point = new int[2]; // ������ �����ϴ� �迭
		char[] code = new char[2]; // �ڵ� �� ���ڸ�(A,B,C) �����ϴ� �迭

		String processCode; // ��ü �ڵ� ����(EX) B88)
		int processPoint; // �Է����� (�ڵ�� 2�ڸ�)

		for (int i = 0; i < 2; i++) {
			System.out.println("�̸��� ó���ڵ带 �Է��� �ּ���");
			name[i] = s.next();
			processCode = s.next();
			code[i] = processCode.charAt(0); // ��ü �ڵ忡�� A,B,C �и�
			processPoint = Integer.parseInt(processCode.substring(1));
			// ��ü�ڵ忡�� �� 2�ڸ� ���� �и�

			switch (code[i]) {
			case 'A':
				point[i] = (int) (processPoint * 1.2);
				break;
			case 'B':
				point[i] = (int) (processPoint * 1.1);
				break;
			case 'C':
				point[i] = (int) (processPoint * 1.05);
				break;
			default:
				point[i] = processPoint;
				break;
			}
			if (point[i] >= 90) {
				grade[i] = "�ֿ��";
			} else if (point[i] >= 80) {
				grade[i] = "���";
			} else {
				grade[i] = "�Ϲ�";
			}
		}
		for (int j = 0; j < 2; j++) {
			System.out.println(name[j] + "����" + grade[j] + "����Դϴ�.");
		}

	}

}
