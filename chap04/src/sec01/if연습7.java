package sec01;

import java.util.Scanner;

public class if����7 {

	public static void main(String[] args) {
		// �߰����� �⸻����� ��������� 90�� �̻��̸� A���� ���
		// �߰����� �⸻����� ��������� 80�� �̻��̸� B���� ���
		// �������� C���� �̵� ��� �Ѱ����̶� 60���̸��̸� ����� ���

		Scanner s = new Scanner(System.in);
		System.out.println("�߰���� ������?");
		int mid = s.nextInt();
		System.out.println("�⸻��� ������?");
		int last = s.nextInt();
		//�켱���� �ľ��� ������ �߿���.
		int result = (mid + last) / 2;
		if (mid < 60 || last < 60) {
			System.out.println("��� �Ѱ����� ������ 60�� �̸��Դϴ�.");
			System.out.println("������Դϴ�.");
		} else if (result >= 90) {
			System.out.println("��������� 90~100�Դϴ�.");
			System.out.println("����� A�Դϴ�.");
		} else if (result >= 80) {
			System.out.println("��������� 80~89�Դϴ�.");
			System.out.println("����� B�Դϴ�.");
		} else {
			System.out.println("��������� 80�� �̸��Դϴ�.");
			System.out.println("����� C�Դϴ�.");
		}

	}

}
